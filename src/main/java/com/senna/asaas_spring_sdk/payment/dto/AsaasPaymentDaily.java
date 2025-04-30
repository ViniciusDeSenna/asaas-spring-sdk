package com.senna.asaas_spring_sdk.payment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Limites diários | Daily limits
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasPaymentDaily {

    /**
     * Limite total | Total limit
     */
    Integer limit;

    /**
     * Limite usado | Limit used
     */
    Integer used;

    /**
     * Indica se o limite foi atingido | Indicates whether the limit has been reached
     */
    Boolean wasReached;
}
