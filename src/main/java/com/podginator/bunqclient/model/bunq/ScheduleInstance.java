package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** view for reading, updating and listing the scheduled instance. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ScheduleInstance {

  /** The state of the scheduleInstance. (FINISHED_SUCCESSFULLY, RETRY, FAILED_USER_ERROR) */
  @JsonProperty("state")
  private String state;

  /** The schedule start time (UTC). */
  @JsonProperty("time_start")
  private String timeStart;

  /** The schedule end time (UTC). */
  @JsonProperty("time_end")
  private String timeEnd;

  /** The message when the scheduled instance has run and failed due to user error. */
  @JsonProperty("error_message")
  private List<java.lang.Error> errorMessage;

  /** The scheduled object. (Payment, PaymentBatch) */
  @JsonProperty("scheduled_object")
  private ScheduleAnchorObject scheduledObject;

  /** The result object of this schedule instance. (Payment, PaymentBatch) */
  @JsonProperty("result_object")
  private ScheduleInstanceAnchorObject resultObject;

  /**
   * The reference to the object used for split the bill. Can be RequestInquiry or
   * RequestInquiryBatch
   */
  @JsonProperty("request_reference_split_the_bill")
  private List<RequestInquiryReference> requestReferenceSplitTheBill;

  /** Change the state of the scheduleInstance from FAILED_USER_ERROR to RETRY. */
  @JsonProperty("state_field_for_request")
  private String stateFieldForRequest;
}
