package com.podginator.splitbunq.client;

import com.podginator.splitbunq.model.bunq.BunqResponses;
import com.podginator.splitbunq.model.bunq.MasterCardAction;
import com.podginator.splitbunq.model.bunq.MonetaryAccount;
import com.podginator.splitbunq.utils.BunqWebClientProvider;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.*;
import reactor.core.publisher.Flux;

public class BunqClient {

  private final BunqWebClientProvider sessionWebclient;

  protected BunqClient(final BunqWebClientProvider provider) {
    this.sessionWebclient = provider;
  }

  public static BunqClient create(final String apiKey) {
    return new BunqClient(new BunqWebClientProvider(apiKey));
  }

  public Flux<MonetaryAccount> getMonetaryAccounts() {
    return sessionWebclient.getBunqSessionWebclient().flatMapMany(this::getMonetaryAccounts);
  }

  private Flux<MonetaryAccount> getMonetaryAccounts(final WebClient webClient) {
    return webClient
        .get()
        .uri("/v1/user/{userId}/monetary-account")
        .retrieve()
        .bodyToMono(new ParameterizedTypeReference<BunqResponses<MonetaryAccount>>() {})
        .flatMapIterable(BunqResponses::getResponses);
  }

  public Flux<MasterCardAction> getCardPaymentsFromMonetaryAccountId(
      final Integer monetaryAccountId) {
    return sessionWebclient
        .getBunqSessionWebclient()
        .flatMapMany(it -> getCardPaymentsFromMonetaryAccountIdRequest(it, monetaryAccountId));
  }

  private Flux<MasterCardAction> getCardPaymentsFromMonetaryAccountIdRequest(
      final WebClient webClient, final Integer monetaryAccountId) {
    return webClient
        .get()
        .uri(
            "/v1/user/{userId}/monetary-account/{monetaryAccountId}/mastercard-action",
            Map.of("monetaryAccountId", monetaryAccountId.toString()))
        .retrieve()
        .bodyToMono(new ParameterizedTypeReference<BunqResponses<MasterCardAction>>() {})
        .flatMapIterable(BunqResponses::getResponses);
  }
}
