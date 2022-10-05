package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used for managing OAuth Clients. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OauthClient {

  /** Id of the client. */
  @JsonProperty("id")
  private Integer id;

  /** The status of the pack group, can be ACTIVE, CANCELLED or CANCELLED_PENDING. */
  @JsonProperty("status")
  private String status;

  /** The display name of this Oauth Client */
  @JsonProperty("display_name")
  private String displayName;

  /** The Client ID associated with this Oauth Client */
  @JsonProperty("client_id")
  private String clientId;

  /** Secret associated with this Oauth Client */
  @JsonProperty("secret")
  private String secret;

  /** The callback URLs which are bound to this Oauth Client */
  @JsonProperty("callback_url")
  private List<OauthCallbackUrl> callbackUrl;

  /** The status of the Oauth Client, can be ACTIVE or CANCELLED. */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;
}
