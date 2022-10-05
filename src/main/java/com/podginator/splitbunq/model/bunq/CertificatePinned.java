package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This endpoint allow you to pin the certificate chains to your account. These certificate chains
 * are used for SSL validation whenever a callback is initiated to one of your https callback urls.
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class CertificatePinned {

  /** The certificate chain in .PEM format. Certificates are glued with newline characters. */
  @JsonProperty("certificate_chain")
  private String certificateChain;

  /** The id generated for the pinned certificate chain. */
  @JsonProperty("id")
  private Integer id;

  /** The certificate chain in .PEM format. */
  @JsonProperty("certificate_chain_field_for_request")
  private List<Certificate> certificateChainFieldForRequest;
}
