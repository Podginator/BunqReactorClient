package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Used to share a monetary account with another bunq user, as in the 'Connect' feature in the bunq
 * app. Allow the creation of share inquiries that, in the same way as request inquiries, can be
 * revoked by the user creating them or accepted/rejected by the other party.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShareInviteBankInquiryBatch {

  /** The list of share invite bank inquiries that were made. */
  @JsonProperty("share_invite_bank_inquiries")
  private List<ShareInviteMonetaryAccountInquiry> shareInviteBankInquiries;

  /**
   * The LabelMonetaryAccount containing the public information of this share invite inquiry batch.
   */
  @JsonProperty("alias")
  private LabelMonetaryAccount alias;
}
