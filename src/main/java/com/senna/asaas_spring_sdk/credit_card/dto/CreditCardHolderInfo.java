package com.senna.asaas_spring_sdk.credit_card.dto;

import jakarta.validation.constraints.NotBlank;

public record CreditCardHolderInfo(

        @NotBlank(message = "Holder name is required")
        String name,

        @NotBlank(message = "Holder email is required")
        String email,

        @NotBlank(message = "Holder cpf/cnpj is required")
        String cpfCnpj,

        @NotBlank(message = "Holder postal code is required")
        String postalCode,

        @NotBlank(message = "Holder address number is required")
        String addressNumber,

        @NotBlank(message = "Holder address complement is required")
        String addressComplement,

        @NotBlank(message = "Holder phone is required")
        String phone
) {}