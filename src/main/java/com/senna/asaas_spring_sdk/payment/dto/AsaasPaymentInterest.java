package com.senna.asaas_spring_sdk.payment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Informações de juros para pagamento após o vencimento | Interest information for payment after due date
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasPaymentInterest {
    /**
     * Percentual de juros ao mês sobre o valor da cobrança para pagamento após o vencimento | Percentage of interest per month on the amount charged for payment after maturity
     */
    BigDecimal value;
}