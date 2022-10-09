package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to view a customer. */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

  /** The id of the customer. */
  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the customer object's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the customer object's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The primary billing account account's id. */
  @JsonProperty("billing_account_id")
  private String billingAccountId;

  /** The preferred notification type for invoices. */
  @JsonProperty("invoice_notification_preference")
  private String invoiceNotificationPreference;

  /** The primary billing account account's id. */
  @JsonProperty("billing_account_id_field_for_request")
  private String billingAccountIdFieldForRequest;

  /** The preferred notification type for invoices */
  @JsonProperty("invoice_notification_preference_field_for_request")
  private String invoiceNotificationPreferenceFieldForRequest;
}
