package com.personal.procurement.modules.product;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Document(collection = "products")
@NoArgsConstructor
@Getter
public class Product {
    @Id
    private String id;
    @Indexed(unique = true)
    private String code;
    private String name;
    @Field(name = "measure_unit")
    private String measureUnit;

    public Product(String code, String name, String measureUnit) {
        this.code = code;
        this.name = name;
        this.measureUnit = measureUnit;
    }
}
