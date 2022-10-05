package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to replace multiple cards in a batch. */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class CardBatchReplace {

  @JsonProperty("updated_card_ids")
  private List<BunqId> updatedCardIds;

  /** The cards that need to be replaced. */
  @JsonProperty("cards_field_for_request")
  private List<CardBatchReplaceEntry> cardsFieldForRequest;
}
