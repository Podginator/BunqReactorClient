package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Used to manage text notes. */
public class NoteTextWhitelistResult {

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
