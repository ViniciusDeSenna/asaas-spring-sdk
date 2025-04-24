package com.senna.asaas_spring_sdk.payment.dto;

import lombok.Data;

@Data
public class PaymentCreditCard {
    String creditCardNumber;
    String creditCardBrand;
    String creditCardToken;
}