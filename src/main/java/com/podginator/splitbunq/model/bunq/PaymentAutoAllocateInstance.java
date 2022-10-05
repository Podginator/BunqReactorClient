package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** List all the times a users payment was automatically allocated. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentAutoAllocateInstance {

  /** The id of the PaymentAutoAllocateInstance. */
  @JsonProperty("id")
  private Integer id;

  /** The timestamp when the PaymentAutoAllocateInstance was created. */
  @JsonProperty("created")
  private String created;

  /** The timestamp when the PaymentAutoAllocateInstance was last updated. */
  @JsonProperty("updated")
  private String updated;

  /** The ID of the payment auto allocate this instance belongs to. */
  @JsonProperty("payment_auto_allocate_id")
  private Integer paymentAutoAllocateId;

  /** The status of the payment auto allocate instance. SUCCEEDED or FAILED. */
  @JsonProperty("status")
  private String status;

  /** The error message, if the payment auto allocating failed. */
  @JsonProperty("error_message")
  private List<java.lang.Error> errorMessage;

  /** The payment batch allocating all the payments. */
  @JsonProperty("payment_batch")
  private PaymentBatch paymentBatch;

  /** The ID of the payment that triggered the allocating of the payments. */
  @JsonProperty("payment_id")
  private Integer paymentId;
}
