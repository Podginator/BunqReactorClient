package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.*;

/** */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdditionalInformation {

  /** The category of the refund, required for chargeback. */
  @JsonProperty("category")
  private String category;

  /** The reason to refund, required for chargeback. */
  @JsonProperty("reason")
  private String reason;

  /** Comment about the refund. */
  @JsonProperty("comment")
  private String comment;

  /** The Attachments to attach to the refund request. */
  @JsonProperty("attachment")
  private List<AttachmentMasterCardActionRefund> attachment;

  /** Proof that the user acknowledged the terms and conditions for chargebacks. */
  @JsonProperty("terms_and_conditions")
  private String termsAndConditions;
}
