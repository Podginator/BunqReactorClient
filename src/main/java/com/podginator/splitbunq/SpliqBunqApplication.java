package com.podginator.splitbunq;

import com.podginator.splitbunq.config.SplitBunqConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(SplitBunqConfiguration.class)
public class SpliqBunqApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpliqBunqApplication.class, args);
  }
}
