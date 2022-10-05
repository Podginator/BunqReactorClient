package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WhitelistResultViewAnchoredObject {

  /** The ID of the whitelist entry. */
  @JsonProperty("id")
  private Integer id;

  /** The RequestResponse object */
  @JsonProperty("requestResponse")
  private RequestResponse requestResponse;

  /** The DraftPayment object */
  @JsonProperty("draftPayment")
  private DraftPayment draftPayment;
}
