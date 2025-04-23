package com.senna.asaas_spring_sdk.customer.dto;

import java.time.LocalDate;

public record CustomerCreateResponse(
        String id,
        LocalDate dateCreated,
        String name,
        String email,
        String phone,
        String mobilePhone,
        String address,
        String addressNumber,
        String complement,
        String province,
        String city,
        String cityName,
        String state,
        String country,
        String postalCode,
        String cpfCnpj,
        String personType,
        boolean deleted,
        String additionalEmails,
        String externalReference,
        boolean notificationDisabled,
        String observations,
        boolean foreignCustomer
) {}
