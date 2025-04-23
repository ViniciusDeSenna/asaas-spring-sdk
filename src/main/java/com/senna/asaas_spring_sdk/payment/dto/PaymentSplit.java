package com.senna.asaas_spring_sdk.payment.dto;

import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

public record PaymentSplit(

        @NotBlank(message = "Wallet id is required")
        String walletId,

        BigDecimal fixedValue,

        BigDecimal percentualValue,

        BigDecimal totalFixedValue,

        String externalReference,

        String description

) {}