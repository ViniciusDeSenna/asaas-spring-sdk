package com.senna.asaas_spring_sdk.customer.dto;

import lombok.Data;

import java.util.List;

@Data
public class AsaasCustomerNotifications {
    String object;
    Boolean hasMore;
    Integer totalCount;
    Integer limit;
    Integer offset;
    List<AsaasCustomerNotification> data;
}
