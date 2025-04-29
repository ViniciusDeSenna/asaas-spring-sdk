package com.senna.asaas_spring_sdk.payment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.senna.asaas_spring_sdk.payment.enums.FineType;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Informações de multa para pagamento após o vencimento | Fine information for payment after due date
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasPaymentFine {
    /**
     * Percentual de multa sobre o valor da cobrança para pagamento após o vencimento | Percentage of fine on the amount of the charge for payment after the due date
     */
    BigDecimal value;
    /**
     * Tipo de multa | Fine type
     */
    FineType type;
}