package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Image {

  /** The public UUID of the public attachment containing the image. */
  @JsonProperty("attachment_public_uuid")
  private String attachmentPublicUuid;

  /** The content-type as a MIME filetype. */
  @JsonProperty("content_type")
  private String contentType;

  /** The image height in pixels. */
  @JsonProperty("height")
  private Integer height;

  /** The image width in pixels. */
  @JsonProperty("width")
  private Integer width;
}
