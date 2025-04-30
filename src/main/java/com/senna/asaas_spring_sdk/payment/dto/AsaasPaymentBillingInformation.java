package com.senna.asaas_spring_sdk.payment.dto;

import com.senna.asaas_spring_sdk.credit_card.dto.AsaasCreditCardSummary;
import lombok.Data;

/**
 * Informações de pagamento de uma cobrança | Payment billing information
 */
@Data
public class AsaasPaymentBillingInformation {
    /**
     * Dados do pagamento relacionados a Pix | Payment data related to pix
     */
    AsaasPaymentPixSummary pix;

    /**
     * Resumo das informações do cartão de crédito | Credit Card Information Summary
     */
    AsaasCreditCardSummary creditCard;

    /**
     * Dados do pagamento relacionados a boleto | Payment data related to bank slip
     */
    AsaasPaymentBankSlipSummary bankSlip;
}
