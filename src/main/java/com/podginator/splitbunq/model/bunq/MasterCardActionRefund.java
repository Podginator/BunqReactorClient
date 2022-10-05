package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Endpoint for creating a refund request for a masterCard transaction. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MasterCardActionRefund {

  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the refund's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the refund's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The label of the user who created this note. */
  @JsonProperty("label_user_creator")
  private LabelUser labelUserCreator;

  /**
   * The status of the refunded mastercard action. Can be AUTO_APPROVED,
   * AUTO_APPROVED_WAITING_FOR_EXPIRY, PENDING_APPROVAL, APPROVED, REFUNDED, DENIED or FAILED
   */
  @JsonProperty("status")
  private String status;

  /** The reference to the object this refund applies to. */
  @JsonProperty("reference_mastercard_action_event")
  private List<MasterCardActionReference> referenceMastercardActionEvent;

  /** The id of mastercard action being refunded. */
  @JsonProperty("mastercard_action_id")
  private Integer mastercardActionId;

  /** Type of this refund. Can de REFUND or CHARGEBACK */
  @JsonProperty("type")
  private String type;

  /** The sub type of this refund indicating whether the chargeback will be FULL or PARTIAL. */
  @JsonProperty("sub_type")
  private String subType;

  /**
   * The reason of the refund. Can be REFUND_EXPIRED_TRANSACTION, REFUND_REQUESTED, REFUND_MERCHANT,
   * REFUND_CHARGEBACK.
   */
  @JsonProperty("reason")
  private String reason;

  /** The amount to refund. */
  @JsonProperty("amount")
  private Amount amount;

  /** The monetary account label of the account that this action is created for. */
  @JsonProperty("alias")
  private LabelMonetaryAccount alias;

  /** The monetary account label of the counterparty. */
  @JsonProperty("counterparty_alias")
  private LabelMonetaryAccount counterpartyAlias;

  /** The description for this transaction to display. */
  @JsonProperty("description")
  private String description;

  /** The label of the card. */
  @JsonProperty("label_card")
  private LabelCard labelCard;

  /** The time the refund will take place. */
  @JsonProperty("time_refund")
  private String timeRefund;

  /** All additional information provided by the user. */
  @JsonProperty("additional_information")
  private AdditionalInformation additionalInformation;

  /** Description of the refund's current status. */
  @JsonProperty("status_description")
  private String statusDescription;

  /** Description of the refund's current status, translated in user's language. */
  @JsonProperty("status_description_translated")
  private String statusDescriptionTranslated;

  /** Together topic concerning the refund's current status. */
  @JsonProperty("status_together_url")
  private String statusTogetherUrl;

  /** Type of this refund. Can de REFUND or CHARGEBACK */
  @JsonProperty("type_field_for_request")
  private String typeFieldForRequest;

  /** The sub type of this refund indicating whether the chargeback will be FULL or PARTIAL. */
  @JsonProperty("sub_type_field_for_request")
  private String subTypeFieldForRequest;

  /** The amount to refund. */
  @JsonProperty("amount_field_for_request")
  private Amount amountFieldForRequest;

  /** The category of the refund, required for chargeback. */
  @JsonProperty("category_field_for_request")
  private String categoryFieldForRequest;

  /** The reason to refund, required for chargeback. */
  @JsonProperty("reason_field_for_request")
  private String reasonFieldForRequest;

  /** Comment about the refund. */
  @JsonProperty("comment_field_for_request")
  private String commentFieldForRequest;

  /** The Attachments to attach to the refund request. */
  @JsonProperty("attachment_field_for_request")
  private List<AttachmentMasterCardActionRefund> attachmentFieldForRequest;

  /** Proof that the user acknowledged the terms and conditions for chargebacks. */
  @JsonProperty("terms_and_conditions_field_for_request")
  private String termsAndConditionsFieldForRequest;
}
