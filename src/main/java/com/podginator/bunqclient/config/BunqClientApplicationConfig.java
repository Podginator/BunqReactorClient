package com.podginator.bunqclient.config;

import com.podginator.bunqclient.client.BunqClient;
import com.podginator.bunqclient.consumer.BunqPaymentSubscriber;
import com.podginator.bunqclient.consumer.BunqDataPrinterSubscriber;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
public class BunqClientApplicationConfig {

  @Value("${bunq.apikey}")
  private String bunqApiKey;

  @Value("${splitwise.apikey}")
  private String splitwiseApiKey;

  @Bean
  public List<BunqPaymentSubscriber> subscriberList() {
    return List.of(new BunqDataPrinterSubscriber());
  }

  @Bean
  public BunqClient bunqClient() {
    return BunqClient.builder().apiKey(bunqApiKey).build();
  }

}
