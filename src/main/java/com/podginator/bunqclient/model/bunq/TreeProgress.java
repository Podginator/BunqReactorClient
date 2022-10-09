package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** See how many trees this user has planted. */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeProgress {

  @JsonProperty("number_of_tree")
  private BigDecimal numberOfTree;

  /** The progress towards the next tree. */
  @JsonProperty("progress_tree_next")
  private BigDecimal progressTreeNext;

  /** URL of the invite profile. */
  @JsonProperty("url_invite_profile")
  private String urlInviteProfile;

  /** The label of the user the progress belongs to. */
  @JsonProperty("label_user")
  private LabelUser labelUser;
}
