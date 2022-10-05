package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Used to create new and read existing RIBs of a monetary account */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExportRib {

  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the RIB's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the RIB's last update. */
  @JsonProperty("updated")
  private String updated;
}
