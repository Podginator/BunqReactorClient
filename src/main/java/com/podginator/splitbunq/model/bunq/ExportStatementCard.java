package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Used to create new and read existing card statement exports. Statement exports can be created in
 * either CSV or PDF file format.
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class ExportStatementCard {

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
}
