package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Manage the PaymentServiceProviderDraftPayment's for a PISP. */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentServiceProviderDraftPayment {

  /** The sender IBAN. */
  @JsonProperty("sender_iban")
  private String senderIban;

  /** The sender IBAN. */
  @JsonProperty("receiver_iban")
  private String receiverIban;

  /** The amount of the draft payment */
  @JsonProperty("amount")
  private Amount amount;

  /** The status of the draft payment */
  @JsonProperty("status")
  private String status;

  /** The IBAN of the sender. */
  @JsonProperty("sender_iban_field_for_request")
  private String senderIbanFieldForRequest;

  /** The name of the sender. */
  @JsonProperty("sender_name_field_for_request")
  private String senderNameFieldForRequest;

  /** The IBAN of the counterparty. */
  @JsonProperty("counterparty_iban_field_for_request")
  private String counterpartyIbanFieldForRequest;

  /** The name of the counterparty. */
  @JsonProperty("counterparty_name_field_for_request")
  private String counterpartyNameFieldForRequest;

  /** Description of the payment. */
  @JsonProperty("description_field_for_request")
  private String descriptionFieldForRequest;

  /** The Amount to transfer with the Payment. Must be bigger than 0. */
  @JsonProperty("amount_field_for_request")
  private Amount amountFieldForRequest;

  /** The new status of the Draft Payment. Can only be set to REJECTED or CANCELLED by update. */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;
}
