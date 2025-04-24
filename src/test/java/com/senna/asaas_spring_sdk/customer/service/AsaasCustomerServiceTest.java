package com.senna.asaas_spring_sdk.customer.service;

import com.senna.asaas_spring_sdk.AsaasWebClient;
import com.senna.asaas_spring_sdk.customer.dto.CustomerCreateRequest;
import com.senna.asaas_spring_sdk.customer.dto.CustomerCreateResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AsaasCustomerServiceTest {

    @Autowired
    AsaasCustomerService asaasCustomerService;

    @Test
    void createNewCustomer() {
       CustomerCreateRequest request = new CustomerCreateRequest();
        request.setName("Test Name");
        request.setCpfCnpj("01234567890");
        request.setEmail("test@test.com");
        request.setPhone("1234567890");
        request.setMobilePhone("1234567890");
        request.setAddress("Test Street");
        request.setAddressNumber("000");
        request.setComplement("Complement");
        request.setProvince("Test Provice");
        request.setPostalCode("1234567");
        request.setExternalReference("123");
        request.setNotificationDisabled(false);
        request.setAdditionalEmails("test2@test.com,test3@test.com");
        request.setMunicipalInscription("1234567890");
        request.setStateInscription("1234567890");
        request.setObservations("Test User");
        request.setGroupName("Test Group");
        request.setCompany("Test Company");
        request.setForeignCustomer(false);

        CustomerCreateResponse response = asaasCustomerService.createNewCustomer(request).block();

        Assertions.assertNotNull(response);
        Assertions.assertEquals("Test Name", response.getName());
        Assertions.assertEquals("01234567890", response.getCpfCnpj());
        Assertions.assertEquals("test@test.com", response.getEmail());
        Assertions.assertEquals("1234567890", response.getPhone());
        Assertions.assertEquals("1234567890", response.getMobilePhone());
        Assertions.assertEquals("Test Street", response.getAddress());
        Assertions.assertEquals("000", response.getAddressNumber());
        Assertions.assertEquals("Complement", response.getComplement());
        Assertions.assertEquals("Test Provice", response.getProvince());
        Assertions.assertEquals("1234567", response.getPostalCode());
        Assertions.assertEquals("123", response.getExternalReference());
        Assertions.assertEquals(false, response.getNotificationDisabled());
        Assertions.assertEquals("test2@test.com,test3@test.com", response.getAdditionalEmails());
        Assertions.assertEquals("Test User", response.getObservations());
    }

    @Test
    void listCustomers() {
        //
    }
}