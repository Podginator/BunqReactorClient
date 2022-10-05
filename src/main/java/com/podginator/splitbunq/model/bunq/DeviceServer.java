package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * After having created an Installation you can now create a DeviceServer. A DeviceServer is needed
 * to do a login call with session-server.
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class DeviceServer {

  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the DeviceServer's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the DeviceServer's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The description of the DeviceServer. */
  @JsonProperty("description")
  private String description;

  /** The ip address which was used to create the DeviceServer. */
  @JsonProperty("ip")
  private String ip;

  /** The status of the DeviceServer. Can be ACTIVE, BLOCKED, NEEDS_CONFIRMATION or OBSOLETE. */
  @JsonProperty("status")
  private String status;

  /**
   * The description of the DeviceServer. This is only for your own reference when reading the
   * DeviceServer again.
   */
  @JsonProperty("description_field_for_request")
  private String descriptionFieldForRequest;

  /** The API key. You can request an API key in the bunq app. */
  @JsonProperty("secret_field_for_request")
  private String secretFieldForRequest;

  /**
   * An array of IPs (v4 or v6) this DeviceServer will be able to do calls from. These will be
   * linked to the API key.
   */
  @JsonProperty("permitted_ips_field_for_request")
  private List<String> permittedIpsFieldForRequest;
}
