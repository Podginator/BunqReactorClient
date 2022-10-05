package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to settle a Slice group. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RegistrySettlement {

  /** The id of the RegistrySettlement. */
  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the RegistrySettlement's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the RegistrySettlement's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The timestamp of the Registry's settlement. */
  @JsonProperty("settlement_time")
  private String settlementTime;

  /** The total amount spent for the RegistrySettlement. */
  @JsonProperty("total_amount_spent")
  private Amount totalAmountSpent;

  /** The number of RegistryEntry's associated with this RegistrySettlement. */
  @JsonProperty("number_of_entries")
  private Integer numberOfEntries;

  /** The membership of the user that settled the Registry. */
  @JsonProperty("settled_by_alias")
  private RegistryMembership settledByAlias;

  /** The membership of the user that has settled the registry. */
  @JsonProperty("membership_settled")
  private RegistryMembership membershipSettled;

  /** List of RegistrySettlementItems */
  @JsonProperty("items")
  private List<RegistrySettlementItem> items;
}
