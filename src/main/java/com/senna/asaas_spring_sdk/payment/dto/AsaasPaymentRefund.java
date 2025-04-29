package com.senna.asaas_spring_sdk.payment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * Informações de estorno
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasPaymentRefund {

    /**
     * Data da criação do estorno | Refund creation date
     */
    String dateCreated;

    /**
     * Status do estorno | Refund status - (PENDING, AWAITING_CRITICAL_ACTION_AUTHORIZATION, AWAITING_CUSTOMER_EXTERNAL_AUTHORIZATION, CANCELLED, DONE)
     */
    String status;

    /**
     * Valor do estorno | Refund value
     */
    BigDecimal value;

    /**
     * (Apenas pix) Identificador da transação Pix no Banco Central | (Pix only) Unique identifier of the Pix transaction at the Central Bank
     */
    String endToEndIdentifier;

    /**
     * Descrição do estorno | Description of the refund
     */
    String description;

    /**
     * (Apenas pix) Data de efetivação do estorno | (Pix only) Refund effective date
     */
    String effectiveDate;

    /**
     * Link do recibo da transação | Transaction receipt link
     */
    String transactionReceiptUrl;

    /**
     * Lista de splits estornados, se houver | Refunded Splits, if any
     */
    List<AsaasPaymentRefundSplit> refundedSplits;
}