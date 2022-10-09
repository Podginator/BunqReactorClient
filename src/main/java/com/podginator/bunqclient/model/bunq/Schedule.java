package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** view for reading the scheduled definitions. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Schedule {

  @JsonProperty("time_start")
  private String timeStart;

  /** The schedule end time (UTC). */
  @JsonProperty("time_end")
  private String timeEnd;

  /** The schedule recurrence unit, options: ONCE, HOURLY, DAILY, WEEKLY, MONTHLY, YEARLY */
  @JsonProperty("recurrence_unit")
  private String recurrenceUnit;

  /**
   * The schedule recurrence size. For example size 4 and unit WEEKLY means the recurrence is every
   * 4 weeks.
   */
  @JsonProperty("recurrence_size")
  private Integer recurrenceSize;

  /** The schedule status, options: ACTIVE, FINISHED, CANCELLED. */
  @JsonProperty("status")
  private String status;

  /** The scheduled object. (Payment, PaymentBatch) */
  @JsonProperty("object")
  private ScheduleAnchorObject object;

  /** The schedule start time (UTC). */
  @JsonProperty("time_start_field_for_request")
  private String timeStartFieldForRequest;

  /** The schedule end time (UTC). */
  @JsonProperty("time_end_field_for_request")
  private String timeEndFieldForRequest;

  /** The schedule recurrence unit, options: ONCE, HOURLY, DAILY, WEEKLY, MONTHLY, YEARLY */
  @JsonProperty("recurrence_unit_field_for_request")
  private String recurrenceUnitFieldForRequest;

  /**
   * The schedule recurrence size. For example size 4 and unit WEEKLY means the recurrence is every
   * 4 weeks.
   */
  @JsonProperty("recurrence_size_field_for_request")
  private Integer recurrenceSizeFieldForRequest;
}
