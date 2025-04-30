package com.senna.asaas_spring_sdk.payment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Simulador de vendas | Sales simulator
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasPaymentSalesSimulator {

    /**
     * Valor total do parcelamento ou da cobrança | Total installment or billing amount
     */
    BigDecimal value;

    /**
     * Taxas de cartão | Card fees
     */
    AsaasPaymentSalesSimulatorCreditCard creditCard;

    /**
     * Taxas de boleto | Boleto fees
     */
    AsaasPaymentSalesSimulatorBankSplit bankSlip;

    /**
     * Taxas de PIX | PIX fees
     */
    AsaasPaymentSalesSimulatorPix pix;
}
