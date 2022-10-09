package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class NotificationAnchorObject {

  @JsonProperty("BunqMeFundraiserResult")
  private BunqMeFundraiserResult bunqMeFundraiserResult;

  /** */
  @JsonProperty("BunqMeTab")
  private BunqMeTab bunqMeTab;

  /** */
  @JsonProperty("BunqMeTabResultInquiry")
  private BunqMeTabResultInquiry bunqMeTabResultInquiry;

  /** */
  @JsonProperty("BunqMeTabResultResponse")
  private BunqMeTabResultResponse bunqMeTabResultResponse;

  /** */

  /** */
  @JsonProperty("DraftPayment")
  private DraftPayment draftPayment;

  /** */
  @JsonProperty("IdealMerchantTransaction")
  private IdealMerchantTransaction idealMerchantTransaction;

  /** */
  @JsonProperty("Invoice")
  private Invoice invoice;

  /** */
  @JsonProperty("MasterCardAction")
  private MasterCardAction masterCardAction;

  /** */
  @JsonProperty("MonetaryAccount")
  private MonetaryAccount monetaryAccount;

  /** */
  @JsonProperty("Payment")
  private Payment payment;

  /** */
  @JsonProperty("PaymentBatch")
  private PaymentBatch paymentBatch;

  /** */
  @JsonProperty("RequestInquiry")
  private RequestInquiry requestInquiry;

  /** */
  @JsonProperty("RequestInquiryBatch")
  private RequestInquiryBatch requestInquiryBatch;

  /** */
  @JsonProperty("RequestResponse")
  private RequestResponse requestResponse;

  /** */
  @JsonProperty("ShareInviteBankInquiry")
  private ShareInviteMonetaryAccountInquiry shareInviteBankInquiry;

  /** */
  @JsonProperty("ShareInviteBankResponse")
  private ShareInviteMonetaryAccountResponse shareInviteBankResponse;

  /** */
  @JsonProperty("ScheduledPayment")
  private SchedulePayment scheduledPayment;

  /** */
  @JsonProperty("ScheduledInstance")
  private ScheduleInstance scheduledInstance;

  /** */
  @JsonProperty("TabResultInquiry")
  private TabResultInquiry tabResultInquiry;

  /** */
  @JsonProperty("TabResultResponse")
  private TabResultResponse tabResultResponse;

  /** */
  @JsonProperty("User")
  private User user;
}
