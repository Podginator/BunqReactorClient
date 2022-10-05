package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to serialize ExportStatementCardCsv */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExportStatementCardCsv {

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

  /** The regional format of a CSV statement. */
  @JsonProperty("regional_format")
  private String regionalFormat;

  /** The card for which this statement was created. */
  @JsonProperty("card_id")
  private Integer cardId;

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
}
