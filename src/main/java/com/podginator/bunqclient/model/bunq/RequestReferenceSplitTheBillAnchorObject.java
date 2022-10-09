package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestReferenceSplitTheBillAnchorObject {

  /** */
  @JsonProperty("BillingInvoice")
  private Invoice billingInvoice;

  /** */
  @JsonProperty("DraftPayment")
  private DraftPayment draftPayment;

  /** */
  @JsonProperty("MasterCardAction")
  private MasterCardAction masterCardAction;

  /** */
  @JsonProperty("Payment")
  private Payment payment;

  /** */
  @JsonProperty("PaymentBatch")
  private PaymentBatch paymentBatch;

  /** */
  @JsonProperty("RequestResponse")
  private RequestResponse requestResponse;

  /** */
  @JsonProperty("ScheduleInstance")
  private ScheduleInstance scheduleInstance;

  /** */
  @JsonProperty("TabResultResponse")
  private TabResultResponse tabResultResponse;

  /** */
  @JsonProperty("WhitelistResult")
  private WhitelistResult whitelistResult;

  /** */
  @JsonProperty("TransferwisePayment")
  private TransferwiseTransfer transferwisePayment;
}
