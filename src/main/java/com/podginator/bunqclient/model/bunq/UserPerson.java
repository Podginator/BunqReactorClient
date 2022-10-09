package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * With UserPerson you can retrieve information regarding the authenticated UserPerson and update
 * specific fields.<br>
 * <br>
 * Notification filters can be set on a UserPerson level to receive callbacks. For more information
 * check the <a href="/api/1/page/callbacks">dedicated callbacks page</a>.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserPerson {

  /** /** The id of the modified person object. */
  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the person object's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the person object's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The person's public UUID. */
  @JsonProperty("public_uuid")
  private String publicUuid;

  /** The person's first name. */
  @JsonProperty("first_name")
  private String firstName;

  /** The person's middle name. */
  @JsonProperty("middle_name")
  private String middleName;

  /** The person's last name. */
  @JsonProperty("last_name")
  private String lastName;

  /** The person's legal name. */
  @JsonProperty("legal_name")
  private String legalName;

  /** The display name for the person. */
  @JsonProperty("display_name")
  private String displayName;

  /** The public nick name for the person. */
  @JsonProperty("public_nick_name")
  private String publicNickName;

  /** The aliases of the user. */
  @JsonProperty("alias")
  private List<Pointer> alias;

  /** The user's tax residence numbers for different countries. */
  @JsonProperty("tax_resident")
  private List<TaxResident> taxResident;

  /** The person's main address. */
  @JsonProperty("address_main")
  private Address addressMain;

  /** The person's postal address. */
  @JsonProperty("address_postal")
  private Address addressPostal;

  /** The person's date of birth. Accepts ISO8601 date formats. */
  @JsonProperty("date_of_birth")
  private String dateOfBirth;

  /** The person's place of birth. */
  @JsonProperty("place_of_birth")
  private String placeOfBirth;

  /** The person's country of birth. Formatted as a SO 3166-1 alpha-2 country code. */
  @JsonProperty("country_of_birth")
  private String countryOfBirth;

  /** The person's nationality. Formatted as a SO 3166-1 alpha-2 country code. */
  @JsonProperty("nationality")
  private String nationality;

  /**
   * The person's preferred language. Formatted as a ISO 639-1 language code plus a ISO 3166-1
   * alpha-2 country code, seperated by an underscore.
   */
  @JsonProperty("language")
  private String language;

  /**
   * The person's preferred region. Formatted as a ISO 639-1 language code plus a ISO 3166-1 alpha-2
   * country code, seperated by an underscore.
   */
  @JsonProperty("region")
  private String region;

  /** The person's gender. Can be MALE, FEMALE or UNKNOWN. */
  @JsonProperty("gender")
  private String gender;

  /** The user's avatar. */
  @JsonProperty("avatar")
  private Avatar avatar;

  /** The version of the terms of service accepted by the user. */
  @JsonProperty("version_terms_of_service")
  private String versionTermsOfService;

  /**
   * The user status. The user status. Can be: ACTIVE, BLOCKED, SIGNUP, RECOVERY, DENIED or ABORTED.
   */
  @JsonProperty("status")
  private String status;

  /**
   * The user sub-status. Can be: NONE, FACE_RESET, APPROVAL, APPROVAL_DIRECTOR, APPROVAL_PARENT,
   * APPROVAL_SUPPORT, COUNTER_IBAN, IDEAL or SUBMIT.
   */
  @JsonProperty("sub_status")
  private String subStatus;

  /** The setting for the session timeout of the user in seconds. */
  @JsonProperty("session_timeout")
  private Integer sessionTimeout;

  /** The amount the user can pay in the session without asking for credentials. */
  @JsonProperty("daily_limit_without_confirmation_login")
  private Amount dailyLimitWithoutConfirmationLogin;

  /**
   * The types of notifications that will result in a push notification or URL callback for this
   * UserPerson.
   */
  @JsonProperty("notification_filters")
  private List<NotificationFilter> notificationFilters;

  /** The relations for this user. */
  @JsonProperty("relations")
  private List<RelationUser> relations;

  /** The person's first name. */
  @JsonProperty("first_name_field_for_request")
  private String firstNameFieldForRequest;

  /** The person's middle name. */
  @JsonProperty("middle_name_field_for_request")
  private String middleNameFieldForRequest;

  /** The person's last name. */
  @JsonProperty("last_name_field_for_request")
  private String lastNameFieldForRequest;

  /** The person's public nick name. */
  @JsonProperty("public_nick_name_field_for_request")
  private String publicNickNameFieldForRequest;

  /** The user's main address. */
  @JsonProperty("address_main_field_for_request")
  private Address addressMainFieldForRequest;

  /** The person's postal address. */
  @JsonProperty("address_postal_field_for_request")
  private Address addressPostalFieldForRequest;

  /** The public UUID of the user's avatar. */
  @JsonProperty("avatar_uuid_field_for_request")
  private String avatarUuidFieldForRequest;

  /** The user's tax residence numbers for different countries. */
  @JsonProperty("tax_resident_field_for_request")
  private List<TaxResident> taxResidentFieldForRequest;

  /** The type of identification document the person registered with. */
  @JsonProperty("document_type_field_for_request")
  private String documentTypeFieldForRequest;

  /** The identification document number the person registered with. */
  @JsonProperty("document_number_field_for_request")
  private String documentNumberFieldForRequest;

  /** The country which issued the identification document the person registered with. */
  @JsonProperty("document_country_of_issuance_field_for_request")
  private String documentCountryOfIssuanceFieldForRequest;

  /**
   * The reference to the uploaded picture/scan of the front side of the identification document.
   */
  @JsonProperty("document_front_attachment_id_field_for_request")
  private Integer documentFrontAttachmentIdFieldForRequest;

  /** The reference to the uploaded picture/scan of the back side of the identification document. */
  @JsonProperty("document_back_attachment_id_field_for_request")
  private Integer documentBackAttachmentIdFieldForRequest;

  /** The person's date of birth. Accepts ISO8601 date formats. */
  @JsonProperty("date_of_birth_field_for_request")
  private String dateOfBirthFieldForRequest;

  /** The person's place of birth. */
  @JsonProperty("place_of_birth_field_for_request")
  private String placeOfBirthFieldForRequest;

  /** The person's country of birth. Formatted as a SO 3166-1 alpha-2 country code. */
  @JsonProperty("country_of_birth_field_for_request")
  private String countryOfBirthFieldForRequest;

  /** The person's nationality. Formatted as a SO 3166-1 alpha-2 country code. */
  @JsonProperty("nationality_field_for_request")
  private String nationalityFieldForRequest;

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

  /** The person's gender. Can be: MALE, FEMALE and UNKNOWN. */
  @JsonProperty("gender_field_for_request")
  private String genderFieldForRequest;

  /** The user status. You are not allowed to update the status via PUT. */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;

  /** The user sub-status. Can be updated to SUBMIT if status is RECOVERY. */
  @JsonProperty("sub_status_field_for_request")
  private String subStatusFieldForRequest;

  /** The legal guardian of the user. Required for minors. */
  @JsonProperty("legal_guardian_alias_field_for_request")
  private Pointer legalGuardianAliasFieldForRequest;

  /** The setting for the session timeout of the user in seconds. */
  @JsonProperty("session_timeout_field_for_request")
  private Integer sessionTimeoutFieldForRequest;

  /** The amount the user can pay in the session without asking for credentials. */
  @JsonProperty("daily_limit_without_confirmation_login_field_for_request")
  private Amount dailyLimitWithoutConfirmationLoginFieldForRequest;

  /**
   * The person's legal name. Available legal names can be listed via the
   * 'user/{user_id}/legal-name' endpoint.
   */
  @JsonProperty("display_name_field_for_request")
  private String displayNameFieldForRequest;
}
