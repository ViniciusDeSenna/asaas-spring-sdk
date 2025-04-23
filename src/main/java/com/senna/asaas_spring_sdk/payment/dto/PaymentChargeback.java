package com.senna.asaas_spring_sdk.payment.dto;

import com.senna.asaas_spring_sdk.credit_card.dto.CreditCardRequest;

import java.math.BigDecimal;

public record PaymentChargeback(

        String id,

        String payment,

        String installment,

        String customerAccount,

        String status,

        String reason,

        String disputeStartDatedisputeStartDate,

        BigDecimal value,

        String paymentDate,

        creditCard creditCard,

        String disputeStatus,

        String deadlineToSendDisputeDocuments
) {

    public record creditCard(
            String number,
            String brand
    ) {}
}