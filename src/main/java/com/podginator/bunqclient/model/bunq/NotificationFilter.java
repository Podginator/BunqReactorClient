package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationFilter {

  /**
   * The delivery method via which notifications that match this notification filter will be
   * delivered. Possible choices are PUSH for delivery via push notification and URL for delivery
   * via URL callback.
   */
  @JsonProperty("notification_delivery_method")
  private String notificationDeliveryMethod;

  /**
   * The target of notifications that match this notification filter. For URL notification filters
   * this is the URL to which the callback will be made. For PUSH notifications filters this should
   * always be null.
   */
  @JsonProperty("notification_target")
  private String notificationTarget;

  /**
   * The notification category that will match this notification filter. Possible choices are
   * BILLING, CARD_TRANSACTION_FAILED, CARD_TRANSACTION_SUCCESSFUL, CHAT, DRAFT_PAYMENT, IDEAL,
   * SOFORT, MONETARY_ACCOUNT_PROFILE, MUTATION, PAYMENT, PROMOTION, REQUEST, SCHEDULE_RESULT,
   * SCHEDULE_STATUS, SHARE, SUPPORT, TAB_RESULT, USER_APPROVAL.
   */
  @JsonProperty("category")
  private String category;

  /**
   * The delivery method via which notifications that match this notification filter will be
   * delivered. Possible choices are PUSH for delivery via push notification and URL for delivery
   * via URL callback.
   */
  @JsonProperty("notification_delivery_method_field_for_request")
  private String notificationDeliveryMethodFieldForRequest;

  /**
   * The target of notifications that match this notification filter. For URL notification filters
   * this is the URL to which the callback will be made. For PUSH notifications filters this should
   * always be null.
   */
  @JsonProperty("notification_target_field_for_request")
  private String notificationTargetFieldForRequest;

  /**
   * The notification category that will match this notification filter. Possible choices are
   * BILLING, CARD_TRANSACTION_FAILED, CARD_TRANSACTION_SUCCESSFUL, CHAT, DRAFT_PAYMENT, IDEAL,
   * SOFORT, MONETARY_ACCOUNT_PROFILE, MUTATION, PAYMENT, PROMOTION, REQUEST, SCHEDULE_RESULT,
   * SCHEDULE_STATUS, SHARE, SUPPORT, TAB_RESULT, USER_APPROVAL.
   */
  @JsonProperty("category_field_for_request")
  private String categoryFieldForRequest;
}
