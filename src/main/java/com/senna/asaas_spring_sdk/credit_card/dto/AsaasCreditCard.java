package com.senna.asaas_spring_sdk.credit_card.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

/**
 * Informações do cartão de crédito | Credit card information
 */
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasCreditCard {

        /**
         * Nome impresso no cartão | Name printed on card
         */
        String holderName;

        /**
         * Número do cartão | Card number
         */
        String number;

        /**
         * Mês de expiração com 2 dígitos | Expiration month with 2 digits
         */
        String expiryMonth;

        /**
         * Ano de expiração com 4 dígitos | Expiration year with 4 digits
         */
        String expiryYear;

        /**
         * Código de segurança | Security code
         */
        String ccv;
}
