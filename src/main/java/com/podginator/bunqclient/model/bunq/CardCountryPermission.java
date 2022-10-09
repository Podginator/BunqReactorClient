package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class CardCountryPermission {

  /** The id of the card country permission entry. */
  @JsonProperty("id")
  private Integer id;

  /** The country to allow transactions in (e.g. NL, DE). */
  @JsonProperty("country")
  private String country;

  /** Expiry time of this rule. */
  @JsonProperty("expiry_time")
  private String expiryTime;

  /** The country to allow transactions in (e.g. NL, DE). */
  @JsonProperty("country_field_for_request")
  private String countryFieldForRequest;

  /** Expiry time of this rule. */
  @JsonProperty("expiry_time_field_for_request")
  private String expiryTimeFieldForRequest;
}
