package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Endpoint for schedule payments. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SchedulePayment {

  /** The payment details. */
  @JsonProperty("payment")
  private SchedulePaymentEntry payment;

  /** The schedule details. */
  @JsonProperty("schedule")
  private Schedule schedule;

  /** The schedule status, options: ACTIVE, FINISHED, CANCELLED. */
  @JsonProperty("status")
  private String status;

  /** The payment details. */
  @JsonProperty("payment_field_for_request")
  private SchedulePaymentEntry paymentFieldForRequest;

  /** The schedule details when creating or updating a scheduled payment. */
  @JsonProperty("schedule_field_for_request")
  private Schedule scheduleFieldForRequest;
}
