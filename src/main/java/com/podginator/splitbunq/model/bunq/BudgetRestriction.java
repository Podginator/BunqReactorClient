package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class BudgetRestriction {

  /** The amount of the budget given to the invited user. */
  @JsonProperty("amount")
  private Amount amount;

  /** The duration for a budget restriction. Valid values are DAILY, WEEKLY, MONTHLY, YEARLY. */
  @JsonProperty("frequency")
  private String frequency;

  /** The amount of the budget given to the invited user. */
  @JsonProperty("amount_field_for_request")
  private Amount amountFieldForRequest;

  /** The duration for a budget restriction. Valid values are DAILY, WEEKLY, MONTHLY, YEARLY. */
  @JsonProperty("frequency_field_for_request")
  private String frequencyFieldForRequest;
}
