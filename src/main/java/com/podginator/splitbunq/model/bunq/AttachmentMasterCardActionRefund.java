package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AttachmentMasterCardActionRefund {

  /** The id of the attached Attachment. */
  @JsonProperty("id")
  private Integer id;

  /** The id of the Attachment. */
  @JsonProperty("id_field_for_request")
  private Integer idFieldForRequest;
}
