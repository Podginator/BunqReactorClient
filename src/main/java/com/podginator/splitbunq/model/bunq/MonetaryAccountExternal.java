package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Endpoint for managing monetary accounts which are connected to external services. */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonetaryAccountExternal {

  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the MonetaryAccountExternal's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the MonetaryAccountExternal's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The Avatar of the MonetaryAccountExternal. */
  @JsonProperty("avatar")
  private Avatar avatar;

  /** The currency of the MonetaryAccountExternal as an ISO 4217 formatted currency code. */
  @JsonProperty("currency")
  private String currency;

  /** The description of the MonetaryAccountExternal. Defaults to 'bunq account'. */
  @JsonProperty("description")
  private String description;

  /**
   * The daily spending limit Amount of the MonetaryAccountExternal. Defaults to 1000 EUR. Currency
   * must match the MonetaryAccountExternal's currency. Limited to 10000 EUR.
   */
  @JsonProperty("daily_limit")
  private Amount dailyLimit;

  /** The maximum Amount the MonetaryAccountExternal can be 'in the red'. */
  @JsonProperty("overdraft_limit")
  private Amount overdraftLimit;

  /** The current available balance Amount of the MonetaryAccountExternal. */
  @JsonProperty("balance")
  private Amount balance;

  /** The Aliases for the MonetaryAccountExternal. */
  @JsonProperty("alias")
  private List<Pointer> alias;

  /** The MonetaryAccountExternal's public UUID. */
  @JsonProperty("public_uuid")
  private String publicUuid;

  /**
   * The status of the MonetaryAccountExternal. Can be: ACTIVE, BLOCKED, CANCELLED or PENDING_REOPEN
   */
  @JsonProperty("status")
  private String status;

  /**
   * The sub-status of the MonetaryAccountExternal providing extra information regarding the status.
   * Will be NONE for ACTIVE or PENDING_REOPEN, COMPLETELY or ONLY_ACCEPTING_INCOMING for BLOCKED
   * and REDEMPTION_INVOLUNTARY, REDEMPTION_VOLUNTARY or PERMANENT for CANCELLED.
   */
  @JsonProperty("sub_status")
  private String subStatus;

  /**
   * The reason for voluntarily cancelling (closing) the MonetaryAccountExternal, can only be OTHER.
   */
  @JsonProperty("reason")
  private String reason;

  /**
   * The optional free-form reason for voluntarily cancelling (closing) the MonetaryAccountExternal.
   * Can be any user provided message.
   */
  @JsonProperty("reason_description")
  private String reasonDescription;

  /** The id of the User who owns the MonetaryAccountExternal. */
  @JsonProperty("user_id")
  private Integer userId;

  /** The profile of the account. */
  @JsonProperty("monetary_account_profile")
  private MonetaryAccountProfile monetaryAccountProfile;

  /** The legal name of the user / company using this monetary account. */
  @JsonProperty("display_name")
  private String displayName;

  /** The settings of the MonetaryAccountExternal. */
  @JsonProperty("setting")
  private MonetaryAccountSetting setting;

  /** The ids of the AutoSave. */
  @JsonProperty("all_auto_save_id")
  private List<BunqId> allAutoSaveId;

  /** The currency of the MonetaryAccountExternal as an ISO 4217 formatted currency code. */
  @JsonProperty("currency_field_for_request")
  private String currencyFieldForRequest;

  /** The description of the MonetaryAccountExternal. Defaults to 'bunq account'. */
  @JsonProperty("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * The daily spending limit Amount of the MonetaryAccountExternal. Defaults to 1000 EUR. Currency
   * must match the MonetaryAccountExternal's currency. Limited to 10000 EUR.
   */
  @JsonProperty("daily_limit_field_for_request")
  private Amount dailyLimitFieldForRequest;

  /** The UUID of the Avatar of the MonetaryAccountExternal. */
  @JsonProperty("avatar_uuid_field_for_request")
  private String avatarUuidFieldForRequest;

  /**
   * The status of the MonetaryAccountExternal. Ignored in POST requests (always set to ACTIVE) can
   * be CANCELLED or PENDING_REOPEN in PUT requests to cancel (close) or reopen the
   * MonetaryAccountExternal. When updating the status and/or sub_status no other fields can be
   * updated in the same request (and vice versa).
   */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The sub-status of the MonetaryAccountExternal providing extra information regarding the status.
   * Should be ignored for POST requests. In case of PUT requests with status CANCELLED it can only
   * be REDEMPTION_VOLUNTARY, while with status PENDING_REOPEN it can only be NONE. When updating
   * the status and/or sub_status no other fields can be updated in the same request (and vice
   * versa).
   */
  @JsonProperty("sub_status_field_for_request")
  private String subStatusFieldForRequest;

  /**
   * The reason for voluntarily cancelling (closing) the MonetaryAccountExternal, can only be OTHER.
   * Should only be specified if updating the status to CANCELLED.
   */
  @JsonProperty("reason_field_for_request")
  private String reasonFieldForRequest;

  /**
   * The optional free-form reason for voluntarily cancelling (closing) the MonetaryAccountExternal.
   * Can be any user provided message. Should only be specified if updating the status to CANCELLED.
   */
  @JsonProperty("reason_description_field_for_request")
  private String reasonDescriptionFieldForRequest;

  /** The legal name of the user / company using this monetary account. */
  @JsonProperty("display_name_field_for_request")
  private String displayNameFieldForRequest;

  /** The settings of the MonetaryAccountExternal. */
  @JsonProperty("setting_field_for_request")
  private MonetaryAccountSetting settingFieldForRequest;
}
