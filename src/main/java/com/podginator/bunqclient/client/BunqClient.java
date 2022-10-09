package com.podginator.bunqclient.client;

import com.podginator.bunqclient.model.bunq.BunqResponses;
import com.podginator.bunqclient.model.bunq.MasterCardAction;
import com.podginator.bunqclient.model.bunq.MonetaryAccount;
import com.podginator.bunqclient.model.bunq.Payment;
import com.podginator.bunqclient.utils.BunqWebClientProvider;
import java.security.PublicKey;
import java.time.Duration;
import java.util.Map;
import java.util.function.Function;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class BunqClient {

  private String apiEndpoint;

  private Duration sessionDuration;

  private WebClient baseWebClient;

  private PublicKey bunqPublicKey;

  private String bunqInstallationToken;

  private String apiKey;

  @Builder.Default
  private int maxPaginationSize = 100;

  private BunqWebClientProvider sessionWebclient;

  public Flux<MonetaryAccount> getMonetaryAccounts() {
    return sessionWebclient.getBunqSessionWebclient().flatMapMany(this::getMonetaryAccounts);
  }

  private static <T> Function<BunqResponses<T>, Flux<T>> followPagination(
      final WebClient webClient,
      final ParameterizedTypeReference<BunqResponses<T>> parameterizedTypeReference) {
    return it -> {
      final var iterableFlux = Flux.fromIterable(it.getResponses());

      if (it.getPagination() != null && it.getPagination().getPreviousUrl() != null) {
        return iterableFlux.concatWith(
            webClient
                .get()
                .uri(it.getPagination().getPreviousUrl())
                .retrieve()
                .bodyToMono(parameterizedTypeReference)
                .flatMapMany(followPagination(webClient, parameterizedTypeReference)));
      }

      return iterableFlux;
    };
  }

  private Flux<MonetaryAccount> getMonetaryAccounts(final WebClient webClient) {
    final var getType = new ParameterizedTypeReference<BunqResponses<MonetaryAccount>>() {};
    return webClient
        .get()
        .uri("/v1/user/{userId}/monetary-account?count={count}")
        .attribute("count", maxPaginationSize)
        .retrieve()
        .bodyToMono(getType)
        .flatMapMany(followPagination(webClient, getType));
  }

  public Flux<MasterCardAction> getCardPayments(
      final Integer monetaryAccountId) {
    return sessionWebclient
        .getBunqSessionWebclient()
        .flatMapMany(it -> getCardPaymentsFromMonetaryAccountIdRequest(it, monetaryAccountId));
  }

  private Flux<MasterCardAction> getCardPaymentsFromMonetaryAccountIdRequest(
      final WebClient webClient, final Integer monetaryAccountId) {
    final var type = new ParameterizedTypeReference<BunqResponses<MasterCardAction>>() {};
    return webClient
        .get()
        .uri(
            "/v1/user/{userId}/monetary-account/{monetaryAccountId}/mastercard-action?count={count}",
            Map.of("monetaryAccountId", monetaryAccountId.toString(), "count", maxPaginationSize))
        .retrieve()
        .bodyToMono(type)
        .flatMapMany(followPagination(webClient, type));
  }


  public Flux<Payment> getPayments(final Integer monetaryAccountId) {
    return sessionWebclient
            .getBunqSessionWebclient()
            .flatMapMany(it -> getPayments(it, monetaryAccountId));
  }

  private Flux<Payment> getPayments(final WebClient webClient, final Integer monetaryAccountId) {
    final var type = new ParameterizedTypeReference<BunqResponses<Payment>>() {};
    return webClient
            .get()
            .uri(
                    "/v1/user/{userId}/monetary-account/{monetaryAccountId}/payment?count={count}",
                    Map.of("monetaryAccountId", monetaryAccountId.toString(), "count", maxPaginationSize))
            .retrieve()
            .bodyToMono(type)
            .flatMapMany(followPagination(webClient, type));
  }

  private Mono<Payment> getPayment(final Integer monetaryAccountId, final Integer paymentId) {
    return sessionWebclient
            .getBunqSessionWebclient()
            .flatMap(it -> getPayment(it, monetaryAccountId, paymentId));
  }

  private Mono<Payment> getPayment(final WebClient webClient, final Integer monetaryAccountId, final Integer paymentId) {
    final var type = new ParameterizedTypeReference<BunqResponses<Payment>>() {};
    return webClient
            .get()
            .uri(
                    "/v1/user/{userId}/monetary-account/{monetaryAccountId}/payment/{paymentId}",
                    Map.of("monetaryAccountId", monetaryAccountId.toString(),
                            "paymentId", paymentId))
            .retrieve()
            .bodyToMono(type)
            .map(it -> it.getResponses().get(0));
  }


  public static BunqClientBuilder builder() {
    return new CustomBunqClientBuilder();
  }

  private static class CustomBunqClientBuilder extends BunqClientBuilder {
    public BunqClient build() {
      final var endpoint = super.apiEndpoint != null ? super.apiEndpoint : "https://api.bunq.com";
      final var sessionDeadline =
          super.sessionDuration != null
              ? super.sessionDuration
              : Duration.ofDays(6).plus(Duration.ofHours(12));
      final var webClient =
          super.baseWebClient != null
              ? super.baseWebClient.mutate().baseUrl(endpoint).build()
              : WebClient.create(endpoint);

      final var webClientProvider =
          BunqWebClientProvider.builder()
              .apiKey(super.apiKey)
              .baseWebClient(webClient)
              .baseUri(endpoint)
              .cacheTime(sessionDeadline)
              .bunqPublicKey(super.bunqPublicKey)
              .build();

      super.sessionWebclient(webClientProvider);
      return super.build();
    }
  }
}
