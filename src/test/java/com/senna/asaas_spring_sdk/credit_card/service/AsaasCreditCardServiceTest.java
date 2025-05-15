package com.senna.asaas_spring_sdk.credit_card.service;

import com.senna.asaas_spring_sdk.credit_card.dto.AsaasCreditCard;
import com.senna.asaas_spring_sdk.credit_card.dto.AsaasCreditCardHolderInfo;
import com.senna.asaas_spring_sdk.credit_card.dto.AsaasCreditCardSummary;
import com.senna.asaas_spring_sdk.credit_card.dto.AsaasCreditCardTokenRequest;
import com.senna.asaas_spring_sdk.credit_card.enums.AsaasCreditCardBrands;
import com.senna.asaas_spring_sdk.customer.dto.AsaasCustomer;
import com.senna.asaas_spring_sdk.customer.dto.AsaasCustomerListQuery;
import com.senna.asaas_spring_sdk.customer.service.AsaasCustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDate;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AsaasCreditCardServiceTest {

    @Autowired
    AsaasCustomerService asaasCustomerService;

    @Autowired
    AsaasCreditCardService asaasCreditCardService;

    @Test
    void tokenization() {

        AsaasCustomer customer = Objects.requireNonNull(asaasCustomerService.list(AsaasCustomerListQuery.builder().build()).block()).getData().get(0);

        AsaasCreditCard creditCard = AsaasCreditCard.builder()
                .holderName(customer.getName())
                .number("12345671234567")
                .expiryMonth("01")
                .expiryYear(String.valueOf(LocalDate.now().plusYears(1).getYear()))
                .ccv("123")
                .build();

        AsaasCreditCardHolderInfo holderInfo = AsaasCreditCardHolderInfo.builder()
                .name(customer.getName())
                .email(customer.getEmail())
                .cpfCnpj(customer.getCpfCnpj())
                .postalCode(customer.getPostalCode())
                .addressNumber(customer.getAddressNumber())
                .addressComplement(customer.getComplement())
                .phone(customer.getPhone())
                .mobilePhone(customer.getMobilePhone())
                .build();

        AsaasCreditCardTokenRequest request = AsaasCreditCardTokenRequest.builder()
                .customer(customer.getId())
                .creditCard(creditCard)
                .creditCardHolderInfo(holderInfo)
                .remoteIp("123")
                .build();

        AsaasCreditCardSummary summary = asaasCreditCardService.tokenization(request).block();

        assertNotNull(summary);
        assertEquals("4567", summary.getCreditCardNumber());
        assertEquals(AsaasCreditCardBrands.UNKNOWN, summary.getCreditCardBrand());
    }
}