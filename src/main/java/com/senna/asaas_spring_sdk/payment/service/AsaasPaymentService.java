package com.senna.asaas_spring_sdk.payment.service;

import com.senna.asaas_spring_sdk.AsaasWebClient;
import com.senna.asaas_spring_sdk.customer.dto.AsaasCustomerList;
import com.senna.asaas_spring_sdk.payment.dto.AsaasPaymentCreateRequest;
import com.senna.asaas_spring_sdk.payment.dto.AsaasPayment;
import com.senna.asaas_spring_sdk.payment.dto.AsaasPaymentList;
import com.senna.asaas_spring_sdk.payment.dto.AsaasPaymentListQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Optional;

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

    /**
     * [PT-BR]
     * Retorna uma lista com todos as cobranças de acordo com o filtro aplicado
     * |
     * [EN]
     * Returns a list with all payments according to the applied filter
     *
     * @param query Filtro da requisição | Request filter - (AsaasPaymentListQuery.class)
     * @return Retorno da API | API return - (AsaasPaymentList.class)
     */
    public Mono<AsaasPaymentList> list(AsaasPaymentListQuery query) {
        return asaasWebClient.get(uriBuilder -> uriBuilder
                        .path("/payments")
                        .queryParamIfPresent("installment", Optional.ofNullable(query.getInstallment()))
                        .queryParamIfPresent("offset", Optional.ofNullable(query.getOffset()))
                        .queryParamIfPresent("limit", Optional.ofNullable(query.getLimit()))
                        .queryParamIfPresent("customer", Optional.ofNullable(query.getCustomer()))
                        .queryParamIfPresent("customerGroupName", Optional.ofNullable(query.getCustomerGroupName()))
                        .queryParamIfPresent("billingType", Optional.ofNullable(query.getBillingType()))
                        .queryParamIfPresent("status", Optional.ofNullable(query.getStatus()))
                        .queryParamIfPresent("subscription", Optional.ofNullable(query.getSubscription()))
                        .queryParamIfPresent("externalReference", Optional.ofNullable(query.getExternalReference()))
                        .queryParamIfPresent("paymentDate", Optional.ofNullable(query.getPaymentDate()))
                        .queryParamIfPresent("invoiceStatus", Optional.ofNullable(query.getInvoiceStatus()))
                        .queryParamIfPresent("estimatedCreditDate", Optional.ofNullable(query.getEstimatedCreditDate()))
                        .queryParamIfPresent("pixQrCodeId", Optional.ofNullable(query.getPixQrCodeId()))
                        .queryParamIfPresent("anticipated", Optional.ofNullable(query.getAnticipated()))
                        .queryParamIfPresent("anticipable", Optional.ofNullable(query.getAnticipable()))
                        .queryParamIfPresent("dateCreated[ge]", Optional.ofNullable(query.getDateCreatedGE()))
                        .queryParamIfPresent("dateCreated[le]", Optional.ofNullable(query.getDateCreatedLE()))
                        .queryParamIfPresent("paymentDate[ge]", Optional.ofNullable(query.getPaymentDateGE()))
                        .queryParamIfPresent("paymentDate[le]", Optional.ofNullable(query.getPaymentDateLE()))
                        .queryParamIfPresent("estimatedCreditDate[ge]", Optional.ofNullable(query.getEstimatedCreditDateGE()))
                        .queryParamIfPresent("estimatedCreditDate[le]", Optional.ofNullable(query.getEstimatedCreditDateLE()))
                        .queryParamIfPresent("dueDate[ge]", Optional.ofNullable(query.getDueDateGE()))
                        .queryParamIfPresent("dueDate[le]", Optional.ofNullable(query.getDueDateLE()))
                        .queryParamIfPresent("user", Optional.ofNullable(query.getUser()))
                        .build(),
                AsaasPaymentList.class
        );
    }
}
