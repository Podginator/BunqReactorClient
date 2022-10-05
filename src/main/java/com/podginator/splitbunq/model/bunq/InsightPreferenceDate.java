package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to allow users to set insight/budget preferences. */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class InsightPreferenceDate {

  /** Endpoint constants. */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/insight-preference-date";

  /** Field constants. */
  public static final String FIELD_DAY_OF_MONTH = "day_of_month";

  /** Object type. */
  protected static final String OBJECT_TYPE_GET = "InsightPreferenceDate";

  /** The day of month at which budgeting/insights should start. */
  @JsonProperty("day_of_month")
  private Integer dayOfMonth;

  /** The day of month at which budgeting/insights should start. */
  @JsonProperty("day_of_month_field_for_request")
  private Integer dayOfMonthFieldForRequest;
}
