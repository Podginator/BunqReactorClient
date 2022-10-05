package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Using Payment, you can send payments to bunq and non-bunq users from your bunq MonetaryAccounts.
 * This can be done using bunq Aliases or IBAN Aliases. When transferring money to other bunq
 * MonetaryAccounts you can also refer to Attachments. These will be received by the counter-party
 * as part of the Payment. You can also retrieve a single Payment or all executed Payments of a
 * specific monetary account.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payment {

  /** The id of the created Payment. */
  @JsonProperty("id")
  private Integer id;

  /** The timestamp when the Payment was done. */
  @JsonProperty("created")
  private String created;

  /**
   * The timestamp when the Payment was last updated (will be updated when chat messages are
   * received).
   */
  @JsonProperty("updated")
  private String updated;

  /**
   * The id of the MonetaryAccount the Payment was made to or from (depending on whether this is an
   * incoming or outgoing Payment).
   */
  @JsonProperty("monetary_account_id")
  private Integer monetaryAccountId;

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

  /** The type of Payment, can be BUNQ, EBA_SCT, EBA_SDD, IDEAL, SWIFT or FIS (card). */
  @JsonProperty("type")
  private String type;

  /**
   * The sub-type of the Payment, can be PAYMENT, WITHDRAWAL, REVERSAL, REQUEST, BILLING, SCT, SDD
   * or NLO.
   */
  @JsonProperty("sub_type")
  private String subType;

  /** The status of the bunq.to payment. */
  @JsonProperty("bunqto_status")
  private String bunqtoStatus;

  /** The sub status of the bunq.to payment. */
  @JsonProperty("bunqto_sub_status")
  private String bunqtoSubStatus;

  /** The status of the bunq.to payment. */
  @JsonProperty("bunqto_share_url")
  private String bunqtoShareUrl;

  /** When bunq.to payment is about to expire. */
  @JsonProperty("bunqto_expiry")
  private String bunqtoExpiry;

  /** The timestamp of when the bunq.to payment was responded to. */
  @JsonProperty("bunqto_time_responded")
  private String bunqtoTimeResponded;

  /** The Attachments attached to the Payment. */
  @JsonProperty("attachment")
  private List<AttachmentMonetaryAccountPayment> attachment;

  /** Optional data included with the Payment specific to the merchant. */
  @JsonProperty("merchant_reference")
  private String merchantReference;

  /** The id of the PaymentBatch if this Payment was part of one. */
  @JsonProperty("batch_id")
  private Integer batchId;

  /** The id of the JobScheduled if the Payment was scheduled. */
  @JsonProperty("scheduled_id")
  private Integer scheduledId;

  /** A shipping Address provided with the Payment, currently unused. */
  @JsonProperty("address_shipping")
  private Address addressShipping;

  /** A billing Address provided with the Payment, currently unused. */
  @JsonProperty("address_billing")
  private Address addressBilling;

  /** The Geolocation where the Payment was done from. */
  @JsonProperty("geolocation")
  private Geolocation geolocation;

  /**
   * The reference to the object used for split the bill. Can be RequestInquiry or
   * RequestInquiryBatch
   */
  @JsonProperty("request_reference_split_the_bill")
  private List<RequestInquiryReference> requestReferenceSplitTheBill;

  /** The new balance of the monetary account after the mutation. */
  @JsonProperty("balance_after_mutation")
  private Amount balanceAfterMutation;

  /** A reference to the PaymentAutoAllocateInstance if it exists. */
  @JsonProperty("payment_auto_allocate_instance")
  private PaymentAutoAllocateInstance paymentAutoAllocateInstance;

  /**
   * The Amount to transfer with the Payment. Must be bigger than 0 and smaller than the
   * MonetaryAccount's balance.
   */
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
   * The description for the Payment. Maximum 140 characters for Payments to external IBANs, 9000
   * characters for Payments to only other bunq MonetaryAccounts. Field is required but can be an
   * empty string.
   */
  @JsonProperty("description_field_for_request")
  private String descriptionFieldForRequest;

  /** The Attachments to attach to the Payment. */
  @JsonProperty("attachment_field_for_request")
  private List<AttachmentMonetaryAccountPayment> attachmentFieldForRequest;

  /** Optional data to be included with the Payment specific to the merchant. */
  @JsonProperty("merchant_reference_field_for_request")
  private String merchantReferenceFieldForRequest;

  /** Whether or not sending a bunq.to payment is allowed. */
  @JsonProperty("allow_bunqto_field_for_request")
  private Boolean allowBunqtoFieldForRequest;
}
