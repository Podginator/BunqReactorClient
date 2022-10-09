package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Used to create new and read existing statement exports. Statement exports can be created in
 * either CSV, MT940 or PDF file format.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExportStatement {

  /** The id of the customer statement model. */
  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the statement model's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the statement model's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The date from when this statement shows transactions. */
  @JsonProperty("date_start")
  private String dateStart;

  /** The date until which statement shows transactions. */
  @JsonProperty("date_end")
  private String dateEnd;

  /** The status of the export. */
  @JsonProperty("status")
  private String status;

  /** MT940 Statement number. Unique per monetary account. */
  @JsonProperty("statement_number")
  private Integer statementNumber;

  /** The format of statement. */
  @JsonProperty("statement_format")
  private String statementFormat;

  /** The regional format of a CSV statement. */
  @JsonProperty("regional_format")
  private String regionalFormat;

  /** The monetary account for which this statement was created. */
  @JsonProperty("alias_monetary_account")
  private LabelMonetaryAccount aliasMonetaryAccount;

  /** The format type of statement. Allowed values: MT940, CSV, PDF. */
  @JsonProperty("statement_format_field_for_request")
  private String statementFormatFieldForRequest;

  /** The start date for making statements. */
  @JsonProperty("date_start_field_for_request")
  private String dateStartFieldForRequest;

  /** The end date for making statements. */
  @JsonProperty("date_end_field_for_request")
  private String dateEndFieldForRequest;

  /**
   * Required for CSV exports. The regional format of the statement, can be UK_US (comma-separated)
   * or EUROPEAN (semicolon-separated).
   */
  @JsonProperty("regional_format_field_for_request")
  private String regionalFormatFieldForRequest;

  /**
   * Only for PDF exports. Includes attachments to mutations in the export, such as scanned
   * receipts.
   */
  @JsonProperty("include_attachment_field_for_request")
  private Boolean includeAttachmentFieldForRequest;
}
