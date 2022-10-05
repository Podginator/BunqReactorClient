package com.podginator.splitbunq.consumer;

import com.podginator.splitbunq.model.bunq.MasterCardAction;
import reactor.core.publisher.Flux;

@FunctionalInterface
public interface BunqPaymentSubscriber {

  void consumeDataStream(final Flux<MasterCardAction> tweetDataFlux);
}
