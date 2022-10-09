package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class BunqDeviceRequest {
  @JsonProperty("description")
  private String description;

  @JsonProperty("secret")
  private String secret;

  @JsonProperty("permitted_ips")
  private List<String> permittedIps;
}
