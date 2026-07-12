package com.personal.procurement.modules.request.platforms.api.payloads;

import java.math.BigDecimal;
import java.util.List;

public record CreatePrPayload(
    String justification,
    List<Line> lines
) {
    public record Line(
        String productId,
        BigDecimal quantity,
        BigDecimal estimatedUnitPrice
    ) {}
}
