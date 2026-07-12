package com.personal.procurement.modules.request.business.entities;

import java.time.LocalDate;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseRequestApproval {
    @Field(name = "approval_date")
    private LocalDate approvalDate;
    private String notes;
    private Status status;

    public enum Status {
        PENDING,
        APPROVED,
        REJECTED
    }
}
