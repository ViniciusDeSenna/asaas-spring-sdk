package com.senna.asaas_spring_sdk.payment.service;

import com.senna.asaas_spring_sdk.AsaasWebClient;
import com.senna.asaas_spring_sdk.credit_card.dto.AsaasCreditCard;
import com.senna.asaas_spring_sdk.credit_card.dto.AsaasCreditCardHolderInfo;
import com.senna.asaas_spring_sdk.customer.dto.AsaasCustomerList;
import com.senna.asaas_spring_sdk.global_dtos.AsaasRemoveResponse;
import com.senna.asaas_spring_sdk.payment.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
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

    /**
     * [PT-BR]
     * Para capturar uma cobrança de cartão de crédito criada com Pré-Autorização, é necessário que você tenha o ID retornado no momento da criação da cobrança e que o status da cobrança seja AUTHORIZED.
     * |
     * [EN]
     * To capture a credit card billing created with Pre-Authorization, you need to have the ID returned at the time of billing creation and ensure that the billing status is AUTHORIZED.
     *
     * @param paymentId Id da cobrança | Payment id - (String.class)
     * @return Retorno da API | API return - (AsaasPayment.class)
     */
    public Mono<AsaasPayment> capturePreAuthorizationPayment(String paymentId) {
        return asaasWebClient.post("/payments/" + paymentId + "/captureAuthorizedPayment", AsaasPayment.class);
    }

    /**
     * [PT-BR]
     * Este endpoint paga uma cobrança com o cartão de crédito informado na hora que você chamá-lo. Caso você tenha o cartão em forma de token você pode usar a função payWithCreditCard passando apenas o token.
     * |
     * [EN]
     * This endpoint processes a payment for a billing using the credit card provided at the time you call it. If you have the card in token form, you can use the payWithCreditCard function, passing only the token.
     *
     * @param paymentId Identificador único da cobrança no Asaas | Unique payment identifier in Asaas - (String.class)
     * @param creditCard Informações do cartão de crédito | Credit card information - (AsaasCreditCard.class)
     * @param creditCardHolderInfo Informações do titular do cartão de crédito | Credit card holder information - (AsaasCreditCardHolderInfo.class)
     * @return Retorno da API | API return - (AsaasPayment.class)
     */
    public Mono<AsaasPayment> payWithCreditCard(String paymentId, AsaasCreditCard creditCard, AsaasCreditCardHolderInfo creditCardHolderInfo) {

        Map<String, Object> request = new HashMap<>();
        request.put("creditCard", creditCard);
        request.put("creditCardHolderInfo", creditCardHolderInfo);

        return asaasWebClient.post("/payments/" + paymentId + "/payWithCreditCard", request, AsaasPayment.class);
    }

    /**
     * [PT-BR]
     * Este endpoint paga uma cobrança com o cartão de crédito informado na hora que você chamá-lo.
     * |
     * [EN]
     * This endpoint processes a payment for a billing using the credit card provided at the time you call it.
     *
     * @param paymentId Identificador único da cobrança no Asaas | Unique payment identifier in Asaas - (String.class).
     * @param creditCardToken Token do cartão de crédito para uso da funcionalidade de tokenização de cartão de crédito. | Credit card token for using the credit card tokenization functionality. - (String.class)
     * @return Retorno da API | API return - (AsaasPayment.class)
     */
    public Mono<AsaasPayment> payWithCreditCard(String paymentId, String creditCardToken) {

        Map<String, Object> request = new HashMap<>();
        request.put("creditCardToken", creditCardToken );

        return asaasWebClient.post("/payments/" + paymentId + "/payWithCreditCard", request, AsaasPayment.class);
    }

    /**
     * [PT-BR]
     * Recuperar informações de pagamento de uma cobrança
     * |
     * [EN]
     * Retrieve payment billing information
     *
     * @param paymentId Identificador único da cobrança no Asaas | Unique payment identifier in Asaas - (String.class).
     * @return Retorno da API | API return - (AsaasPayment.class)
     */
    public Mono<AsaasPaymentBillingInformation> paymentBillingInformation(String paymentId) {
        return asaasWebClient.get("/payments/" + paymentId + "/billingInfo", AsaasPaymentBillingInformation.class);
    }

    /**
     * [PT-BR]
     * Recuperar informações sobre visualização da cobrança
     * |
     * [EN]
     * Retrieve payment viewing information
     *
     * @param paymentId Identificador único da cobrança no Asaas | Unique payment identifier in Asaas - (String.class).
     * @return Retorno da API | API return - (AsaasPayment.class)
     */
    public Mono<AsaasPaymentViewingInformation> paymentViewingInformation(String paymentId) {
        return asaasWebClient.get("/payments/" + paymentId + "/viewingInfo", AsaasPaymentViewingInformation.class);
    }

    /**
     * [PT-BR]
     * Recuperar uma única cobrança. Para recuperar uma cobrança específica é necessário que você tenha o ID que o Asaas retornou no momento da criação dela.
     * |
     * [EN]
     * Retrieve a single payment. To retrieve a specific charge, you need to have the ID that Asaas returned when it was created.
     *
     * @param paymentId Identificador único da cobrança no Asaas | Unique payment identifier in Asaas - (String.class).
     * @return Retorno da API | API return - (AsaasPayment.class)
     */
    public Mono<AsaasPayment> getPayment(String paymentId) {
        return asaasWebClient.get("/payments/" + paymentId, AsaasPayment.class);
    }

    /**
     * [PT-BR]
     * Atualizar cobrança existente. Somente é possível atualizar cobranças aguardando pagamento ou vencidas. Uma vez criada, não é possível alterar o cliente ao qual a cobrança pertence.
     * |
     * [EN]
     * Update existing payment. It is only possible to update billings that are pending payment or overdue. Once created, it is not possible to change the customer to which the billing belongs.
     *
     * @param paymentId Identificador único da cobrança no Asaas | Unique payment identifier in Asaas - (String.class).
     * @param request Cobraça atualizada | Updated payment - (AsaasPaymentUpdateRequest.class).
     * @return Retorno da API | API return - (AsaasPayment.class)
     */
    public Mono<AsaasPayment> updatePayment(String paymentId, AsaasPaymentUpdateRequest request) {
        return asaasWebClient.put("/payments/" + paymentId, request, AsaasPayment.class);
    }

    /**
     * [PT-BR]
     * Excluir cobrança
     * |
     * [EN]
     * Delete payment
     *
     * @param paymentId Identificador único da cobrança no Asaas | Unique payment identifier in Asaas - (String.class).
     * @return Retorno da API | API return - (AsaasPayment.class)
     */
    public Mono<AsaasRemoveResponse> deletePayment(String paymentId) {
        return asaasWebClient.delete("/payments/" + paymentId, AsaasRemoveResponse.class);
    }

    /**
     * [PT-BR]
     * Restaurar cobrança excluida
     * |
     * [EN]
     * Restore removed payment
     *
     * @param paymentId Identificador único da cobrança no Asaas | Unique payment identifier in Asaas - (String.class).
     * @return Retorno da API | API return - (AsaasPayment.class)
     */
    public Mono<AsaasPayment> restorePayment(String paymentId) {
        return asaasWebClient.delete("/payments/" + paymentId + "/restore", AsaasPayment.class);
    }


    /**
     * [PT-BR]
     * Retorna o status da cobrança
     * |
     * [EN]
     * Retrieve status of a payment
     *
     * @param paymentId Identificador único da cobrança no Asaas | Unique payment identifier in Asaas - (String.class).
     * @return Retorno da API | API return - (AsaasPayment.class)
     */
    public Mono<AsaasPaymentStatus> statusOfAPayment(String paymentId) {
        return asaasWebClient.get("/payments/" + paymentId + "/status", AsaasPaymentStatus.class);
    }

    /**
     * [PT-BR]
     * Reembolsar cobrança
     * |
     * [EN]
     * Refund payment
     *
     * @param paymentId Identificador único da cobrança no Asaas | Unique payment identifier in Asaas - (String.class).
     * @param value Valor do reembolso | Amount to be refunded - (String.class).
     * @param description Motivo do reembolso | Reason for the refund - (String.class).
     * @return Retorno da API | API return - (AsaasPayment.class)
     */
    public Mono<AsaasPayment> statusOfAPayment(String paymentId, BigDecimal value, String description) {

        Map<String, Object> request = new HashMap<>();
        request.put("value", value );
        request.put("description", description );

        return asaasWebClient.post("/payments/" + paymentId + "/refund", request,  AsaasPayment.class);
    }

    /**
     * [PT-BR]
     * Obter linha digitável do boleto
     * |
     * [EN]
     * Get digitable bill line
     *
     * @param paymentId Identificador único da cobrança no Asaas | Unique payment identifier in Asaas - (String.class).
     * @return Retorno da API | API return - (AsaasPayment.class)
     */
    public Mono<AsaasPaymentBankSlipSummary> getDigitableBillLine(String paymentId) {
        return asaasWebClient.get("/payments/" + paymentId + "/identificationField", AsaasPaymentBankSlipSummary.class);
    }
}
