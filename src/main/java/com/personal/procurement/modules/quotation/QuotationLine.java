package com.personal.procurement.modules.quotation;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class QuotationLine {
    @Field(name = "quotation_id")
    private String quotationId;
    @Field(name = "product_id")
    private String productId;
    @Field(name = "product_name")
    private String productName;
    private BigDecimal quantity;
    @Field(name = "unit_price")
    private BigDecimal unitPrice;
}
