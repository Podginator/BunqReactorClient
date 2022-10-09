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

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.ClientRequest;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

@Builder
@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class BunqWebClientProvider {
  private static final Logger log = LoggerFactory.getLogger(BunqWebClientProvider.class);
  private static final String BUNQ_CLIENT_HEADER = "X-Bunq-Client-Signature";
  private static final String BUNQ_SERVER_HEADER = "X-Bunq-Server-Signature";
  private static final String BUNQ_CLIENT_AUTH = "X-Bunq-Client-Authentication";

  private final Mono<WebClient> sessionWebclient;

  private Duration cacheTime;

  private String baseUri;

  private WebClient baseWebClient;

  private String apiKey;

  private String bunqInstallationToken;

  private PublicKey bunqPublicKey;

  public BunqWebClientProvider(
      Duration cacheTime,
      String baseUri,
      WebClient baseWebClient,
      String apiKey,
      String bunqInstallationToken,
      PublicKey bunqPublicKey) {
    this.cacheTime = cacheTime;
    this.baseUri = baseUri;
    this.baseWebClient = baseWebClient;
    this.apiKey = apiKey;
    this.bunqInstallationToken = bunqInstallationToken;
    this.bunqPublicKey = bunqPublicKey;

    this.sessionWebclient = generateSessionKey(apiKey).cache(cacheTime);
  }

  public Mono<WebClient> getBunqSessionWebclient() {
    return sessionWebclient;
  }

  private ExchangeFilterFunction validateResponse(final PublicKey publicKey) {
    return ExchangeFilterFunction.ofResponseProcessor(
        response -> {
          final var responseCopy = response.mutate();
          return response
              .bodyToMono(String.class)
              .flatMap(
                  it -> {
                    // Do validation logic here.
                    final var headers = response.headers().header(BUNQ_SERVER_HEADER);
                    if (!headers.isEmpty()
                        && !SecurityUtils.validateEquality(it, headers.get(0), publicKey)) {
                      return Mono.error(new IllegalStateException("Response didn't validate."));
                    }
                    ;

                    responseCopy.body(it);
                    return Mono.just(responseCopy.build());
                  });
        });
  }

  private Function<ClientRequest, Mono<ClientRequest>> encryptBunqHeader(
      final PublicKey publicKey) {
    return (req) -> {
      final var headers = req.headers();
      if (headers.containsKey(BUNQ_CLIENT_HEADER)) {
        final var unencryptedSig = headers.get(BUNQ_CLIENT_HEADER);
        final var encrytpedSigs =
            unencryptedSig.stream()
                .filter(Objects::nonNull)
                .map(it -> SecurityUtils.encrypted(publicKey, it))
                .collect(Collectors.toList());

        return Mono.just(
            ClientRequest.from(req)
                .headers((it) -> it.replace(BUNQ_CLIENT_HEADER, encrytpedSigs))
                .build());
      }

      return Mono.just(req);
    };
  }

  private ExchangeFilterFunction logRequest() {
    return ExchangeFilterFunction.ofRequestProcessor(
        clientRequest -> {
          if (log.isDebugEnabled()) {
            StringBuilder sb = new StringBuilder("Request: \n");
            // append clientRequest method and url
            clientRequest
                .headers()
                .forEach(
                    (name, values) ->
                        values.forEach(value -> sb.append(String.format("%s: %s\n", name, value))));
            sb.append(String.format("Url: %s", clientRequest.url()));

            log.debug(sb.toString());
          }
          return Mono.just(clientRequest);
        });
  }

  private ExchangeFilterFunction logResponse() {
    return ExchangeFilterFunction.ofResponseProcessor(
        clientRequest -> {
          if (log.isDebugEnabled()) {
            StringBuilder sb = new StringBuilder("Response: \n");
            // append clientRequest method and url

            sb.append(String.format("Returned %d", clientRequest.rawStatusCode()));

            log.debug(sb.toString());
          }
          return Mono.just(clientRequest);
        });
  }

  /**
   * Create a KeyPair, and shares information with the bunq server if necessary. Otherwise use an
   * existing Public Key and Installation Token generated by the Device Installation Process.
   *
   * @return The WebClient builder we are working with, and the BunqInstallation with the Public Key
   *     generated.
   */
  private Mono<Tuple2<WebClient.Builder, BunqInstallation>> createSessionAndDeviceServerIfNeeded() {
      final int size = 16 * 1024 * 1024;
      final ExchangeStrategies strategies = ExchangeStrategies.builder()
              .codecs(codecs -> codecs.defaultCodecs().maxInMemorySize(size))
              .build();
      final WebClient.Builder webClientBuilder =
        WebClient.builder()
            .defaultHeader("User-Agent", "SplitBunq")
            .baseUrl(this.baseUri)
            .exchangeStrategies(strategies)
            .filters(
                exchangeFilterFunctions -> {
                  exchangeFilterFunctions.add(logRequest());
                  exchangeFilterFunctions.add(logResponse());
                });

    // if we have a provided Bunq Public Key and installation - we can use that.
    // Otherwise, we create it.
    if (bunqPublicKey != null && bunqInstallationToken != null) {
      return Mono.zip(
          Mono.just(webClientBuilder),
          Mono.just(
              BunqInstallation.builder()
                  .token(BunqInstallation.Token.builder().token(bunqInstallationToken).build())
                  .serverPublicKey(
                      BunqInstallation.ServerPublicKey.builder()
                          .serverPublicKey(SecurityUtils.getPublicKeyFormattedString(bunqPublicKey))
                          .build())
                  .build()));
    }

    return Mono.fromCallable(
            () -> {
              final KeyPair keyPair = generateKeyPair();
              return Pair.of(keyPair, webClientBuilder);
            })
        .flatMap(
            it ->
                Mono.zip(
                    Mono.just(it.getRight()),
                    bunqInstallation(it.getLeft().getPublic(), it.getRight().build())));
  }

  private Mono<WebClient> generateSessionKey(final String apiKey) {
    return createSessionAndDeviceServerIfNeeded()
        .flatMap(
            tuple -> {
              final var webClientBuilder = tuple.getT1();
              final var it = tuple.getT2();

              final var serverPublicKey = it.getServerPublicKey().getServerPublicKey();
              final var publicKey = SecurityUtils.generatePublicKey(serverPublicKey);
              webClientBuilder.filter(
                  ExchangeFilterFunction.ofRequestProcessor(encryptBunqHeader(publicKey)));
              webClientBuilder.filter(validateResponse(publicKey));

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

              webClientBuilder.defaultHeader(BUNQ_CLIENT_AUTH, it.getT2().getToken().getToken());
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
            .description("BunqWebClient")
            .secret(apiKey)
            .permittedIps(List.of("*"))
            .build();

    return webClient
        .post()
        .uri("/v1/device-server")
        .header(BUNQ_CLIENT_HEADER, writeValueAsString(request))
        .header(BUNQ_CLIENT_AUTH, token.getToken().getToken())
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
        .header(BUNQ_CLIENT_HEADER, writeValueAsString(request))
        .header(BUNQ_CLIENT_AUTH, bunqInstallation.getToken().getToken())
        .body(Mono.just(request), BunqSessionRequest.class)
        .retrieve()
        .bodyToMono(new ParameterizedTypeReference<BunqResponses<BunqSession>>() {})
        .map(BunqResponses::mergeAll);
  }

  public static BunqWebClientProviderBuilder builder() {
    return new CustomBunqWebClientProviderBuilder();
  }

  private static class CustomBunqWebClientProviderBuilder extends BunqWebClientProviderBuilder {
    public BunqWebClientProvider build() {
      return new BunqWebClientProvider(
          super.cacheTime,
          super.baseUri,
          super.baseWebClient,
          super.apiKey,
          super.bunqInstallationToken,
          super.bunqPublicKey);
    }
  }
}
