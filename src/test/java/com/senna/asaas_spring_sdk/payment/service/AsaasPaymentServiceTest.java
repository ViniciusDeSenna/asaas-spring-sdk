package com.senna.asaas_spring_sdk.payment.service;

import com.senna.asaas_spring_sdk.credit_card.service.AsaasCreditCardService;
import com.senna.asaas_spring_sdk.customer.service.AsaasCustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AsaasPaymentServiceTest {

    @Autowired
    AsaasCustomerService asaasCustomerService;

    @Autowired
    AsaasCreditCardService asaasCreditCardService;

    @Autowired
    AsaasPaymentService asaasPaymentService;

    @Test
    void createNewPayment() {

        /*
        AsaasCustomerList asaasCustomerList = asaasCustomerService.list(new AsaasCustomerListQuery(0, 1)).block();

        CreditCardRequest creditCardRequest = new CreditCardRequest();
        creditCardRequest.setHolderName("TESTE USER");
        creditCardRequest.setNumber("1234567890123456");
        creditCardRequest.setExpiryMonth("4");
        creditCardRequest.setExpiryYear("2027");
        creditCardRequest.setCcv("123");

        CreditCardHolderInfo holderInfo = new CreditCardHolderInfo();
        holderInfo.setName("TESTE USER");
        holderInfo.setEmail("teste@teste.com");
        holderInfo.setCpfCnpj("45190135004");
        holderInfo.setPostalCode("89066361");
        holderInfo.setAddressNumber("34");
        holderInfo.setAddressComplement("");
        holderInfo.setPhone("23434344567");

        CreditCardTokenizationRequest requestCreditCard = new CreditCardTokenizationRequest();
        requestCreditCard.setCustomer(asaasCustomerList.getData().get(0).getId());
        requestCreditCard.setCreditCard(creditCardRequest);
        requestCreditCard.setCreditCardHolderInfo(holderInfo);
        requestCreditCard.setRemoteIp("123");

        CreditCardTokenizationResponse responseCreditCard = asaasCreditCardService.tokenization(requestCreditCard).block();

        PaymentCreateRequest request = new PaymentCreateRequest();
        request.setCustomer(asaasCustomerList.getData().get(0).getId());
        request.setBillingType(BillingType.CREDIT_CARD.toString());
        request.setValue(BigDecimal.valueOf(10.0));
        request.setDueDate(LocalDate.now().toString());
        request.setCreditCardHolderInfo(holderInfo);
        request.setCreditCardToken(responseCreditCard.getCreditCardToken());
        request.setRemoteIp("123");

        Mono<AsaasApiResponse<PaymentCreateResponse>> responsePay = asaasPaymentService.createNewPayment(request);

        Assertions.assertNotNull(responsePay.block());
        //Assertions.assertEquals("payment", response.getData().getObject());

         */
    }
}