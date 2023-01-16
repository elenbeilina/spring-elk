package com.aqualen.springelk.entity;

import lombok.Builder;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Builder
@ToString
@Document(indexName = "twin_peaks")
public class TwinPeaksQuote {
  @Id
  private String id;
  private String location;
  private String character;
  private String quote;

}
