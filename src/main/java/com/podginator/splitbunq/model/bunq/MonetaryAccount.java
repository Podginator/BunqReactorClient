package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonetaryAccount {

  @JsonProperty("MonetaryAccountBank")
  private MonetaryAccountBank monetaryAccountBank;

  @JsonProperty("MonetaryAccountJoint")
  private MonetaryAccountJoint monetaryAccountJoint;

  @JsonProperty("MonetaryAccountLight")
  private MonetaryAccountLight monetaryAccountLight;

  @JsonProperty("MonetaryAccountSavings")
  private MonetaryAccountSavings monetaryAccountSavings;

  @JsonProperty("MonetaryAccountExternal")
  private MonetaryAccountExternal monetaryAccountExternal;

  @JsonProperty("MonetaryAccountInvestment")
  private MonetaryAccountInvestment monetaryAccountInvestment;
}
