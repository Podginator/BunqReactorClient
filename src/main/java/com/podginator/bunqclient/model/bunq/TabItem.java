package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to get items on a tab. */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class TabItem {

  /** The id of the tab item. */
  @JsonProperty("id")
  private Integer id;

  /** The item's brief description. */
  @JsonProperty("description")
  private String description;

  /** The item's EAN code. */
  @JsonProperty("ean_code")
  private String eanCode;

  /** A struct with an AttachmentPublic UUID that used as an avatar for the TabItem. */
  @JsonProperty("avatar_attachment")
  private AttachmentPublic avatarAttachment;

  /** A list of AttachmentTab attached to the TabItem. */
  @JsonProperty("tab_attachment")
  private List<AttachmentTab> tabAttachment;

  /**
   * The quantity of the item. Formatted as a number containing up to 15 digits, up to 15 decimals
   * and using a dot.
   */
  @JsonProperty("quantity")
  private String quantity;

  /** The money amount of the item. */
  @JsonProperty("amount")
  private Amount amount;
}
