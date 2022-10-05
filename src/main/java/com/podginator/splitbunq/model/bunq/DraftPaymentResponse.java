package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class DraftPaymentResponse {

  /** The status with which was responded. */
  @JsonProperty("status")
  private String status;

  /** The user that responded to the DraftPayment. */
  @JsonProperty("user_alias_created")
  private LabelUser userAliasCreated;
}
