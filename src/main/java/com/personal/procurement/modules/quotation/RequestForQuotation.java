package com.personal.procurement.modules.quotation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Document(collection = "rfqs")
@Getter
@NoArgsConstructor
public class RequestForQuotation {
    @Id
    private String id;
    private Status status;
    private LocalDate deadline;
    private String notes;
    @Field(name = "pr_id")
    private String purchaseRequestId;
    private List<InvitedSupplier> suppliers = new ArrayList<>();

    public enum Status {
        DRAFT,
        ISSUED,
        CLOSED,
        CANCELLED
    }

    public RequestForQuotation(
        Status status, 
        LocalDate deadline, 
        String notes, 
        String purchaseRequestId
    ) {
        this.status = status;
        this.deadline = deadline;
        this.notes = notes;
        this.purchaseRequestId = purchaseRequestId;
    }
}
