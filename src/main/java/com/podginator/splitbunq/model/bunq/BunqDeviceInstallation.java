package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class BunqDeviceInstallation {

  @Data
  @NoArgsConstructor
  private static class Id {
    private String id;
  }

  @JsonProperty("Id")
  private Id id;
}
