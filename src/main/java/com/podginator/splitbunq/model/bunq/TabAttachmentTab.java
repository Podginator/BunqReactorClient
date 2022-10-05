package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** This call is used to view an attachment that is linked to a tab. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TabAttachmentTab {

  /** The id of the attachment. */
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
