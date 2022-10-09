package com.podginator.bunqclient.model.bunq;

import com.bunq.sdk.model.generated.object.Image;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Avatar {

  /** The public UUID of the avatar. */
  @JsonProperty("uuid")
  private String uuid;

  /** The public UUID of object this avatar is anchored to. */
  @JsonProperty("anchor_uuid")
  private String anchorUuid;

  /** The actual image information of this avatar. */
  @JsonProperty("image")
  private List<Image> image;

  /** The style (if applicable) for this Avatar. */
  @JsonProperty("style")
  private String style;

  /** The public UUID of the avatar. */
  @JsonProperty("uuid_field_for_request")
  private String uuidFieldForRequest;
}
