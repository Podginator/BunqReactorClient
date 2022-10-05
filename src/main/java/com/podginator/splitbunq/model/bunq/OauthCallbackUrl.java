package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class OauthCallbackUrl {

  /** The id of the callback URL. */
  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the callback URL's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the callback URL's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The Callback URL. */
  @JsonProperty("url")
  private String url;
}
