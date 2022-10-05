package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TabTextWaitingScreen {

  /** Language of tab text */
  @JsonProperty("language")
  private String language;

  /** Tab text */
  @JsonProperty("description")
  private String description;

  /** Language of tab text */
  @JsonProperty("language_field_for_request")
  private String languageFieldForRequest;

  /** Tab text */
  @JsonProperty("description_field_for_request")
  private String descriptionFieldForRequest;
}
