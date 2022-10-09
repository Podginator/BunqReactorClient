package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Depreciated route, replaced with whitelist-sdd-recurring */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class WhitelistSdd {

  /** The ID of the whitelist entry. */
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

  /** ID of the monetary account of which you want to pay from. */
  @JsonProperty("monetary_account_paying_id_field_for_request")
  private Integer monetaryAccountPayingIdFieldForRequest;

  /** ID of the request for which you want to whitelist the originating SDD. */
  @JsonProperty("request_id_field_for_request")
  private Integer requestIdFieldForRequest;

  /** The maximum amount of money that is allowed to be deducted based on the whitelist. */
  @JsonProperty("maximum_amount_per_month_field_for_request")
  private Amount maximumAmountPerMonthFieldForRequest;
}
