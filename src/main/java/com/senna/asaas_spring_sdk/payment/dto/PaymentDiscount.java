package com.senna.asaas_spring_sdk.payment.dto;

import java.math.BigDecimal;

public record PaymentDiscount(

        BigDecimal value,

        Integer dueDateLimitDays,

        DiscountType type
) {}