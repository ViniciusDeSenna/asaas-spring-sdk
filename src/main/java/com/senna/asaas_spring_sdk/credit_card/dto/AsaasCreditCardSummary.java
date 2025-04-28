package com.senna.asaas_spring_sdk.credit_card.dto;

import lombok.Data;

/**
 * [PT-BR]
 * Resumo das informações do cartão de crédito.
 * |
 * [EN]
 * Credit Card Information Summary.
 */
@Data
public class AsaasCreditCardSummary {
    String creditCardNumber;
    String creditCardBrand;
    String creditCardToken;
}
