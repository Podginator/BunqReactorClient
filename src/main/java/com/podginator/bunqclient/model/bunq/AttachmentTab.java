package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AttachmentTab {

  /** The id of the attachment. */
  @JsonProperty("id")
  private Integer id;

  /** The description of the attachment. */
  @JsonProperty("description")
  private String description;

  /** The content type of the attachment's file. */
  @JsonProperty("content_type")
  private String contentType;
}
