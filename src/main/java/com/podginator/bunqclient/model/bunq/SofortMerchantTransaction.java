package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** View for requesting Sofort transactions and polling their status. */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SofortMerchantTransaction {

  /** The id of the monetary account this sofort merchant transaction links to. */
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

  /** The BIC of the issuer. */
  @JsonProperty("issuer")
  private String issuer;

  /** The URL to visit to */
  @JsonProperty("issuer_authentication_url")
  private String issuerAuthenticationUrl;

  /** The status of the transaction. */
  @JsonProperty("status")
  private String status;

  /** The error message of the transaction. */
  @JsonProperty("error_message")
  private List<java.lang.Error> errorMessage;

  /** The 'transaction ID' of the Sofort transaction. */
  @JsonProperty("transaction_identifier")
  private String transactionIdentifier;

  /** The requested amount of money to add. */
  @JsonProperty("amount_requested_field_for_request")
  private Amount amountRequestedFieldForRequest;

  /** The BIC of the issuing bank to ask for money. */
  @JsonProperty("issuer_field_for_request")
  private String issuerFieldForRequest;
}
