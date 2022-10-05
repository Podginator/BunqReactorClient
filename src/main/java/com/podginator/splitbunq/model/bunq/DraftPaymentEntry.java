package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class DraftPaymentEntry {

  /** The id of the draft payment entry. */
  @JsonProperty("id")
  private Integer id;

  /** The amount of the payment. */
  @JsonProperty("amount")
  private Amount amount;

  /**
   * The LabelMonetaryAccount containing the public information of 'this' (party) side of the
   * DraftPayment.
   */
  @JsonProperty("alias")
  private LabelMonetaryAccount alias;

  /**
   * The LabelMonetaryAccount containing the public information of the other (counterparty) side of
   * the DraftPayment.
   */
  @JsonProperty("counterparty_alias")
  private LabelMonetaryAccount counterpartyAlias;

  /**
   * The description for the DraftPayment. Maximum 140 characters for DraftPayments to external
   * IBANs, 9000 characters for DraftPayments to only other bunq MonetaryAccounts.
   */
  @JsonProperty("description")
  private String description;

  /** Optional data to be included with the Payment specific to the merchant. */
  @JsonProperty("merchant_reference")
  private String merchantReference;

  /** The type of the draft payment entry. */
  @JsonProperty("type")
  private String type;

  /** The Attachments attached to the DraftPayment. */
  @JsonProperty("attachment")
  private List<AttachmentMonetaryAccountPayment> attachment;

  /** The amount of the payment. */
  @JsonProperty("amount_field_for_request")
  private Amount amountFieldForRequest;

  /**
   * The Alias of the party we are transferring the money to. Can be an Alias of type EMAIL or
   * PHONE_NUMBER (for bunq MonetaryAccounts or bunq.to payments) or IBAN (for external bank
   * account).
   */
  @JsonProperty("counterparty_alias_field_for_request")
  private Pointer counterpartyAliasFieldForRequest;

  /**
   * The description for the DraftPayment. Maximum 140 characters for DraftPayments to external
   * IBANs, 9000 characters for DraftPayments to only other bunq MonetaryAccounts. Field is required
   * but can be an empty string.
   */
  @JsonProperty("description_field_for_request")
  private String descriptionFieldForRequest;

  /** Optional data to be included with the Payment specific to the merchant. */
  @JsonProperty("merchant_reference_field_for_request")
  private String merchantReferenceFieldForRequest;
}
