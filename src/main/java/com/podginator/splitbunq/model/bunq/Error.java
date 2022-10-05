package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Error {

  /** The error description (in English). */
  @JsonProperty("error_description")
  private String errorDescription;

  /** The error description (in the user language). */
  @JsonProperty("error_description_translated")
  private String errorDescriptionTranslated;
}
