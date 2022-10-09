package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pointer {

  /** The alias type, can be: EMAIL|PHONE_NUMBER|IBAN. */
  @JsonProperty("type")
  private String type;

  /** The alias value. */
  @JsonProperty("value")
  private String value;

  /** The alias name. */
  @JsonProperty("name")
  private String name;

  /** The alias type, can be: EMAIL|PHONE_NUMBER|IBAN. */
  @JsonProperty("type_field_for_request")
  private String typeFieldForRequest;

  /**
   * The alias value. Phone number are formatted conform E.123 without spaces (e.g., +314211234567).
   */
  @JsonProperty("value_field_for_request")
  private String valueFieldForRequest;

  /** The alias name. Only required for IBANs. */
  @JsonProperty("name_field_for_request")
  private String nameFieldForRequest;

  /** The pointer service. Only required for external counterparties. */
  @JsonProperty("service_field_for_request")
  private String serviceFieldForRequest;
}
