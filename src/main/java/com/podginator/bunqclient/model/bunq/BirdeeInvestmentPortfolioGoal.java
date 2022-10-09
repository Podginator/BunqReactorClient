package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class BirdeeInvestmentPortfolioGoal {

  /** The investment goal amount. */
  @JsonProperty("amount_target")
  private Amount amountTarget;

  /** The investment goal end time. */
  @JsonProperty("time_end")
  private String timeEnd;

  /** The investment goal amount. */
  @JsonProperty("amount_target_field_for_request")
  private Amount amountTargetFieldForRequest;

  /** The investment goal end time. */
  @JsonProperty("time_end_field_for_request")
  private String timeEndFieldForRequest;
}
