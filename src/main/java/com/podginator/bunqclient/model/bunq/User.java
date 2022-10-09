package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Using this call you can retrieve information of the user you are logged in as. This includes your
 * user id, which is referred to in endpoints.
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class User {

  @JsonProperty("UserPerson")
  private UserPerson userPerson;

  /** */
  @JsonProperty("UserCompany")
  private UserCompany userCompany;

  /** */
  @JsonProperty("UserApiKey")
  private UserApiKey userApiKey;

  /** */
  @JsonProperty("UserPaymentServiceProvider")
  private UserPaymentServiceProvider userPaymentServiceProvider;
}
