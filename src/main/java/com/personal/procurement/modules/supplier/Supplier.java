package com.personal.procurement.modules.supplier;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Document(collection = "suppliers")
@NoArgsConstructor
@Getter
public class Supplier {
    @Id
    private String id;
    private String name;

    public Supplier(String name) {
        this.name = name;
    }
}
