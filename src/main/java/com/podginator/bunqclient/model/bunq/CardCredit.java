package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * With bunq it is possible to order credit cards that can then be connected with each one of the
 * monetary accounts the user has access to (including connected accounts).
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CardCredit {

  /** The id of the card. */
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

  /** The type of the card. Can is MASTERCARD. */
  @JsonProperty("type")
  private String type;

  /** The sub-type of the card. */
  @JsonProperty("sub_type")
  private String subType;

  /** The product type of the card. */
  @JsonProperty("product_type")
  private String productType;

  /** The second line of text on the card */
  @JsonProperty("second_line")
  private String secondLine;

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

  /** The user's preferred name that can be put on the card. */
  @JsonProperty("preferred_name_on_card")
  private String preferredNameOnCard;

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

  /**
   * The second line of text on the card, used as name/description for it. It can contain at most 17
   * characters and it can be empty.
   */
  @JsonProperty("second_line_field_for_request")
  private String secondLineFieldForRequest;

  /**
   * The user's name as it will be on the card. Check 'card-name' for the available card names for a
   * user.
   */
  @JsonProperty("name_on_card_field_for_request")
  private String nameOnCardFieldForRequest;

  /** The user's preferred name that can be put on the card. */
  @JsonProperty("preferred_name_on_card_field_for_request")
  private String preferredNameOnCardFieldForRequest;

  /**
   * The pointer to the monetary account that will be connected at first with the card. Its IBAN
   * code is also the one that will be printed on the card itself. The pointer must be of type IBAN.
   */
  @JsonProperty("alias_field_for_request")
  private Pointer aliasFieldForRequest;

  /** The type of card to order. Can be MASTERCARD. */
  @JsonProperty("type_field_for_request")
  private String typeFieldForRequest;

  /** The product type of the card to order. */
  @JsonProperty("product_type_field_for_request")
  private String productTypeFieldForRequest;

  /** Array of Types, PINs, account IDs assigned to the card. */
  @JsonProperty("pin_code_assignment_field_for_request")
  private List<CardPinAssignment> pinCodeAssignmentFieldForRequest;

  /**
   * ID of the MA to be used as fallback for this card if insufficient balance. Fallback account is
   * removed if not supplied.
   */
  @JsonProperty("monetary_account_id_fallback_field_for_request")
  private Integer monetaryAccountIdFallbackFieldForRequest;

  /** The order status of this card. Can be CARD_REQUEST_PENDING or VIRTUAL_DELIVERY. */
  @JsonProperty("order_status_field_for_request")
  private String orderStatusFieldForRequest;
}
