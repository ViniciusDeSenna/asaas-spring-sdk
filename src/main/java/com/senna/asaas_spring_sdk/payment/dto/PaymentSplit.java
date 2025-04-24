package com.senna.asaas_spring_sdk.payment.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PaymentSplit {

        @NotBlank(message = "Wallet id is required")
        String walletId;

        BigDecimal fixedValue;
        BigDecimal percentualValue;
        BigDecimal totalFixedValue;
        String externalReference;
        String descriptio;
}