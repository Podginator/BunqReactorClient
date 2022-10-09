package com.podginator.splitbunq.model.bunq;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.podginator.splitbunq.utils.JacksonUtils;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BunqResponses<T> {
  @JsonProperty("Response")
  private List<T> responses;

  @JsonProperty("Pagination")
  private BunqPagination pagination;

  public T mergeAll() {
    return JacksonUtils.mergeAll(this.responses);
  }
}
