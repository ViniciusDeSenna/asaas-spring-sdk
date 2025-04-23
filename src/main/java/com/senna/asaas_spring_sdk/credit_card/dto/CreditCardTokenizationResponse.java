package com.senna.asaas_spring_sdk.credit_card.dto;

public record CreditCardTokenizationResponse(

        String creditCardNumber,

        String creditCardBrand,

        String creditCardToken
) {}