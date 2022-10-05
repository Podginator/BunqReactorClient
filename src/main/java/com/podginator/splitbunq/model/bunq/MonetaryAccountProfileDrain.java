package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MonetaryAccountProfileDrain {

  /** The status of the profile. */
  @JsonProperty("status")
  private String status;

  /** The goal balance. */
  @JsonProperty("balance_preferred")
  private Amount balancePreferred;

  /** The high threshold balance. */
  @JsonProperty("balance_threshold_high")
  private Amount balanceThresholdHigh;

  /** The savings monetary account. */
  @JsonProperty("savings_account_alias")
  private LabelMonetaryAccount savingsAccountAlias;

  /** The status of the profile. */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;

  /** The goal balance. */
  @JsonProperty("balance_preferred_field_for_request")
  private Amount balancePreferredFieldForRequest;

  /** The high threshold balance. */
  @JsonProperty("balance_threshold_high_field_for_request")
  private Amount balanceThresholdHighFieldForRequest;

  /** The savings monetary account. */
  @JsonProperty("savings_account_alias_field_for_request")
  private Pointer savingsAccountAliasFieldForRequest;
}
