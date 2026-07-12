package com.personal.procurement.modules.request;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Document(collection = "prs")
@Getter
@NoArgsConstructor
public class PurchaseRequest {
    @Id
    private String id;
    private Status status;
    private String justification;
    private List<PurchaseRequestLine> lines = new ArrayList<>();
    private List<PurchaseRequestApproval> approvals = new ArrayList<>();

    public enum Status {
        DRAFT,
        SUBMITTED,
        APPROVED,
        REJECTED
    }

    public PurchaseRequest(Status status, String justification) {
        this.status = status;
        this.justification = justification;
    }
}
