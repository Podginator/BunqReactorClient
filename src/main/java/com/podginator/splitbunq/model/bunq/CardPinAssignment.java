package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CardPinAssignment {

  /** PIN type. Can be PRIMARY, SECONDARY or TERTIARY */
  @JsonProperty("type")
  private String type;

  /** The ID of the monetary account to assign to this pin for the card. */
  @JsonProperty("monetary_account_id")
  private Integer monetaryAccountId;

  /** PIN type. Can be PRIMARY, SECONDARY or TERTIARY */
  @JsonProperty("type_field_for_request")
  private String typeFieldForRequest;

  /** The 4 digit PIN to be assigned to this account. */
  @JsonProperty("pin_code_field_for_request")
  private String pinCodeFieldForRequest;

  /** The ID of the monetary account to assign to this pin for the card. */
  @JsonProperty("monetary_account_id_field_for_request")
  private Integer monetaryAccountIdFieldForRequest;
}
