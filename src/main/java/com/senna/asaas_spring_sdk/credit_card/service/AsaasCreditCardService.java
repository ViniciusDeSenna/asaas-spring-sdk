package com.senna.asaas_spring_sdk.credit_card.service;

import com.senna.asaas_spring_sdk.AsaasWebClient;
import com.senna.asaas_spring_sdk.credit_card.dto.AsaasCreditCardSummary;
import com.senna.asaas_spring_sdk.credit_card.dto.AsaasCreditCardTokenRequest;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class AsaasCreditCardService {

    private final AsaasWebClient asaasWebClient;

    public AsaasCreditCardService(AsaasWebClient asaasWebClient) {
        this.asaasWebClient = asaasWebClient;
    }

    /**
     * [PT-BR]
     * Transforma os dados do cartão do cliente em um token que pode ser utilizado em outras chamadas.
     * |
     * [EN]
     * Transforms the customer's card data into a token that can be used in other calls.
     *
     * @param request Dados do cartão e do dono do cartão | Card and cardholder details (AsaasCreditCardTokenRequest.class).
     * @return Um Mono contendo os dados resumidos do cartão | A Mono containing the summary data of the card (AsaasCreditCardSummary.class).
     */
    public Mono<AsaasCreditCardSummary> tokenization(AsaasCreditCardTokenRequest request) {
        return asaasWebClient.post("/creditCard/tokenizeCreditCard", request, AsaasCreditCardSummary.class);
    }
}
