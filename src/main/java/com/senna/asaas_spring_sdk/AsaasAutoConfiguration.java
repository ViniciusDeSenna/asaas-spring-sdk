package com.senna.asaas_spring_sdk;

import com.senna.asaas_spring_sdk.credit_card.service.AsaasCreditCardService;
import com.senna.asaas_spring_sdk.customer.service.AsaasCustomerService;
import com.senna.asaas_spring_sdk.payment.service.AsaasPaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AsaasAutoConfiguration {

    @Value("${asaas.api.base-url}")
    private String baseUrl;

    @Value("${asaas.api.token}")
    private String apiKey;

    @Bean
    public AsaasWebClient asaasWebClient() {
        return new AsaasWebClient(baseUrl, apiKey);
    }

    @Bean
    public AsaasCreditCardService asaasCreditCardService(AsaasWebClient client) {
        return new AsaasCreditCardService(client);
    }

    @Bean
    public AsaasCustomerService asaasCustomerService(AsaasWebClient client) {
        return new AsaasCustomerService(client);
    }

    @Bean
    public AsaasPaymentService asaasPaymentService(AsaasWebClient client) {
        return new AsaasPaymentService(client);
    }
}
