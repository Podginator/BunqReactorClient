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
public class InvoiceItemGroup {

  /** The type of the invoice item group. */
  @JsonProperty("type")
  private String type;

  /** The description of the type of the invoice item group. */
  @JsonProperty("type_description")
  private String typeDescription;

  /** The translated description of the type of the invoice item group. */
  @JsonProperty("type_description_translated")
  private String typeDescriptionTranslated;

  /** The identifier of the invoice item group. */
  @JsonProperty("instance_description")
  private String instanceDescription;

  /** The unit item price excluding VAT. */
  @JsonProperty("product_vat_exclusive")
  private Amount productVatExclusive;

  /** The unit item price including VAT. */
  @JsonProperty("product_vat_inclusive")
  private Amount productVatInclusive;

  /** The invoice items in the group. */
  @JsonProperty("item")
  private List<InvoiceItem> item;
}
