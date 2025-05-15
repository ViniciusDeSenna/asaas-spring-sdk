package com.senna.asaas_spring_sdk;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;

@Getter
public class AsaasException extends RuntimeException {
    private final int statusCode;
    private final String responseBody;

    public AsaasException(String message, int statusCode, String responseBody) {
        super(message + extractDescription(responseBody));
        this.statusCode = statusCode;
        this.responseBody = responseBody;
    }

    private static String extractDescription(String responseBody) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(responseBody);
            return " " + root.path("errors").get(0).path("description").asText();
        } catch (Exception e) {
            return "";
        }
    }
}
