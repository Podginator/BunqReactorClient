package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * [DEPRECATED - use /share-invite-monetary-account-response] Used to share a monetary account with
 * another bunq user, as in the 'Connect' feature in the bunq app. Allow the creation of share
 * inquiries that, in the same way as request inquiries, can be revoked by the user creating them or
 * accepted/rejected by the other party.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShareInviteMonetaryAccountInquiry {

  @JsonProperty("alias")
  private LabelMonetaryAccount alias;

  /** The user who created the share. */
  @JsonProperty("user_alias_created")
  private LabelUser userAliasCreated;

  /** The user who revoked the share. */
  @JsonProperty("user_alias_revoked")
  private LabelUser userAliasRevoked;

  /** The label of the user to share with. */
  @JsonProperty("counter_user_alias")
  private LabelUser counterUserAlias;

  /** The id of the monetary account the share applies to. */
  @JsonProperty("monetary_account_id")
  private Integer monetaryAccountId;

  /** The id of the draft share invite bank. */
  @JsonProperty("draft_share_invite_bank_id")
  private Integer draftShareInviteBankId;

  /** The share details. Only one of these objects is returned. */
  @JsonProperty("share_detail")
  private ShareDetail shareDetail;

  /**
   * The status of the share. Can be PENDING, REVOKED (the user deletes the share inquiry before
   * it's accepted), ACCEPTED, CANCELLED (the user deletes an active share) or CANCELLATION_PENDING,
   * CANCELLATION_ACCEPTED, CANCELLATION_REJECTED (for canceling mutual connects)
   */
  @JsonProperty("status")
  private String status;

  /** The relationship: COMPANY_DIRECTOR, COMPANY_EMPLOYEE, etc */
  @JsonProperty("relationship")
  private String relationship;

  /** The share type, either STANDARD or MUTUAL. */
  @JsonProperty("share_type")
  private String shareType;

  /** The start date of this share. */
  @JsonProperty("start_date")
  private String startDate;

  /** The expiration date of this share. */
  @JsonProperty("end_date")
  private String endDate;

  /** The id of the newly created share invite. */
  @JsonProperty("id")
  private Integer id;

  /** The pointer of the user to share with. */
  @JsonProperty("counter_user_alias_field_for_request")
  private Pointer counterUserAliasFieldForRequest;

  /** The id of the draft share invite bank. */
  @JsonProperty("draft_share_invite_bank_id_field_for_request")
  private Integer draftShareInviteBankIdFieldForRequest;

  /** The share details. Only one of these objects may be passed. */
  @JsonProperty("share_detail_field_for_request")
  private ShareDetail shareDetailFieldForRequest;

  /**
   * The status of the share. Can be PENDING, REVOKED (the user deletes the share inquiry before
   * it's accepted), ACCEPTED, CANCELLED (the user deletes an active share) or CANCELLATION_PENDING,
   * CANCELLATION_ACCEPTED, CANCELLATION_REJECTED (for canceling mutual connects).
   */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;

  /** The relationship: COMPANY_DIRECTOR, COMPANY_EMPLOYEE, etc */
  @JsonProperty("relationship_field_for_request")
  private String relationshipFieldForRequest;

  /** The share type, either STANDARD or MUTUAL. */
  @JsonProperty("share_type_field_for_request")
  private String shareTypeFieldForRequest;

  /** The start date of this share. */
  @JsonProperty("start_date_field_for_request")
  private String startDateFieldForRequest;

  /** The expiration date of this share. */
  @JsonProperty("end_date_field_for_request")
  private String endDateFieldForRequest;
}
