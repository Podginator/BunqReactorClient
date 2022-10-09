package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This call is used to upload an attachment that can be referenced to in payment requests and
 * payments sent from a specific monetary account. Attachments supported are png, jpg and gif.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AttachmentMonetaryAccount {

  /** Endpoint constants. */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/attachment";

  /** The attachment. */
  @JsonProperty("attachment")
  private Attachment attachment;

  /** The ID of the attachment created. */
  @JsonProperty("id")
  private Integer id;
}
