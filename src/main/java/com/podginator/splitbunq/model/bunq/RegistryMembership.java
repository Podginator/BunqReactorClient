package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** View for RegistryMembership. */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class RegistryMembership {

  /** The LabelMonetaryAccount of the user who belongs to this RegistryMembership. */
  @JsonProperty("alias")
  private LabelMonetaryAccount alias;

  /** The balance of this RegistryMembership. */
  @JsonProperty("balance")
  private Amount balance;

  /** The total amount spent of this RegistryMembership. */
  @JsonProperty("total_amount_spent")
  private Amount totalAmountSpent;

  /** The status of the RegistryMembership. */
  @JsonProperty("status")
  private String status;

  /** The status of the settlement of the Registry. Can be PENDING or SETTLED. */
  @JsonProperty("status_settlement")
  private String statusSettlement;

  /** The setting for for adding automatically card transactions to the registry. */
  @JsonProperty("auto_add_card_transaction")
  private String autoAddCardTransaction;

  /** The registry id. */
  @JsonProperty("registry_id")
  private Integer registryId;

  /** The registry title. */
  @JsonProperty("registry_title")
  private String registryTitle;

  /** The label of the user that sent the invite. */
  @JsonProperty("invitor")
  private LabelUser invitor;

  /** The Alias of the party we are inviting to the Registry. */
  @JsonProperty("alias_field_for_request")
  private Pointer aliasFieldForRequest;

  /** The status of the RegistryMembership. */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;

  /** The setting for for adding automatically card transactions to the registry. */
  @JsonProperty("auto_add_card_transaction_field_for_request")
  private String autoAddCardTransactionFieldForRequest;
}
