package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to manage Transferwise users. */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferwiseUser {

  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the TransferwiseUser's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the TransferwiseUser's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The name the user is registered with at TransferWise. */
  @JsonProperty("name")
  private String name;

  /** The email the user is registered with at TransferWise. */
  @JsonProperty("email")
  private String email;

  /** The source of the user at TransferWise. */
  @JsonProperty("source")
  private String source;

  /**
   * The OAuth code returned by Transferwise we should be using to gain access to the user's
   * Transferwise account.
   */
  @JsonProperty("oauth_code_field_for_request")
  private String oauthCodeFieldForRequest;
}
