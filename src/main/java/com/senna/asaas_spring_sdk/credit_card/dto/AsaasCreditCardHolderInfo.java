package com.senna.asaas_spring_sdk.credit_card.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Informações do titular do cartão de crédito | Credit card holder information
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasCreditCardHolderInfo {
        /**
         * Nome do titular do cartão | Name of card holder
         */
        String name;

        /**
         * Email do titular do cartão | Cardholder email
         */
        String email;

        /**
         * CPF ou CNPJ do titular do cartão | CPF or CNPJ of the cardholder
         */
        String cpfCnpj;

        /**
         * CEP do titular do cartão | Cardholder zip code
         */
        String postalCode;

        /**
         * Número do endereço do titular do cartão | Cardholder address number
         */
        String addressNumber;

        /**
         * Complemento do endereço do titular do cartão | Supplementing the cardholder's address
         */
        String addressComplement;

        /**
         * Telefone com DDD do titular do cartão | Phone with cardholder's area code
         */
        String phone;

        /**
         * Celular do titular do cartão | Cardholder's cell phone
         */
        String mobilePhone;
}