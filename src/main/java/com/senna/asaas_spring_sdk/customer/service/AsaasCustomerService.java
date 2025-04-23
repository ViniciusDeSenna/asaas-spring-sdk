package com.senna.asaas_spring_sdk.customer.service;

import com.senna.asaas_spring_sdk.AsaasWebClient;
import com.senna.asaas_spring_sdk.customer.dto.CustomerCreateRequest;
import com.senna.asaas_spring_sdk.customer.dto.CustomerCreateResponse;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

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
}
