package com.senna.asaas_spring_sdk.payment.service;

import com.senna.asaas_spring_sdk.AsaasWebClient;
import com.senna.asaas_spring_sdk.payment.dto.AsaasPaymentCreateRequest;
import com.senna.asaas_spring_sdk.payment.dto.AsaasPayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class AsaasPaymentService {

    @Autowired
    AsaasWebClient asaasWebClient;

    /**
     * [PT-BR]
     * Cria uma nova cobrança chamando a rota '/payments'.
     * |
     * [EN]
     * Creates a new payment by calling the '/payments' route.
     *
     * @param request Corpo da requisição | Request Body - (PaymentCreateRequest.class)
     * @return Retorno da API | API return - (AsaasPayment.class)
     */
    public Mono<AsaasPayment> create(AsaasPaymentCreateRequest request) {
        return asaasWebClient.post("/payments", request, AsaasPayment.class);
    }
}
