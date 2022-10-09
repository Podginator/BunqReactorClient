package com.podginator.bunqclient.model.bunq;

import com.bunq.sdk.model.generated.object.MonetaryAccountProfileDrain;
import com.bunq.sdk.model.generated.object.MonetaryAccountProfileFill;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Used to update and read up monetary account profiles, to keep the balance between specific
 * thresholds.
 */
@NoArgsConstructor
@Data
@AllArgsConstructor
public class MonetaryAccountProfile {

  /** The profile settings for triggering the fill of a monetary account. */
  @JsonProperty("profile_fill")
  private MonetaryAccountProfileFill profileFill;

  /** The profile settings for moving excesses to a savings account */
  @JsonProperty("profile_drain")
  private MonetaryAccountProfileDrain profileDrain;

  /** The profile settings for triggering the fill of a monetary account. */
  @JsonProperty("profile_fill_field_for_request")
  private MonetaryAccountProfileFill profileFillFieldForRequest;

  /** The profile settings for moving excesses to a savings account */
  @JsonProperty("profile_drain_field_for_request")
  private MonetaryAccountProfileDrain profileDrainFieldForRequest;
}
