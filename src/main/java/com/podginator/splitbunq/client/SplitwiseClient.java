package com.podginator.splitbunq.client;

import static com.podginator.splitbunq.utils.JacksonUtils.objectMapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.podginator.splitbunq.model.SplitwiseExpense;
import com.podginator.splitbunq.model.SplitwiseGroup;
import com.podginator.splitbunq.model.SplitwiseGroups;
import java.net.URI;
import java.net.http.HttpRequest;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class SplitwiseClient {

  private final WebClient httpClient;

  private final String apiKey;

  public SplitwiseClient(final WebClient httpClient, final String apiKey) {
    this.httpClient = httpClient;
    this.apiKey = apiKey;
  }

  public Flux<SplitwiseGroup> getGroups() {
    return httpClient
        .get()
        .uri("https://secure.splitwise.com/api/v3.0/get_groups")
        .header("Authorization", String.format("Bearer %s", apiKey))
        .retrieve()
        .bodyToMono(SplitwiseGroups.class)
        .flatMapIterable(SplitwiseGroups::getGroups);
  }

  public Mono<SplitwiseExpense> addExpense(final SplitwiseExpense splitwiseExpense)
      throws JsonProcessingException {
    final var httpRequest =
        HttpRequest.newBuilder(URI.create("https://secure.splitwise.com/api/v3.0/create_expense"))
            .POST(
                HttpRequest.BodyPublishers.ofString(
                    objectMapper.writeValueAsString(splitwiseExpense)))
            .header("Content-Type", "application/json")
            .header("Authorization", String.format("Bearer %s", apiKey))
            .build();

    return httpClient
        .post()
        .uri("https://secure.splitwise.com/api/v3.0/create_expense")
        .header("Authorization", String.format("Bearer %s", apiKey))
        .retrieve()
        .bodyToMono(Void.class)
        .map((voidItem) -> splitwiseExpense);
  }
}
