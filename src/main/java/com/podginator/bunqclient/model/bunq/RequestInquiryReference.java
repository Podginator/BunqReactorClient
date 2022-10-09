package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestInquiryReference {

  /** The type of request inquiry. Can be RequestInquiry or RequestInquiryBatch. */
  @JsonProperty("type")
  private String type;

  /** The id of the request inquiry (batch). */
  @JsonProperty("id")
  private Integer id;
}
