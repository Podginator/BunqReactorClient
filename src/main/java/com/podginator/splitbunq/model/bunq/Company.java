package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Create and manage companies. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Company {

  @JsonProperty("UserCompany")
  private UserCompany userCompany;

  /** The company name. */
  @JsonProperty("name_field_for_request")
  private String nameFieldForRequest;

  /** The company's main address. */
  @JsonProperty("address_main_field_for_request")
  private Address addressMainFieldForRequest;

  /** The company's postal address. */
  @JsonProperty("address_postal_field_for_request")
  private Address addressPostalFieldForRequest;

  /** The country where the company is registered. */
  @JsonProperty("country_field_for_request")
  private String countryFieldForRequest;

  /**
   * The names and birth dates of the company's ultimate beneficiary owners. Minimum zero, maximum
   * four.
   */
  @JsonProperty("ubo_field_for_request")
  private List<Ubo> uboFieldForRequest;

  /** The company's chamber of commerce number. */
  @JsonProperty("chamber_of_commerce_number_field_for_request")
  private String chamberOfCommerceNumberFieldForRequest;

  /** The company's legal form. */
  @JsonProperty("legal_form_field_for_request")
  private String legalFormFieldForRequest;

  /** The subscription type for the company. */
  @JsonProperty("subscription_type_field_for_request")
  private String subscriptionTypeFieldForRequest;

  /** The public UUID of the company's avatar. */
  @JsonProperty("avatar_uuid_field_for_request")
  private String avatarUuidFieldForRequest;

  /** All the vat numbers of the company */
  @JsonProperty("vat_number_field_for_request")
  private CompanyVatNumber vatNumberFieldForRequest;
}
