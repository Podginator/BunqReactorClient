package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferwiseRequirementField {

  /** The descriptive label of the field. */
  @JsonProperty("name")
  private String name;

  /** The field group. */
  @JsonProperty("group")
  private TransferwiseRequirementFieldGroup group;

  /** The name of the required field. */
  @JsonProperty("key_field_for_request")
  private String keyFieldForRequest;

  /** The value of the required field. */
  @JsonProperty("value_field_for_request")
  private String valueFieldForRequest;
}
