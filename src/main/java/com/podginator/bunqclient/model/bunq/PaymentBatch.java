package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Create a payment batch, or show the payment batches of a monetary account. */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class PaymentBatch {

  @JsonProperty("payments")
  private PaymentBatchAnchoredPayment payments;

  /** The list of payments we want to send in a single batch. */
  @JsonProperty("payments_field_for_request")
  private List<Payment> paymentsFieldForRequest;
}
