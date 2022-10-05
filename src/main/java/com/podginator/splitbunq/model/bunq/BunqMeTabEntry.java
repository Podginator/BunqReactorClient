package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * bunq.me tabs allows you to create a payment request and share the link through e-mail, chat, etc.
 * Multiple persons are able to respond to the payment request and pay through bunq, iDeal or
 * SOFORT.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BunqMeTabEntry {

  @JsonProperty("uuid")
  private String uuid;

  /** The requested Amount. */
  @JsonProperty("amount_inquired")
  private Amount amountInquired;

  /**
   * The LabelMonetaryAccount with the public information of the User and the MonetaryAccount that
   * created the bunq.me link.
   */
  @JsonProperty("alias")
  private LabelMonetaryAccount alias;

  /** The description for the bunq.me. Maximum 9000 characters. */
  @JsonProperty("description")
  private String description;

  /** The status of the bunq.me. Can be WAITING_FOR_PAYMENT, CANCELLED or EXPIRED. */
  @JsonProperty("status")
  private String status;

  /** The URL which the user is sent to when a payment is completed. */
  @JsonProperty("redirect_url")
  private String redirectUrl;

  /** List of available merchants. */
  @JsonProperty("merchant_available")
  private List<BunqMeMerchantAvailable> merchantAvailable;

  /** Provided if the user has enabled their invite link. */
  @JsonProperty("invite_profile_name")
  private String inviteProfileName;

  /** The Amount requested to be paid. Can be optional. */
  @JsonProperty("amount_inquired_field_for_request")
  private Amount amountInquiredFieldForRequest;

  /**
   * The description for the bunq.me. Maximum 9000 characters. Field is required but can be an empty
   * string.
   */
  @JsonProperty("description_field_for_request")
  private String descriptionFieldForRequest;

  /** The URL which the user is sent to after making a payment. */
  @JsonProperty("redirect_url_field_for_request")
  private String redirectUrlFieldForRequest;
}
