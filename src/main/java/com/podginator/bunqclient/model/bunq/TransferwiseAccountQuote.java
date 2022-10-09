package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to manage recipient accounts with Transferwise. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransferwiseAccountQuote {

  @JsonProperty("account_id")
  private String accountId;

  /** The currency the account. */
  @JsonProperty("currency")
  private String currency;

  /** The country of the account. */
  @JsonProperty("country")
  private String country;

  /** The name of the account holder. */
  @JsonProperty("name_account_holder")
  private String nameAccountHolder;

  /** The account number. */
  @JsonProperty("account_number")
  private String accountNumber;

  /** The bank code. */
  @JsonProperty("bank_code")
  private String bankCode;

  /** The country of the receiving account. */
  @JsonProperty("country_field_for_request")
  private String countryFieldForRequest;

  /** The name of the account holder. */
  @JsonProperty("name_account_holder_field_for_request")
  private String nameAccountHolderFieldForRequest;

  /**
   * The chosen recipient account type. The possible options are provided dynamically in the
   * response endpoint.
   */
  @JsonProperty("type_field_for_request")
  private String typeFieldForRequest;

  /**
   * The fields which were specified as "required" and have since been filled by the user. Always
   * provide the full list.
   */
  @JsonProperty("detail_field_for_request")
  private List<TransferwiseRequirementField> detailFieldForRequest;
}
