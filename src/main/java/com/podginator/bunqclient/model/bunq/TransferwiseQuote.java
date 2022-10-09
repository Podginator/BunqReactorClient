package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to get quotes from Transferwise. These can be used to initiate payments. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransferwiseQuote {

  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the quote's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the quote's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The expiration timestamp of the quote. */
  @JsonProperty("time_expiry")
  private String timeExpiry;

  /** The quote id Transferwise needs. */
  @JsonProperty("quote_id")
  private String quoteId;

  /** The source amount. */
  @JsonProperty("amount_source")
  private Amount amountSource;

  /** The target amount. */
  @JsonProperty("amount_target")
  private Amount amountTarget;

  /** The fee amount. */
  @JsonProperty("amount_fee")
  private Amount amountFee;

  /** The rate. */
  @JsonProperty("rate")
  private String rate;

  /** The estimated delivery time. */
  @JsonProperty("time_delivery_estimate")
  private String timeDeliveryEstimate;

  /** The source currency. */
  @JsonProperty("currency_source_field_for_request")
  private String currencySourceFieldForRequest;

  /** The target currency. */
  @JsonProperty("currency_target_field_for_request")
  private String currencyTargetFieldForRequest;

  /** The source amount. Required if target amount is left empty. */
  @JsonProperty("amount_source_field_for_request")
  private Amount amountSourceFieldForRequest;

  /** The target amount. Required if source amount is left empty. */
  @JsonProperty("amount_target_field_for_request")
  private Amount amountTargetFieldForRequest;
}
