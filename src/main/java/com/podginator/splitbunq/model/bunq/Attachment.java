package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Attachment {

  /** The description of the attachment. */
  @JsonProperty("description")
  private String description;

  /** The content type of the attachment's file. */
  @JsonProperty("content_type")
  private String contentType;

  /** The URLs where the file can be downloaded. */
  @JsonProperty("urls")
  private List<AttachmentUrl> urls;
}
