package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class BunqInstallation {

  @Data
  @NoArgsConstructor
  public static class Id {
    private String id;
  }

  @Data
  @NoArgsConstructor
  @AllArgsConstructor
  @Builder
  public static class Token {
    private String id;
    private String created;
    private String updated;
    private String token;
  }

  @Data
  @NoArgsConstructor
  @Builder
  @AllArgsConstructor
  public static class ServerPublicKey {
    @JsonProperty("server_public_key")
    private String serverPublicKey;
  }

  @JsonProperty("Id")
  private Id id;

  @JsonProperty("Token")
  private Token token;

  @JsonProperty("ServerPublicKey")
  private ServerPublicKey serverPublicKey;
}
