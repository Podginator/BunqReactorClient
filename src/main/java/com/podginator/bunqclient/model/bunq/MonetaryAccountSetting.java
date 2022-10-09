package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MonetaryAccountSetting {

  /** The color chosen for the MonetaryAccount. */
  @JsonProperty("color")
  private String color;

  /** The icon chosen for the MonetaryAccount. */
  @JsonProperty("icon")
  private String icon;

  /**
   * The status of the avatar. Can be either AVATAR_DEFAULT, AVATAR_CUSTOM or AVATAR_UNDETERMINED.
   */
  @JsonProperty("default_avatar_status")
  private String defaultAvatarStatus;

  /** The chat restriction. Possible values are ALLOW_INCOMING or BLOCK_INCOMING */
  @JsonProperty("restriction_chat")
  private String restrictionChat;

  /**
   * The preference for this monetary account on whether to automatically accept or reject expiring
   * SDDs.
   */
  @JsonProperty("sdd_expiration_action")
  private String sddExpirationAction;

  /** The color chosen for the MonetaryAccount in hexadecimal format. */
  @JsonProperty("color_field_for_request")
  private String colorFieldForRequest;

  /** The icon chosen for the MonetaryAccount. */
  @JsonProperty("icon_field_for_request")
  private String iconFieldForRequest;

  /** The status of the avatar. Cannot be updated directly. */
  @JsonProperty("default_avatar_status_field_for_request")
  private String defaultAvatarStatusFieldForRequest;

  /** The chat restriction. Possible values are ALLOW_INCOMING or BLOCK_INCOMING */
  @JsonProperty("restriction_chat_field_for_request")
  private String restrictionChatFieldForRequest;

  /**
   * The preference for this monetary account on whether to automatically accept or reject expiring
   * SDDs.
   */
  @JsonProperty("sdd_expiration_action_field_for_request")
  private String sddExpirationActionFieldForRequest;
}
