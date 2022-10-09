package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to create a statement export of a single payment. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ExportStatementPayment {

  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the statement model's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the statement model's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The status of the export. */
  @JsonProperty("status")
  private String status;
}
