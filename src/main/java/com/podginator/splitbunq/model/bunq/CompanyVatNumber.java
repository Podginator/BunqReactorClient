package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CompanyVatNumber {

  @JsonProperty("country")
  private String country;

  @JsonProperty("value")
  private String value;

  @JsonProperty("country_field_for_request")
  private String countryFieldForRequest;

  @JsonProperty("value_field_for_request")
  private String valueFieldForRequest;
}
