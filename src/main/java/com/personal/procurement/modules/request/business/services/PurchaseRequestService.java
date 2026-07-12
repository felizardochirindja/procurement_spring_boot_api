package com.personal.procurement.modules.request.business.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.personal.procurement.modules.product.Product;
import com.personal.procurement.modules.product.repositories.ProductRepository;
import com.personal.procurement.modules.request.business.entities.PurchaseRequest;
import com.personal.procurement.modules.request.business.entities.PurchaseRequestLine;
import com.personal.procurement.modules.request.business.services.params.CreatePurchaseRequestParam;
import com.personal.procurement.modules.request.repositories.PurchaseRequestRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PurchaseRequestService {
    private final PurchaseRequestRepository repository;
    private final ProductRepository productRepository;

    public PurchaseRequest create(String justification, List<CreatePurchaseRequestParam> lines) {
        if (lines == null || lines.isEmpty()) {
            throw new IllegalArgumentException("At least one line is required");
        }

        PurchaseRequest purchaseRequest = new PurchaseRequest(PurchaseRequest.Status.DRAFT, justification);

        for (CreatePurchaseRequestParam line : lines) {
            Product product = productRepository.findById(line.productId())
                .orElseThrow(() -> new IllegalArgumentException("Product not found: " + line.productId()));

            purchaseRequest.appendLine(new PurchaseRequestLine(
                product.getId(),
                product.getName(),
                line.quantity(),
                line.estimatedUnitPrice(),
                product.getMeasureUnit()
            ));
        }

        return repository.save(purchaseRequest);
    }

    public void approvePurchaseRequest() {}

    public void getPurchaseRequestLines() {}
}
