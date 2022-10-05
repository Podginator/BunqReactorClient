package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Using this call you can create a SOFORT Request assigned to your User by providing the Token of
 * the request.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TokenQrRequestSofort {

  @JsonProperty("token_field_for_request")
  private String tokenFieldForRequest;
}
