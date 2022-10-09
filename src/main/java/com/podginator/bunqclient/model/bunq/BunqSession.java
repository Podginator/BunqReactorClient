package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class BunqSession {

  @Data
  @NoArgsConstructor
  public static class Id {
    private Long id;
  }

  @Data
  @NoArgsConstructor
  public static class Token {
    private Long id;
    private String created;
    private String updated;
    private String token;
  }

  @Data
  @NoArgsConstructor
  public static class UserPerson {
    private Long id;
  }

  @JsonProperty("Id")
  private Id id;

  @JsonProperty("Token")
  private Token token;

  @JsonProperty("UserPerson")
  private UserPerson userPerson;
}
