package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to get temporary quotes from Transferwise. These cannot be used to initiate payments */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class TransferwiseQuoteTemporary {

  /** The id of the quote. */
  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the note's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the note's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The expiration timestamp of the quote. Will always be null for temporary quotes. */
  @JsonProperty("time_expiry")
  private String timeExpiry;

  /** The quote id Transferwise needs. Will always be null for temporary quotes. */
  @JsonProperty("quote_id")
  private String quoteId;

  /** The source amount. */
  @JsonProperty("amount_source")
  private Amount amountSource;

  /** The target amount. */
  @JsonProperty("amount_target")
  private Amount amountTarget;

  /** The rate. */
  @JsonProperty("rate")
  private String rate;

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
