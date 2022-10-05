package com.podginator.splitbunq.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class SplitwiseExpense {
  private String cost;
  private String description;
  private String date;
  private String currencyCode;
  @Builder.Default private boolean splitEqually = true;
  private Integer groupId;
}
