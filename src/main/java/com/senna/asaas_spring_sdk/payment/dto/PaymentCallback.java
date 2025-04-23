package com.senna.asaas_spring_sdk.payment.dto;

import jakarta.validation.constraints.NotBlank;

public record PaymentCallback(
        @NotBlank(message = "Success url is required")
        String successUrl,

        Boolean autoRedirect
) {}