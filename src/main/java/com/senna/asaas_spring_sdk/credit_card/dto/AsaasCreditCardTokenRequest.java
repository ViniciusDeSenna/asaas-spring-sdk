package com.senna.asaas_spring_sdk.credit_card.dto;

import lombok.Data;

@Data
public class AsaasCreditCardTokenRequest {
        String customer;
        AsaasCreditCardRequest creditCard;
        AsaasCreditCardHolderInfo creditCardHolderInfo;
        String remoteIp;
}