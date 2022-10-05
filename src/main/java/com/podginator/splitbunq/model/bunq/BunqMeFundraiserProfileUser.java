package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** bunq.me public profile of the user. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BunqMeFundraiserProfileUser {

  /** Id of the monetary account on which you want to receive bunq.me payments. */
  @JsonProperty("monetary_account_id")
  private Integer monetaryAccountId;

  /** Id of the user owning the profile. */
  @JsonProperty("owner_user_id")
  private Integer ownerUserId;

  /** The color chosen for the bunq.me fundraiser profile in hexadecimal format. */
  @JsonProperty("color")
  private String color;

  /**
   * The LabelMonetaryAccount with the public information of the User and the MonetaryAccount that
   * created the bunq.me fundraiser profile.
   */
  @JsonProperty("alias")
  private LabelMonetaryAccount alias;

  /** The currency of the MonetaryAccount that created the bunq.me fundraiser profile. */
  @JsonProperty("currency")
  private String currency;

  /** The description of the bunq.me fundraiser profile. */
  @JsonProperty("description")
  private String description;

  /** The attachment used for the background of the bunq.me fundraiser profile. */
  @JsonProperty("attachment")
  private AttachmentPublic attachment;

  /** The pointer (url) which will be used to access the bunq.me fundraiser profile. */
  @JsonProperty("pointer")
  private Pointer pointer;

  /** The URL which the user is sent to when a payment is completed. */
  @JsonProperty("redirect_url")
  private String redirectUrl;

  /** The status of the bunq.me fundraiser profile, can be ACTIVE or DEACTIVATED. */
  @JsonProperty("status")
  private String status;

  /** ID of the monetary account on which you want to receive bunq.me fundraiser payments. */
  @JsonProperty("monetary_account_id_field_for_request")
  private Integer monetaryAccountIdFieldForRequest;

  /** The color chosen for the bunq.me fundraiser profile in hexadecimal format. */
  @JsonProperty("color_field_for_request")
  private String colorFieldForRequest;

  /**
   * The description of the bunq.me fundraiser profile. Maximum 9000 characters. Field is required
   * but can be an empty string.
   */
  @JsonProperty("description_field_for_request")
  private String descriptionFieldForRequest;

  /** The public UUID of the public attachment from which an avatar image must be created. */
  @JsonProperty("attachment_public_uuid_field_for_request")
  private String attachmentPublicUuidFieldForRequest;

  /** The pointer (url) which will be used to access the bunq.me fundraiser profile. */
  @JsonProperty("pointer_field_for_request")
  private Pointer pointerFieldForRequest;

  /** The URL which the user is sent to when a payment is completed. */
  @JsonProperty("redirect_url_field_for_request")
  private String redirectUrlFieldForRequest;

  /** The status of the bunq.me fundraiser profile. */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;
}
