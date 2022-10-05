package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This call is used to upload an attachment that is accessible only by a specific user. This can be
 * used for example to upload passport scans or other documents. Attachments supported are png, jpg
 * and gif.
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class AttachmentUser {

  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the attachment's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the attachment's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The attachment. */
  @JsonProperty("attachment")
  private Attachment attachment;
}
