package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ShareDetailPayment {

  /** If set to true, the invited user will be able to make payments from the shared account. */
  @JsonProperty("make_payments")
  private Boolean makePayments;

  /**
   * If set to true, the invited user will be able to make draft payments from the shared account.
   */
  @JsonProperty("make_draft_payments")
  private Boolean makeDraftPayments;

  /** If set to true, the invited user will be able to view the account balance. */
  @JsonProperty("view_balance")
  private Boolean viewBalance;

  /**
   * If set to true, the invited user will be able to view events from before the share was active.
   */
  @JsonProperty("view_old_events")
  private Boolean viewOldEvents;

  /**
   * If set to true, the invited user will be able to view events starting from the time the share
   * became active.
   */
  @JsonProperty("view_new_events")
  private Boolean viewNewEvents;

  /** The budget restriction. */
  @JsonProperty("budget")
  private BudgetRestriction budget;

  /** If set to true, the invited user will be able to make payments from the shared account. */
  @JsonProperty("make_payments_field_for_request")
  private Boolean makePaymentsFieldForRequest;

  /**
   * If set to true, the invited user will be able to make draft payments from the shared account.
   */
  @JsonProperty("make_draft_payments_field_for_request")
  private Boolean makeDraftPaymentsFieldForRequest;

  /** If set to true, the invited user will be able to view the account balance. */
  @JsonProperty("view_balance_field_for_request")
  private Boolean viewBalanceFieldForRequest;

  /**
   * If set to true, the invited user will be able to view events from before the share was active.
   */
  @JsonProperty("view_old_events_field_for_request")
  private Boolean viewOldEventsFieldForRequest;

  /**
   * If set to true, the invited user will be able to view events starting from the time the share
   * became active.
   */
  @JsonProperty("view_new_events_field_for_request")
  private Boolean viewNewEventsFieldForRequest;

  /** The budget restriction. */
  @JsonProperty("budget_field_for_request")
  private BudgetRestriction budgetFieldForRequest;
}