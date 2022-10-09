package com.podginator.bunqclient;

import com.podginator.bunqclient.config.BunqClientApplicationConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(BunqClientApplicationConfig.class)
public class BunqApplication {

  public static void main(String[] args) {
    SpringApplication.run(BunqApplication.class, args);
  }
}
