package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Using /installation/_/server-public-key you can request the ServerPublicKey again. This is done
 * by referring to the id of the Installation.
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class InstallationServerPublicKey {

  @JsonProperty("server_public_key")
  private String serverPublicKey;
}
