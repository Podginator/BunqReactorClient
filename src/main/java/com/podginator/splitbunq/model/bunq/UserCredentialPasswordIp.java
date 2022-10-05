package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Create a credential of a user for server authentication, or delete the credential of a user for
 * server authentication.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserCredentialPasswordIp {

  /** The id of the credential. */
  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the credential object's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the credential object's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The status of the credential. */
  @JsonProperty("status")
  private String status;

  /** When the status is PENDING_FIRST_USE: when the credential expires. */
  @JsonProperty("expiry_time")
  private String expiryTime;

  /** When the status is PENDING_FIRST_USE: the value of the token. */
  @JsonProperty("token_value")
  private String tokenValue;

  /** When the status is ACTIVE: the details of the device that may use the credential. */
  @JsonProperty("permitted_device")
  private PermittedDevice permittedDevice;
}
