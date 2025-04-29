package com.senna.asaas_spring_sdk.payment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

/**
 * Lista com todos as cobranças | List with all payments
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasPaymentList {

    /**
     * Tipo de objeto | Object type
     */
    String object;

    /**
     * Indica se há mais uma página a ser buscada | Indicates whether there is another page to be searched
     */
    String hasMore;

    /**
     * Quantidade total de itens para os filtros informados | Total number of items for the filters entered
     */
    String totalCount;

    /**
     * Quantidade de objetos por página | Number of objects per page
     */
    String limit;

    /**
     * Posição do objeto a partir do qual a página deve ser carregada | Position of the object from which the page should be loaded
     */
    String offset;

    /**
     * Lista de objetos | List of objects
     */
    List<AsaasPayment> data;
}
