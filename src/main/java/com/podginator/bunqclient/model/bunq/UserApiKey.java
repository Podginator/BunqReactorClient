package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to view OAuth request detais in events. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserApiKey {

  /** The id of the user. */
  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the user object's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the user object's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The user who requested access. */
  @JsonProperty("requested_by_user")
  private UserApiKeyAnchoredUser requestedByUser;

  /** The user who granted access. */
  @JsonProperty("granted_by_user")
  private UserApiKeyAnchoredUser grantedByUser;
}
