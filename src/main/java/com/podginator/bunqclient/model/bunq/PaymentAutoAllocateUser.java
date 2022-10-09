package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** List a users automatic payment auto allocated settings. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentAutoAllocateUser {

  /** */
  @JsonProperty("PaymentAutoAllocate")
  private PaymentAutoAllocate paymentAutoAllocate;
}
