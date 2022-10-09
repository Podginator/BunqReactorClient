package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * An incoming payment made towards an account of an external bank and redirected to a bunq account
 * via switch service.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BankSwitchServiceNetherlandsIncomingPayment {

  @JsonProperty("bank_switch_service")
  private BankSwitchServiceNetherlandsIncoming bankSwitchService;

  /** The payment made using bank switch service. */
  @JsonProperty("payment")
  private Payment payment;
}
