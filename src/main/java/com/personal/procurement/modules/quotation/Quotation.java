package com.personal.procurement.modules.quotation;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Document(collection = "quotations")
@Getter
@NoArgsConstructor
public class Quotation {
    @Id
    private String id;
    @Field(name = "rfq_id")
    private String requestForQuotationId;
    @Field(name = "supplier_id")
    private String supplierId;
    @Field(name = "expiration_date")
    private LocalDate expirationDate;
    private BigDecimal amount;
    private String notes;
    private List<QuotationLine> lines = new ArrayList<>();

    public Quotation(
        String requestForQuotationId, 
        String supplierId, 
        LocalDate expirationDate, 
        BigDecimal amount,
        String notes
    ) {
        this.requestForQuotationId = requestForQuotationId;
        this.supplierId = supplierId;
        this.expirationDate = expirationDate;
        this.amount = amount;
        this.notes = notes;
    }
}
