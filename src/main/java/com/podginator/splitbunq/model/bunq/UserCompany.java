package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * With UserCompany you can retrieve information regarding the authenticated UserCompany and update
 * specific fields.<br>
 * <br>
 * Notification filters can be set on a UserCompany level to receive callbacks. For more information
 * check the <a href="/api/1/page/callbacks">dedicated callbacks page</a>.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserCompany {
  /** The id of the modified company. */
  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the company object's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the company object's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The company's public UUID. */
  @JsonProperty("public_uuid")
  private String publicUuid;

  /** The company name. */
  @JsonProperty("name")
  private String name;

  /** The company's display name. */
  @JsonProperty("display_name")
  private String displayName;

  /** The company's public nick name. */
  @JsonProperty("public_nick_name")
  private String publicNickName;

  /** The aliases of the account. */
  @JsonProperty("alias")
  private List<Pointer> alias;

  /** The company's chamber of commerce number. */
  @JsonProperty("chamber_of_commerce_number")
  private String chamberOfCommerceNumber;

  /** The company's legal form. */
  @JsonProperty("legal_form")
  private String legalForm;

  /** The type of business entity. */
  @JsonProperty("type_of_business_entity")
  private String typeOfBusinessEntity;

  /** The sector of industry. */
  @JsonProperty("sector_of_industry")
  private String sectorOfIndustry;

  /** The company's other bank account IBAN, through which we verify it. */
  @JsonProperty("counter_bank_iban")
  private String counterBankIban;

  /** The company's avatar. */
  @JsonProperty("avatar")
  private Avatar avatar;

  /** The company's main address. */
  @JsonProperty("address_main")
  private Address addressMain;

  /** The company's postal address. */
  @JsonProperty("address_postal")
  private Address addressPostal;

  /** The version of the terms of service accepted by the user. */
  @JsonProperty("version_terms_of_service")
  private String versionTermsOfService;

  /** The existing bunq aliases for the company's directors. */
  @JsonProperty("directors")
  private List<LabelUser> directors;

  /**
   * The person's preferred language. Formatted as a ISO 639-1 language code plus a ISO 3166-1
   * alpha-2 country code, seperated by an underscore.
   */
  @JsonProperty("language")
  private String language;

  /** The country as an ISO 3166-1 alpha-2 country code. */
  @JsonProperty("country")
  private String country;

  /**
   * The person's preferred region. Formatted as a ISO 639-1 language code plus a ISO 3166-1 alpha-2
   * country code, seperated by an underscore.
   */
  @JsonProperty("region")
  private String region;

  /** The names of the company's ultimate beneficiary owners. Minimum zero, maximum four. */
  @JsonProperty("ubo")
  private List<Ubo> ubo;

  /** The user status. Can be: ACTIVE, SIGNUP, RECOVERY. */
  @JsonProperty("status")
  private String status;

  /**
   * The user sub-status. Can be: NONE, FACE_RESET, APPROVAL, APPROVAL_DIRECTOR, APPROVAL_PARENT,
   * APPROVAL_SUPPORT, COUNTER_IBAN, IDEAL or SUBMIT.
   */
  @JsonProperty("sub_status")
  private String subStatus;

  /** The setting for the session timeout of the company in seconds. */
  @JsonProperty("session_timeout")
  private Integer sessionTimeout;

  /** The amount the company can pay in the session without asking for credentials. */
  @JsonProperty("daily_limit_without_confirmation_login")
  private Amount dailyLimitWithoutConfirmationLogin;

  /**
   * The types of notifications that will result in a push notification or URL callback for this
   * UserCompany.
   */
  @JsonProperty("notification_filters")
  private List<NotificationFilter> notificationFilters;

  /** The customer profile of the company. */
  @JsonProperty("customer")
  private Customer customer;

  /** The customer limits of the company. */
  @JsonProperty("customer_limit")
  private CustomerLimit customerLimit;

  /** The subscription of the company. */
  @JsonProperty("billing_contract")
  private List<BillingContractSubscription> billingContract;

  /** The user deny reason. */
  @JsonProperty("deny_reason")
  private String denyReason;

  /** The relations for this user. */
  @JsonProperty("relations")
  private List<RelationUser> relations;

  /** The user's tax residence numbers for different countries. */
  @JsonProperty("tax_resident")
  private List<TaxResident> taxResident;

  /** The company name. */
  @JsonProperty("name_field_for_request")
  private String nameFieldForRequest;

  /** The company's nick name. */
  @JsonProperty("public_nick_name_field_for_request")
  private String publicNickNameFieldForRequest;

  /** The public UUID of the company's avatar. */
  @JsonProperty("avatar_uuid_field_for_request")
  private String avatarUuidFieldForRequest;

  /** The user's main address. */
  @JsonProperty("address_main_field_for_request")
  private Address addressMainFieldForRequest;

  /** The company's postal address. */
  @JsonProperty("address_postal_field_for_request")
  private Address addressPostalFieldForRequest;

  /**
   * The person's preferred language. Formatted as a ISO 639-1 language code plus a ISO 3166-1
   * alpha-2 country code, seperated by an underscore.
   */
  @JsonProperty("language_field_for_request")
  private String languageFieldForRequest;

  /**
   * The person's preferred region. Formatted as a ISO 639-1 language code plus a ISO 3166-1 alpha-2
   * country code, seperated by an underscore.
   */
  @JsonProperty("region_field_for_request")
  private String regionFieldForRequest;

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

  /** The user status. Can be: ACTIVE, SIGNUP, RECOVERY. */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The user sub-status. Can be: NONE, FACE_RESET, APPROVAL, APPROVAL_DIRECTOR, APPROVAL_PARENT,
   * APPROVAL_SUPPORT, COUNTER_IBAN, IDEAL or SUBMIT.
   */
  @JsonProperty("sub_status_field_for_request")
  private String subStatusFieldForRequest;

  /** The setting for the session timeout of the company in seconds. */
  @JsonProperty("session_timeout_field_for_request")
  private Integer sessionTimeoutFieldForRequest;

  /** The amount the company can pay in the session without asking for credentials. */
  @JsonProperty("daily_limit_without_confirmation_login_field_for_request")
  private Amount dailyLimitWithoutConfirmationLoginFieldForRequest;
}
