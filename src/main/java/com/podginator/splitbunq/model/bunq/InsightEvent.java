package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to get events based on time and insight category. */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsightEvent {

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
}
