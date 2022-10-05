package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CardBatchReplaceEntry {

  /** The ID of the card that needs to be replaced. */
  @JsonProperty("id_field_for_request")
  private Integer idFieldForRequest;

  /**
   * The user's name as it will be on the card. Check 'card-name' for the available card names for a
   * user.
   */
  @JsonProperty("name_on_card_field_for_request")
  private String nameOnCardFieldForRequest;

  /** Array of Types, PINs, account IDs assigned to the card. */
  @JsonProperty("pin_code_assignment_field_for_request")
  private List<CardPinAssignment> pinCodeAssignmentFieldForRequest;

  /** The second line on the card. */
  @JsonProperty("second_line_field_for_request")
  private String secondLineFieldForRequest;
}
