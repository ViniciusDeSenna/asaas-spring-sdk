package com.senna.asaas_spring_sdk.exceptions;

import lombok.Getter;

@Getter
public class AsaasApiException extends RuntimeException {
    public AsaasApiException(String body) {
        super(body);
    }
}


