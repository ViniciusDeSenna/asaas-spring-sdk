package com.senna.asaas_spring_sdk.customer.dto;

import lombok.Data;

@Data
public class AsaasCustomerListQuery {

    public AsaasCustomerListQuery(Integer offset, Integer limit) {
        this.offset = offset;
        this.limit = limit;
    }

    Integer offset;
    Integer limit;
    String name;
    String email;
    String cpfCnpj;
    String groupName;
    String externalReference;
}
