package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to determine the recipient account requirements for Transferwise transfers. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransferwiseAccountRequirement {

  /** A possible recipient account type. */
  @JsonProperty("type")
  private String type;

  /** The label of the possible recipient account type to show to the user. */
  @JsonProperty("label")
  private String label;

  /** The fields which the user needs to fill. */
  @JsonProperty("fields")
  private List<TransferwiseRequirementField> fields;

  /** The country of the receiving account. */
  @JsonProperty("country_field_for_request")
  private String countryFieldForRequest;

  /** The name of the account holder. */
  @JsonProperty("name_account_holder_field_for_request")
  private String nameAccountHolderFieldForRequest;

  /**
   * The chosen recipient account type. The possible options are provided dynamically in the
   * response endpoint.
   */
  @JsonProperty("type_field_for_request")
  private String typeFieldForRequest;

  /**
   * The fields which were specified as "required" and have since been filled by the user. Always
   * provide the full list.
   */
  @JsonProperty("detail_field_for_request")
  private List<TransferwiseRequirementField> detailFieldForRequest;
}
