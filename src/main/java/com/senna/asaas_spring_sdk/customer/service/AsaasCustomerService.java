package com.senna.asaas_spring_sdk.customer.service;

import com.senna.asaas_spring_sdk.AsaasWebClient;
import com.senna.asaas_spring_sdk.customer.dto.*;
import com.senna.asaas_spring_sdk.global_dtos.AsaasRemoveResponse;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Optional;

/**
 * [PT-BR]
 * Serviço para realizar chamadas a API relacionadas diretamente ao cliente.
 * |
 * [EN]
 * Service to make API calls directly related to the client.
 */
@Service
public class AsaasCustomerService {

    private final AsaasWebClient asaasWebClient;

    public AsaasCustomerService(AsaasWebClient asaasWebClient) {
        this.asaasWebClient = asaasWebClient;
    }

    /**
     * [PT-BR]
     * Cria um cliente chamando a rota '/customers' com os dados informados.
     * |
     * [EN]
     * Creates a client by calling the '/clientes' route with the provided data.
     *
     * @param request Dados do cliente a ser criado | Customer data to be created (AsaasCustomerCreateRequest).
     * @return Um Mono contendo os dados do cliente criado | A Mono containing the data of the created client (AsaasCustomer.class).
     */
    public Mono<AsaasCustomer> create(AsaasCustomerCreateRequest request) {
        return asaasWebClient.post("/customers", request, AsaasCustomer.class);
    }

    /**
     * [PT-BR]
     * Lista todos os clientes conforme a query montada chamando a rota '/customers'.
     * |
     * [EN]
     * List all customers according to the query created by calling the '/customers' route.
     *
     * @param query Filtro para listar os clientes | Filter to list customers (AsaasCustomerListQuery.class).
     * @return Clientes listados | Listed customers (AsaasCustomerList.class).
     */
    public Mono<AsaasCustomerList> list(AsaasCustomerListQuery query) {
        return asaasWebClient.get(uriBuilder -> uriBuilder
                .path("/customers")
                .queryParamIfPresent("offset", Optional.ofNullable(query.getOffset()))
                .queryParamIfPresent("limit", Optional.ofNullable(query.getLimit()))
                .queryParamIfPresent("name", Optional.ofNullable(query.getName()))
                .queryParamIfPresent("email", Optional.ofNullable(query.getEmail()))
                .queryParamIfPresent("cpfCnpj", Optional.ofNullable(query.getCpfCnpj()))
                .queryParamIfPresent("groupName", Optional.ofNullable(query.getGroupName()))
                .queryParamIfPresent("externalReference", Optional.ofNullable(query.getExternalReference()))
                .build(),
                AsaasCustomerList.class
        );
    }

    /**
     * [PT-BR]
     * Retorna um único cliente chamando a rota '/customers/{id}'.
     * |
     * [EN]
     * Returns a single customer by calling the '/customers/{id}' route.
     *
     * @param customerId Cliente Id | Customer Id (String.class).
     * @return Cliente filtrado | Filtered customer (AsaasCustomer.class).
     */
    public Mono<AsaasCustomer> get(String customerId) {
        return asaasWebClient.get("/customers/" + customerId, AsaasCustomer.class);
    }

    /**
     * [PT-BR]
     * Atualiza um único cliente chamando a rota '/customers/{id}'.
     * |
     * [EN]
     * Updates a single customer by calling the '/customers/{id}' route.
     *
     * @param customerId Cliente Id | Customer Id (String.class).
     * @param request Dados do customer a ser atualizados | Customer data to be updated (AsaasCustomerUpdateRequest).
     * @return Cliente atualizado | Updated customer (AsaasCustomer.class).
     */
    public Mono<AsaasCustomer> update(String customerId, AsaasCustomerUpdateRequest request) {
        return asaasWebClient.put("/customers/" + customerId, request, AsaasCustomer.class);
    }

    /**
     * [PT-BR]
     * Remover um único cliente chamando a rota '/customers/{id}'.
     * |
     * [EN]
     * Remove a single customer by calling the '/customers/{id}' route.
     *
     * @param customerId Cliente Id | Customer Id (String.class).
     * @return Status do delete | Delete status (AsaasRemoveResponse.class).
     */
    public Mono<AsaasRemoveResponse> remove(String customerId) {
        return asaasWebClient.delete("/customers/" + customerId, AsaasRemoveResponse.class);
    }

    /**
     * [PT-BR]
     * Restaura um único cliente removido chamando a rota '/customers/{id}/restore'.
     * |
     * [EN]
     * Restores a single removed customer by calling the '/customers/{id}/restore' route.
     *
     * @param customerId Cliente Id | Customer Id (String.class).
     * @return Cliente restaurado | Restored customer (AsaasCustomer.class).
     */
    public Mono<AsaasCustomer> restore(String customerId) {
        return asaasWebClient.post("/customers/" + customerId + "/restore", AsaasCustomer.class);
    }

    /**
     * [PT-BR]
     * Retorna todas as notificações do cliente chamando a rota '/customers/{id}/notifications'.
     * |
     * [EN]
     * Returns all notifications from the customer calling the '/customers/{id}/notifications' route.
     *
     * @param customerId Cliente Id (String.class).
     * @return Notificações do Cliente (AsaasCustomerNotifications.class).
     */
    public Mono<AsaasCustomerNotifications> retrieveNotifications(String customerId) {
        return asaasWebClient.get("/customers/" + customerId + "/notifications", AsaasCustomerNotifications.class);
    }
}
