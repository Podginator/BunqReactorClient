package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Manage the IPs which may be used for a credential of a user for server authentication. */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class PermittedIp {

  /** The IP address. */
  @JsonProperty("ip")
  private String ip;

  /**
   * The status of the IP. May be "ACTIVE" or "INACTIVE". It is only possible to make requests from
   * "ACTIVE" IP addresses. Only "ACTIVE" IPs will be billed.
   */
  @JsonProperty("status")
  private String status;

  /** The IP address. */
  @JsonProperty("ip_field_for_request")
  private String ipFieldForRequest;

  /**
   * The status of the IP. May be "ACTIVE" or "INACTIVE". It is only possible to make requests from
   * "ACTIVE" IP addresses. Only "ACTIVE" IPs will be billed.
   */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;
}
