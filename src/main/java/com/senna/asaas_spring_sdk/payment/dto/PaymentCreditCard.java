package com.senna.asaas_spring_sdk.payment.dto;

public record PaymentCreditCard(

        String creditCardNumber,

        String creditCardBrand,

        String creditCardToken
) {}