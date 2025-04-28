package com.senna.asaas_spring_sdk.credit_card.service;

import com.senna.asaas_spring_sdk.credit_card.dto.CreditCardHolderInfo;
import com.senna.asaas_spring_sdk.credit_card.dto.CreditCardRequest;
import com.senna.asaas_spring_sdk.credit_card.dto.CreditCardTokenizationRequest;
import com.senna.asaas_spring_sdk.credit_card.dto.CreditCardTokenizationResponse;
import com.senna.asaas_spring_sdk.customer.dto.AsaasCustomerList;
import com.senna.asaas_spring_sdk.customer.dto.AsaasCustomerListQuery;
import com.senna.asaas_spring_sdk.customer.service.AsaasCustomerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AsaasCreditCardServiceTest {

    @Autowired
    AsaasCustomerService asaasCustomerService;

    @Autowired
    AsaasCreditCardService asaasCreditCardService;

    @Test
    void tokenization() {

        AsaasCustomerList customers = asaasCustomerService.list(new AsaasCustomerListQuery(0, 1)).block();

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

        CreditCardTokenizationRequest request = new CreditCardTokenizationRequest();
        request.setCustomer(customers.getData().get(0).getId());
        request.setCreditCard(creditCardRequest);
        request.setCreditCardHolderInfo(holderInfo);
        request.setRemoteIp("123");

        CreditCardTokenizationResponse response = asaasCreditCardService.tokenization(request).block();

        Assertions.assertNotNull(response);
        Assertions.assertNotNull(response.getCreditCardToken());
        Assertions.assertEquals("3456", response.getCreditCardNumber());
    }
}