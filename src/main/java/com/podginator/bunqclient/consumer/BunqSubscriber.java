package com.podginator.bunqclient.consumer;

import com.podginator.bunqclient.model.bunq.MasterCardAction;
import com.podginator.bunqclient.service.BunqReactiveService;
import java.util.List;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public class BunqSubscriber {

  private final BunqReactiveService bunqReactiveService;

  public BunqSubscriber(
      final List<BunqPaymentSubscriber> consumers, final BunqReactiveService reactiveService)
      throws InterruptedException {
    bunqReactiveService = reactiveService;
    subscribeConsumers(consumers);
  }

  private void subscribeConsumers(final List<BunqPaymentSubscriber> consumers)  {
    final Flux<MasterCardAction> tweetDataFlux =
        bunqReactiveService.streamCardPaymentsFromAllAccounts();
    consumers.forEach(twitterConsumer -> twitterConsumer.consumeDataStream(tweetDataFlux));
  }
}
