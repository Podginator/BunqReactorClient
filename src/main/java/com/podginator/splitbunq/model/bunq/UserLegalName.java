package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Endpoint for getting available legal names that can be used by the user. */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserLegalName {

  @JsonProperty("legal_names")
  private List<String> legalNames;
}
