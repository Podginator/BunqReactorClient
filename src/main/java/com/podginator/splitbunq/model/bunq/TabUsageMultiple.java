package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TabUsageMultiple is a Tab that can be paid by multiple users. Just like the TabUsageSingle it is
 * created with the status OPEN, the visibility can be defined in the visibility object and TabItems
 * can be added as long as the status is OPEN. When you change the status to PAYABLE any bunq user
 * can use the tab to make a payment to your account. After an user has paid your TabUsageMultiple
 * the status will not change, it will stay PAYABLE. For example: you can create a TabUsageMultiple
 * with require_address set to true. Now show the QR code of this Tab on your webshop, and any bunq
 * user can instantly pay and order something from your webshop.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TabUsageMultiple {

  /** The uuid of the created TabUsageMultiple. */
  @JsonProperty("uuid")
  private String uuid;

  /** The timestamp of the Tab's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the Tab's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The description of the TabUsageMultiple. Maximum 9000 characters. */
  @JsonProperty("description")
  private String description;

  /** The status of the Tab. Can be OPEN, PAYABLE or CLOSED. */
  @JsonProperty("status")
  private String status;

  /** The total amount of the Tab. */
  @JsonProperty("amount_total")
  private Amount amountTotal;

  /**
   * The token used to redirect mobile devices directly to the bunq app. Because they can't scan a
   * QR code.
   */
  @JsonProperty("qr_code_token")
  private String qrCodeToken;

  /** The URL redirecting user to the tab payment in the bunq app. Only works on mobile devices. */
  @JsonProperty("tab_url")
  private String tabUrl;

  /**
   * The visibility of a Tab. A Tab can be visible trough NearPay, the QR code of the CashRegister
   * and its own QR code.
   */
  @JsonProperty("visibility")
  private TabVisibility visibility;

  /** The minimum age of the user paying the Tab. */
  @JsonProperty("minimum_age")
  private Boolean minimumAge;

  /** Whether or not an billing and shipping address must be provided when paying the Tab. */
  @JsonProperty("require_address")
  private String requireAddress;

  /** The URL which the user is sent to after paying the Tab. */
  @JsonProperty("redirect_url")
  private String redirectUrl;

  /** The moment when this Tab expires. */
  @JsonProperty("expiration")
  private String expiration;

  /** The alias of the party that owns this tab. */
  @JsonProperty("alias")
  private LabelMonetaryAccount alias;

  /** The location of the cash register that created this tab. */
  @JsonProperty("cash_register_location")
  private Geolocation cashRegisterLocation;

  /** The tab items of this tab. */
  @JsonProperty("tab_item")
  private List<TabItem> tabItem;

  /**
   * An array of attachments that describe the tab. Viewable through the GET
   * /tab/{tabid}/attachment/{attachmentid}/content endpoint.
   */
  @JsonProperty("tab_attachment")
  private List<BunqId> tabAttachment;

  /**
   * The description of the TabUsageMultiple. Maximum 9000 characters. Field is required but can be
   * an empty string.
   */
  @JsonProperty("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * The status of the TabUsageMultiple. On creation the status must be set to OPEN. You can change
   * the status from OPEN to PAYABLE. If the TabUsageMultiple gets paid the status will remain
   * PAYABLE.
   */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The total amount of the Tab. Must be a positive amount. As long as the tab has the status OPEN
   * you can change the total amount. This amount is not affected by the amounts of the TabItems.
   * However, if you've created any TabItems for a Tab the sum of the amounts of these items must be
   * equal to the total_amount of the Tab when you change its status to PAYABLE
   */
  @JsonProperty("amount_total_field_for_request")
  private Amount amountTotalFieldForRequest;

  /** [DEPRECATED] Whether or not a higher amount can be paid. */
  @JsonProperty("allow_amount_higher_field_for_request")
  private Boolean allowAmountHigherFieldForRequest;

  /** [DEPRECATED] Whether or not a lower amount can be paid. */
  @JsonProperty("allow_amount_lower_field_for_request")
  private Boolean allowAmountLowerFieldForRequest;

  /**
   * [DEPRECATED] Whether or not the user paying the Tab should be asked if he wants to give a tip.
   * When want_tip is set to true, allow_amount_higher must also be set to true and
   * allow_amount_lower must be false.
   */
  @JsonProperty("want_tip_field_for_request")
  private Boolean wantTipFieldForRequest;

  /** The minimum age of the user paying the Tab. */
  @JsonProperty("minimum_age_field_for_request")
  private Integer minimumAgeFieldForRequest;

  /**
   * Whether a billing and shipping address must be provided when paying the Tab. Possible values
   * are: BILLING, SHIPPING, BILLING_SHIPPING, NONE, OPTIONAL. Default is NONE.
   */
  @JsonProperty("require_address_field_for_request")
  private String requireAddressFieldForRequest;

  /** The URL which the user is sent to after paying the Tab. */
  @JsonProperty("redirect_url_field_for_request")
  private String redirectUrlFieldForRequest;

  /**
   * The visibility of a Tab. A Tab can be visible trough NearPay, the QR code of the CashRegister
   * and its own QR code.
   */
  @JsonProperty("visibility_field_for_request")
  private TabVisibility visibilityFieldForRequest;

  /** The moment when this Tab expires. Can be at most 365 days into the future. */
  @JsonProperty("expiration_field_for_request")
  private String expirationFieldForRequest;

  /**
   * An array of attachments that describe the tab. Uploaded through the POST
   * /user/{userid}/attachment-tab endpoint.
   */
  @JsonProperty("tab_attachment_field_for_request")
  private List<BunqId> tabAttachmentFieldForRequest;
}
