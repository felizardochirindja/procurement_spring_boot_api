package com.personal.procurement.modules.quotation.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.personal.procurement.modules.quotation.Quotation;

public interface QuotationRepository extends MongoRepository<Quotation, String> {}
