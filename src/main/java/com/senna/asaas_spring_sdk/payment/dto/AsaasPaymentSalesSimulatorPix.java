package com.senna.asaas_spring_sdk.payment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Taxas de PIX | PIX fees
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasPaymentSalesSimulatorPix {
    /**
     * Valor liquido | Net value
     */
    BigDecimal netValue;

    /**
     * Taxa em porcentagem | Rate in percentage
     */
    BigDecimal feePercentage;

    /**
     * Taxa de operação | Operation fee
     */
    BigDecimal operationFee;

    /**
     * Informações de parcelamento | Installment information
     */
    AsaasPaymentInstallment installment;
}
