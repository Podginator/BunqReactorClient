package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to view Rewards. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RewardRecipient {

  @JsonProperty("id")
  private Integer id;

  /** The time the reward was created. */
  @JsonProperty("created")
  private String created;

  /** The time the reward was last updated. */
  @JsonProperty("updated")
  private String updated;

  /** The status of the reward. */
  @JsonProperty("status")
  private String status;

  /** The subStatus of the reward. */
  @JsonProperty("sub_status")
  private String subStatus;

  /** The type of the reward. */
  @JsonProperty("type")
  private String type;

  /** The alias of the other user eligible for the reward award. */
  @JsonProperty("counterparty_alias")
  private LabelUser counterpartyAlias;

  /** The amount that will be/was awarded as reward for the reward. */
  @JsonProperty("amount_reward")
  private Amount amountReward;
}
