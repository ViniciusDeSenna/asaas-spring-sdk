package com.senna.asaas_spring_sdk.payment.dto;

public record PaymentEscrow(

        String id,

        String status,

        String expirationDate,

        String finishDate,

        String finishReason
) {}