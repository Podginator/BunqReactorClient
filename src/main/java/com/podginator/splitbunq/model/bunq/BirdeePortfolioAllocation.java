package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Endpoint for viewing the allocations of the model portfolios Birdee offers. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BirdeePortfolioAllocation {

  /** Currency of the instrument. */
  @JsonProperty("instrument_currency")
  private String instrumentCurrency;

  /** Asset Class of the instrument. */
  @JsonProperty("instrument_asset_class")
  private String instrumentAssetClass;

  /** Name of the asset class. */
  @JsonProperty("instrument_asset_class_name")
  private String instrumentAssetClassName;

  /** ISIN code of the instrument. */
  @JsonProperty("instrument_isin")
  private String instrumentIsin;

  /** Name of the instrument. */
  @JsonProperty("instrument_name")
  private String instrumentName;

  /** Name of the geographical region covered by the instrument */
  @JsonProperty("instrument_region_name")
  private String instrumentRegionName;

  /** Key Information Document of the instrument. */
  @JsonProperty("instrument_key_information_document_uri")
  private String instrumentKeyInformationDocumentUri;

  /** Weight of the financial instrument in the model portfolio. */
  @JsonProperty("weight")
  private String weight;

  /** Quantity of the financial instrument in the portfolio. */
  @JsonProperty("quantity")
  private String quantity;

  /** Unit price of the financial instrument. */
  @JsonProperty("price")
  private String price;

  /** Monetary amount of the financial instrument in the portfolio. */
  @JsonProperty("amount")
  private String amount;
}
