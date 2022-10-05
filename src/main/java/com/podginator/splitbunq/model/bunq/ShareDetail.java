package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShareDetail {

  /**
   * The share details for a payment share. In the response 'payment' is replaced by
   * 'ShareDetailPayment'.
   */
  @JsonProperty("ShareDetailPayment")
  private ShareDetailPayment payment;

  /**
   * The share details for viewing a share. In the response 'read_only' is replaced by
   * 'ShareDetailReadOnly'.
   */
  @JsonProperty("ShareDetailReadOnly")
  private ShareDetailReadOnly readOnly;

  /**
   * The share details for a draft payment share. In the response 'draft_payment' is replaced by
   * 'ShareDetailDraftPayment'.
   */
  @JsonProperty("ShareDetailDraftPayment")
  private ShareDetailDraftPayment draftPayment;

  /**
   * The share details for a payment share. Remember to replace 'payment' with 'ShareDetailPayment'
   * before sending a request.
   */
  @JsonProperty("ShareDetailPayment_field_for_request")
  private ShareDetailPayment paymentFieldForRequest;

  /**
   * The share details for viewing a share. Remember to replace 'read_only' with
   * 'ShareDetailReadOnly' before sending a request.
   */
  @JsonProperty("ShareDetailReadOnly_field_for_request")
  private ShareDetailReadOnly readOnlyFieldForRequest;

  /**
   * The share details for a draft payment share. Remember to replace 'draft_payment' with
   * 'ShareDetailDraftPayment' before sending a request.
   */
  @JsonProperty("ShareDetailDraftPayment_field_for_request")
  private ShareDetailDraftPayment draftPaymentFieldForRequest;
}
