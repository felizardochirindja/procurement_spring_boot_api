package com.personal.procurement.modules.request.business.entities;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PurchaseRequestLine {
    private String productId;
    @Field(name = "product_name")
    private String productName;
    private BigDecimal quantity;
    @Field(name = "estimated_unit_price")
    private BigDecimal estimatedUnitPrice;
    @Field(name = "measure_unit")
    private String measureUnit;
}
