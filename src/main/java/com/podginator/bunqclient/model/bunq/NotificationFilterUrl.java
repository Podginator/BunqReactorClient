package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationFilterUrl {

  /** The id of the NotificationFilterUrl. */
  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the NotificationFilterUrl's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the NotificationFilterUrl's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The notification category that will match this notification filter. */
  @JsonProperty("category")
  private String category;

  /** The URL to which the callback should be made. */
  @JsonProperty("notification_target")
  private String notificationTarget;

  /** The notification category that will match this notification filter. */
  @JsonProperty("category_field_for_request")
  private String categoryFieldForRequest;

  /** The URL to which the callback should be made. */
  @JsonProperty("notification_target_field_for_request")
  private String notificationTargetFieldForRequest;
}
