package com.senna.asaas_spring_sdk.exceptions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.senna.asaas_spring_sdk.AsaasErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(AsaasApiException.class)
    public ResponseEntity<AsaasApiResponse> apiError(AsaasApiException e) {

        String errorMessage = e.getMessage();

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            AsaasErrorResponse errorMessageMap = objectMapper.readValue(errorMessage, AsaasErrorResponse.class);
            errorMessage = errorMessageMap.getErrors().get(0).getDescription();
        } catch (Exception ex) {
            //
        }

        AsaasApiResponse response = AsaasApiResponse.error(HttpStatus.NOT_FOUND.value(), e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }

}
