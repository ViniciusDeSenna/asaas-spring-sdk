package com.senna.asaas_spring_sdk.payment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Installment information
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasPaymentInstallment {
    /**
     * Valor líquido | Net value
     */
    BigDecimal paymentNetValue;

    /**
     * Valor total | Total value
     */
    BigDecimal paymentValue;
}
