package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Certificate {

  /** A single certificate in the chain in .PEM format. */
  @JsonProperty("certificate")
  private String certificate;

  /** A single certificate in the chain in .PEM format. */
  @JsonProperty("certificate_field_for_request")
  private String certificateFieldForRequest;
}
