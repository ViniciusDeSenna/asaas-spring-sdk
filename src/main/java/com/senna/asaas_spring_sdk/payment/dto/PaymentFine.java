package com.senna.asaas_spring_sdk.payment.dto;

import com.senna.asaas_spring_sdk.payment.enums.FineType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PaymentFine {
    BigDecimal value;
    FineType type;
}