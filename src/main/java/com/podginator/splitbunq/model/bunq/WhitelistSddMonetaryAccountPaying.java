package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Whitelist an SDD so that when one comes in, it is automatically accepted. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class WhitelistSddMonetaryAccountPaying {

  @JsonProperty("id")
  private Integer id;

  /**
   * The account to which payments will come in before possibly being 'redirected' by the whitelist.
   */
  @JsonProperty("monetary_account_incoming_id")
  private Integer monetaryAccountIncomingId;

  /**
   * The account from which payments will be deducted when a transaction is matched with this
   * whitelist.
   */
  @JsonProperty("monetary_account_paying_id")
  private Integer monetaryAccountPayingId;

  /** The type of the SDD whitelist, can be CORE or B2B. */
  @JsonProperty("type")
  private String type;

  /** The status of the whitelist. */
  @JsonProperty("status")
  private String status;

  /** The credit scheme ID provided by the counterparty. */
  @JsonProperty("credit_scheme_identifier")
  private String creditSchemeIdentifier;

  /** The mandate ID provided by the counterparty. */
  @JsonProperty("mandate_identifier")
  private String mandateIdentifier;

  /** The account to which payments will be paid. */
  @JsonProperty("counterparty_alias")
  private LabelMonetaryAccount counterpartyAlias;

  /** The monthly maximum amount that can be deducted from the target account. */
  @JsonProperty("maximum_amount_per_month")
  private Amount maximumAmountPerMonth;

  /** The user who created the whitelist entry. */
  @JsonProperty("user_alias_created")
  private LabelUser userAliasCreated;
}
