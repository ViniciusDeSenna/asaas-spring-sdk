package com.senna.asaas_spring_sdk.customer.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Classe genérica para o grupo do cliente
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasCustomerGroup {
    /**
     * Nome | Name
     */
    String name;
}
