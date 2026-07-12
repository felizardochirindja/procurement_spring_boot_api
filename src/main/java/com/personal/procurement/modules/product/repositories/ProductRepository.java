package com.personal.procurement.modules.product.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.personal.procurement.modules.product.Product;

public interface ProductRepository extends MongoRepository<Product, String> {}
