package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Whitelist an SDD so that when one comes in, it is automatically accepted. */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class WhitelistResult {

  /** The ID of the whitelist entry. */
  @JsonProperty("id")
  private Integer id;

  /**
   * The account from which payments will be deducted when a transaction is matched with this
   * whitelist.
   */
  @JsonProperty("monetary_account_paying_id")
  private Integer monetaryAccountPayingId;

  /** The status of the WhitelistResult. */
  @JsonProperty("status")
  private String status;

  /** The subStatus of the WhitelistResult. */
  @JsonProperty("sub_status")
  private String subStatus;

  /** The message when the whitelist result has failed due to user error. */
  @JsonProperty("error_message")
  private List<java.lang.Error> errorMessage;

  /** The corresponding whitelist. */
  @JsonProperty("whitelist")
  private Whitelist whitelist;

  /** The details of the external object the event was created for. */
  @JsonProperty("object")
  private WhitelistResultViewAnchoredObject object;

  /**
   * The reference to the object used for split the bill. Can be RequestInquiry or
   * RequestInquiryBatch
   */
  @JsonProperty("request_reference_split_the_bill")
  private List<RequestInquiryReference> requestReferenceSplitTheBill;
}
