package com.podginator.splitbunq.model.bunq;

import com.bunq.sdk.model.generated.object.Avatar;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LabelUser {

  /** The public UUID of the label-user. */
  @JsonProperty("uuid")
  private String uuid;

  /** The current avatar of the user. */
  @JsonProperty("avatar")
  private Avatar avatar;

  /** The current nickname of the user. */
  @JsonProperty("public_nick_name")
  private String publicNickName;

  /** The name to be displayed for this user, as it was given on the request. */
  @JsonProperty("display_name")
  private String displayName;

  /** The country of the user. 000 stands for "unknown" */
  @JsonProperty("country")
  private String country;

  /** The public UUID of the label-user. */
  @JsonProperty("uuid_field_for_request")
  private String uuidFieldForRequest;

  /** The name to be displayed for this user, as it was given on the request. */
  @JsonProperty("display_name_field_for_request")
  private String displayNameFieldForRequest;

  /** The country of the user */
  @JsonProperty("country_field_for_request")
  private String countryFieldForRequest;
}
