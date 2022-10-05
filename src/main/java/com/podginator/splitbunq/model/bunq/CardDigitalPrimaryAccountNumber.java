package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** View for getting the dPAN of the card. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CardDigitalPrimaryAccountNumber {

  @JsonProperty("digital_primary_account_number")
  private String digitalPrimaryAccountNumber;

  /** The expiry date. */
  @JsonProperty("expiry_date")
  private String expiryDate;

  /** The sequence number. */
  @JsonProperty("sequence_number")
  private String sequenceNumber;

  /** Unique reference given by MDES. */
  @JsonProperty("token_unique_reference")
  private String tokenUniqueReference;

  /** Status code of the token given by MDES. */
  @JsonProperty("token_status_code")
  private String tokenStatusCode;
}
