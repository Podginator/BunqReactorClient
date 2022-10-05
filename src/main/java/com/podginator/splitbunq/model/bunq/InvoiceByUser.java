package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to list bunq invoices by user. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class InvoiceByUser {

  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the invoice object's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the invoice object's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The invoice date. */
  @JsonProperty("invoice_date")
  private String invoiceDate;

  /** The invoice number. */
  @JsonProperty("invoice_number")
  private String invoiceNumber;

  /** The invoice status. */
  @JsonProperty("status")
  private String status;

  /** The invoice item groups. */
  @JsonProperty("group")
  private List<InvoiceItemGroup> group;

  /** The total discounted item price including VAT. */
  @JsonProperty("total_vat_inclusive")
  private Amount totalVatInclusive;

  /** The total discounted item price excluding VAT. */
  @JsonProperty("total_vat_exclusive")
  private Amount totalVatExclusive;

  /** The VAT on the total discounted item price. */
  @JsonProperty("total_vat")
  private Amount totalVat;

  /** The label that's displayed to the counterparty with the invoice. Includes user. */
  @JsonProperty("alias")
  private LabelMonetaryAccount alias;

  /** The customer's address. */
  @JsonProperty("address")
  private Address address;

  /** The label of the counterparty of the invoice. Includes user. */
  @JsonProperty("counterparty_alias")
  private LabelMonetaryAccount counterpartyAlias;

  /** The company's address. */
  @JsonProperty("counterparty_address")
  private Address counterpartyAddress;

  /** The company's chamber of commerce number. */
  @JsonProperty("chamber_of_commerce_number")
  private String chamberOfCommerceNumber;

  /** The company's chamber of commerce number. */
  @JsonProperty("vat_number")
  private String vatNumber;
}
