package com.senna.asaas_spring_sdk.credit_card.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.senna.asaas_spring_sdk.credit_card.enums.AsaasCreditCardBrands;
import lombok.Data;

/**
 * Resumo das informações do cartão de crédito | Credit Card Information Summary
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasCreditCardSummary {

    /**
     * Últimos 4 dígitos do cartão utilizado | Last 4 digits of the card used
     */
    String creditCardNumber;

    /**
     * Bandeira do cartão utilizado | Brand of the card used - (VISA, MASTERCARD, ELO, DINERS, DISCOVER, AMEX, HIPERCARD, CABAL, BANESCARD, CREDZ, SOROCRED, CREDSYSTEM, JCB, UNKNOWN)
     */
    AsaasCreditCardBrands creditCardBrand;

    /**
     * Token do cartão de crédito que poderá ser enviado nas próximas transações sem a necessidade de informar novamente os dados de cartão e do titular | Credit card token that can be sent in future transactions without the need to re-enter card and cardholder details.
     */
    String creditCardToken;
}
