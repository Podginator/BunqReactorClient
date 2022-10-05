package com.podginator.splitbunq.model.bunq;

import com.bunq.sdk.model.generated.object.CoOwner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** The endpoint for joint monetary accounts. */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonetaryAccountJoint {

  /** The id of the MonetaryAccountJoint. */
  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the MonetaryAccountJoint's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the MonetaryAccountJoint's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The Avatar of the MonetaryAccountJoint. */
  @JsonProperty("avatar")
  private Avatar avatar;

  /** The currency of the MonetaryAccountJoint as an ISO 4217 formatted currency code. */
  @JsonProperty("currency")
  private String currency;

  /** The description of the MonetaryAccountJoint. Defaults to 'bunq account'. */
  @JsonProperty("description")
  private String description;

  /**
   * The daily spending limit Amount of the MonetaryAccountJoint. Defaults to 1000 EUR. Currency
   * must match the MonetaryAccountJoint's currency. Limited to 10000 EUR.
   */
  @JsonProperty("daily_limit")
  private Amount dailyLimit;

  /** The maximum Amount the MonetaryAccountJoint can be 'in the red'. */
  @JsonProperty("overdraft_limit")
  private Amount overdraftLimit;

  /** The current available balance Amount of the MonetaryAccountJoint. */
  @JsonProperty("balance")
  private Amount balance;

  /** The Aliases for the MonetaryAccountJoint. */
  @JsonProperty("alias")
  private List<Pointer> alias;

  /** The MonetaryAccountJoint's public UUID. */
  @JsonProperty("public_uuid")
  private String publicUuid;

  /**
   * The status of the MonetaryAccountJoint. Can be: ACTIVE, BLOCKED, CANCELLED or PENDING_REOPEN
   */
  @JsonProperty("status")
  private String status;

  /**
   * The sub-status of the MonetaryAccountJoint providing extra information regarding the status.
   * Will be NONE for ACTIVE or PENDING_REOPEN, COMPLETELY or ONLY_ACCEPTING_INCOMING for BLOCKED
   * and REDEMPTION_INVOLUNTARY, REDEMPTION_VOLUNTARY or PERMANENT for CANCELLED.
   */
  @JsonProperty("sub_status")
  private String subStatus;

  /**
   * The reason for voluntarily cancelling (closing) the MonetaryAccountJoint, can only be OTHER.
   */
  @JsonProperty("reason")
  private String reason;

  /**
   * The optional free-form reason for voluntarily cancelling (closing) the MonetaryAccountJoint.
   * Can be any user provided message.
   */
  @JsonProperty("reason_description")
  private String reasonDescription;

  /** The users the account will be joint with. */
  @JsonProperty("all_co_owner")
  private List<CoOwner> allCoOwner;

  /** The id of the User who owns the MonetaryAccountJoint. */
  @JsonProperty("user_id")
  private Integer userId;

  /** The profile of the account. */
  @JsonProperty("monetary_account_profile")
  private MonetaryAccountProfile monetaryAccountProfile;

  /** The settings of the MonetaryAccountJoint. */
  @JsonProperty("setting")
  private MonetaryAccountSetting setting;

  /** The ids of the AutoSave. */
  @JsonProperty("all_auto_save_id")
  private List<BunqId> allAutoSaveId;

  /** The currency of the MonetaryAccountJoint as an ISO 4217 formatted currency code. */
  @JsonProperty("currency_field_for_request")
  private String currencyFieldForRequest;

  /** The description of the MonetaryAccountJoint. Defaults to 'bunq account'. */
  @JsonProperty("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * The daily spending limit Amount of the MonetaryAccountJoint. Defaults to 1000 EUR. Currency
   * must match the MonetaryAccountJoint's currency. Limited to 10000 EUR.
   */
  @JsonProperty("daily_limit_field_for_request")
  private Amount dailyLimitFieldForRequest;

  /** The maximum Amount the MonetaryAccountJoint can be 'in the red'. Must be 0 EUR or omitted. */
  @JsonProperty("overdraft_limit_field_for_request")
  private Amount overdraftLimitFieldForRequest;

  /**
   * The Aliases to add to MonetaryAccountJoint. Must all be confirmed first. Can mostly be ignored.
   */
  @JsonProperty("alias_field_for_request")
  private List<Pointer> aliasFieldForRequest;

  /** The UUID of the Avatar of the MonetaryAccountJoint. */
  @JsonProperty("avatar_uuid_field_for_request")
  private String avatarUuidFieldForRequest;

  /**
   * The status of the MonetaryAccountJoint. Ignored in POST requests (always set to ACTIVE) can be
   * CANCELLED or PENDING_REOPEN in PUT requests to cancel (close) or reopen the
   * MonetaryAccountJoint. When updating the status and/or sub_status no other fields can be updated
   * in the same request (and vice versa).
   */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The sub-status of the MonetaryAccountJoint providing extra information regarding the status.
   * Should be ignored for POST requests. In case of PUT requests with status CANCELLED it can only
   * be REDEMPTION_VOLUNTARY, while with status PENDING_REOPEN it can only be NONE. When updating
   * the status and/or sub_status no other fields can be updated in the same request (and vice
   * versa).
   */
  @JsonProperty("sub_status_field_for_request")
  private String subStatusFieldForRequest;

  /**
   * The reason for voluntarily cancelling (closing) the MonetaryAccountJoint, can only be OTHER.
   * Should only be specified if updating the status to CANCELLED.
   */
  @JsonProperty("reason_field_for_request")
  private String reasonFieldForRequest;

  /**
   * The optional free-form reason for voluntarily cancelling (closing) the MonetaryAccountJoint.
   * Can be any user provided message. Should only be specified if updating the status to CANCELLED.
   */
  @JsonProperty("reason_description_field_for_request")
  private String reasonDescriptionFieldForRequest;

  /** The users the account will be joint with. */
  @JsonProperty("all_co_owner_field_for_request")
  private List<CoOwner> allCoOwnerFieldForRequest;

  /** The settings of the MonetaryAccountJoint. */
  @JsonProperty("setting_field_for_request")
  private MonetaryAccountSetting settingFieldForRequest;
}
