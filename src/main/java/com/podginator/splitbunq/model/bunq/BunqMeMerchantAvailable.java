package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class BunqMeMerchantAvailable {

  /** A merchant type supported by bunq.me. */
  @JsonProperty("merchant_type")
  private String merchantType;

  /** Whether or not the merchant is available for the user. */
  @JsonProperty("available")
  private Boolean available;
}
