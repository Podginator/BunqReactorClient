package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Used to view bunq.me TabResultResponse objects belonging to a tab. A TabResultResponse is an
 * object that holds details on a tab which has been paid from the provided monetary account.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BunqMeTabResultResponse {

  /** The payment made for the bunq.me tab. */
  @JsonProperty("payment")
  private Payment payment;
}
