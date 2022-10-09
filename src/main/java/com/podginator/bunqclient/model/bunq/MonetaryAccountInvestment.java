package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Endpoint for managing investment monetary accounts. */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonetaryAccountInvestment {

  /** The id of the MonetaryAccountInvestment. */
  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the MonetaryAccountInvestment's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the MonetaryAccountInvestment's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The Avatar of the MonetaryAccountInvestment. */
  @JsonProperty("avatar")
  private Avatar avatar;

  /** The currency of the MonetaryAccountInvestment as an ISO 4217 formatted currency code. */
  @JsonProperty("currency")
  private String currency;

  /** The description of the MonetaryAccountInvestment. Defaults to 'bunq account'. */
  @JsonProperty("description")
  private String description;

  /**
   * The daily spending limit Amount of the MonetaryAccountInvestment. Defaults to 1000 EUR.
   * Currency must match the MonetaryAccountInvestment's currency. Limited to 10000 EUR.
   */
  @JsonProperty("daily_limit")
  private Amount dailyLimit;

  /** The current available balance Amount of the MonetaryAccountInvestment. */
  @JsonProperty("balance")
  private Amount balance;

  /** The Aliases for the MonetaryAccountInvestment. */
  @JsonProperty("alias")
  private List<Pointer> alias;

  /** The MonetaryAccountInvestment's public UUID. */
  @JsonProperty("public_uuid")
  private String publicUuid;

  /**
   * The status of the MonetaryAccountInvestment. Can be: ACTIVE, BLOCKED, CANCELLED or
   * PENDING_REOPEN
   */
  @JsonProperty("status")
  private String status;

  /**
   * The sub-status of the MonetaryAccountInvestment providing extra information regarding the
   * status. Will be NONE for ACTIVE or PENDING_REOPEN, COMPLETELY or ONLY_ACCEPTING_INCOMING for
   * BLOCKED and REDEMPTION_INVOLUNTARY, REDEMPTION_VOLUNTARY or PERMANENT for CANCELLED.
   */
  @JsonProperty("sub_status")
  private String subStatus;

  /**
   * The reason for voluntarily cancelling (closing) the MonetaryAccountInvestment, can only be
   * OTHER.
   */
  @JsonProperty("reason")
  private String reason;

  /**
   * The optional free-form reason for voluntarily cancelling (closing) the
   * MonetaryAccountInvestment. Can be any user provided message.
   */
  @JsonProperty("reason_description")
  private String reasonDescription;

  /** The id of the User who owns the MonetaryAccountInvestment. */
  @JsonProperty("user_id")
  private Integer userId;

  /** The profile of the account. */
  @JsonProperty("monetary_account_profile")
  private MonetaryAccountProfile monetaryAccountProfile;

  /** The legal name of the user / company using this monetary account. */
  @JsonProperty("display_name")
  private String displayName;

  /** The settings of the MonetaryAccountInvestment. */
  @JsonProperty("setting")
  private MonetaryAccountSetting setting;

  /** The ids of the AutoSave. */
  @JsonProperty("all_auto_save_id")
  private List<BunqId> allAutoSaveId;

  /** The currency of the MonetaryAccountInvestment as an ISO 4217 formatted currency code. */
  @JsonProperty("currency_field_for_request")
  private String currencyFieldForRequest;

  /** The provider of the investment service. */
  @JsonProperty("provider_field_for_request")
  private String providerFieldForRequest;

  /** The description of the MonetaryAccountInvestment. Defaults to 'bunq account'. */
  @JsonProperty("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * The daily spending limit Amount of the MonetaryAccountInvestment. Defaults to 1000 EUR.
   * Currency must match the MonetaryAccountInvestment's currency. Limited to 10000 EUR.
   */
  @JsonProperty("daily_limit_field_for_request")
  private Amount dailyLimitFieldForRequest;

  /** The UUID of the Avatar of the MonetaryAccountInvestment. */
  @JsonProperty("avatar_uuid_field_for_request")
  private String avatarUuidFieldForRequest;

  /**
   * The status of the MonetaryAccountInvestment. Ignored in POST requests (always set to ACTIVE)
   * can be CANCELLED or PENDING_REOPEN in PUT requests to cancel (close) or reopen the
   * MonetaryAccountInvestment. When updating the status and/or sub_status no other fields can be
   * updated in the same request (and vice versa).
   */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The sub-status of the MonetaryAccountInvestment providing extra information regarding the
   * status. Should be ignored for POST requests. In case of PUT requests with status CANCELLED it
   * can only be REDEMPTION_VOLUNTARY, while with status PENDING_REOPEN it can only be NONE. When
   * updating the status and/or sub_status no other fields can be updated in the same request (and
   * vice versa).
   */
  @JsonProperty("sub_status_field_for_request")
  private String subStatusFieldForRequest;

  /**
   * The reason for voluntarily cancelling (closing) the MonetaryAccountInvestment, can only be
   * OTHER. Should only be specified if updating the status to CANCELLED.
   */
  @JsonProperty("reason_field_for_request")
  private String reasonFieldForRequest;

  /**
   * The optional free-form reason for voluntarily cancelling (closing) the
   * MonetaryAccountInvestment. Can be any user provided message. Should only be specified if
   * updating the status to CANCELLED.
   */
  @JsonProperty("reason_description_field_for_request")
  private String reasonDescriptionFieldForRequest;

  /** The legal name of the user / company using this monetary account. */
  @JsonProperty("display_name_field_for_request")
  private String displayNameFieldForRequest;

  /** The settings of the MonetaryAccountInvestment. */
  @JsonProperty("setting_field_for_request")
  private MonetaryAccountSetting settingFieldForRequest;
}
