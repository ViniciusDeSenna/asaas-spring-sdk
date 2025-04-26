package com.senna.asaas_spring_sdk.exceptions;

import lombok.Data;

@Data
public class AsaasApiResponse<T> {

    private int status;
    private String message;
    private T data;

    public AsaasApiResponse() {
    }

    public AsaasApiResponse(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public static <T> AsaasApiResponse<T> success(T data) {
        return new AsaasApiResponse<>(200, "Success", data);
    }

    public static <T> AsaasApiResponse<T> error(int status, String message) {
        return new AsaasApiResponse<>(status, message, null);
    }
}
