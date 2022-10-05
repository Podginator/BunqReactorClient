package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to update multiple cards in a batch. */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardBatch {

  @JsonProperty("updated_card_ids")
  private List<BunqId> updatedCardIds;

  /** The cards that need to be updated. */
  @JsonProperty("cards_field_for_request")
  private List<CardBatchEntry> cardsFieldForRequest;
}
