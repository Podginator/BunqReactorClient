package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Used to get a Device or a listing of Devices. Creating a DeviceServer should happen via
 * /device-server
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Device {

  @JsonProperty("DeviceServer")
  private DeviceServer deviceServer;
}
