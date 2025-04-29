package com.senna.asaas_spring_sdk.customer.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

/**
 * Lista com todos os clientes | List with all customers
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasCustomerList {
    /**
     * Tipo de objeto | Object type
     */
    String object;

    /**
     * Indica se há mais uma página a ser buscada | Indicates whether there is another page to be searched
     */
    Boolean hasMore;

    /**
     * Quantidade total de itens para os filtros informados | Total number of items for the filters entered
     */
    Integer totalCount;

    /**
     * Quantidade de objetos por página | Number of objects per page
     */
    Integer limit;

    /**
     * Posição do objeto a partir do qual a página deve ser carregada | Position of the object from which the page should be loaded
     */
    Integer offset;

    /**
     * Lista de objetos | List of objects
     */
    List<AsaasCustomer> data;
}
