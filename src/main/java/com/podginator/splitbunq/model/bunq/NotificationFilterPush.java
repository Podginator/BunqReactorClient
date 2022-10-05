package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NotificationFilterPush {

  /** The notification category that will match this notification filter. */
  @JsonProperty("category")
  private String category;

  /** The notification category that will match this notification filter. */
  @JsonProperty("category_field_for_request")
  private String categoryFieldForRequest;
}
