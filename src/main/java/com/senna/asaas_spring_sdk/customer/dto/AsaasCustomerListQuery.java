package com.senna.asaas_spring_sdk.customer.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

/**
 * Classe de filtro para listar os clientes | Filter class to list customers
 */
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasCustomerListQuery {

    /**
     * Elemento inicial da lista | List starting element
     */
    Integer offset;

    /**
     * Número de elementos da lista | Number of list elements - (max: 100)
     */
    Integer limit;

    /**
     * Filtrar por nome | Filter by name
     */
    String name;

    /**
     * Filtrar por email | Filter by email
     */
    String email;

    /**
     * Filtrar por CPF ou CNPJ | Filter by CPF or CNPJ
     */
    String cpfCnpj;

    /**
     * Filtrar por grupo | Filter by group
     */
    String groupName;

    /**
     * Filtrar pelo Identificador do seu sistema | Filter by your system identifier
     */
    String externalReference;
}
