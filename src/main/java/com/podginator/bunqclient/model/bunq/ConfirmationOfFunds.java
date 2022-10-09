package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to confirm availability of funds on an account. */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConfirmationOfFunds {

  @JsonProperty("has_sufficient_funds")
  private Boolean hasSufficientFunds;

  /** The pointer (IBAN) of the account we're querying. */
  @JsonProperty("pointer_iban_field_for_request")
  private Pointer pointerIbanFieldForRequest;

  /** The amount we want to check for. */
  @JsonProperty("amount_field_for_request")
  private Amount amountFieldForRequest;
}
