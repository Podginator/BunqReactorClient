package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to manage attachment notes. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NoteAttachmentDraftPayment {

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

  /** Optional description of the attachment. */
  @JsonProperty("description")
  private String description;

  /** The attachment attached to the note. */
  @JsonProperty("attachment")
  private List<AttachmentMonetaryAccountPayment> attachment;

  /** Optional description of the attachment. */
  @JsonProperty("description_field_for_request")
  private String descriptionFieldForRequest;

  /** The reference to the uploaded file to attach to this note. */
  @JsonProperty("attachment_id_field_for_request")
  private Integer attachmentIdFieldForRequest;
}
