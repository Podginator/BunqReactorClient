package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** View for requesting iDEAL transactions and polling their status. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class IdealMerchantTransaction {

  @JsonProperty("monetary_account_id")
  private Integer monetaryAccountId;

  /** The alias of the monetary account to add money to. */
  @JsonProperty("alias")
  private LabelMonetaryAccount alias;

  /** The alias of the monetary account the money comes from. */
  @JsonProperty("counterparty_alias")
  private LabelMonetaryAccount counterpartyAlias;

  /** In case of a successful transaction, the amount of money that will be transferred. */
  @JsonProperty("amount_guaranteed")
  private Amount amountGuaranteed;

  /** The requested amount of money to add. */
  @JsonProperty("amount_requested")
  private Amount amountRequested;

  /** When the transaction will expire. */
  @JsonProperty("expiration")
  private String expiration;

  /** The BIC of the issuer. */
  @JsonProperty("issuer")
  private String issuer;

  /** The Name of the issuer. */
  @JsonProperty("issuer_name")
  private String issuerName;

  /** The URL to visit to */
  @JsonProperty("issuer_authentication_url")
  private String issuerAuthenticationUrl;

  /** The 'purchase ID' of the iDEAL transaction. */
  @JsonProperty("purchase_identifier")
  private String purchaseIdentifier;

  /** The status of the transaction. */
  @JsonProperty("status")
  private String status;

  /** When the status was last updated. */
  @JsonProperty("status_timestamp")
  private String statusTimestamp;

  /** The 'transaction ID' of the iDEAL transaction. */
  @JsonProperty("transaction_identifier")
  private String transactionIdentifier;

  /** The requested amount of money to add. */
  @JsonProperty("amount_requested_field_for_request")
  private Amount amountRequestedFieldForRequest;

  /** The BIC of the issuing bank to ask for money. */
  @JsonProperty("issuer_field_for_request")
  private String issuerFieldForRequest;
}
