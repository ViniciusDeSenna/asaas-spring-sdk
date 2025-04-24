package com.senna.asaas_spring_sdk.payment.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PaymentRefundSplit {
    String id;
    BigDecimal value;
    Boolean done;
}