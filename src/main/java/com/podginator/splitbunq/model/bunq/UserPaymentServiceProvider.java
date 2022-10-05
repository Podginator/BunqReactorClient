package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to view UserPaymentServiceProvider for session creation. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserPaymentServiceProvider {

  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the user object's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the user object's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The distinguished name from the certificate used to identify this user. */
  @JsonProperty("certificate_distinguished_name")
  private String certificateDistinguishedName;

  /** The aliases of the user. */
  @JsonProperty("alias")
  private List<Pointer> alias;

  /** The user's avatar. */
  @JsonProperty("avatar")
  private Avatar avatar;

  /** The user status. The user status. Can be: ACTIVE, BLOCKED or DENIED. */
  @JsonProperty("status")
  private String status;

  /** The user sub-status. Can be: NONE */
  @JsonProperty("sub_status")
  private String subStatus;

  /** The providers's public UUID. */
  @JsonProperty("public_uuid")
  private String publicUuid;

  /** The display name for the provider. */
  @JsonProperty("display_name")
  private String displayName;

  /** The public nick name for the provider. */
  @JsonProperty("public_nick_name")
  private String publicNickName;

  /**
   * The provider's language. Formatted as a ISO 639-1 language code plus a ISO 3166-1 alpha-2
   * country code, separated by an underscore.
   */
  @JsonProperty("language")
  private String language;

  /**
   * The provider's region. Formatted as a ISO 639-1 language code plus a ISO 3166-1 alpha-2 country
   * code, separated by an underscore.
   */
  @JsonProperty("region")
  private String region;

  /** The setting for the session timeout of the user in seconds. */
  @JsonProperty("session_timeout")
  private Integer sessionTimeout;
}
