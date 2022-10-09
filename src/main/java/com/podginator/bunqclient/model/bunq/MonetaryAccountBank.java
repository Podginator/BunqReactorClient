package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MonetaryAccountBank {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("created")
  private String created;

  @JsonProperty("updated")
  private String updated;

  @JsonProperty("avatar")
  private Avatar avatar;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("description")
  private String description;

  @JsonProperty("daily_limit")
  private Amount dailyLimit;

  @JsonProperty("overdraft_limit")
  private Amount overdraftLimit;

  @JsonProperty("balance")
  private Amount balance;

  @JsonProperty("alias")
  private List<Pointer> alias;

  @JsonProperty("public_uuid")
  private String publicUuid;

  @JsonProperty("status")
  private String status;

  @JsonProperty("sub_status")
  private String subStatus;

  @JsonProperty("reason")
  private String reason;

  @JsonProperty("reason_description")
  private String reasonDescription;

  @JsonProperty("user_id")
  private Integer userId;

  @JsonProperty("monetary_account_profile")
  private MonetaryAccountProfile monetaryAccountProfile;

  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("setting")
  private MonetaryAccountSetting setting;

  @JsonProperty("all_auto_save_id")
  private List<BunqId> allAutoSaveId;

  @JsonProperty("currency_field_for_request")
  private String currencyFieldForRequest;

  @JsonProperty("description_field_for_request")
  private String descriptionFieldForRequest;

  @JsonProperty("daily_limit_field_for_request")
  private Amount dailyLimitFieldForRequest;

  @JsonProperty("avatar_uuid_field_for_request")
  private String avatarUuidFieldForRequest;

  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;

  @JsonProperty("sub_status_field_for_request")
  private String subStatusFieldForRequest;

  @JsonProperty("reason_field_for_request")
  private String reasonFieldForRequest;

  @JsonProperty("reason_description_field_for_request")
  private String reasonDescriptionFieldForRequest;

  @JsonProperty("display_name_field_for_request")
  private String displayNameFieldForRequest;

  @JsonProperty("setting_field_for_request")
  private MonetaryAccountSetting settingFieldForRequest;

  @JsonProperty("country_iban_field_for_request")
  private String countryIbanFieldForRequest;
}
