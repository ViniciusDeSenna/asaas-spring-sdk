package com.senna.asaas_spring_sdk.payment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Status da cobrança | Status of a payment
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasPaymentStatus {
    /**
     * Status da cobrança | Payment status
     */
    String status;
}
