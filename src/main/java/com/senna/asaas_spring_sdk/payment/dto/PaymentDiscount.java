package com.senna.asaas_spring_sdk.payment.dto;

import com.senna.asaas_spring_sdk.payment.enums.DiscountType;
import lombok.Data;


import java.math.BigDecimal;

@Data
public class PaymentDiscount {
    BigDecimal value;
    Integer dueDateLimitDays;
    DiscountType type;
}