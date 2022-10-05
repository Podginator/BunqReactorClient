package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Endpoint for getting all the accepted card names for a user. As bunq do not allow total freedom
 * in choosing the name that is going to be printed on the card, the following formats are accepted:
 * Name Surname, N. Surname, N Surname or Surname.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CardName {

  @JsonProperty("possible_card_name_array")
  private List<String> possibleCardNameArray;
}
