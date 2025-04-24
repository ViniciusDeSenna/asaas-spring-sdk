package com.senna.asaas_spring_sdk.credit_card.dto;


import lombok.Data;

@Data
public class CreditCardTokenizationResponse {
    String creditCardNumber;
    String creditCardBrand;
    String creditCardToken;
}