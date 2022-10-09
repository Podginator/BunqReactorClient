package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to create a sandbox userCompany. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SandboxUserCompany {

  @JsonProperty("api_key")
  private String apiKey;
}
