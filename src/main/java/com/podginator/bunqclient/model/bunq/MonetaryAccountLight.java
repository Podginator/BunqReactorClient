package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * With MonetaryAccountLight is a monetary account for bunq light users. Through this endpoint you
 * can retrieve information regarding your existing MonetaryAccountLights and update specific fields
 * of an existing MonetaryAccountLight. Examples of fields that can be updated are the description,
 * the daily limit and the avatar of the account.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MonetaryAccountLight {

  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the MonetaryAccountLight's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the MonetaryAccountLight's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The Avatar of the MonetaryAccountLight. */
  @JsonProperty("avatar")
  private Avatar avatar;

  /** The currency of the MonetaryAccountLight as an ISO 4217 formatted currency code. */
  @JsonProperty("currency")
  private String currency;

  /** The description of the MonetaryAccountLight. Defaults to 'bunq account'. */
  @JsonProperty("description")
  private String description;

  /**
   * The daily spending limit Amount of the MonetaryAccountLight. Defaults to 1000 EUR. Currency
   * must match the MonetaryAccountLight's currency. Limited to 10000 EUR.
   */
  @JsonProperty("daily_limit")
  private Amount dailyLimit;

  /** The current available balance Amount of the MonetaryAccountLight. */
  @JsonProperty("balance")
  private Amount balance;

  /** The Aliases for the MonetaryAccountLight. */
  @JsonProperty("alias")
  private List<Pointer> alias;

  /** The MonetaryAccountLight's public UUID. */
  @JsonProperty("public_uuid")
  private String publicUuid;

  /**
   * The status of the MonetaryAccountLight. Can be: ACTIVE, BLOCKED, CANCELLED or PENDING_REOPEN
   */
  @JsonProperty("status")
  private String status;

  /**
   * The sub-status of the MonetaryAccountLight providing extra information regarding the status.
   * Will be NONE for ACTIVE or PENDING_REOPEN, COMPLETELY or ONLY_ACCEPTING_INCOMING for BLOCKED
   * and REDEMPTION_INVOLUNTARY, REDEMPTION_VOLUNTARY or PERMANENT for CANCELLED.
   */
  @JsonProperty("sub_status")
  private String subStatus;

  /** The reason for voluntarily cancelling (closing) the MonetaryAccountBank, can only be OTHER. */
  @JsonProperty("reason")
  private String reason;

  /**
   * The optional free-form reason for voluntarily cancelling (closing) the MonetaryAccountBank. Can
   * be any user provided message.
   */
  @JsonProperty("reason_description")
  private String reasonDescription;

  /** The id of the User who owns the MonetaryAccountLight. */
  @JsonProperty("user_id")
  private Integer userId;

  /** The maximum balance Amount of the MonetaryAccountLight. */
  @JsonProperty("balance_maximum")
  private Amount balanceMaximum;

  /** The amount of the monthly budget used. */
  @JsonProperty("budget_month_used")
  private Amount budgetMonthUsed;

  /** The total amount of the monthly budget. */
  @JsonProperty("budget_month_maximum")
  private Amount budgetMonthMaximum;

  /** The amount of the yearly budget used. */
  @JsonProperty("budget_year_used")
  private Amount budgetYearUsed;

  /** The total amount of the yearly budget. */
  @JsonProperty("budget_year_maximum")
  private Amount budgetYearMaximum;

  /** The amount of the yearly withdrawal budget used. */
  @JsonProperty("budget_withdrawal_year_used")
  private Amount budgetWithdrawalYearUsed;

  /** The total amount of the yearly withdrawal budget. */
  @JsonProperty("budget_withdrawal_year_maximum")
  private Amount budgetWithdrawalYearMaximum;

  /** The settings of the MonetaryAccountLight. */
  @JsonProperty("setting")
  private MonetaryAccountSetting setting;

  /** The currency of the MonetaryAccountLight as an ISO 4217 formatted currency code. */
  @JsonProperty("currency_field_for_request")
  private String currencyFieldForRequest;

  /** The description of the MonetaryAccountLight. Defaults to 'bunq account'. */
  @JsonProperty("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * The daily spending limit Amount of the MonetaryAccountLight. Defaults to 1000 EUR. Currency
   * must match the MonetaryAccountLight's currency. Limited to 10000 EUR.
   */
  @JsonProperty("daily_limit_field_for_request")
  private Amount dailyLimitFieldForRequest;

  /** The UUID of the Avatar of the MonetaryAccountLight. */
  @JsonProperty("avatar_uuid_field_for_request")
  private String avatarUuidFieldForRequest;

  /**
   * The status of the MonetaryAccountLight. Ignored in POST requests (always set to ACTIVE) can be
   * CANCELLED or PENDING_REOPEN in PUT requests to cancel (close) or reopen the
   * MonetaryAccountLight. When updating the status and/or sub_status no other fields can be updated
   * in the same request (and vice versa).
   */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The sub-status of the MonetaryAccountLight providing extra information regarding the status.
   * Should be ignored for POST requests and can only be REDEMPTION_VOLUNTARY for PUT requests with
   * status CANCELLED. When updating the status and/or sub_status no other fields can be updated in
   * the same request (and vice versa).
   */
  @JsonProperty("sub_status_field_for_request")
  private String subStatusFieldForRequest;

  /**
   * The reason for voluntarily cancelling (closing) the MonetaryAccountBank, can only be OTHER.
   * Should only be specified if updating the status to CANCELLED.
   */
  @JsonProperty("reason_field_for_request")
  private String reasonFieldForRequest;

  /**
   * The optional free-form reason for voluntarily cancelling (closing) the MonetaryAccountBank. Can
   * be any user provided message. Should only be specified if updating the status to CANCELLED.
   */
  @JsonProperty("reason_description_field_for_request")
  private String reasonDescriptionFieldForRequest;

  /** The settings of the MonetaryAccountLight. */
  @JsonProperty("setting_field_for_request")
  private MonetaryAccountSetting settingFieldForRequest;
}
