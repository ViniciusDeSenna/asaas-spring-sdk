package com.senna.asaas_spring_sdk.payment.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class PaymentCallback {

        @NotBlank(message = "Success url is required")
        String successUrl;

        Boolean autoRedirect;
}