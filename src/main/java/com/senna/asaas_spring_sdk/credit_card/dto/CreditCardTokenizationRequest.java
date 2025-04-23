package com.senna.asaas_spring_sdk.credit_card.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreditCardTokenizationRequest(

        @NotBlank(message = "Customer is required")
        String customer,

        @NotNull(message = "Credit Card is required")
        CreditCardRequest creditCard,

        @NotNull(message = "Credit card holder info is required")
        CreditCardHolderInfo creditCardHolderInfo,

        @NotBlank(message = "Remote Ip is required")
        String remoteIp
) {}