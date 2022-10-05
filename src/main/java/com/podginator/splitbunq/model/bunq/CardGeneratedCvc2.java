package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Endpoint for generating and retrieving a new CVC2 code. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CardGeneratedCvc2 {

  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the cvc code's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the cvc code's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The type of generated cvc2. Can be STATIC or GENERATED. */
  @JsonProperty("type")
  private String type;

  /** The cvc2 code. */
  @JsonProperty("cvc2")
  private String cvc2;

  /** The status of the cvc2. Can be AVAILABLE, USED, EXPIRED, BLOCKED. */
  @JsonProperty("status")
  private String status;

  /** Expiry time of the cvc2. */
  @JsonProperty("expiry_time")
  private String expiryTime;

  /** The type of generated cvc2. Can be STATIC or GENERATED. */
  @JsonProperty("type_field_for_request")
  private String typeFieldForRequest;
}
