package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferwiseRequirementFieldGroupValidationAsync {

  /** The url to be used to validate user input. */
  @JsonProperty("url")
  private String url;

  /** The parameters to send when validating user input. */
  @JsonProperty("params")
  private TransferwiseRequirementFieldGroupValidationAsyncParams params;
}
