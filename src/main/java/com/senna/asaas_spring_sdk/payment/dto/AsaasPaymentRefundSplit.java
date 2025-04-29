package com.senna.asaas_spring_sdk.payment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Split estornado | Refunded split
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasPaymentRefundSplit {

    /**
     * Identificador único do split | Unique split identifier
     */
    String id;

    /**
     * Valor estornado | Refunded value
     */
    BigDecimal value;

    /**
     * Indica se o split foi estornado | Indicates whether the split was refunded
     */
    Boolean done;
}