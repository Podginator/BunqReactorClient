package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** With MonetaryAccountSavings you can create a new savings account. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MonetaryAccountSavings {

  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the MonetaryAccountSavings's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the MonetaryAccountSavings's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The Avatar of the MonetaryAccountSavings. */
  @JsonProperty("avatar")
  private Avatar avatar;

  /** The currency of the MonetaryAccountSavings as an ISO 4217 formatted currency code. */
  @JsonProperty("currency")
  private String currency;

  /** The description of the MonetaryAccountSavings. Defaults to 'bunq account'. */
  @JsonProperty("description")
  private String description;

  /**
   * The daily spending limit Amount of the MonetaryAccountSavings. Defaults to 1000 EUR. Currency
   * must match the MonetaryAccountSavings's currency. Limited to 10000 EUR.
   */
  @JsonProperty("daily_limit")
  private com.podginator.bunqclient.model.bunq.Amount dailyLimit;

  /**
   * The maximum Amount the MonetaryAccountSavings can be 'in the red'. Must be 0 EUR or omitted.
   */
  @JsonProperty("overdraft_limit")
  private com.podginator.bunqclient.model.bunq.Amount overdraftLimit;

  /** The current available balance Amount of the MonetaryAccountSavings. */
  @JsonProperty("balance")
  private com.podginator.bunqclient.model.bunq.Amount balance;

  /** The Aliases for the MonetaryAccountSavings. */
  @JsonProperty("alias")
  private List<Pointer> alias;

  /** The MonetaryAccountSavings's public UUID. */
  @JsonProperty("public_uuid")
  private String publicUuid;

  /**
   * The status of the MonetaryAccountSavings. Can be: ACTIVE, BLOCKED, CANCELLED or PENDING_REOPEN
   */
  @JsonProperty("status")
  private String status;

  /**
   * The sub-status of the MonetaryAccountSavings providing extra information regarding the status.
   * Will be NONE for ACTIVE or PENDING_REOPEN, COMPLETELY or ONLY_ACCEPTING_INCOMING for BLOCKED
   * and REDEMPTION_INVOLUNTARY, REDEMPTION_VOLUNTARY or PERMANENT for CANCELLED.
   */
  @JsonProperty("sub_status")
  private String subStatus;

  /**
   * The reason for voluntarily cancelling (closing) the MonetaryAccountSavings, can only be OTHER.
   */
  @JsonProperty("reason")
  private String reason;

  /**
   * The optional free-form reason for voluntarily cancelling (closing) the MonetaryAccountSavings.
   * Can be any user provided message.
   */
  @JsonProperty("reason_description")
  private String reasonDescription;

  /** The users the account will be joint with. */
  @JsonProperty("all_co_owner")
  private List<com.podginator.bunqclient.model.bunq.CoOwner> allCoOwner;

  /** The id of the User who owns the MonetaryAccountSavings. */
  @JsonProperty("user_id")
  private Integer userId;

  /** The profile of the account. */
  @JsonProperty("monetary_account_profile")
  private MonetaryAccountProfile monetaryAccountProfile;

  /** The settings of the MonetaryAccountSavings. */
  @JsonProperty("setting")
  private MonetaryAccountSetting setting;

  /** The Savings Goal set for this MonetaryAccountSavings. */
  @JsonProperty("savings_goal")
  private com.podginator.bunqclient.model.bunq.Amount savingsGoal;

  /** The progress in percentages for the Savings Goal set for this MonetaryAccountSavings. */
  @JsonProperty("savings_goal_progress")
  private BigDecimal savingsGoalProgress;

  /** The ids of the AutoSave. */
  @JsonProperty("all_auto_save_id")
  private List<BunqId> allAutoSaveId;

  /** The currency of the MonetaryAccountSavings as an ISO 4217 formatted currency code. */
  @JsonProperty("currency_field_for_request")
  private String currencyFieldForRequest;

  /** The description of the MonetaryAccountSavings. Defaults to 'bunq account'. */
  @JsonProperty("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * The daily spending limit Amount of the MonetaryAccountSavings. Defaults to 1000 EUR. Currency
   * must match the MonetaryAccountSavings's currency. Limited to 10000 EUR.
   */
  @JsonProperty("daily_limit_field_for_request")
  private com.podginator.bunqclient.model.bunq.Amount dailyLimitFieldForRequest;

  /** The UUID of the Avatar of the MonetaryAccountSavings. */
  @JsonProperty("avatar_uuid_field_for_request")
  private String avatarUuidFieldForRequest;

  /**
   * The status of the MonetaryAccountSavings. Ignored in POST requests (always set to ACTIVE) can
   * be CANCELLED or PENDING_REOPEN in PUT requests to cancel (close) or reopen the
   * MonetaryAccountSavings. When updating the status and/or sub_status no other fields can be
   * updated in the same request (and vice versa).
   */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The sub-status of the MonetaryAccountSavings providing extra information regarding the status.
   * Should be ignored for POST requests. In case of PUT requests with status CANCELLED it can only
   * be REDEMPTION_VOLUNTARY, while with status PENDING_REOPEN it can only be NONE. When updating
   * the status and/or sub_status no other fields can be updated in the same request (and vice
   * versa).
   */
  @JsonProperty("sub_status_field_for_request")
  private String subStatusFieldForRequest;

  /**
   * The reason for voluntarily cancelling (closing) the MonetaryAccountSavings, can only be OTHER.
   * Should only be specified if updating the status to CANCELLED.
   */
  @JsonProperty("reason_field_for_request")
  private String reasonFieldForRequest;

  /**
   * The optional free-form reason for voluntarily cancelling (closing) the MonetaryAccountSavings.
   * Can be any user provided message. Should only be specified if updating the status to CANCELLED.
   */
  @JsonProperty("reason_description_field_for_request")
  private String reasonDescriptionFieldForRequest;

  /** The users the account will be joint with. */
  @JsonProperty("all_co_owner_field_for_request")
  private List<CoOwner> allCoOwnerFieldForRequest;

  /** The settings of the MonetaryAccountSavings. */
  @JsonProperty("setting_field_for_request")
  private MonetaryAccountSetting settingFieldForRequest;

  /** The Savings Goal set for this MonetaryAccountSavings. */
  @JsonProperty("savings_goal_field_for_request")
  private Amount savingsGoalFieldForRequest;
}
