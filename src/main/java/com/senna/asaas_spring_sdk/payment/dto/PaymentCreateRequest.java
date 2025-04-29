package com.senna.asaas_spring_sdk.payment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.senna.asaas_spring_sdk.credit_card.dto.AsaasCreditCard;
import com.senna.asaas_spring_sdk.credit_card.dto.AsaasCreditCardHolderInfo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentCreateRequest {

   @NotBlank(message = "Customer is required")
   String customer;

   @NotBlank(message = "Billing type is required")
   String billingType;

   @NotNull(message = "Value is required")
   BigDecimal value;

   @NotBlank(message = "Due date is required")
   String dueDate;

   String description;
   Integer daysAfterDueDateToRegistrationCancellation;
   String externalReference;
   Integer installmentCount;
   BigDecimal totalValue;
   BigDecimal installmentValue;
   PaymentDiscount discount;
   PaymentInterest interest;
   PaymentFine fine;
   Boolean postalService;
   List<PaymentSplit> split;
   PaymentCallback callback;
   AsaasCreditCard creditCard;
   AsaasCreditCardHolderInfo creditCardHolderInfo;
   String creditCardToken;
   Boolean authorizeOnly;

   @NotBlank(message = "Remote ip is required")
   String remoteIp;
}