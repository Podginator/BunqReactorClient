package com.podginator.bunqclient.consumer;

import com.podginator.bunqclient.model.bunq.MasterCardAction;
import reactor.core.publisher.Flux;

@FunctionalInterface
public interface BunqPaymentSubscriber {

  void consumeDataStream(final Flux<MasterCardAction> tweetDataFlux);
}
