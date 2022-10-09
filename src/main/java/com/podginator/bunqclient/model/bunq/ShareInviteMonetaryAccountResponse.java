package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Used to view or respond to shares a user was invited to. See 'share-invite-bank-inquiry' for more
 * information about the inquiring endpoint.
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class ShareInviteMonetaryAccountResponse {

  /** The id of the ShareInviteBankResponse. */
  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the ShareInviteBankResponse creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the ShareInviteBankResponse last update. */
  @JsonProperty("updated")
  private String updated;

  /** The monetary account and user who created the share. */
  @JsonProperty("counter_alias")
  private LabelMonetaryAccount counterAlias;

  /** The user who cancelled the share if it has been revoked or rejected. */
  @JsonProperty("user_alias_cancelled")
  private LabelUser userAliasCancelled;

  /** The id of the monetary account the ACCEPTED share applies to. null otherwise. */
  @JsonProperty("monetary_account_id")
  private Integer monetaryAccountId;

  /** The id of the draft share invite bank. */
  @JsonProperty("draft_share_invite_bank_id")
  private Integer draftShareInviteBankId;

  /** The share details. */
  @JsonProperty("share_detail")
  private ShareDetail shareDetail;

  /**
   * The status of the share. Can be PENDING, REVOKED (the user deletes the share inquiry before
   * it's accepted), ACCEPTED, CANCELLED (the user deletes an active share) or CANCELLATION_PENDING,
   * CANCELLATION_ACCEPTED, CANCELLATION_REJECTED (for canceling mutual connects)
   */
  @JsonProperty("status")
  private String status;

  /** All of the relation users towards this MA. */
  @JsonProperty("relation_user")
  private RelationUser relationUser;

  /** The share type, either STANDARD or MUTUAL. */
  @JsonProperty("share_type")
  private String shareType;

  /** The start date of this share. */
  @JsonProperty("start_date")
  private String startDate;

  /** The expiration date of this share. */
  @JsonProperty("end_date")
  private String endDate;

  /** The description of this share. It is basically the monetary account description. */
  @JsonProperty("description")
  private String description;

  /**
   * The status of the share. Can be PENDING, REVOKED (the user deletes the share inquiry before
   * it's accepted), ACCEPTED, CANCELLED (the user deletes an active share) or CANCELLATION_PENDING,
   * CANCELLATION_ACCEPTED, CANCELLATION_REJECTED (for canceling mutual connects)
   */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The card to link to the shared monetary account. Used only if share_detail is
   * ShareDetailCardPayment.
   */
  @JsonProperty("card_id_field_for_request")
  private Integer cardIdFieldForRequest;
}
