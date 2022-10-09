package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Show the limits for the authenticated user. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerLimit {

  @JsonProperty("limit_monetary_account")
  private Integer limitMonetaryAccount;

  /** The amount of additional monetary accounts you can create. */
  @JsonProperty("limit_monetary_account_remaining")
  private Integer limitMonetaryAccountRemaining;

  /** The limit of Maestro cards. */
  @JsonProperty("limit_card_debit_maestro")
  private Integer limitCardDebitMaestro;

  /** The limit of MasterCard cards. */
  @JsonProperty("limit_card_debit_mastercard")
  private Integer limitCardDebitMastercard;

  /** DEPRECTATED: The limit of wildcards, e.g. Maestro or MasterCard cards. */
  @JsonProperty("limit_card_debit_wildcard")
  private Integer limitCardDebitWildcard;

  /** The limit of wildcards, e.g. Maestro or MasterCard cards. */
  @JsonProperty("limit_card_wildcard")
  private Integer limitCardWildcard;

  /** The limit of free replacement cards. */
  @JsonProperty("limit_card_replacement")
  private Integer limitCardReplacement;

  /** The maximum amount a user is allowed to spend in a month. */
  @JsonProperty("limit_amount_monthly")
  private Amount limitAmountMonthly;

  /** The amount the user has spent in the last month. */
  @JsonProperty("spent_amount_monthly")
  private Amount spentAmountMonthly;
}
