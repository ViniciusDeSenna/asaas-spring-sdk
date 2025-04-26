package com.senna.asaas_spring_sdk;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class AsaasErrorResponse {
    @JsonProperty("errors")
    private List<Error> errors;

    @Data
    public static class Error {
        @JsonProperty("code")
        private String code;

        @JsonProperty("description")
        private String description;
    }
}
