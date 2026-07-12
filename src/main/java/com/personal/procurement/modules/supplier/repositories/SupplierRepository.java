package com.personal.procurement.modules.supplier.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.personal.procurement.modules.supplier.Supplier;

public interface SupplierRepository extends MongoRepository<Supplier, String> {}
