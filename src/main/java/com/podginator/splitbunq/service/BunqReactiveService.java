package com.podginator.splitbunq.service;

import com.podginator.splitbunq.client.BunqClient;
import com.podginator.splitbunq.model.bunq.BunqId;
import com.podginator.splitbunq.model.bunq.MasterCardAction;
import java.time.Duration;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

@Service
public class BunqReactiveService {

  private final BunqClient bunqClient;

  // We need a Bunq Client to make this work.
  public BunqReactiveService(final BunqClient bunqClient) {
    this.bunqClient = bunqClient;
  }

  public Flux<BunqId> getActiveMonetaryAccounts() {
    final var bunqAccounts = bunqClient.getMonetaryAccounts();

    final var bunqBanks =
        bunqAccounts
            .filter(
                it ->
                    it.getMonetaryAccountBank() != null
                        && "ACTIVE".equals(it.getMonetaryAccountBank().getStatus()))
            .map(it -> it.getMonetaryAccountBank().getId())
            .map(BunqId::new);
    final var bunqSavings =
        bunqAccounts
            .filter(
                it ->
                    it.getMonetaryAccountSavings() != null
                        && "ACTIVE".equals(it.getMonetaryAccountSavings().getStatus()))
            .map(it -> it.getMonetaryAccountSavings().getId())
            .map(BunqId::new);

    return Flux.concat(bunqBanks, bunqSavings);
  }

  public Flux<com.podginator.splitbunq.model.bunq.MasterCardAction> getCardPaymentsFromAccount(
      final Integer accountId) {
    return bunqClient.getCardPaymentsFromMonetaryAccountId(accountId);
  }

  public Flux<MasterCardAction> streamCardPaymentsFromAllAccounts() {
    final var accountsCached =
        getActiveMonetaryAccounts().cache(Duration.ofDays(1), Schedulers.boundedElastic());

    return Flux.interval(Duration.ofSeconds(5))
        .switchMap(it -> accountsCached)
        .concatMap(it -> getCardPaymentsFromAccount(it.getId()))
        .distinct(MasterCardAction::getId);
  }
}
