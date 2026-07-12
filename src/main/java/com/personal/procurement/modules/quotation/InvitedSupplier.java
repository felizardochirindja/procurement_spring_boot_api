package com.personal.procurement.modules.quotation;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class InvitedSupplier {
    private String supplierId;
    @Field(name = "invitation_status")
    private Status invitationStatus;
    private String name;

    public enum Status {
        INVITED,
        RESPONDED,
        DECLINED
    }
}
