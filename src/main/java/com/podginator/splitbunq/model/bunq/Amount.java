package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Amount {

  /** The amount formatted to two decimal places. */
  @JsonProperty("value")
  private String value;

  /** The currency of the amount. It is an ISO 4217 formatted currency code. */
  @JsonProperty("currency")
  private String currency;

  /** The amount formatted to two decimal places. */
  @JsonProperty("value_field_for_request")
  private String valueFieldForRequest;

  /** The currency of the amount. It is an ISO 4217 formatted currency code. */
  @JsonProperty("currency_field_for_request")
  private String currencyFieldForRequest;
}
