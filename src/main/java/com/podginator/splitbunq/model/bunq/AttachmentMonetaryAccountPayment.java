package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AttachmentMonetaryAccountPayment {

  /** The id of the attached Attachment. */
  @JsonProperty("id")
  private Integer id;

  /** The id of the MonetaryAccount this Attachment is attached from. */
  @JsonProperty("monetary_account_id")
  private Integer monetaryAccountId;

  /** The id of the Attachment to attach to the MonetaryAccount. */
  @JsonProperty("id_field_for_request")
  private Integer idFieldForRequest;
}
