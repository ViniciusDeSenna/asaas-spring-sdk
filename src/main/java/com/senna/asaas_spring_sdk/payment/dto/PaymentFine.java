package com.senna.asaas_spring_sdk.payment.dto;

import java.math.BigDecimal;

public record PaymentFine(

        BigDecimal value,

        FineType type
) {}