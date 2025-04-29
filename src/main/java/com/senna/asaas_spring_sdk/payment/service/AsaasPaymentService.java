package com.senna.asaas_spring_sdk.payment.service;

import com.senna.asaas_spring_sdk.AsaasWebClient;
import com.senna.asaas_spring_sdk.payment.dto.PaymentCreateRequest;
import com.senna.asaas_spring_sdk.payment.dto.PaymentCreateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class AsaasPaymentService {

    @Autowired
    AsaasWebClient asaasWebClient;

    public Mono<PaymentCreateResponse> createNewPayment(PaymentCreateRequest request) {
        //
    }
}
