package com.podginator.bunqclient.config;

import com.podginator.bunqclient.client.BunqClient;
import com.podginator.bunqclient.consumer.BunqPaymentSubscriber;
import com.podginator.bunqclient.consumer.BunqDataPrinterSubscriber;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@ConfigurationProperties
public class SplitBunqConfiguration {

  @Value("${bunq.apikey}")
  private String bunqApiKey;

  @Value("${splitwise.apikey}")
  private String splitwiseApiKey;

  @Bean
  public List<BunqPaymentSubscriber> subscriberList() {
    return List.of(new BunqDataPrinterSubscriber(splitwiseClient()));
  }

  @Bean
  public BunqClient bunqClient() {
    return BunqClient.builder().apiKey(bunqApiKey).build();
  }

  @Bean
  public SplitwiseClient splitwiseClient() {
    return new SplitwiseClient(WebClient.create(), splitwiseApiKey);
  }
}
