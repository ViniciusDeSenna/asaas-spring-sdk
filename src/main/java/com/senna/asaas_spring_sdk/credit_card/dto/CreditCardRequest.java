package com.senna.asaas_spring_sdk.credit_card.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreditCardRequest {

        @NotBlank(message = "Holder name is required")
        String holderName;

        @NotBlank(message = "Number is required")
        String number;

        @NotBlank(message = "Expiry month is required")
        String expiryMonth;

        @NotBlank(message = "Expiry Year is required")
        String expiryYear;

        @NotBlank(message = "CCV is required")
        String ccv;
}
