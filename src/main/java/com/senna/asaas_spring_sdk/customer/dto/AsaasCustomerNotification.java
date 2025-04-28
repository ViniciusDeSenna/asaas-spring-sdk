package com.senna.asaas_spring_sdk.customer.dto;

import lombok.Data;

@Data
public class AsaasCustomerNotification {
    String object;
    String id;
    String customer;
    Boolean enabled;
    Boolean emailEnabledForProvider;
    Boolean smsEnabledForProvider;
    Boolean emailEnabledForCustomer;
    Boolean smsEnabledForCustomer;
    Boolean phoneCallEnabledForCustomer;
    Boolean whatsappEnabledForCustomer;
    String event;
    Integer scheduleOffset;
    Boolean deleted;
}