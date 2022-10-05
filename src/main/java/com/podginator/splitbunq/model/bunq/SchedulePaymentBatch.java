package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Endpoint for schedule payment batches. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SchedulePaymentBatch {

  /** The payment details. */
  @JsonProperty("payments")
  private List<SchedulePaymentEntry> payments;

  /** The schedule details. */
  @JsonProperty("schedule")
  private Schedule schedule;

  /** The payment details. */
  @JsonProperty("payments_field_for_request")
  private List<SchedulePaymentEntry> paymentsFieldForRequest;

  /** The schedule details when creating a scheduled payment. */
  @JsonProperty("schedule_field_for_request")
  private Schedule scheduleFieldForRequest;
}
