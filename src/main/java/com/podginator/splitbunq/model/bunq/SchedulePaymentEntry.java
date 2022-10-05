package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SchedulePaymentEntry {

  /**
   * The Amount transferred by the Payment. Will be negative for outgoing Payments and positive for
   * incoming Payments (relative to the MonetaryAccount indicated by monetary_account_id).
   */
  @JsonProperty("amount")
  private Amount amount;

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

  /**
   * The description for the Payment. Maximum 140 characters for Payments to external IBANs, 9000
   * characters for Payments to only other bunq MonetaryAccounts.
   */
  @JsonProperty("description")
  private String description;

  /** The Attachments attached to the Payment. */
  @JsonProperty("attachment")
  private List<AttachmentMonetaryAccountPayment> attachment;

  /** Optional data included with the Payment specific to the merchant. */
  @JsonProperty("merchant_reference")
  private String merchantReference;

  /**
   * The Amount to transfer with the Payment. Must be bigger 0 and smaller than the
   * MonetaryAccount's balance.
   */
  @JsonProperty("amount_field_for_request")
  private Amount amountFieldForRequest;

  /**
   * The Alias of the party we are transferring the money to. Can be an Alias of type EMAIL or PHONE
   * (for bunq MonetaryAccounts) or IBAN (for external bank account).
   */
  @JsonProperty("counterparty_alias_field_for_request")
  private Pointer counterpartyAliasFieldForRequest;

  /**
   * The description for the Payment. Maximum 140 characters for Payments to external IBANs, 9000
   * characters for Payments to only other bunq MonetaryAccounts. Field is required but can be an
   * empty string.
   */
  @JsonProperty("description_field_for_request")
  private String descriptionFieldForRequest;

  /** The Attachments to attach to the Payment. */
  @JsonProperty("attachment_field_for_request")
  private List<BunqId> attachmentFieldForRequest;

  /** Optional data to be included with the Payment specific to the merchant. */
  @JsonProperty("merchant_reference_field_for_request")
  private String merchantReferenceFieldForRequest;

  /** Whether or not sending a bunq.to payment is allowed. */
  @JsonProperty("allow_bunqto_field_for_request")
  private Boolean allowBunqtoFieldForRequest;
}
