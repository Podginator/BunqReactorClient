package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A DraftPayment is like a regular Payment, but it needs to be accepted by the sending party before
 * the actual Payment is done.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DraftPayment {

  @JsonProperty("id")
  private Integer id;

  /** The id of the MonetaryAccount the DraftPayment applies to. */
  @JsonProperty("monetary_account_id")
  private Integer monetaryAccountId;

  /** The label of the User who created the DraftPayment. */
  @JsonProperty("user_alias_created")
  private LabelUser userAliasCreated;

  /** All responses to this draft payment. */
  @JsonProperty("responses")
  private List<DraftPaymentResponse> responses;

  /** The status of the DraftPayment. */
  @JsonProperty("status")
  private String status;

  /** The type of the DraftPayment. */
  @JsonProperty("type")
  private String type;

  /** The entries in the DraftPayment. */
  @JsonProperty("entries")
  private List<DraftPaymentEntry> entries;

  /**
   * The Payment or PaymentBatch. This will only be present after the DraftPayment has been
   * accepted.
   */
  @JsonProperty("object")
  private DraftPaymentAnchorObject object;

  /**
   * The reference to the object used for split the bill. Can be RequestInquiry or
   * RequestInquiryBatch
   */
  @JsonProperty("request_reference_split_the_bill")
  private List<RequestInquiryReference> requestReferenceSplitTheBill;

  /** The schedule details. */
  @JsonProperty("schedule")
  private Schedule schedule;

  /** The status of the DraftPayment. */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The list of entries in the DraftPayment. Each entry will result in a payment when the
   * DraftPayment is accepted.
   */
  @JsonProperty("entries_field_for_request")
  private List<DraftPaymentEntry> entriesFieldForRequest;

  /**
   * The last updated_timestamp that you received for this DraftPayment. This needs to be provided
   * to prevent race conditions.
   */
  @JsonProperty("previous_updated_timestamp_field_for_request")
  private String previousUpdatedTimestampFieldForRequest;

  /**
   * The number of accepts that are required for the draft payment to receive status ACCEPTED.
   * Currently only 1 is valid.
   */
  @JsonProperty("number_of_required_accepts_field_for_request")
  private Integer numberOfRequiredAcceptsFieldForRequest;

  /** The schedule details when creating or updating a scheduled payment. */
  @JsonProperty("schedule_field_for_request")
  private Schedule scheduleFieldForRequest;
}
