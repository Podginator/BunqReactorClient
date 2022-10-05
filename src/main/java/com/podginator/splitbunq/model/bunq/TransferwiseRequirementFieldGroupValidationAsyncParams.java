package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferwiseRequirementFieldGroupValidationAsyncParams {

  /** The parameter key. */
  @JsonProperty("key")
  private String key;

  /** The parameter label. */
  @JsonProperty("parameter_name")
  private String parameterName;

  /** Shows whether the parameter is required or not. */
  @JsonProperty("required")
  private Boolean required;
}
