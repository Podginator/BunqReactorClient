package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * bunq.me tabs allows you to create a payment request and share the link through e-mail, chat, etc.
 * Multiple persons are able to respond to the payment request and pay through bunq, iDeal or
 * SOFORT.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BunqMeTab {

  /** The id of the created bunq.me. */
  @JsonProperty("id")
  private Integer id;

  /** The timestamp when the bunq.me was created. */
  @JsonProperty("created")
  private String created;

  /** The timestamp when the bunq.me was last updated. */
  @JsonProperty("updated")
  private String updated;

  /** The timestamp of when the bunq.me expired or will expire. */
  @JsonProperty("time_expiry")
  private String timeExpiry;

  /** The id of the MonetaryAccount the bunq.me was sent from. */
  @JsonProperty("monetary_account_id")
  private Integer monetaryAccountId;

  /** The status of the bunq.me. Can be WAITING_FOR_PAYMENT, CANCELLED or EXPIRED. */
  @JsonProperty("status")
  private String status;

  /** The type of the bunq.me Tab. Can be BUNQ_ME or SPLIT_RECEIPT. */
  @JsonProperty("type")
  private String type;

  /**
   * The LabelMonetaryAccount with the public information of the User and the MonetaryAccount that
   * created the bunq.me link.
   */
  @JsonProperty("alias_monetary_account")
  private LabelMonetaryAccount aliasMonetaryAccount;

  /** The url that points to the bunq.me page. */
  @JsonProperty("bunqme_tab_share_url")
  private String bunqmeTabShareUrl;

  /** The bunq.me entry containing the payment information. */
  @JsonProperty("bunqme_tab_entry")
  private BunqMeTabEntry bunqmeTabEntry;

  /** The bunq.me tab entries attached to this bunq.me Tab. */
  @JsonProperty("bunqme_tab_entries")
  private List<BunqMeTabEntry> bunqmeTabEntries;

  /** The list of bunq.me result Inquiries successfully made and paid. */
  @JsonProperty("result_inquiries")
  private List<BunqMeTabResultInquiry> resultInquiries;

  /** The bunq.me entry containing the payment information. */
  @JsonProperty("bunqme_tab_entry_field_for_request")
  private BunqMeTabEntry bunqmeTabEntryFieldForRequest;

  /**
   * The status of the bunq.me. Ignored in POST requests but can be used for cancelling the bunq.me
   * by setting status as CANCELLED with a PUT request.
   */
  @JsonProperty("status_field_for_request")
  private String statusFieldForRequest;
}
