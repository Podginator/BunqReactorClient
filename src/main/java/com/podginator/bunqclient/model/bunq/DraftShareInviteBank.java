package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Used to create a draft share invite for a monetary account with another bunq user, as in the
 * 'Connect' feature in the bunq app. The user that accepts the invite can share one of their
 * MonetaryAccounts with the user that created the invite.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DraftShareInviteBank {

  /** The user who created the draft share invite. */
  @JsonProperty("user_alias_created")
  private LabelUser userAliasCreated;

  /** The status of the draft share invite. Can be USED, CANCELLED and PENDING. */
  @JsonProperty("status")
  private String status;

  /** The moment when this draft share invite expires. */
  @JsonProperty("expiration")
  private String expiration;

  /** The id of the share invite bank response this draft share belongs to. */
  @JsonProperty("share_invite_bank_response_id")
  private Integer shareInviteBankResponseId;

  /**
   * The URL redirecting user to the draft share invite in the app. Only works on mobile devices.
   */
  @JsonProperty("draft_share_url")
  private String draftShareUrl;

  /** The draft share invite details. */
  @JsonProperty("draft_share_settings")
  private DraftShareInviteEntry draftShareSettings;

  /** The id of the newly created draft share invite. */
  @JsonProperty("id")
  private Integer id;

  /**
   * The status of the draft share invite. Can be CANCELLED (the user cancels the draft share before
   * it's used).
   */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;

  /** The moment when this draft share invite expires. */
  @JsonProperty("expiration_field_for_request")
  private String expirationFieldForRequest;

  /** The draft share invite details. */
  @JsonProperty("draft_share_settings_field_for_request")
  private DraftShareInviteEntry draftShareSettingsFieldForRequest;
}
