package com.senna.asaas_spring_sdk.customer.dto;

import lombok.Data;

@Data
public class Customer {
    String object;
    String id;
    String dateCreated;
    String name;
    String email;
    String phone;
    String mobilePhone;
    String address;
    String addressNumber;
    String complement;
    String province;
    String city;
    String cityName;
    String state;
    String country;
    String postalCode;
    String cpfCnpj;
    String personType;
    Boolean deleted;
    String additionalEmails;
    String externalReference;
    Boolean notificationDisabled;
    String observations;
    Boolean foreignCustomer;
}
