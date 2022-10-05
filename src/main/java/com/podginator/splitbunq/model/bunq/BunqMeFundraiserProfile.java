package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** bunq.me public profile of the user. */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class BunqMeFundraiserProfile {

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

  /** The attachment attached to the fundraiser profile. */
  @JsonProperty("attachment")
  private AttachmentPublic attachment;

  /** The pointer (url) which will be used to access the bunq.me fundraiser profile. */
  @JsonProperty("pointer")
  private Pointer pointer;

  /** The status of the bunq.me fundraiser profile, can be ACTIVE or DEACTIVATED. */
  @JsonProperty("status")
  private String status;

  /** The URL which the user is sent to when a payment is completed. */
  @JsonProperty("redirect_url")
  private String redirectUrl;

  /** Provided if the user has enabled their invite link. */
  @JsonProperty("invite_profile_name")
  private String inviteProfileName;

  /** The pointer (url) which will be used to access the bunq.me fundraiser profile. */
  @JsonProperty("pointer_field_for_request")
  private Pointer pointerFieldForRequest;
}
