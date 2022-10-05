package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to get insights about transactions between given time range. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Insight {

  /** The category. */
  @JsonProperty("category")
  private String category;

  /** The translated category. */
  @JsonProperty("category_translated")
  private String categoryTranslated;

  /** The total amount of the transactions in the category. */
  @JsonProperty("amount_total")
  private Amount amountTotal;

  /** The number of the transactions in the category. */
  @JsonProperty("number_of_transactions")
  private BigDecimal numberOfTransactions;
}
