package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * RequestInquiry, aka 'RFP' (Request for Payment), is one of the innovative features that bunq
 * offers. To request payment from another bunq account a new Request Inquiry is created. As with
 * payments you can add attachments to a RFP. Requests for Payment are the foundation for a number
 * of consumer features like 'Split the bill' and 'Request forwarding'. We invite you to invent your
 * own based on the bunq api!
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestInquiry {

  /** The id of the created RequestInquiry. */
  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the payment request's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the payment request's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The timestamp of when the payment request was responded to. */
  @JsonProperty("time_responded")
  private String timeResponded;

  /** The timestamp of when the payment request expired. */
  @JsonProperty("time_expiry")
  private String timeExpiry;

  /** The id of the monetary account the request response applies to. */
  @JsonProperty("monetary_account_id")
  private Integer monetaryAccountId;

  /** The requested amount. */
  @JsonProperty("amount_inquired")
  private Amount amountInquired;

  /** The responded amount. */
  @JsonProperty("amount_responded")
  private Amount amountResponded;

  /** The label that's displayed to the counterparty with the mutation. Includes user. */
  @JsonProperty("user_alias_created")
  private LabelUser userAliasCreated;

  /** The label that's displayed to the counterparty with the mutation. Includes user. */
  @JsonProperty("user_alias_revoked")
  private LabelUser userAliasRevoked;

  /**
   * The LabelMonetaryAccount with the public information of the MonetaryAccount the money was
   * requested from.
   */
  @JsonProperty("counterparty_alias")
  private LabelMonetaryAccount counterpartyAlias;

  /** The description of the inquiry. */
  @JsonProperty("description")
  private String description;

  /** The client's custom reference that was attached to the request and the mutation. */
  @JsonProperty("merchant_reference")
  private String merchantReference;

  /** The attachments attached to the payment. */
  @JsonProperty("attachment")
  private List<BunqId> attachment;

  /** The status of the request. */
  @JsonProperty("status")
  private String status;

  /** The id of the batch if the request was part of a batch. */
  @JsonProperty("batch_id")
  private Integer batchId;

  /** The id of the scheduled job if the request was scheduled. */
  @JsonProperty("scheduled_id")
  private Integer scheduledId;

  /** The minimum age the user accepting the RequestInquiry must have. */
  @JsonProperty("minimum_age")
  private Integer minimumAge;

  /** Whether or not an address must be provided on accept. */
  @JsonProperty("require_address")
  private String requireAddress;

  /** The url that points to the bunq.me request. */
  @JsonProperty("bunqme_share_url")
  private String bunqmeShareUrl;

  /** The URL which the user is sent to after accepting or rejecting the Request. */
  @JsonProperty("redirect_url")
  private String redirectUrl;

  /** The shipping address provided by the accepting user if an address was requested. */
  @JsonProperty("address_shipping")
  private Address addressShipping;

  /** The billing address provided by the accepting user if an address was requested. */
  @JsonProperty("address_billing")
  private Address addressBilling;

  /** The geolocation where the payment was done. */
  @JsonProperty("geolocation")
  private Geolocation geolocation;

  /**
   * The reference to the object used for split the bill. Can be Payment, PaymentBatch,
   * ScheduleInstance, RequestResponse and MasterCardAction
   */
  @JsonProperty("reference_split_the_bill")
  private RequestReferenceSplitTheBillAnchorObject referenceSplitTheBill;

  /**
   * The Amount requested to be paid by the person the RequestInquiry is sent to. Must be bigger
   * than 0.
   */
  @JsonProperty("amount_inquired_field_for_request")
  private Amount amountInquiredFieldForRequest;

  /**
   * The Alias of the party we are requesting the money from. Can be an Alias of type EMAIL,
   * PHONE_NUMBER or IBAN. In case the EMAIL or PHONE_NUMBER Alias does not refer to a bunq monetary
   * account, 'allow_bunqme' needs to be 'true' in order to trigger the creation of a bunq.me
   * request. Otherwise no request inquiry will be sent.
   */
  @JsonProperty("counterparty_alias_field_for_request")
  private Pointer counterpartyAliasFieldForRequest;

  /**
   * The description for the RequestInquiry. Maximum 9000 characters. Field is required but can be
   * an empty string.
   */
  @JsonProperty("description_field_for_request")
  private String descriptionFieldForRequest;

  /** The Attachments to attach to the RequestInquiry. */
  @JsonProperty("attachment_field_for_request")
  private List<BunqId> attachmentFieldForRequest;

  /**
   * Optional data to be included with the RequestInquiry specific to the merchant. Has to be unique
   * for the same source MonetaryAccount.
   */
  @JsonProperty("merchant_reference_field_for_request")
  private String merchantReferenceFieldForRequest;

  /**
   * The status of the RequestInquiry. Ignored in POST requests but can be used for revoking
   * (cancelling) the RequestInquiry by setting REVOKED with a PUT request.
   */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The minimum age the user accepting the RequestInquiry must have. Defaults to not checking. If
   * set, must be between 12 and 100 inclusive.
   */
  @JsonProperty("minimum_age_field_for_request")
  private Integer minimumAgeFieldForRequest;

  /**
   * Whether a billing and shipping address must be provided when paying the request. Possible
   * values are: BILLING, SHIPPING, BILLING_SHIPPING, NONE, OPTIONAL. Default is NONE.
   */
  @JsonProperty("require_address_field_for_request")
  private String requireAddressFieldForRequest;

  /**
   * [DEPRECATED] Whether or not the accepting user can give an extra tip on top of the requested
   * Amount. Defaults to false.
   */
  @JsonProperty("want_tip_field_for_request")
  private Boolean wantTipFieldForRequest;

  /**
   * [DEPRECATED] Whether or not the accepting user can choose to accept with a lower amount than
   * requested. Defaults to false.
   */
  @JsonProperty("allow_amount_lower_field_for_request")
  private Boolean allowAmountLowerFieldForRequest;

  /**
   * [DEPRECATED] Whether or not the accepting user can choose to accept with a higher amount than
   * requested. Defaults to false.
   */
  @JsonProperty("allow_amount_higher_field_for_request")
  private Boolean allowAmountHigherFieldForRequest;

  /** Whether or not sending a bunq.me request is allowed. */
  @JsonProperty("allow_bunqme_field_for_request")
  private Boolean allowBunqmeFieldForRequest;

  /** The URL which the user is sent to after accepting or rejecting the Request. */
  @JsonProperty("redirect_url_field_for_request")
  private String redirectUrlFieldForRequest;

  /** The ID of the associated event if the request was made using 'split the bill'. */
  @JsonProperty("event_id_field_for_request")
  private Integer eventIdFieldForRequest;
}
