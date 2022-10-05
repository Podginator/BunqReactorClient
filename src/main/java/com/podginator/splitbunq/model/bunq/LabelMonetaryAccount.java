package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LabelMonetaryAccount {

  /** The IBAN of the monetary account. */
  @JsonProperty("iban")
  private String iban;

  /** The name to display with this monetary account. */
  @JsonProperty("display_name")
  private String displayName;

  /** The avatar of the monetary account. */
  @JsonProperty("avatar")
  private Avatar avatar;

  /** The user this monetary account belongs to. */
  @JsonProperty("label_user")
  private LabelUser labelUser;

  /** The country of the user. Formatted as a ISO 3166-1 alpha-2 country code. */
  @JsonProperty("country")
  private String country;

  /** Bunq.me pointer with type and value. */
  @JsonProperty("bunq_me")
  private Pointer bunqMe;

  /** Whether or not the monetary account is light. */
  @JsonProperty("is_light")
  private Boolean isLight;

  /** The BIC used for a SWIFT payment. */
  @JsonProperty("swift_bic")
  private String swiftBic;

  /** The account number used for a SWIFT payment. May or may not be an IBAN. */
  @JsonProperty("swift_account_number")
  private String swiftAccountNumber;

  /** The account number used for a Transferwise payment. May or may not be an IBAN. */
  @JsonProperty("transferwise_account_number")
  private String transferwiseAccountNumber;

  /** The bank code used for a Transferwise payment. May or may not be a BIC. */
  @JsonProperty("transferwise_bank_code")
  private String transferwiseBankCode;

  /** The merchant category code. */
  @JsonProperty("merchant_category_code")
  private String merchantCategoryCode;
}
