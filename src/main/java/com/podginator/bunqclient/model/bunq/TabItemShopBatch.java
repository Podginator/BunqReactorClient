package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Create a batch of tab items. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TabItemShopBatch {

  /** The list of tab items in the batch. */
  @JsonProperty("tab_items")
  private List<TabItemShop> tabItems;

  /** The list of tab items we want to create in a single batch. Limited to 50 items per batch. */
  @JsonProperty("tab_items_field_for_request")
  private List<TabItemShop> tabItemsFieldForRequest;
}
