package com.podginator.splitbunq.utils;

import static com.podginator.splitbunq.utils.JacksonUtils.writeValueAsString;
import static com.podginator.splitbunq.utils.SecurityUtils.generateKeyPair;

import com.podginator.splitbunq.model.bunq.*;
import java.security.KeyPair;
import java.security.PublicKey;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.ClientRequest;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class BunqWebClientProvider {

  private static final Logger log = LoggerFactory.getLogger(BunqWebClientProvider.class);

  private final Mono<WebClient> sessionWebclient;

  private final Duration cacheTime;

  private final String baseUri;

  public BunqWebClientProvider(final String apiKey) {
    this(apiKey, "https://api.bunq.com", Duration.ofDays(1));
  }

  public BunqWebClientProvider(final String apiKey, final String baseUri, final Duration duration) {
    this.baseUri = baseUri;
    this.cacheTime = duration;

    this.sessionWebclient = generateSessionKey(apiKey).cache(duration);
  }

  public Mono<WebClient> getBunqSessionWebclient() {
    return sessionWebclient;
  }

  public Duration getCacheTime() {
    return cacheTime;
  }

  public String getBaseUri() {
    return baseUri;
  }

  private Function<ClientRequest, Mono<ClientRequest>> encryptBunqHeader(
      final PublicKey publicKey) {
    return (req) -> {
      final var headers = req.headers();
      if (headers.containsKey("X-Bunq-Client-Signature")) {
        final var unencryptedSig = headers.get("X-Bunq-Client-Signature");
        final var encrytpedSigs =
            unencryptedSig.stream()
                .filter(Objects::nonNull)
                .map(it -> SecurityUtils.encrypted(publicKey, it))
                .collect(Collectors.toList());

        return Mono.just(
            ClientRequest.from(req)
                .headers((it) -> it.replace("X-Bunq-Client-Signature", encrytpedSigs))
                .build());
      }

      return Mono.just(req);
    };
  }

  private ExchangeFilterFunction logRequest() {
    return ExchangeFilterFunction.ofRequestProcessor(
        clientRequest -> {
          if (true || log.isDebugEnabled()) {
            StringBuilder sb = new StringBuilder("Request: \n");
            // append clientRequest method and url
            clientRequest
                .headers()
                .forEach(
                    (name, values) ->
                        values.forEach(value -> sb.append(String.format("%s: %s\n", name, value))));
            sb.append(String.format("Url: %s", clientRequest.url()));

            log.info(sb.toString());
          }
          return Mono.just(clientRequest);
        });
  }

  private Mono<WebClient> generateSessionKey(final String apiKey) {
    return Mono.fromCallable(
            () -> {
              final KeyPair keyPair = generateKeyPair();

              final WebClient.Builder webClientBuilder =
                  WebClient.builder()
                      .defaultHeader("User-Agent", "SplitBunq")
                      .baseUrl(this.baseUri)
                      .filters(
                          exchangeFilterFunctions -> {
                            exchangeFilterFunctions.add(logRequest());
                          });

              return Pair.of(keyPair, webClientBuilder);
            })
        .flatMap(
            it ->
                Mono.zip(
                    Mono.just(it.getRight()),
                    bunqInstallation(it.getLeft().getPublic(), it.getRight().build())))
        .flatMap(
            tuple -> {
              final var webClientBuilder = tuple.getT1();
              final var it = tuple.getT2();

              final var key = it.getServerPublicKey().getServerPublicKey();
              final var publicKey = SecurityUtils.generatePublicKey(key);
              webClientBuilder.filter(
                  ExchangeFilterFunction.ofRequestProcessor(encryptBunqHeader(publicKey)));

              return Mono.zip(
                  Mono.just(it),
                  Mono.just(tuple.getT1()),
                  bunqDeviceInstallation(it, apiKey, webClientBuilder.build()));
            })
        .flatMap(
            it ->
                Mono.zip(
                    Mono.just(it.getT2()), bunqOpenSession(apiKey, it.getT1(), it.getT2().build())))
        .map(
            it -> {
              final var webClientBuilder = it.getT1();

              webClientBuilder.defaultHeader(
                  "X-Bunq-Client-Authentication", it.getT2().getToken().getToken());
              webClientBuilder.defaultUriVariables(
                  Map.of("userId", it.getT2().getUserPerson().getId()));
              return webClientBuilder.build();
            })
        .doOnError(it -> System.out.println(it))
        .retry();
  }

  private Mono<BunqInstallation> bunqInstallation(
      final PublicKey publicKey, final WebClient webClient) {
    final var request =
        BunqInstallationRequest.builder()
            .clientPublicKey(SecurityUtils.getPublicKeyFormattedString(publicKey))
            .build();

    return webClient
        .post()
        .uri("/v1/installation")
        .header("X-Bunq-Client-Signature", writeValueAsString(request))
        .body(Mono.just(request), BunqInstallationRequest.class)
        .retrieve()
        .bodyToMono(new ParameterizedTypeReference<BunqResponses<BunqInstallation>>() {})
        .map(BunqResponses::mergeAll);
  }

  private Mono<BunqDeviceInstallation> bunqDeviceInstallation(
      final BunqInstallation token, final String apiKey, final WebClient webClient) {
    final var request =
        BunqDeviceRequest.builder()
            .description("SplitBunq")
            .secret(apiKey)
            .permittedIps(List.of("*"))
            .build();

    return webClient
        .post()
        .uri("/v1/device-server")
        .header("X-Bunq-Client-Signature", writeValueAsString(request))
        .header("X-Bunq-Client-Authentication", token.getToken().getToken())
        .body(Mono.just(request), BunqDeviceRequest.class)
        .retrieve()
        .bodyToMono(new ParameterizedTypeReference<BunqResponses<BunqDeviceInstallation>>() {})
        .map(BunqResponses::mergeAll);
  }

  private Mono<BunqSession> bunqOpenSession(
      final String apiKey, final BunqInstallation bunqInstallation, final WebClient webClient) {
    final var request = BunqSessionRequest.builder().secret(apiKey).build();

    return webClient
        .post()
        .uri("/v1/session-server")
        .header("X-Bunq-Client-Signature", writeValueAsString(request))
        .header("X-Bunq-Client-Authentication", bunqInstallation.getToken().getToken())
        .body(Mono.just(request), BunqSessionRequest.class)
        .retrieve()
        .bodyToMono(new ParameterizedTypeReference<BunqResponses<BunqSession>>() {})
        .map(BunqResponses::mergeAll);
  }
}
