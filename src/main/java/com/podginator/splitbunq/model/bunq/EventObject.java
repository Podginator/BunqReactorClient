package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class EventObject {

  @JsonProperty("BunqMeTab")
  private BunqMeTab bunqMeTab;

  /** */
  @JsonProperty("BunqMeTabResultResponse")
  private BunqMeTabResultResponse bunqMeTabResultResponse;

  /** */
  @JsonProperty("BunqMeFundraiserResult")
  private BunqMeFundraiserResult bunqMeFundraiserResult;

  /** */
  @JsonProperty("Card")
  private Card card;

  /** */
  @JsonProperty("CardDebit")
  private CardDebit cardDebit;

  /** */
  @JsonProperty("DraftPayment")
  private DraftPayment draftPayment;

  /** */
  @JsonProperty("FeatureAnnouncement")
  private FeatureAnnouncement featureAnnouncement;

  /** */
  @JsonProperty("IdealMerchantTransaction")
  private IdealMerchantTransaction idealMerchantTransaction;

  /** */
  @JsonProperty("Invoice")
  private Invoice invoice;

  /** */
  @JsonProperty("ScheduledPayment")
  private SchedulePayment scheduledPayment;

  /** */
  @JsonProperty("ScheduledPaymentBatch")
  private SchedulePaymentBatch scheduledPaymentBatch;

  /** */
  @JsonProperty("ScheduledInstance")
  private ScheduleInstance scheduledInstance;

  /** */
  @JsonProperty("MasterCardAction")
  private MasterCardAction masterCardAction;

  /** */
  @JsonProperty("BankSwitchServiceNetherlandsIncomingPayment")
  private BankSwitchServiceNetherlandsIncomingPayment bankSwitchServiceNetherlandsIncomingPayment;

  /** */
  @JsonProperty("Payment")
  private Payment payment;

  /** */
  @JsonProperty("PaymentBatch")
  private PaymentBatch paymentBatch;

  /** */
  @JsonProperty("RequestInquiryBatch")
  private RequestInquiryBatch requestInquiryBatch;

  /** */
  @JsonProperty("RequestInquiry")
  private RequestInquiry requestInquiry;

  /** */
  @JsonProperty("RequestResponse")
  private RequestResponse requestResponse;

  /** */
  @JsonProperty("RewardRecipient")
  private RewardRecipient rewardRecipient;

  /** */
  @JsonProperty("RewardSender")
  private RewardSender rewardSender;

  /** */
  @JsonProperty("ShareInviteBankInquiryBatch")
  private ShareInviteBankInquiryBatch shareInviteBankInquiryBatch;

  /** */
  @JsonProperty("ShareInviteBankInquiry")
  private ShareInviteMonetaryAccountInquiry shareInviteBankInquiry;

  /** */
  @JsonProperty("ShareInviteBankResponse")
  private ShareInviteMonetaryAccountResponse shareInviteBankResponse;

  /** */
  @JsonProperty("SofortMerchantTransaction")
  private SofortMerchantTransaction sofortMerchantTransaction;

  /** */
  @JsonProperty("TabResultInquiry")
  private TabResultInquiry tabResultInquiry;

  /** */
  @JsonProperty("TabResultResponse")
  private TabResultResponse tabResultResponse;

  /** */
  @JsonProperty("TransferwisePayment")
  private TransferwiseTransfer transferwisePayment;
}
