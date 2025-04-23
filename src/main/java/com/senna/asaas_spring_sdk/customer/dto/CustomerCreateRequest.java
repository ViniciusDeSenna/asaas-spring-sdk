package com.senna.asaas_spring_sdk.customer.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CustomerCreateRequest(

        @NotBlank(message = "Client name is required")
        String name,

        @NotBlank(message = "Customer CPF or CNPJ is required")
        String cpfCnpj,

        @Email(message = "Invalid email format")
        String email,

        String phone,

        String mobilePhone,

        String address,

        String addressNumber,

        @Size(max = 255, message = "Address complement must be at most 255 characters")
        String complement,

        String province,

        String postalCode,

        String externalReference,

        Boolean notificationDisabled,

        String additionalEmails,

        String municipalInscription,

        String stateInscription,

        String observations,

        String groupName,

        String company,

        Boolean foreignCustomer
) {}
