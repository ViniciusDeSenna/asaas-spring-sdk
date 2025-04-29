package com.senna.asaas_spring_sdk.payment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Informações de garantia da cobrança na Conta Escrow | Payment escrow in the Escrow Account information
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasPaymentEscrow {
    /**
     * Identificador único da garantia da cobrança na Conta Escrow do Asaas | Unique payment escrow identifier in Asaas
     */
    String id;

    /**
     * Status da garantia da cobrança | Payment escrow status - (ACTIVE, DONE)
     */
    String status;

    /**
     * Data de expiração da garantia da cobrança | Payment escrow expiration date
     */
    String expirationDate;

    /**
     * Data de encerramento da garantia da cobrança | Payment escrow finish date
     */
    String finishDate;

    /**
     * Motivo do encerramento da garantia da cobrança | Payment escrow finish reason - (CHARGEBACK, EXPIRED, INSUFFICIENT_BALANCE, PAYMENT_REFUNDED, REQUESTED_BY_CUSTOMER, CUSTOMER_CONFIG_DISABLED)
     */
    String finishReason;
}