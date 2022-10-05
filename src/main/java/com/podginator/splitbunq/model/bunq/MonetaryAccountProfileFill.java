package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@NoArgsConstructor
@Data
@AllArgsConstructor
public class MonetaryAccountProfileFill {

  /** The status of the profile. */
  @JsonProperty("status")
  private String status;

  /** The goal balance. */
  @JsonProperty("balance_preferred")
  private Amount balancePreferred;

  /** The low threshold balance. */
  @JsonProperty("balance_threshold_low")
  private Amount balanceThresholdLow;

  /**
   * The method used to fill the monetary account. Currently only iDEAL is supported, and it is the
   * default one.
   */
  @JsonProperty("method_fill")
  private String methodFill;

  /** The bank the fill is supposed to happen from, with BIC and bank name. */
  @JsonProperty("issuer")
  private Issuer issuer;

  /** The status of the profile. */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;

  /** The goal balance. */
  @JsonProperty("balance_preferred_field_for_request")
  private Amount balancePreferredFieldForRequest;

  /** The low threshold balance. */
  @JsonProperty("balance_threshold_low_field_for_request")
  private Amount balanceThresholdLowFieldForRequest;

  /** The method used to fill the monetary account. Currently IDEAL and SOFORT is supported. */
  @JsonProperty("method_fill_field_for_request")
  private String methodFillFieldForRequest;

  /** The bank the fill is supposed to happen from, with BIC and bank name. */
  @JsonProperty("issuer_field_for_request")
  private Issuer issuerFieldForRequest;
}
