package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CoOwner {

  /** The Alias of the co-owner. */
  @JsonProperty("alias")
  private LabelUser alias;

  /** Can be: ACCEPTED, REJECTED, PENDING or REVOKED */
  @JsonProperty("status")
  private String status;

  /** The users the account will be joint with. */
  @JsonProperty("alias_field_for_request")
  private Pointer aliasFieldForRequest;
}
