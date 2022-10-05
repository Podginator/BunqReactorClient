package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Endpoint for interacting with the birdee investment portfolio balance.. */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class BirdeeInvestmentPortfolioBalance {

  /** The current valuation of the portfolio, minus any amount pending withdrawal. */
  @JsonProperty("amount_available")
  private Amount amountAvailable;

  /** The total amount deposited. */
  @JsonProperty("amount_deposit_total")
  private Amount amountDepositTotal;

  /** The total amount withdrawn. */
  @JsonProperty("amount_withdrawal_total")
  private Amount amountWithdrawalTotal;

  /** The total fee amount. */
  @JsonProperty("amount_fee_total")
  private Amount amountFeeTotal;

  /** The difference between the netto deposited amount and the current valuation. */
  @JsonProperty("amount_profit")
  private Amount amountProfit;

  /** The amount that's sent to Birdee, but pending investment on the portfolio. */
  @JsonProperty("amount_deposit_pending")
  private Amount amountDepositPending;

  /** The amount that's sent to Birdee, but pending withdrawal. */
  @JsonProperty("amount_withdrawal_pending")
  private Amount amountWithdrawalPending;
}
