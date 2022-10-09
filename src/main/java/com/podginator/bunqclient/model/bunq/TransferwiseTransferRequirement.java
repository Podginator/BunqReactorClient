package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to determine the account requirements for Transferwise transfers. */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferwiseTransferRequirement {

  @JsonProperty("type")
  private String type;

  /** The label of the possible transfer type to show to the user. */
  @JsonProperty("label")
  private String label;

  /** The fields which the user needs to fill. */
  @JsonProperty("fields")
  private List<TransferwiseRequirementField> fields;

  /** The id of the target account. */
  @JsonProperty("recipient_id_field_for_request")
  private String recipientIdFieldForRequest;

  /**
   * The fields which were specified as "required" and have since been filled by the user. Always
   * provide the full list.
   */
  @JsonProperty("detail_field_for_request")
  private List<TransferwiseRequirementField> detailFieldForRequest;
}
