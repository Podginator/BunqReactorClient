package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * After you’ve created a Tab using /tab-usage-single or /tab-usage-multiple you can add items and
 * attachments using tab-item. You can only add or modify TabItems of a Tab which status is OPEN.
 * The amount of the TabItems will not influence the total_amount of the corresponding Tab. However,
 * if you've created any TabItems for a Tab the sum of the amounts of these items must be equal to
 * the total_amount of the Tab when you change its status to PAYABLE/WAITING_FOR_PAYMENT.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TabItemShop {

  /** The id of the created TabItem. */
  @JsonProperty("id")
  private Integer id;

  /** The TabItem's brief description. */
  @JsonProperty("description")
  private String description;

  /** The TabItem's EAN code. */
  @JsonProperty("ean_code")
  private String eanCode;

  /** A struct with an AttachmentPublic UUID that used as an avatar for the TabItem. */
  @JsonProperty("avatar_attachment")
  private AttachmentPublic avatarAttachment;

  /** A list of AttachmentTab attached to the TabItem. */
  @JsonProperty("tab_attachment")
  private List<AttachmentTab> tabAttachment;

  /** The quantity of the TabItem. */
  @JsonProperty("quantity")
  private BigDecimal quantity;

  /** The money amount of the TabItem. */
  @JsonProperty("amount")
  private Amount amount;

  /** The TabItem's brief description. Can't be empty and must be no longer than 100 characters */
  @JsonProperty("description_field_for_request")
  private String descriptionFieldForRequest;

  /** The TabItem's EAN code. */
  @JsonProperty("ean_code_field_for_request")
  private String eanCodeFieldForRequest;

  /** An AttachmentPublic UUID that used as an avatar for the TabItem. */
  @JsonProperty("avatar_attachment_uuid_field_for_request")
  private String avatarAttachmentUuidFieldForRequest;

  /** A list of AttachmentTab attached to the TabItem. */
  @JsonProperty("tab_attachment_field_for_request")
  private List<TabAttachment> tabAttachmentFieldForRequest;

  /**
   * The quantity of the TabItem. Formatted as a number containing up to 15 digits, up to 15
   * decimals and using a dot.
   */
  @JsonProperty("quantity_field_for_request")
  private String quantityFieldForRequest;

  /** The money amount of the TabItem. Will not change the value of the corresponding Tab. */
  @JsonProperty("amount_field_for_request")
  private Amount amountFieldForRequest;
}
