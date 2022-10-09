package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Aggregation of how many card payments have been done with a Green Card in the current calendar
 * month.
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class MasterCardActionGreenAggregation {

  /** The date of the aggregation. */
  @JsonProperty("date")
  private String date;

  /** The percentage of card payments that were done with a Green Card. */
  @JsonProperty("percentage")
  private String percentage;
}
