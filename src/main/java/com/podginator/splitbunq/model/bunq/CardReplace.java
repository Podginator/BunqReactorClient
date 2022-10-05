package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * It is possible to order a card replacement with the bunq API.<br>
 * <br>
 * You can order up to one free card replacement per year. Additional replacement requests will be
 * billed.<br>
 * <br>
 * The card replacement will have the same expiry date and the same pricing as the old card, but it
 * will have a new card number. You can change the description and optional the PIN through the card
 * replacement endpoint.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CardReplace {

  @JsonProperty("id")
  private Integer id;

  /**
   * The user's name as it will be on the card. Check 'card-name' for the available card names for a
   * user.
   */
  @JsonProperty("name_on_card_field_for_request")
  private String nameOnCardFieldForRequest;

  /** The user's preferred name that can be put on the card. */
  @JsonProperty("preferred_name_on_card_field_for_request")
  private String preferredNameOnCardFieldForRequest;

  /** Array of Types, PINs, account IDs assigned to the card. */
  @JsonProperty("pin_code_assignment_field_for_request")
  private List<CardPinAssignment> pinCodeAssignmentFieldForRequest;

  /** The second line on the card. */
  @JsonProperty("second_line_field_for_request")
  private String secondLineFieldForRequest;
}
