package com.senna.asaas_spring_sdk.payment.dto;

import com.senna.asaas_spring_sdk.credit_card.dto.CreditCardRequest;
import com.senna.asaas_spring_sdk.credit_card.dto.CreditCardHolderInfo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public record PaymentCreateRequest(

   @NotBlank(message = "Customer is required")
   String customer,

   @NotBlank(message = "Billing type is required")
   String billingType,

   @NotNull(message = "Value is required")
   BigDecimal value,

   @NotNull(message = "Due date is required")
   LocalDate dueDate,

   String description,

   Integer daysAfterDueDateToRegistrationCancellation,

   String externalReference,

   Integer installmentCount,

   BigDecimal totalValue,

   BigDecimal installmentValue,

   PaymentDiscount discount,

   PaymentInterest interest,

   PaymentFine fine,

   Boolean postalService,

   List<PaymentSplit> split,

   PaymentCallback callback,

   CreditCardRequest creditCard,

   CreditCardHolderInfo creditCardHolderInfo,

   String creditCardToken,

   Boolean authorizeOnly,

   @NotBlank(message = "Remote ip is required")
   String remoteIp

) {}