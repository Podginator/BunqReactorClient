package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A RequestResponse is what a user on the other side of a RequestInquiry gets when he is sent one.
 * So a RequestInquiry is the initiator and visible for the user that sent it and that wants to
 * receive the money. A RequestResponse is what the other side sees, i.e. the user that pays the
 * money to accept the request. The content is almost identical.
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class RequestResponse {

  /** The id of the Request Response. */
  @JsonProperty("id")
  private Integer id;

  /** The timestamp when the Request Response was created. */
  @JsonProperty("created")
  private String created;

  /**
   * The timestamp when the Request Response was last updated (will be updated when chat messages
   * are received).
   */
  @JsonProperty("updated")
  private String updated;

  /** The timestamp of when the RequestResponse was responded to. */
  @JsonProperty("time_responded")
  private String timeResponded;

  /** The timestamp of when the RequestResponse expired or will expire. */
  @JsonProperty("time_expiry")
  private String timeExpiry;

  /** The timestamp of when a refund request for the RequestResponse was claimed. */
  @JsonProperty("time_refund_requested")
  private String timeRefundRequested;

  /** The timestamp of when the RequestResponse was refunded. */
  @JsonProperty("time_refunded")
  private String timeRefunded;

  /** The label of the user that requested the refund. */
  @JsonProperty("user_refund_requested")
  private LabelUser userRefundRequested;

  /** The id of the MonetaryAccount the RequestResponse was received on. */
  @JsonProperty("monetary_account_id")
  private Integer monetaryAccountId;

  /** The requested Amount. */
  @JsonProperty("amount_inquired")
  private Amount amountInquired;

  /** The Amount the RequestResponse was accepted with. */
  @JsonProperty("amount_responded")
  private Amount amountResponded;

  /**
   * The status of the RequestResponse. Can be ACCEPTED, PENDING, REJECTED, REFUND_REQUESTED,
   * REFUNDED or REVOKED.
   */
  @JsonProperty("status")
  private String status;

  /**
   * The description for the RequestResponse provided by the requesting party. Maximum 9000
   * characters.
   */
  @JsonProperty("description")
  private String description;

  /**
   * The LabelMonetaryAccount with the public information of the MonetaryAccount this
   * RequestResponse was received on.
   */
  @JsonProperty("alias")
  private LabelMonetaryAccount alias;

  /**
   * The LabelMonetaryAccount with the public information of the MonetaryAccount that is requesting
   * money with this RequestResponse.
   */
  @JsonProperty("counterparty_alias")
  private LabelMonetaryAccount counterpartyAlias;

  /** The Attachments attached to the RequestResponse. */
  @JsonProperty("attachment")
  private List<Attachment> attachment;

  /** The minimum age the user accepting the RequestResponse must have. */
  @JsonProperty("minimum_age")
  private Integer minimumAge;

  /** Whether or not an address must be provided on accept. */
  @JsonProperty("require_address")
  private String requireAddress;

  /** The Geolocation where the RequestResponse was created. */
  @JsonProperty("geolocation")
  private Geolocation geolocation;

  /**
   * The type of the RequestInquiry. Can be DIRECT_DEBIT, DIRECT_DEBIT_B2B, IDEAL, SOFORT or
   * INTERNAL.
   */
  @JsonProperty("type")
  private String type;

  /**
   * The subtype of the RequestInquiry. Can be ONCE or RECURRING for DIRECT_DEBIT RequestInquiries
   * and NONE for all other.
   */
  @JsonProperty("sub_type")
  private String subType;

  /** The URL which the user is sent to after accepting or rejecting the Request. */
  @JsonProperty("redirect_url")
  private String redirectUrl;

  /** The billing address provided by the accepting user if an address was requested. */
  @JsonProperty("address_billing")
  private Address addressBilling;

  /** The shipping address provided by the accepting user if an address was requested. */
  @JsonProperty("address_shipping")
  private Address addressShipping;

  /** The credit scheme id provided by the counterparty for DIRECT_DEBIT inquiries. */
  @JsonProperty("credit_scheme_identifier")
  private String creditSchemeIdentifier;

  /** The mandate id provided by the counterparty for DIRECT_DEBIT inquiries. */
  @JsonProperty("mandate_identifier")
  private String mandateIdentifier;

  /** The whitelist id for this action or null. */
  @JsonProperty("eligible_whitelist_id")
  private Integer eligibleWhitelistId;

  /**
   * The reference to the object used for split the bill. Can be RequestInquiry or
   * RequestInquiryBatch
   */
  @JsonProperty("request_reference_split_the_bill")
  private List<RequestInquiryReference> requestReferenceSplitTheBill;

  /** The Amount the user decides to pay. */
  @JsonProperty("amount_responded_field_for_request")
  private Amount amountRespondedFieldForRequest;

  /** The responding status of the RequestResponse. Can be ACCEPTED or REJECTED. */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The shipping Address to return to the user who created the RequestInquiry. Should only be
   * provided if 'require_address' is set to SHIPPING, BILLING_SHIPPING or OPTIONAL.
   */
  @JsonProperty("address_shipping_field_for_request")
  private Address addressShippingFieldForRequest;

  /**
   * The billing Address to return to the user who created the RequestInquiry. Should only be
   * provided if 'require_address' is set to BILLING, BILLING_SHIPPING or OPTIONAL.
   */
  @JsonProperty("address_billing_field_for_request")
  private Address addressBillingFieldForRequest;
}
