package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DraftShareInviteEntry {

  /** The share details. Only one of these objects is returned. */
  @JsonProperty("share_detail")
  private ShareDetail shareDetail;

  /** The start date of this share. */
  @JsonProperty("start_date")
  private String startDate;

  /** The expiration date of this share. */
  @JsonProperty("end_date")
  private String endDate;

  /** The share details. Only one of these objects may be passed. */
  @JsonProperty("share_detail_field_for_request")
  private ShareDetail shareDetailFieldForRequest;

  /** The start date of this share. */
  @JsonProperty("start_date_field_for_request")
  private String startDateFieldForRequest;

  /** The expiration date of this share. */
  @JsonProperty("end_date_field_for_request")
  private String endDateFieldForRequest;
}
