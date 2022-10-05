package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** bunq.me fundraiser result containing all payments. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BunqMeFundraiserResult {

  /** The id of the bunq.me. */
  @JsonProperty("id")
  private Integer id;

  /** The timestamp when the bunq.me was created. */
  @JsonProperty("created")
  private String created;

  /** The timestamp when the bunq.me was last updated. */
  @JsonProperty("updated")
  private String updated;

  /** The bunq.me fundraiser profile. */
  @JsonProperty("bunqme_fundraiser_profile")
  private BunqMeFundraiserProfile bunqmeFundraiserProfile;

  /** The list of payments, paid to the bunq.me fundraiser profile. */
  @JsonProperty("payments")
  private List<Payment> payments;
}
