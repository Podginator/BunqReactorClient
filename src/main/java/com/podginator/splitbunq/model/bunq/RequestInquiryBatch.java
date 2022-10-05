package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;

/** Create a batch of requests for payment, or show the request batches of a monetary account. */
@AllArgsConstructor
@Deprecated
public class RequestInquiryBatch {

  /** The list of requests that were made. */
  @JsonProperty("request_inquiries")
  private List<RequestInquiry> requestInquiries;

  /** The total amount originally inquired for this batch. */
  @JsonProperty("total_amount_inquired")
  private Amount totalAmountInquired;

  /**
   * The reference to the object used for split the bill. Can be Payment, PaymentBatch,
   * ScheduleInstance, RequestResponse and MasterCardAction
   */
  @JsonProperty("reference_split_the_bill")
  private RequestReferenceSplitTheBillAnchorObject referenceSplitTheBill;

  /** The list of request inquiries we want to send in 1 batch. */
  @JsonProperty("request_inquiries_field_for_request")
  private List<RequestInquiry> requestInquiriesFieldForRequest;

  /** The status of the request. */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;

  /** The total amount originally inquired for this batch. */
  @JsonProperty("total_amount_inquired_field_for_request")
  private Amount totalAmountInquiredFieldForRequest;

  /** The ID of the associated event if the request batch was made using 'split the bill'. */
  @JsonProperty("event_id_field_for_request")
  private Integer eventIdFieldForRequest;
}
