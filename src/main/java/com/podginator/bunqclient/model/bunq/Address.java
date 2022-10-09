package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Address {

  /** The street. */
  @JsonProperty("street")
  private String street;

  /** The house number. */
  @JsonProperty("house_number")
  private String houseNumber;

  /** The PO box. */
  @JsonProperty("po_box")
  private String poBox;

  /** The postal code. */
  @JsonProperty("postal_code")
  private String postalCode;

  /** The city. */
  @JsonProperty("city")
  private String city;

  /** The country as an ISO 3166-1 alpha-2 country code. */
  @JsonProperty("country")
  private String country;

  /** The province according to local standard. */
  @JsonProperty("province")
  private String province;

  /** The apartment, building or other extra information for addresses. */
  @JsonProperty("extra")
  private String extra;

  /** The name on the mailbox (only used for Postal addresses). */
  @JsonProperty("mailbox_name")
  private String mailboxName;

  /** To show whether user created or updated her address for app event listing. */
  @JsonProperty("is_user_address_updated")
  private Boolean isUserAddressUpdated;

  /** The street. */
  @JsonProperty("street_field_for_request")
  private String streetFieldForRequest;

  /** The house number. */
  @JsonProperty("house_number_field_for_request")
  private String houseNumberFieldForRequest;

  /** The PO box. */
  @JsonProperty("po_box_field_for_request")
  private String poBoxFieldForRequest;

  /** The postal code. */
  @JsonProperty("postal_code_field_for_request")
  private String postalCodeFieldForRequest;

  /** The city. */
  @JsonProperty("city_field_for_request")
  private String cityFieldForRequest;

  /** The country as an ISO 3166-1 alpha-2 country code. */
  @JsonProperty("country_field_for_request")
  private String countryFieldForRequest;

  /** The apartment, building or other extra information for addresses. */
  @JsonProperty("extra_field_for_request")
  private String extraFieldForRequest;

  /** The name on the mailbox (only used for Postal addresses). */
  @JsonProperty("mailbox_name_field_for_request")
  private String mailboxNameFieldForRequest;
}
