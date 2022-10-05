package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class InvoiceItem {

  /** The id of the invoice item. */
  @JsonProperty("id")
  private Integer id;

  /** The billing date of the item. */
  @JsonProperty("billing_date")
  private String billingDate;

  /** The price description. */
  @JsonProperty("type_description")
  private String typeDescription;

  /** The translated price description. */
  @JsonProperty("type_description_translated")
  private String typeDescriptionTranslated;

  /** The unit item price excluding VAT. */
  @JsonProperty("unit_vat_exclusive")
  private Amount unitVatExclusive;

  /** The unit item price including VAT. */
  @JsonProperty("unit_vat_inclusive")
  private Amount unitVatInclusive;

  /** The VAT tax fraction. */
  @JsonProperty("vat")
  private BigDecimal vat;

  /** The number of items priced. */
  @JsonProperty("quantity")
  private BigDecimal quantity;

  /** The item price excluding VAT. */
  @JsonProperty("total_vat_exclusive")
  private Amount totalVatExclusive;

  /** The item price including VAT. */
  @JsonProperty("total_vat_inclusive")
  private Amount totalVatInclusive;
}
