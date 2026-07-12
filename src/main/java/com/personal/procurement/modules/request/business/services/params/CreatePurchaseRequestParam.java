package com.personal.procurement.modules.request.business.services.params;

import java.math.BigDecimal;

public record CreatePurchaseRequestParam (
    String productId,
    BigDecimal quantity,
    BigDecimal estimatedUnitPrice
){}
