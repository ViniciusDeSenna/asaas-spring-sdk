package com.senna.asaas_spring_sdk.payment.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class PaymentRefund {
    String dateCreated;
    String status;
    BigDecimal value;
    String endToEndIdentifier;
    String description;
    String effectiveDate;
    String transactionReceiptUrl;
    List<PaymentRefundSplit> refundedSplits;
}