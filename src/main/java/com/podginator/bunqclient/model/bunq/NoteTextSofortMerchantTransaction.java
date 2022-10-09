package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to manage text notes. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NoteTextSofortMerchantTransaction {

  /** The id of the note. */
  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the note's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the note's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The label of the user who created this note. */
  @JsonProperty("label_user_creator")
  private LabelUser labelUserCreator;

  /** The content of the note. */
  @JsonProperty("content")
  private String content;

  /** The content of the note. */
  @JsonProperty("content_field_for_request")
  private String contentFieldForRequest;
}
