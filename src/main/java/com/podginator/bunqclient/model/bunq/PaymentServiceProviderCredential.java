package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Register a Payment Service Provider and provide credentials */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentServiceProviderCredential {

  /** The id of the credential. */
  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the credential object's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the credential object's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The status of the credential. */
  @JsonProperty("status")
  private String status;

  /** When the status is PENDING_FIRST_USE: when the credential expires. */
  @JsonProperty("expiry_time")
  private String expiryTime;

  /** When the status is PENDING_FIRST_USE: the value of the token. */
  @JsonProperty("token_value")
  private String tokenValue;

  /** When the status is ACTIVE: the details of the device that may use the credential. */
  @JsonProperty("permitted_device")
  private PermittedDevice permittedDevice;

  /** Payment Services Directive 2 compatible QSEAL certificate */
  @JsonProperty("client_payment_service_provider_certificate_field_for_request")
  private String clientPaymentServiceProviderCertificateFieldForRequest;

  /** Intermediate and root certificate belonging to the provided certificate. */
  @JsonProperty("client_payment_service_provider_certificate_chain_field_for_request")
  private String clientPaymentServiceProviderCertificateChainFieldForRequest;

  /**
   * The Base64 encoded signature of the public key provided during installation and with the
   * installation token appended as a nonce. Signed with the private key belonging to the QSEAL
   * certificate.
   */
  @JsonProperty("client_public_key_signature_field_for_request")
  private String clientPublicKeySignatureFieldForRequest;
}
