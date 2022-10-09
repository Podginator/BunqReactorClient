package com.podginator.bunqclient.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Endpoint for getting all the known (trade) names for a user company. This is needed for updating
 * the user name, as we only accept legal or trade names.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserCompanyName {

  /** All known (trade) names for a user company. */
  @JsonProperty("name_array")
  private List<String> nameArray;
}
