package com.senna.asaas_spring_sdk;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class AsaasWebClient {

    private final WebClient webClient;

    public AsaasWebClient(@Value("${asaas.api.base-url}") String baseUrl, @Value("${asaas.api.token}") String apiKey) {
        this.webClient = WebClient.builder()
                .baseUrl(baseUrl)
                .defaultHeader("Accept", "application/json")
                .defaultHeader("Content-Type", "application/json")
                .defaultHeader("access_token", apiKey)
                .build();
    }

    public WebClient getClient() {
        return this.webClient;
    }
}
