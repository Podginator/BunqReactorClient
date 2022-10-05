package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Used to view TabResultInquiry objects belonging to a tab. A TabResultInquiry is an object that
 * holds details on both the tab and a single payment made for that tab.
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class TabResultInquiry {

  /** The Tab details. */
  @JsonProperty("tab")
  private Tab tab;

  /** The payment made for the Tab. */
  @JsonProperty("payment")
  private Payment payment;
}
