package com.senna.asaas_spring_sdk.customer.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

/**
 * Objeto informando a consulta e listando todas as notificações do cliente | Object reporting the query and listing all client notifications
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasCustomerNotifications {
    /**
     * Tipo de objeto | Object type
     */
    String object;

    /**
     * Indica se há outra página a ser pesquisada | Indicates whether there is another page to be searched
     */
    Boolean hasMore;

    /**
     * Número total de itens para os filtros inseridos | Total number of items for the filters entered
     */
    Integer totalCount;

    /**
     * Número de objetos por página | Number of objects per page
     */
    Integer limit;

    /**
     * Posição do objeto de onde a página deve ser carregada | Position of the object from which the page should be loaded
     */
    Integer offset;

    /**
     * Lista de objetos | List of objects
     */
    List<AsaasCustomerNotification> data;
}
