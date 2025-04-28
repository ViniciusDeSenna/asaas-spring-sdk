package com.senna.asaas_spring_sdk.credit_card.dto;

import lombok.Data;

@Data
public class AsaasCreditCardHolderInfo {
        String name;
        String email;
        String cpfCnpj;
        String postalCode;
        String addressNumber;
        String addressComplement;
        String phone;
}