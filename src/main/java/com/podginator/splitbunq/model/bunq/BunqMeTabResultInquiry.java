package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Used to view bunq.me TabResultInquiry objects belonging to a tab. A TabResultInquiry is an object
 * that holds details on both the tab and a single payment made for that tab.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BunqMeTabResultInquiry {

  /** The payment made for the Tab. */
  @JsonProperty("payment")
  private Payment payment;

  /** The Id of the bunq.me tab that this BunqMeTabResultInquiry belongs to. */
  @JsonProperty("bunq_me_tab_id")
  private Integer bunqMeTabId;
}
