package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TaxResident {

  /** The country of the tax number. */
  @JsonProperty("country")
  private String country;

  /** The tax number. */
  @JsonProperty("tax_number")
  private String taxNumber;

  /** The status of the tax number. Either CONFIRMED or UNCONFIRMED. */
  @JsonProperty("status")
  private String status;

  /** The country of the tax number. */
  @JsonProperty("country_field_for_request")
  private String countryFieldForRequest;

  /** The tax number. */
  @JsonProperty("tax_number_field_for_request")
  private String taxNumberFieldForRequest;

  /** The status of the tax number. Either CONFIRMED or UNCONFIRMED. */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;
}
