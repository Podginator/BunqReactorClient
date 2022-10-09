package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to get a list of supported currencies for Transferwise. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransferwiseCurrency {

  /** The currency code. */
  @JsonProperty("currency")
  private String currency;

  /** The currency name. */
  @JsonProperty("name")
  private String name;

  /** The country code associated with the currency. */
  @JsonProperty("country")
  private String country;
}
