package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Show the subscription billing contract for the authenticated user. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BillingContractSubscription {

  /** The id of the billing contract. */
  @JsonProperty("id")
  private Integer id;

  /** The timestamp when the billing contract was made. */
  @JsonProperty("created")
  private String created;

  /** The timestamp when the billing contract was last updated. */
  @JsonProperty("updated")
  private String updated;

  /** The date from when the billing contract is valid. */
  @JsonProperty("contract_date_start")
  private String contractDateStart;

  /** The date until when the billing contract is valid. */
  @JsonProperty("contract_date_end")
  private String contractDateEnd;

  /** The version of the billing contract. */
  @JsonProperty("contract_version")
  private Integer contractVersion;

  /**
   * The subscription type of the user. Can be one of PERSON_SUPER_LIGHT_V1, PERSON_LIGHT_V1,
   * PERSON_MORE_V1, PERSON_FREE_V1, PERSON_PREMIUM_V1, COMPANY_V1, or COMPANY_V2.
   */
  @JsonProperty("subscription_type")
  private String subscriptionType;

  /**
   * The subscription type the user will have after a subscription downgrade. Will be null if
   * downgrading is not possible.
   */
  @JsonProperty("subscription_type_downgrade")
  private String subscriptionTypeDowngrade;

  /** The subscription status. */
  @JsonProperty("status")
  private String status;

  /** The subscription substatus. */
  @JsonProperty("sub_status")
  private String subStatus;

  /**
   * The subscription type of the user. Can be one of PERSON_LIGHT_V1, PERSON_MORE_V1,
   * PERSON_FREE_V1, PERSON_PREMIUM_V1, COMPANY_V1, or COMPANY_V2.
   */
  @JsonProperty("subscription_type_field_for_request")
  private String subscriptionTypeFieldForRequest;
}
