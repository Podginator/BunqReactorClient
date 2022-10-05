package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransferwiseRequirementFieldGroupValuesAllowed {

  /** The key. */
  @JsonProperty("key")
  private String key;

  /** The label. */
  @JsonProperty("name")
  private String name;

  /** The key. */
  public String getKey() {
    return this.key;
  }

  public void setKey(String key) {
    this.key = key;
  }
}
