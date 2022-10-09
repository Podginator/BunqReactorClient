package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Issuer {

  /** The BIC code. */
  @JsonProperty("bic")
  private String bic;

  /** The name of the bank. */
  @JsonProperty("name")
  private String name;

  /** The BIC code. */
  @JsonProperty("bic_field_for_request")
  private String bicFieldForRequest;

  /** The name of the bank. */
  @JsonProperty("name_field_for_request")
  private String nameFieldForRequest;
}
