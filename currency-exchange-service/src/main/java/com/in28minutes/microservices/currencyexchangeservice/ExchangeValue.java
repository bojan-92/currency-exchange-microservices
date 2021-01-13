package com.in28minutes.microservices.currencyexchangeservice;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class ExchangeValue {

  @Id
  private Long id;

  @Column(name = "change_from")
  private String from;

  @Column(name = "change_to")
  private String to;

  @Column(name = "conversionMultiple")
  private BigDecimal conversionMultiple;

  @Transient
  private int port;

}
