package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** MasterCard transaction view. */
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonTypeName("MasterCardAction")
@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT, use = JsonTypeInfo.Id.NAME)
public class MasterCardAction {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("created")
  private String created;

  @JsonProperty("updated")
  private String updated;

  /** The id of the monetary account this action links to. */
  @JsonProperty("monetary_account_id")
  private Integer monetaryAccountId;

  /** The id of the card this action links to. */
  @JsonProperty("card_id")
  private Integer cardId;

  /** The amount of the transaction in local currency. */
  @JsonProperty("amount_local")
  private Amount amountLocal;

  /** The amount of the transaction in local currency. */
  @JsonProperty("amount_converted")
  private Amount amountConverted;

  /** The amount of the transaction in the monetary account's currency. */
  @JsonProperty("amount_billing")
  private Amount amountBilling;

  /** The original amount in local currency. */
  @JsonProperty("amount_original_local")
  private Amount amountOriginalLocal;

  /** The original amount in the monetary account's currency. */
  @JsonProperty("amount_original_billing")
  private Amount amountOriginalBilling;

  /** The fee amount as charged by the merchant, if applicable. */
  @JsonProperty("amount_fee")
  private Amount amountFee;

  /** The response code by which authorised transaction can be identified as authorised by bunq. */
  @JsonProperty("card_authorisation_id_response")
  private String cardAuthorisationIdResponse;

  /** Why the transaction was denied, if it was denied, or just ALLOWED. */
  @JsonProperty("decision")
  private String decision;

  /**
   * The payment status of the transaction. For example PAYMENT_SUCCESSFUL, for a successful
   * payment.
   */
  @JsonProperty("payment_status")
  private String paymentStatus;

  /** Empty if allowed, otherwise a textual explanation of why it was denied. */
  @JsonProperty("decision_description")
  private String decisionDescription;

  /** Empty if allowed, otherwise a textual explanation of why it was denied in user's language. */
  @JsonProperty("decision_description_translated")
  private String decisionDescriptionTranslated;

  /**
   * Empty if allowed or if no relevant Together topic exists, otherwise contains the URL for a
   * Together topic with more information about the decision.
   */
  @JsonProperty("decision_together_url")
  private String decisionTogetherUrl;

  /** The description for this transaction to display. */
  @JsonProperty("description")
  private String description;

  /** The status in the authorisation process. */
  @JsonProperty("authorisation_status")
  private String authorisationStatus;

  /** The type of transaction that was delivered using the card. */
  @JsonProperty("authorisation_type")
  private String authorisationType;

  /**
   * The type of entry mode the user used. Can be 'ATM', 'ICC', 'MAGNETIC_STRIPE' or 'E_COMMERCE'.
   */
  @JsonProperty("pan_entry_mode_user")
  private String panEntryModeUser;

  /** The setlement status in the authorisation process. */
  @JsonProperty("settlement_status")
  private String settlementStatus;

  /**
   * The clearing status of the authorisation. Can be 'PENDING', 'FIRST_PRESENTMENT_COMPLETE' or
   * 'REFUND_LENIENCY'.
   */
  @JsonProperty("clearing_status")
  private String clearingStatus;

  /** The maturity date. */
  @JsonProperty("maturity_date")
  private String maturityDate;

  /** The city where the message originates from as announced by the terminal. */
  @JsonProperty("city")
  private String city;

  /** The monetary account label of the account that this action is created for. */
  @JsonProperty("alias")
  private LabelMonetaryAccount alias;

  /** The monetary account label of the counterparty. */
  @JsonProperty("counterparty_alias")
  private LabelMonetaryAccount counterpartyAlias;

  /** The label of the card. */
  @JsonProperty("label_card")
  private LabelCard labelCard;

  /** If this is a tokenisation action, this shows the status of the token. */
  @JsonProperty("token_status")
  private String tokenStatus;

  /** If this is a reservation, the moment the reservation will expire. */
  @JsonProperty("reservation_expiry_time")
  private String reservationExpiryTime;

  /** The time when the processing of the clearing is expired, refunding the authorisation. */
  @JsonProperty("clearing_expiry_time")
  private String clearingExpiryTime;

  /**
   * The type of the limit applied to validate if this MasterCardAction was within the spending
   * limits. The returned string matches the limit types as defined in the card endpoint.
   */
  @JsonProperty("applied_limit")
  private String appliedLimit;

  /** The secure code id for this mastercard action or null. */
  @JsonProperty("secure_code_id")
  private Integer secureCodeId;

  /**
   * The ID of the wallet provider as defined by MasterCard. 420 = bunq Android app with Tap&Pay;
   * 103 = Apple Pay.
   */
  @JsonProperty("wallet_provider_id")
  private String walletProviderId;

  /**
   * The reference to the object used for split the bill. Can be RequestInquiry or
   * RequestInquiryBatch
   */
  @JsonProperty("request_reference_split_the_bill")
  private List<RequestInquiryReference> requestReferenceSplitTheBill;

  /** A reference to the Refunds if they exist. */
  @JsonProperty("all_mastercard_action_refund")
  private List<MasterCardActionRefund> allMastercardActionRefund;

  /** The Card Presence type of the POS. */
  @JsonProperty("pos_card_presence")
  private String posCardPresence;

  /** The Card Holder Presence type of the POS. */
  @JsonProperty("pos_card_holder_presence")
  private String posCardHolderPresence;

  /** The whitelist id for this action or null. */
  @JsonProperty("eligible_whitelist_id")
  private Integer eligibleWhitelistId;
}
