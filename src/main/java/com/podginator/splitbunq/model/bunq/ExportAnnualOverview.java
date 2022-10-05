package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Used to create new and read existing annual overviews of all the user's monetary accounts. Once
 * created, annual overviews can be downloaded in PDF format via the
 * 'export-annual-overview/{id}/content' endpoint.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExportAnnualOverview {

  @JsonProperty("id")
  private Integer id;

  /** The timestamp of the annual overview 's creation. */
  @JsonProperty("created")
  private String created;

  /** The timestamp of the annual overview 's last update. */
  @JsonProperty("updated")
  private String updated;

  /** The year for which the overview is. */
  @JsonProperty("year")
  private Integer year;

  /** The user to which this annual overview belongs. */
  @JsonProperty("alias_user")
  private LabelUser aliasUser;

  /** The year for which the overview is. */
  @JsonProperty("year_field_for_request")
  private Integer yearFieldForRequest;
}
