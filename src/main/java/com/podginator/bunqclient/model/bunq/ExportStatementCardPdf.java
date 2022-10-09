package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to serialize ExportStatementCardPdf */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ExportStatementCardPdf {

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

  /** The card for which this statement was created. */
  @JsonProperty("card_id")
  private Integer cardId;

  /** The start date for making statements. */
  @JsonProperty("date_start_field_for_request")
  private String dateStartFieldForRequest;

  /** The end date for making statements. */
  @JsonProperty("date_end_field_for_request")
  private String dateEndFieldForRequest;
}
