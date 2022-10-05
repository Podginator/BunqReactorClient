package com.podginator.splitbunq.consumer;

import com.podginator.splitbunq.client.SplitwiseClient;
import com.podginator.splitbunq.model.bunq.MasterCardAction;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public class BunqSplitwiseSubscriber implements BunqPaymentSubscriber {

  private final SplitwiseClient splitwiseClient;

  public BunqSplitwiseSubscriber(final SplitwiseClient splitwiseClient) {
    this.splitwiseClient = splitwiseClient;
  }

  @Override
  public void consumeDataStream(final Flux<MasterCardAction> tweetDataFlux) {
    // Have a consumer that will subscribe to the data, and then process it
    tweetDataFlux.subscribe();
  }
}
