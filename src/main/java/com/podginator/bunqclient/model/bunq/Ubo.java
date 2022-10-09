package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ubo {

  /** The name of the ultimate beneficiary owner. */
  @JsonProperty("name")
  private String name;

  /** The date of birth of the ultimate beneficiary owner. */
  @JsonProperty("date_of_birth")
  private String dateOfBirth;

  /** The nationality of the ultimate beneficiary owner. */
  @JsonProperty("nationality")
  private String nationality;

  /** The name of the ultimate beneficiary owner. */
  @JsonProperty("name_field_for_request")
  private String nameFieldForRequest;

  /** The date of birth of the ultimate beneficiary owner. Accepts ISO8601 date formats. */
  @JsonProperty("date_of_birth_field_for_request")
  private String dateOfBirthFieldForRequest;

  /** The nationality of the ultimate beneficiary owner. Accepts ISO8601 date formats. */
  @JsonProperty("nationality_field_for_request")
  private String nationalityFieldForRequest;
}
