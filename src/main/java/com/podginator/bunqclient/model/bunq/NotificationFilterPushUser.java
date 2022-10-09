package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Manage the push notification filters for a user. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NotificationFilterPushUser {

  /** The types of notifications that will result in a push notification for this user. */
  @JsonProperty("notification_filters")
  private List<NotificationFilterPush> notificationFilters;

  /** The types of notifications that will result in a push notification for this user. */
  @JsonProperty("notification_filters_field_for_request")
  private List<NotificationFilterPush> notificationFiltersFieldForRequest;
}
