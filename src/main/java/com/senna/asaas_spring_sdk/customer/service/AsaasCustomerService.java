package com.senna.asaas_spring_sdk.customer.service;

import com.senna.asaas_spring_sdk.AsaasWebClient;
import com.senna.asaas_spring_sdk.customer.dto.CustomerCreateRequest;
import com.senna.asaas_spring_sdk.customer.dto.CustomerCreateResponse;
import com.senna.asaas_spring_sdk.customer.dto.CustomerList;
import com.senna.asaas_spring_sdk.customer.dto.CustomerListQuery;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class AsaasCustomerService {

    private final AsaasWebClient asaasWebClient;

    public AsaasCustomerService(AsaasWebClient asaasWebClient) {
        this.asaasWebClient = asaasWebClient;
    }

    public Mono<CustomerCreateResponse> createNewCustomer(CustomerCreateRequest request) {
        return asaasWebClient.getClient()
                .post()
                .uri("/customers")
                .bodyValue(request)
                .retrieve()
                .bodyToMono(CustomerCreateResponse.class);
    }

    public Mono<CustomerList> listCustomers(CustomerListQuery query) {
        return asaasWebClient.getClient()
                .get()
                .uri(uriBuilder -> uriBuilder
                        .path("/customers")
                        .queryParamIfPresent("offset", Optional.ofNullable(query.getOffset()))
                        .queryParamIfPresent("limit", Optional.ofNullable(query.getLimit()))
                        .queryParamIfPresent("name", Optional.ofNullable(query.getName()))
                        .queryParamIfPresent("email", Optional.ofNullable(query.getEmail()))
                        .queryParamIfPresent("cpfCnpj", Optional.ofNullable(query.getCpfCnpj()))
                        .queryParamIfPresent("groupName", Optional.ofNullable(query.getGroupName()))
                        .queryParamIfPresent("externalReference", Optional.ofNullable(query.getExternalReference()))
                        .build()
                )
                .retrieve()
                .bodyToMono(CustomerList.class);
    }
}
