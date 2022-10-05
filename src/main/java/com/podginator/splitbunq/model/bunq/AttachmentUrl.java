package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AttachmentUrl {

  /** The file type of attachment. */
  @JsonProperty("type")
  private String type;

  /** The URL where the attachment can be downloaded. */
  @JsonProperty("url")
  private String url;
}
