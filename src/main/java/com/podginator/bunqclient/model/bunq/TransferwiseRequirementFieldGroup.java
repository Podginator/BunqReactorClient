package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@NoArgsConstructor
@Data
@AllArgsConstructor
public class TransferwiseRequirementFieldGroup {

  /** The key of the field. This is the value to send as input. */
  @JsonProperty("key")
  private String key;

  /** The field's input type: "text", "select" or "radio". */
  @JsonProperty("type")
  private String type;

  /** The field name. */
  @JsonProperty("name")
  private String name;

  /**
   * Indicates that any changes in this field affect the requirements, if this field is changed, the
   * requirements endpoint must be called again to recheck if there are any additional requirements.
   */
  @JsonProperty("refresh_requirements_on_change")
  private Boolean refreshRequirementsOnChange;

  /** Whether or not the field is required. */
  @JsonProperty("required")
  private Boolean required;

  /** Formatting mask to guide user input. */
  @JsonProperty("display_format")
  private String displayFormat;

  /** An example value for this field. */
  @JsonProperty("example")
  private String example;

  /** The minimum length of the field's value. */
  @JsonProperty("min_length")
  private String minLength;

  /** The maximum length of the field's value. */
  @JsonProperty("max_length")
  private String maxLength;

  /** A regular expression which may be used to validate the user input. */
  @JsonProperty("validation_regexp")
  private String validationRegexp;

  /** Details of an endpoint which may be used to validate the user input. */
  @JsonProperty("validation_async")
  private TransferwiseRequirementFieldGroupValidationAsync validationAsync;

  /** Shows which values are allowed for fields of type "select" or "radio". */
  @JsonProperty("values_allowed")
  private TransferwiseRequirementFieldGroupValuesAllowed valuesAllowed;
}
