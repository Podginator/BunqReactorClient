package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CardPrimaryAccountNumber {

  /** The ID for this Virtual PAN. */
  @JsonProperty("id")
  private Integer id;

  /** The UUID for this Virtual PAN. */
  @JsonProperty("uuid")
  private String uuid;

  /** The description for this PAN. */
  @JsonProperty("description")
  private String description;

  /** The status for this PAN, only for Online Cards. */
  @JsonProperty("status")
  private String status;

  /** The ID of the monetary account to assign to this PAN, only for Online Cards. */
  @JsonProperty("monetary_account_id")
  private Integer monetaryAccountId;

  /** The last four digits of the PAN. */
  @JsonProperty("four_digit")
  private String fourDigit;

  /** The ID for this PAN. */
  @JsonProperty("id_field_for_request")
  private Integer idFieldForRequest;

  /** The description for this PAN. */
  @JsonProperty("description_field_for_request")
  private String descriptionFieldForRequest;

  /** The status for this PAN, only for Online Cards. */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;

  /** The ID of the monetary account to assign to this PAN, only for Online Cards. */
  @JsonProperty("monetary_account_id_field_for_request")
  private Integer monetaryAccountIdFieldForRequest;
}
