package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DraftPaymentAnchorObject {

  @JsonProperty("Payment")
  private Payment payment;

  /** */
  @JsonProperty("PaymentBatch")
  private PaymentBatch paymentBatch;
}
