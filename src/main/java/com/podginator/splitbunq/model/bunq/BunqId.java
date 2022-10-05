package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BunqId {
  @JsonProperty private Integer id;

  @JsonProperty("id_field_for_request")
  private Integer idFieldForRequest;

  public BunqId(final Integer id) {
    this(id, null);
  }
}
