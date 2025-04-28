package com.senna.asaas_spring_sdk.customer.dto;

import lombok.Data;

@Data
public class AsaasCustomerUpdateRequest {
    String name;
    String cpfCnpj;
    String email;
    String phone;
    String mobilePhone;
    String address;
    String addressNumber;
    String complement;
    String province;
    String postalCode;
    String externalReference;
    Boolean notificationDisabled;
    String additionalEmails;
    String municipalInscription;
    String stateInscription;
    String observations;
    String groupName;
    String company;
    Boolean foreignCustomer;
}
