package com.senna.asaas_spring_sdk.payment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Limites de criação | Breeding limits
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasPaymentCreation {
    /**
     * Limites diários | Daily limits
     */
    AsaasPaymentDaily daily;
}
