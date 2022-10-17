package com.trungnguyen.api.composite.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RecommendationSummary {
  private final int recommendationId;

  private final String author;

  private final int rate;
}
