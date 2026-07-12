package com.personal.procurement.modules.quotation.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.personal.procurement.modules.quotation.business.entities.RequestForQuotation;

public interface RequestForQuotationRepository extends MongoRepository<RequestForQuotation, String> {}
