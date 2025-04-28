package com.senna.asaas_spring_sdk.payment.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PaymentChargeback {
    String id;
    String payment;
    String installment;
    String customerAccount;
    String status;
    String reason;
    String disputeStartDatedisputeStartDate;
    BigDecimal value;
    String paymentDate;
    CreditCard creditCard;
    String disputeStatus;
    String deadlineToSendDisputeDocuments;
}