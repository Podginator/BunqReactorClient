package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class CardBatchEntry {

  /** The ID of the card that needs to be updated. */
  @JsonProperty("id_field_for_request")
  private Integer idFieldForRequest;

  /**
   * The status to set for the card. Can be ACTIVE, DEACTIVATED, LOST, STOLEN or CANCELLED, and can
   * only be set to LOST/STOLEN/CANCELLED when order status is
   * ACCEPTED_FOR_PRODUCTION/DELIVERED_TO_CUSTOMER/CARD_UPDATE_REQUESTED/CARD_UPDATE_SENT/CARD_UPDATE_ACCEPTED.
   * Can only be set to DEACTIVATED after initial activation, i.e. order_status is
   * DELIVERED_TO_CUSTOMER/CARD_UPDATE_REQUESTED/CARD_UPDATE_SENT/CARD_UPDATE_ACCEPTED. Mind that
   * all the possible choices (apart from ACTIVE and DEACTIVATED) are permanent and cannot be
   * changed after.
   */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;

  /** The spending limit for the card. */
  @JsonProperty("card_limit_field_for_request")
  private Amount cardLimitFieldForRequest;

  /** The ATM spending limit for the card. */
  @JsonProperty("card_limit_atm_field_for_request")
  private Amount cardLimitAtmFieldForRequest;

  /** The countries for which to grant (temporary) permissions to use the card. */
  @JsonProperty("country_permission_field_for_request")
  private List<CardCountryPermission> countryPermissionFieldForRequest;

  /**
   * ID of the MA to be used as fallback for this card if insufficient balance. Fallback account is
   * removed if not supplied.
   */
  @JsonProperty("monetary_account_id_fallback_field_for_request")
  private Integer monetaryAccountIdFallbackFieldForRequest;
}
