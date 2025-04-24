package com.senna.asaas_spring_sdk.customer.dto;

import lombok.Data;

import java.util.List;

@Data
public class CustomerList {
    String object;
    Boolean hasMore;
    Integer totalCount;
    Integer limit;
    Integer offset;
    List<Customer> data;
}
