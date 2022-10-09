package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Using this call you create a request for payment from an external token provided with an ideal
 * transaction. Make sure your iDEAL payments are compliant with the iDEAL standards, by following
 * the following manual: https://www.bunq.com/terms-idealstandards. It's very important to keep
 * these points in mind when you are using the endpoint to make iDEAL payments from your
 * application.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TokenQrRequestIdeal {

  /** The id of the RequestResponse. */
  @JsonProperty("id")
  private Integer id;

  /** The timestamp of when the RequestResponse was responded to. */
  @JsonProperty("time_responded")
  private String timeResponded;

  /** The timestamp of when the RequestResponse expired or will expire. */
  @JsonProperty("time_expiry")
  private String timeExpiry;

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

  /**
   * The description for the RequestResponse provided by the requesting party. Maximum 9000
   * characters.
   */
  @JsonProperty("description")
  private String description;

  /** The Attachments attached to the RequestResponse. */
  @JsonProperty("attachment")
  private List<Attachment> attachment;

  /** The status of the created RequestResponse. Can only be PENDING. */
  @JsonProperty("status")
  private String status;

  /** The minimum age the user accepting the RequestResponse must have. */
  @JsonProperty("minimum_age")
  private Integer minimumAge;

  /** Whether or not an address must be provided on accept. */
  @JsonProperty("require_address")
  private String requireAddress;

  /** The shipping address provided by the accepting user if an address was requested. */
  @JsonProperty("address_shipping")
  private Address addressShipping;

  /** The billing address provided by the accepting user if an address was requested. */
  @JsonProperty("address_billing")
  private Address addressBilling;

  /** The Geolocation where the RequestResponse was created. */
  @JsonProperty("geolocation")
  private Geolocation geolocation;

  /** The URL which the user is sent to after accepting or rejecting the Request. */
  @JsonProperty("redirect_url")
  private String redirectUrl;

  /** The type of the RequestResponse. Can be only be IDEAL. */
  @JsonProperty("type")
  private String type;

  /** The subtype of the RequestResponse. Can be only be NONE. */
  @JsonProperty("sub_type")
  private String subType;

  /** The whitelist id for this action or null. */
  @JsonProperty("eligible_whitelist_id")
  private Integer eligibleWhitelistId;

  /** The token passed from a site or read from a QR code. */
  @JsonProperty("token_field_for_request")
  private String tokenFieldForRequest;
}
