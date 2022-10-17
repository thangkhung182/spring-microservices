package com.trungnguyen.api.composite.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ReviewSummary {
  private final int reviewId;

  private final String author;

  private final String subject;
}
