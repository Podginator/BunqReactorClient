package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@NoArgsConstructor
@Data
@AllArgsConstructor
public class TabVisibility {

  /** When true the tab will be linked to the ACTIVE cash registers QR code. */
  @JsonProperty("cash_register_qr_code")
  private Boolean cashRegisterQrCode;

  /**
   * When true the tab will be visible through its own QR code. Use ../tab/{tab-id}/qr-code-content
   * to get the raw content of this QR code
   */
  @JsonProperty("tab_qr_code")
  private Boolean tabQrCode;

  /** The location of the Tab in NearPay. */
  @JsonProperty("location")
  private Geolocation location;

  /**
   * When true the Tab will be linked to the ACTIVE cash registers QR code. If no cash register QR
   * code exists, one will be created.
   */
  @JsonProperty("cash_register_qr_code_field_for_request")
  private Boolean cashRegisterQrCodeFieldForRequest;

  /**
   * When true the Tab will be visible through its own QR code. Use ../tab/{tab-id}/qr-code-content
   * to get the raw content of this QR code
   */
  @JsonProperty("tab_qr_code_field_for_request")
  private Boolean tabQrCodeFieldForRequest;

  /**
   * The location on which this tab will be made visible in NearPay. This location must overlap with
   * the location of the CashRegister. If no location is provided the location of the CashRegister
   * will be used.
   */
  @JsonProperty("location_field_for_request")
  private Geolocation locationFieldForRequest;
}
