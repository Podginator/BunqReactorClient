package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CashRegisters are virtual points of sale. They have a specific name and avatar, and optionally, a
 * location.<br>
 * With a CashRegister you can create a Tab and then use a QR code to receive payments.<br>
 * Check out our Quickstart example to learn how you can easily <a
 * href="/api/1/page/usecase-tab-payment">create Tab payments</a>.<br>
 * <br>
 * Notification filters can be set on a CashRegister to receive callbacks. For more information
 * check the <a href="/api/1/page/callbacks">dedicated callbacks page</a>.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CashRegister {

  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the CashRegister's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the CashRegister's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The name of the CashRegister. */
  @JsonProperty("name")
  private String name;

  /** The status of the CashRegister. Can be PENDING_APPROVAL, ACTIVE, DENIED or CLOSED. */
  @JsonProperty("status")
  private String status;

  /** The Avatar of the CashRegister. */
  @JsonProperty("avatar")
  private Avatar avatar;

  /** The geolocation of the CashRegister. Can be null. */
  @JsonProperty("location")
  private Geolocation location;

  /** The tab text for waiting screen of CashRegister. */
  @JsonProperty("tab_text_waiting_screen")
  private List<TabTextWaitingScreen> tabTextWaitingScreen;

  /** The name of the CashRegister. Must be unique for this MonetaryAccount. */
  @JsonProperty("name_field_for_request")
  private String nameFieldForRequest;

  /**
   * The status of the CashRegister. Can only be created or updated with PENDING_APPROVAL or CLOSED.
   */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The UUID of the avatar of the CashRegister. Use the calls /attachment-public and /avatar to
   * create a new Avatar and get its UUID.
   */
  @JsonProperty("avatar_uuid_field_for_request")
  private String avatarUuidFieldForRequest;

  /** The geolocation of the CashRegister. */
  @JsonProperty("location_field_for_request")
  private Geolocation locationFieldForRequest;

  /** The tab text for waiting screen of CashRegister. */
  @JsonProperty("tab_text_waiting_screen_field_for_request")
  private List<TabTextWaitingScreen> tabTextWaitingScreenFieldForRequest;
}
