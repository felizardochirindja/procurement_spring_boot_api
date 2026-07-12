package com.personal.procurement.modules.request.platforms.api;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.procurement.modules.request.business.entities.PurchaseRequest;
import com.personal.procurement.modules.request.business.services.PurchaseRequestService;
import com.personal.procurement.modules.request.business.services.params.CreatePrParam;
import com.personal.procurement.modules.request.platforms.api.payloads.CreatePrPayload;
import com.personal.procurement.modules.request.platforms.api.responses.CreatePrResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/api/prs")
@RequiredArgsConstructor
public class PurchaseRequestController {
    private final PurchaseRequestService service;

    @PostMapping
    public ResponseEntity<CreatePrResponse> create(@RequestBody CreatePrPayload request) {
        List<CreatePrParam> params = request.lines().stream()
            .map(line -> new CreatePrParam(
                line.productId(),
                line.quantity(),
                line.estimatedUnitPrice()
            ))
            .toList();

        PurchaseRequest created = service.create(request.justification(), params);

        var response = new CreatePrResponse("OK", "pr created successfully!");

        return ResponseEntity
            .created(URI.create("/api/prs/" + created.getId()))
            .body(response);
    }
}
