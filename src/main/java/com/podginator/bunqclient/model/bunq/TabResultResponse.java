package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Used to view TabResultResponse objects belonging to a tab. A TabResultResponse is an object that
 * holds details on a tab which has been paid from the provided monetary account.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TabResultResponse {

  /** The Tab details. */
  @JsonProperty("tab")
  private Tab tab;

  /** The payment made for the Tab. */
  @JsonProperty("payment")
  private Payment payment;

  /**
   * The reference to the object used for split the bill. Can be RequestInquiry or
   * RequestInquiryBatch
   */
  @JsonProperty("request_reference_split_the_bill")
  private List<RequestInquiryReference> requestReferenceSplitTheBill;
}
