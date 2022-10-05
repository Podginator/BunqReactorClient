package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class LabelCard {

  /** The public UUID. */
  @JsonProperty("uuid")
  private String uuid;

  /** The type of the card. */
  @JsonProperty("type")
  private String type;

  /** The second line on the card. */
  @JsonProperty("second_line")
  private String secondLine;

  /** The date this card will expire. */
  @JsonProperty("expiry_date")
  private String expiryDate;

  /** The status of the card. */
  @JsonProperty("status")
  private String status;

  /** The owner of this card. */
  @JsonProperty("label_user")
  private LabelUser labelUser;
}
