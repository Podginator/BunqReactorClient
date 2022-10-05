package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@NoArgsConstructor
@Data
@AllArgsConstructor
public class RegistrySettlementItem {

  /** The amount of the RegistrySettlementItem. */
  @JsonProperty("amount")
  private Amount amount;

  /** The membership of the user that has to pay. */
  @JsonProperty("membership_paying")
  private RegistryMembership membershipPaying;

  /** The membership of the user that will receive money. */
  @JsonProperty("membership_receiving")
  private RegistryMembership membershipReceiving;

  /** The LabelMonetaryAccount of the user that has to pay the request. */
  @JsonProperty("paying_user_alias")
  private LabelMonetaryAccount payingUserAlias;

  /** The LabelMonetaryAccount of the user that will receive the amount. */
  @JsonProperty("receiving_user_alias")
  private LabelMonetaryAccount receivingUserAlias;
}
