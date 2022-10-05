package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Endpoint for retrieving details for the cards the user has access to. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Card {

  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the card's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the card's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The public UUID of the card. */
  @JsonProperty("public_uuid")
  private String publicUuid;

  /** The type of the card. Can be MAESTRO, MASTERCARD. */
  @JsonProperty("type")
  private String type;

  /** The sub-type of the card. */
  @JsonProperty("sub_type")
  private String subType;

  /** The second line of text on the card */
  @JsonProperty("second_line")
  private String secondLine;

  /** ID of the user who is owner of the card. */
  @JsonProperty("user_id")
  private Integer userId;

  /**
   * The status to set for the card. Can be ACTIVE, DEACTIVATED, LOST, STOLEN, CANCELLED, EXPIRED or
   * PIN_TRIES_EXCEEDED.
   */
  @JsonProperty("status")
  private String status;

  /** The sub-status of the card. Can be NONE or REPLACED. */
  @JsonProperty("sub_status")
  private String subStatus;

  /**
   * The order status of the card. Can be NEW_CARD_REQUEST_RECEIVED, CARD_REQUEST_PENDING,
   * SENT_FOR_PRODUCTION, ACCEPTED_FOR_PRODUCTION, DELIVERED_TO_CUSTOMER, CARD_UPDATE_REQUESTED,
   * CARD_UPDATE_PENDING, CARD_UPDATE_SENT, CARD_UPDATE_ACCEPTED, VIRTUAL_DELIVERY,
   * NEW_CARD_REQUEST_PENDING_USER_APPROVAL, SENT_FOR_DELIVERY or NEW_CARD_REQUEST_CANCELLED.
   */
  @JsonProperty("order_status")
  private String orderStatus;

  /** Expiry date of the card. */
  @JsonProperty("expiry_date")
  private String expiryDate;

  /** The user's name on the card. */
  @JsonProperty("name_on_card")
  private String nameOnCard;

  /** Array of PANs and their attributes. */
  @JsonProperty("primary_account_numbers")
  private List<CardPrimaryAccountNumber> primaryAccountNumbers;

  /** The payment account reference number associated with the card. */
  @JsonProperty("payment_account_reference")
  private String paymentAccountReference;

  /** The spending limit for the card. */
  @JsonProperty("card_limit")
  private Amount cardLimit;

  /** The ATM spending limit for the card. */
  @JsonProperty("card_limit_atm")
  private Amount cardLimitAtm;

  /** The countries for which to grant (temporary) permissions to use the card. */
  @JsonProperty("country_permission")
  private List<CardCountryPermission> countryPermission;

  /** The monetary account this card was ordered on and the label user that owns the card. */
  @JsonProperty("label_monetary_account_ordered")
  private LabelMonetaryAccount labelMonetaryAccountOrdered;

  /** The monetary account that this card is currently linked to and the label user viewing it. */
  @JsonProperty("label_monetary_account_current")
  private LabelMonetaryAccount labelMonetaryAccountCurrent;

  /** Array of Types, PINs, account IDs assigned to the card. */
  @JsonProperty("pin_code_assignment")
  private List<CardPinAssignment> pinCodeAssignment;

  /**
   * ID of the MA to be used as fallback for this card if insufficient balance. Fallback account is
   * removed if not supplied.
   */
  @JsonProperty("monetary_account_id_fallback")
  private Integer monetaryAccountIdFallback;

  /** The country that is domestic to the card. Defaults to country of residence of user. */
  @JsonProperty("country")
  private String country;

  /** A tracking link provided by our shipment provider. */
  @JsonProperty("card_shipment_tracking_url")
  private String cardShipmentTrackingUrl;

  /** The amount saved through ZeroFX on this card. */
  @JsonProperty("amount_saved_zero_fx")
  private Amount amountSavedZeroFx;

  /** The plaintext pin code. Requests require encryption to be enabled. */
  @JsonProperty("pin_code_field_for_request")
  private String pinCodeFieldForRequest;

  /**
   * DEPRECATED: Activate a card by setting status to ACTIVE when the order_status is
   * ACCEPTED_FOR_PRODUCTION.
   */
  @JsonProperty("activation_code_field_for_request")
  private String activationCodeFieldForRequest;

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

  /**
   * The order status to set for the card. Set to CARD_REQUEST_PENDING to get a virtual card
   * produced.
   */
  @JsonProperty("order_status_field_for_request")
  private String orderStatusFieldForRequest;

  /** The spending limit for the card. */
  @JsonProperty("card_limit_field_for_request")
  private Amount cardLimitFieldForRequest;

  /** The ATM spending limit for the card. */
  @JsonProperty("card_limit_atm_field_for_request")
  private Amount cardLimitAtmFieldForRequest;

  /** The countries for which to grant (temporary) permissions to use the card. */
  @JsonProperty("country_permission_field_for_request")
  private List<CardCountryPermission> countryPermissionFieldForRequest;

  /** Array of Types, PINs, account IDs assigned to the card. */
  @JsonProperty("pin_code_assignment_field_for_request")
  private List<CardPinAssignment> pinCodeAssignmentFieldForRequest;

  /** Array of PANs and their attributes. */
  @JsonProperty("primary_account_numbers_field_for_request")
  private List<CardPrimaryAccountNumber> primaryAccountNumbersFieldForRequest;

  /**
   * ID of the MA to be used as fallback for this card if insufficient balance. Fallback account is
   * removed if not supplied.
   */
  @JsonProperty("monetary_account_id_fallback_field_for_request")
  private Integer monetaryAccountIdFallbackFieldForRequest;
}
