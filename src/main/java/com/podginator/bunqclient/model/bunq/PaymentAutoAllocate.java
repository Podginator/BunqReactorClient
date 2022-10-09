package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Manage a users automatic payment auto allocated settings. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentAutoAllocate {

  /** The id of the PaymentAutoAllocate. */
  @JsonProperty("id")
  private Integer id;

  /** The timestamp when the PaymentAutoAllocate was created. */
  @JsonProperty("created")
  private String created;

  /** The timestamp when the PaymentAutoAllocate was last updated. */
  @JsonProperty("updated")
  private String updated;

  /** The type. */
  @JsonProperty("type")
  private String type;

  /** The status. */
  @JsonProperty("status")
  private String status;

  /** The amount on which this payment auto allocate will be triggered. */
  @JsonProperty("trigger_amount")
  private Amount triggerAmount;

  /** The payment that was used to define the triggers for this payment auto allocate. */
  @JsonProperty("payment")
  private Payment payment;

  /** The payment that should be used to define the triggers for the payment auto allocate. */
  @JsonProperty("payment_id_field_for_request")
  private Integer paymentIdFieldForRequest;

  /** Whether a payment should be sorted ONCE or RECURRING. */
  @JsonProperty("type_field_for_request")
  private String typeFieldForRequest;

  /** The definition of how the money should be allocated. */
  @JsonProperty("definition_field_for_request")
  private List<PaymentAutoAllocateDefinition> definitionFieldForRequest;
}
