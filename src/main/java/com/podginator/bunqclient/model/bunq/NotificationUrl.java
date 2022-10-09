package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationUrl {

  /** */
  @JsonProperty("target_url")
  private String targetUrl;

  /** */
  @JsonProperty("category")
  private String category;

  /** */
  @JsonProperty("event_type")
  private String eventType;

  /** */
  @JsonProperty("object")
  private NotificationAnchorObject object;
}
