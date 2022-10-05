package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to create a sandbox userPerson. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SandboxUserPerson {

  @JsonProperty("api_key")
  private String apiKey;
}
