package com.senna.asaas_spring_sdk.exceptions;

import lombok.Getter;

@Getter
public class AsaasException extends RuntimeException {
    private final int statusCode;
    private final String responseBody;

    public AsaasException(String message, int statusCode, String responseBody) {
        super(message);
        this.statusCode = statusCode;
        this.responseBody = responseBody;
    }
}
