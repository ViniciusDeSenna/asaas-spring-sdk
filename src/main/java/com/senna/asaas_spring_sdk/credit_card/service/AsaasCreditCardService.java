package com.senna.asaas_spring_sdk.credit_card.service;

import com.senna.asaas_spring_sdk.AsaasWebClient;
import com.senna.asaas_spring_sdk.credit_card.dto.CreditCardTokenizationRequest;
import com.senna.asaas_spring_sdk.credit_card.dto.CreditCardTokenizationResponse;
import reactor.core.publisher.Mono;

public class AsaasCreditCardService {

    private final AsaasWebClient asaasWebClient;

    public AsaasCreditCardService(AsaasWebClient asaasWebClient) {
        this.asaasWebClient = asaasWebClient;
    }

    public Mono<CreditCardTokenizationResponse> tokenization(CreditCardTokenizationRequest request) {
        return asaasWebClient.getClient()
                .post()
                .uri("/creditCard/tokenizeCreditCard")
                .bodyValue(request)
                .retrieve()
                .bodyToMono(CreditCardTokenizationResponse.class);
    }
}
