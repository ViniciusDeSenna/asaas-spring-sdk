package com.senna.asaas_spring_sdk.customer.service;

import com.senna.asaas_spring_sdk.AsaasRemoveResponse;
import com.senna.asaas_spring_sdk.customer.dto.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AsaasCustomerServiceTest {

    @Autowired
    AsaasCustomerService asaasCustomerService;

    @Test
    void createPF() {
        AsaasCustomerCreateRequest requestPF = AsaasCustomerCreateRequest.builder()
                .name("Teste Customer")
                .cpfCnpj("70711808066")
                .email("teste@customer.com")
                .phone("4738010919")
                .mobilePhone("47999376637")
                .address("Av. Paulista")
                .addressNumber("50")
                .complement("Sala 201")
                .province("Centro")
                .postalCode("01310000")
                .externalReference("12345")
                .notificationDisabled(false)
                .additionalEmails("teste2@customer.com,teste3@customer.com")
                .observations("Observação")
                .groupName("Teste")
                .company("Teste")
                .foreignCustomer(false)
                .build();

        AsaasCustomer customerPF = asaasCustomerService.create(requestPF).block();

        assertNotNull(customerPF, "Customer returned as null when attempting to create via Asaas.");
        assertEquals("customer", customerPF.getObject(), "Returned object type from Asaas is incorrect.");
        assertEquals(LocalDate.now().toString(), customerPF.getDateCreated(), "Customer creation date does not match today's date.");
        assertEquals(requestPF.getName(), customerPF.getName(), "Customer name does not match.");
        assertEquals(requestPF.getEmail(), customerPF.getEmail(), "Customer email does not match.");
        assertEquals(requestPF.getCompany(), customerPF.getCompany(), "Customer company does not match.");
        assertEquals(requestPF.getPhone(), customerPF.getPhone(), "Customer phone does not match.");
        assertEquals(requestPF.getMobilePhone(), customerPF.getMobilePhone(), "Customer mobile phone does not match.");
        assertEquals(requestPF.getAddress(), customerPF.getAddress(), "Customer address does not match.");
        assertEquals(requestPF.getAddressNumber(), customerPF.getAddressNumber(), "Customer address number does not match.");
        assertEquals(requestPF.getComplement(), customerPF.getComplement(), "Customer address complement does not match.");
        assertEquals(requestPF.getProvince(), customerPF.getProvince(), "Customer province does not match.");
        assertEquals(requestPF.getPostalCode(), customerPF.getPostalCode(), "Customer postal code does not match.");
        assertEquals(requestPF.getCpfCnpj(), customerPF.getCpfCnpj(), "Customer CPF/CNPJ does not match.");
        assertEquals("FISICA", customerPF.getPersonType(), "Customer person type should be 'FISICA'.");
        assertFalse(customerPF.getDeleted(), "Customer should not be marked as deleted.");
        assertEquals(requestPF.getAdditionalEmails(), customerPF.getAdditionalEmails(), "Customer additional emails do not match.");
        assertEquals(requestPF.getExternalReference(), customerPF.getExternalReference(), "Customer external reference does not match.");
        assertFalse(customerPF.getNotificationDisabled(), "Customer notifications should not be disabled.");
        assertEquals(requestPF.getObservations(), customerPF.getObservations(), "Customer observations do not match.");
        assertEquals(15873, customerPF.getCity(), "Customer city ID does not match.");
        assertEquals("São Paulo", customerPF.getCityName(), "Customer city name does not match.");
        assertEquals("SP", customerPF.getState(), "Customer state does not match.");
        assertEquals("Brasil", customerPF.getCountry(), "Customer country does not match.");

        assertNotNull(customerPF.getGroups(), "Customer groups should not be null.");
        assertFalse(customerPF.getGroups().isEmpty(), "Customer groups should not be empty.");
        assertEquals("Teste", customerPF.getGroups().get(0).getName(), "Customer group name does not match.");
    }

    @Test
    void createPJ() {

        AsaasCustomerCreateRequest requestPJ = AsaasCustomerCreateRequest.builder()
                .name("Empresa Teste LTDA")
                .cpfCnpj("24255998000133")
                .email("contato@empresa.com")
                .phone("1130004000")
                .mobilePhone("11999988888")
                .address("Rua das Empresas")
                .addressNumber("100")
                .complement("Andar 3")
                .province("Bairro Empresarial")
                .postalCode("01310000")
                .externalReference("PJ12345")
                .notificationDisabled(false)
                .additionalEmails("financeiro@empresa.com,comercial@empresa.com")
                .municipalInscription("1234567890")
                .stateInscription("524957781469")
                .observations("Cliente PJ - contrato assinado")
                .groupName("Empresas")
                .company("Empresa Teste LTDA")
                .foreignCustomer(false)
                .build();

        AsaasCustomer customerPJ = asaasCustomerService.create(requestPJ).block();

        assertNotNull(customerPJ, "Customer returned as null when attempting to create via Asaas.");
        assertEquals("customer", customerPJ.getObject(), "Returned object type from Asaas is incorrect.");
        assertEquals(LocalDate.now().toString(), customerPJ.getDateCreated(), "Customer creation date does not match today's date.");
        assertEquals(requestPJ.getName(), customerPJ.getName(), "Customer name does not match.");
        assertEquals(requestPJ.getEmail(), customerPJ.getEmail(), "Customer email does not match.");
        assertEquals(requestPJ.getCompany(), customerPJ.getCompany(), "Customer company does not match.");
        assertEquals(requestPJ.getPhone(), customerPJ.getPhone(), "Customer phone does not match.");
        assertEquals(requestPJ.getMobilePhone(), customerPJ.getMobilePhone(), "Customer mobile phone does not match.");
        assertEquals(requestPJ.getAddress(), customerPJ.getAddress(), "Customer address does not match.");
        assertEquals(requestPJ.getAddressNumber(), customerPJ.getAddressNumber(), "Customer address number does not match.");
        assertEquals(requestPJ.getComplement(), customerPJ.getComplement(), "Customer address complement does not match.");
        assertEquals(requestPJ.getProvince(), customerPJ.getProvince(), "Customer province does not match.");
        assertEquals(requestPJ.getPostalCode(), customerPJ.getPostalCode(), "Customer postal code does not match.");
        assertEquals(requestPJ.getCpfCnpj(), customerPJ.getCpfCnpj(), "Customer CNPJ does not match.");
        assertEquals("JURIDICA", customerPJ.getPersonType(), "Customer person type should be 'JURIDICA'.");
        assertFalse(customerPJ.getDeleted(), "Customer should not be marked as deleted.");
        assertEquals(requestPJ.getAdditionalEmails(), customerPJ.getAdditionalEmails(), "Customer additional emails do not match.");
        assertEquals(requestPJ.getMunicipalInscription(), customerPJ.getMunicipalInscription(), "Customer Municipal Inscripition emails do not match.");
        assertEquals(requestPJ.getStateInscription(), customerPJ.getStateInscription(), "Customer State Inscripition emails do not match.");
        assertEquals(requestPJ.getExternalReference(), customerPJ.getExternalReference(), "Customer external reference does not match.");
        assertFalse(customerPJ.getNotificationDisabled(), "Customer notifications should not be disabled.");
        assertEquals(requestPJ.getObservations(), customerPJ.getObservations(), "Customer observations do not match.");
        assertEquals(15873, customerPJ.getCity(), "Customer city ID does not match.");
        assertEquals("São Paulo", customerPJ.getCityName(), "Customer city name does not match.");
        assertEquals("SP", customerPJ.getState(), "Customer state does not match.");
        assertEquals("Brasil", customerPJ.getCountry(), "Customer country does not match.");

        assertNotNull(customerPJ.getGroups(), "Customer groups should not be null.");
        assertFalse(customerPJ.getGroups().isEmpty(), "Customer groups should not be empty.");
        assertEquals("Empresas", customerPJ.getGroups().get(0).getName(), "Customer group name does not match.");
    }


    @Test
    void list() {
        AsaasCustomerList customers = asaasCustomerService.list(AsaasCustomerListQuery.builder().build()).block();

        assertNotNull(customers);
        assertNotNull(customers.getData());
        assertFalse(customers.getData().isEmpty(), "Data should not be empty.");
        assertEquals("customer", customers.getData().get(0).getObject());
    }

    @Test
    void get() {
        AsaasCustomer request = Objects.requireNonNull(asaasCustomerService.list(AsaasCustomerListQuery.builder().build()).block()).getData().get(0);

        AsaasCustomer customer = asaasCustomerService.get(request.getId()).block();

        assertNotNull(customer);
        assertEquals("customer", customer.getObject());
        assertEquals(request, customer);
    }

    @Test
    void update() {

        AsaasCustomer request = Objects.requireNonNull(asaasCustomerService.list(AsaasCustomerListQuery.builder().build()).block()).getData().get(0);
        request.setName("Teste Update");

        AsaasCustomerUpdateRequest updateRequest = AsaasCustomerUpdateRequest.builder()
                .name("Teste Update")
                .build();

        AsaasCustomer customer = asaasCustomerService.update(request.getId(), updateRequest).block();

        assertNotNull(customer);
        assertEquals("customer", customer.getObject());
        assertEquals(request, customer);

    }

    @Test
    void remove() {
        AsaasCustomer request = Objects.requireNonNull(asaasCustomerService.list(AsaasCustomerListQuery.builder().build()).block()).getData().get(0);

        AsaasRemoveResponse response = asaasCustomerService.remove(request.getId()).block();

        assertNotNull(response);
        assertEquals(true, response.getDeleted());
        assertEquals(request.getId(), response.getId());
    }

    @Test
    void restore() {
        AsaasCustomer request = Objects.requireNonNull(asaasCustomerService.list(AsaasCustomerListQuery.builder().build()).block()).getData().get(0);

        AsaasCustomer response = asaasCustomerService.restore(request.getId()).block();

        assertNotNull(response);
        assertEquals(request, response);
    }

    @Test
    void retrieveNotifications() {
        AsaasCustomer request = Objects.requireNonNull(asaasCustomerService.list(AsaasCustomerListQuery.builder().build()).block()).getData().get(0);

        AsaasCustomerNotifications response = asaasCustomerService.retrieveNotifications(request.getId()).block();

        assertNotNull(response);
        assertNotNull(response.getData());
        assertFalse(response.getData().isEmpty());
        assertEquals("notification", response.getData().get(0).getObject());
    }
}