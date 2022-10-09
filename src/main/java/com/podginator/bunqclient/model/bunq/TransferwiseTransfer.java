package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to create Transferwise payments. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransferwiseTransfer {

  /**
   * The LabelMonetaryAccount containing the public information of 'this' (party) side of the
   * Payment.
   */
  @JsonProperty("alias")
  private LabelMonetaryAccount alias;

  /**
   * The LabelMonetaryAccount containing the public information of the other (counterparty) side of
   * the Payment.
   */
  @JsonProperty("counterparty_alias")
  private LabelMonetaryAccount counterpartyAlias;

  /** The status. */
  @JsonProperty("status")
  private String status;

  /** The subStatus. */
  @JsonProperty("sub_status")
  private String subStatus;

  /** The status as Transferwise reports it. */
  @JsonProperty("status_transferwise")
  private String statusTransferwise;

  /**
   * A status to indicatie if Transferwise has an issue with this payment and requires more
   * information.
   */
  @JsonProperty("status_transferwise_issue")
  private String statusTransferwiseIssue;

  /** The source amount. */
  @JsonProperty("amount_source")
  private Amount amountSource;

  /** The target amount. */
  @JsonProperty("amount_target")
  private Amount amountTarget;

  /** The rate of the payment. */
  @JsonProperty("rate")
  private String rate;

  /** The reference of the payment. */
  @JsonProperty("reference")
  private String reference;

  /** The Pay-In reference of the payment. */
  @JsonProperty("pay_in_reference")
  private String payInReference;

  /** The estimated delivery time. */
  @JsonProperty("time_delivery_estimate")
  private String timeDeliveryEstimate;

  /** The quote details used to created the payment. */
  @JsonProperty("quote")
  private TransferwiseQuote quote;

  /** The id of the monetary account the payment should be made from. */
  @JsonProperty("monetary_account_id_field_for_request")
  private String monetaryAccountIdFieldForRequest;

  /** The id of the target account. */
  @JsonProperty("recipient_id_field_for_request")
  private String recipientIdFieldForRequest;
}
