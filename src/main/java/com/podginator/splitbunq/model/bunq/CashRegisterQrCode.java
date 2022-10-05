package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Once your CashRegister has been activated you can create a QR code for it. The visibility of a
 * tab can be modified to be linked to this QR code. If a user of the bunq app scans this QR code,
 * the linked tab will be shown on his device.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CashRegisterQrCode {

  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the QR code's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the TokenQrCashRegister's last update. */
  @JsonProperty("updated")
  private String updated;

  /**
   * The status of this QR code. If the status is "ACTIVE" the QR code can be scanned to see the
   * linked CashRegister and tab. If the status is "INACTIVE" the QR code does not link to a
   * anything.
   */
  @JsonProperty("status")
  private String status;

  /** The CashRegister that is linked to the token. */
  @JsonProperty("cash_register")
  private CashRegister cashRegister;

  /** Holds the Tab object. Can be TabUsageSingle, TabUsageMultiple or null */
  @JsonProperty("tab_object")
  private Tab tabObject;

  /**
   * The status of the QR code. ACTIVE or INACTIVE. Only one QR code can be ACTIVE for a
   * CashRegister at any time. Setting a QR code to ACTIVE will deactivate any other CashRegister QR
   * codes.
   */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;
}
