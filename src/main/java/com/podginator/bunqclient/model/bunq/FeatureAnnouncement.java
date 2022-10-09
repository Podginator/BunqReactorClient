package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** view for updating the feature display. */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class FeatureAnnouncement {

  @JsonProperty("avatar")
  private Avatar avatar;

  /** The event overview title of the feature display */
  @JsonProperty("title")
  private String title;

  /** The event overview subtitle of the feature display */
  @JsonProperty("sub_title")
  private String subTitle;

  /** The type of the feature announcement so apps can override with their own stuff if desired */
  @JsonProperty("type")
  private String type;
}
