package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Endpoint for interacting with the investment portfolio opened at Birdee. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BirdeeInvestmentPortfolio {

  @JsonProperty("status")
  private String status;

  /** The type of risk profile associated with the portfolio. */
  @JsonProperty("risk_profile_type")
  private String riskProfileType;

  /** The investment theme. */
  @JsonProperty("investment_theme")
  private String investmentTheme;

  /** Maximum number of strategy changes in a year. */
  @JsonProperty("number_of_strategy_change_annual_maximum")
  private Integer numberOfStrategyChangeAnnualMaximum;

  /** Maximum number of strategy changes used. */
  @JsonProperty("number_of_strategy_change_annual_used")
  private Integer numberOfStrategyChangeAnnualUsed;

  /** The name associated with the investment portfolio. */
  @JsonProperty("name")
  private String name;

  /** The investment goal. */
  @JsonProperty("goal")
  private BirdeeInvestmentPortfolioGoal goal;

  /** The investment portfolio balance. */
  @JsonProperty("balance")
  private BirdeeInvestmentPortfolioBalance balance;

  /** The allocations of the investment portfolio. */
  @JsonProperty("allocations")
  private List<BirdeePortfolioAllocation> allocations;

  /** The type of risk profile associated with the portfolio. */
  @JsonProperty("risk_profile_type_field_for_request")
  private String riskProfileTypeFieldForRequest;

  /** The investment theme. */
  @JsonProperty("investment_theme_field_for_request")
  private String investmentThemeFieldForRequest;

  /** The name associated with the investment portfolio. */
  @JsonProperty("name_field_for_request")
  private String nameFieldForRequest;

  /** The investment goal. */
  @JsonProperty("goal_field_for_request")
  private BirdeeInvestmentPortfolioGoal goalFieldForRequest;
}
