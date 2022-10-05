package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Manage the relation user details. */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class RelationUser {

  /** The user's ID. */
  @JsonProperty("user_id")
  private String userId;

  /** The counter user's ID. */
  @JsonProperty("counter_user_id")
  private String counterUserId;

  /** The user's label. */
  @JsonProperty("label_user")
  private LabelUser labelUser;

  /** The counter user's label. */
  @JsonProperty("counter_label_user")
  private LabelUser counterLabelUser;

  /** The requested relation type. */
  @JsonProperty("relationship")
  private String relationship;

  /** The request's status, only for UPDATE. */
  @JsonProperty("status")
  private String status;
}
