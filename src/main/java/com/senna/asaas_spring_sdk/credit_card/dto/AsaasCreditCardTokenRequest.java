package com.senna.asaas_spring_sdk.credit_card.dto;

import lombok.Data;

/**
 * Request para receber o ‘token’ do cartão | Request to receive the card token
 */
@Data
public class AsaasCreditCardTokenRequest {
        /**
         * Identificador único do cliente no Asaas | Unique customer identifier in Asaas
         */
        String customer;

        /**
         * Informações do cartão de crédito | Credit card information
         */
        AsaasCreditCard creditCard;

        /**
         * Informações do titular do cartão de crédito | Credit card holder information
         */
        AsaasCreditCardHolderInfo creditCardHolderInfo;

        /**
         * IP de onde o cliente está fazendo a compra. Não deve ser informado o IP do seu servidor. | IP from where the customer is making the purchase. Your server's IP must not be entered.
         */
        String remoteIp;
}