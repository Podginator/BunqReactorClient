package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Used to view events. Events are automatically created and contain information about everything
 * that happens to your bunq account. In the bunq app events are shown in your 'overview'. Examples
 * of when events are created or modified: payment sent, payment received, request for payment
 * received or connect invite received.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {

  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the event's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the event's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The performed action. Can be: CREATE or UPDATE. */
  @JsonProperty("action")
  private String action;

  /** The id of the user the event applied to (if it was a user event). */
  @JsonProperty("user_id")
  private String userId;

  /** The id of the monetary account the event applied to (if it was a monetary account event). */
  @JsonProperty("monetary_account_id")
  private String monetaryAccountId;

  /** The details of the external object the event was created for. */
  @JsonProperty("object")
  private EventObject object;

  /**
   * The event status. Can be: FINALIZED or AWAITING_REPLY. An example of FINALIZED event is a
   * payment received event, while an AWAITING_REPLY event is a request received event.
   */
  @JsonProperty("status")
  private String status;

  /**
   * Fields of the external model which we have stored so we know what they were at the time of the
   * event.
   */
  @JsonProperty("object_data_at_event")
  private EventObject objectDataAtEvent;

  /** Indicator whether this is the latest event for the object. */
  @JsonProperty("is_event_latest_for_object")
  private Boolean isEventLatestForObject;
}
