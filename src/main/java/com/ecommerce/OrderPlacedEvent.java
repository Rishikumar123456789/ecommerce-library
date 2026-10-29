package com.ecommerce;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderPlacedEvent {

	private Long orderId;

	private String customerName;

	private String productName;

	private BigDecimal unitPrice;

	private Integer numberOfunits;

}
