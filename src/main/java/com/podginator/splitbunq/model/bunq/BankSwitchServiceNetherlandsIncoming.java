package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Endpoint for using the Equens Bank Switch Service. */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class BankSwitchServiceNetherlandsIncoming {

  /** The label of the user creator of this switch service. */
  @JsonProperty("user_alias")
  private LabelUser userAlias;

  /** The label of the monetary of this switch service. */
  @JsonProperty("alias")
  private LabelMonetaryAccount alias;

  /** The IBAN alias that's displayed for this switch service. */
  @JsonProperty("counterparty_alias")
  private LabelMonetaryAccount counterpartyAlias;

  /** The status of the switch service. */
  @JsonProperty("status")
  private String status;

  /** The sub status of the switch service. */
  @JsonProperty("sub_status")
  private String subStatus;

  /** The timestamp when the switch service desired to be start. */
  @JsonProperty("time_start_desired")
  private String timeStartDesired;

  /** The timestamp when the switch service actually starts. */
  @JsonProperty("time_start_actual")
  private String timeStartActual;

  /** The timestamp when the switch service ends. */
  @JsonProperty("time_end")
  private String timeEnd;

  /** Reference to the bank transfer form for this switch-service. */
  @JsonProperty("attachment")
  private Attachment attachment;

  /** The alias of the Monetary Account this switch service is for. */
  @JsonProperty("alias_field_for_request")
  private Pointer aliasFieldForRequest;

  /**
   * The Alias of the party we are switching from. Can only be an Alias of type IBAN (external bank
   * account).
   */
  @JsonProperty("counterparty_alias_field_for_request")
  private Pointer counterpartyAliasFieldForRequest;

  /**
   * The status of the switch service. Ignored in POST requests (always set to REQUESTED) can be
   * CANCELLED in PUT requests to cancel the switch service. Admin can set this to ACCEPTED, or
   * REJECTED.
   */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;
}
