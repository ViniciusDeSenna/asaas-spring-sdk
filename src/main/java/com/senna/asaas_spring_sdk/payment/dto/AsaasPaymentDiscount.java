package com.senna.asaas_spring_sdk.payment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.senna.asaas_spring_sdk.payment.enums.DiscountType;
import lombok.Data;


import java.math.BigDecimal;

/**
 * | Discount information
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasPaymentDiscount {
    /**
     * Valor percentual ou fixo de desconto a ser aplicado sobre o valor da cobrança | Percentage or fixed amount of discount to be applied to the Payment amount
     */
    BigDecimal value;

    /**
     * Dias antes do vencimento para aplicar desconto. Ex: 0 = até o vencimento, 1 = até um dia antes, 2 = até dois dias antes, e assim por diante | Days before expiration to apply discount. Ex: 0 = until expiration, 1 = up to one day before, 2 = up to 2 days before, and so on
     */
    Integer dueDateLimitDays;

    /**
     * Tipo de desconto | Discount type
     */
    DiscountType type;
}