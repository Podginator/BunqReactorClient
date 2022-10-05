package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** List all the definitions in a payment auto allocate. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentAutoAllocateDefinition {

  @JsonProperty("id")
  private Integer id;

  /** The timestamp when the PaymentAutoAllocateDefinition was created. */
  @JsonProperty("created")
  private String created;

  /** The timestamp when the PaymentAutoAllocateDefinition was last updated. */
  @JsonProperty("updated")
  private String updated;

  /** The alias of the party we are allocating the money to. */
  @JsonProperty("counterparty_alias")
  private Pointer counterpartyAlias;

  /** The description for the payment. */
  @JsonProperty("description")
  private String description;

  /** The amount to allocate. */
  @JsonProperty("amount")
  private Amount amount;

  /** The percentage of the triggering payment's amount to allocate. */
  @JsonProperty("fraction")
  private BigDecimal fraction;

  /** The type of definition. */
  @JsonProperty("type_field_for_request")
  private String typeFieldForRequest;

  /** The alias of the party we are allocating the money to. */
  @JsonProperty("counterparty_alias_field_for_request")
  private Pointer counterpartyAliasFieldForRequest;

  /** The description for the payment. */
  @JsonProperty("description_field_for_request")
  private String descriptionFieldForRequest;

  /** The amount to allocate. */
  @JsonProperty("amount_field_for_request")
  private Amount amountFieldForRequest;

  /** The percentage of the triggering payment's amount to allocate. */
  @JsonProperty("fraction_field_for_request")
  private BigDecimal fractionFieldForRequest;
}
