package com.personal.procurement.modules.request.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.personal.procurement.modules.request.PurchaseRequest;

public interface PurchaseRequestRepository extends MongoRepository<PurchaseRequest, String> {}
