package com.podginator.bunqclient.consumer;

import com.podginator.bunqclient.model.bunq.MasterCardAction;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public class BunqDataPrinterSubscriber implements BunqPaymentSubscriber {


  public BunqDataPrinterSubscriber() {

  }

  @Override
  public void consumeDataStream(final Flux<MasterCardAction> tweetDataFlux) {
    // Have a consumer that will subscribe to the data, and then process it
    tweetDataFlux.subscribe(it -> {
      System.out.println(it.getCreated());
    });
  }
}
