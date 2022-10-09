package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class PermittedDevice {

  /** The description of the device that may use the credential. */
  @JsonProperty("description")
  private String description;

  /** The IP address of the device that may use the credential. */
  @JsonProperty("ip")
  private String ip;
}
