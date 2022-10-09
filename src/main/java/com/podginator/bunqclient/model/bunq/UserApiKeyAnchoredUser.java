package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserApiKeyAnchoredUser {

  /** */
  @JsonProperty("UserPerson")
  private UserPerson userPerson;

  /** */
  @JsonProperty("UserCompany")
  private UserCompany userCompany;

  /** */
  @JsonProperty("UserPaymentServiceProvider")
  private UserPaymentServiceProvider userPaymentServiceProvider;
}
