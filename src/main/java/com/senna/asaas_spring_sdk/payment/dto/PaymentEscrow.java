package com.senna.asaas_spring_sdk.payment.dto;

import lombok.Data;

@Data
public class PaymentEscrow {
    String id;
    String status;
    String expirationDate;
    String finishDate;
    String finishReason;
}