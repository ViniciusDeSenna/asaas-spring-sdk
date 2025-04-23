package com.senna.asaas_spring_sdk.payment.dto;

import java.math.BigDecimal;

public record PaymentRefundSplit(
        String id,
        BigDecimal value,
        Boolean done
) {}