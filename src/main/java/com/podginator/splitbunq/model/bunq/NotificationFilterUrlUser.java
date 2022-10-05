package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Manage the url notification filters for a user. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NotificationFilterUrlUser {

  /** The types of notifications that will result in a url notification for this user. */
  @JsonProperty("notification_filters")
  private List<NotificationFilterUrl> notificationFilters;

  /** The types of notifications that will result in a url notification for this user. */
  @JsonProperty("notification_filters_field_for_request")
  private List<NotificationFilterUrl> notificationFiltersFieldForRequest;
}
