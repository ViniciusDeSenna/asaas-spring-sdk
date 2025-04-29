package com.senna.asaas_spring_sdk.payment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Configurações do split | Split Settings
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasPaymentSplit {

        /**
         * Identificador da carteira Asaas que será transferido | Asaas wallet identifier that will be transferred
         */
        String walletId;

        /**
         * Valor fixo a ser transferido para a conta quando a cobrança for recebida | Fixed amount to be transferred to the account when the payment is received
         */
        BigDecimal fixedValue;

        /**
         * Percentual sobre o valor líquido da cobrança a ser transferido quando for recebida | Percentage of the net value of the charge to be transferred when received
         */
        BigDecimal percentualValue;

        /**
         * (Somente parcelamentos). Valor que será feito split referente ao valor total que será parcelado. | (Instalments only). Amount that will be split relative to the total amount that will be paid in installments.
         */
        BigDecimal totalFixedValue;

        /**
         * Identificador do split no seu sistema | Split identifier in your system
         */
        String externalReference;

        /**
         * Descrição do split | Split description
         */
        String descriptio;
}