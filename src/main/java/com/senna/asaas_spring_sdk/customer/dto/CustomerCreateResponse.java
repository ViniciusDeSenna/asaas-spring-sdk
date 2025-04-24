package com.senna.asaas_spring_sdk.customer.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class CustomerCreateResponse {
    private String object;
    private String id;
    private LocalDate dateCreated;
    private String name;
    private String email;
    private String company;
    private String phone;
    private String mobilePhone;
    private String address;
    private String addressNumber;
    private String complement;
    private String province;
    private String city;
    private String cityName;
    private String state;
    private String country;
    private String postalCode;
    private String cpfCnpj;
    private String personType;
    private Boolean deleted;
    private String additionalEmails;
    private String externalReference;
    private Boolean notificationDisabled;
    private String observations;
    private Boolean foreignCustomer;
    private String municipalInscription;
    private String stateInscription;
    private Boolean canDelete;
    private String cannotBeDeletedReason;
    private Boolean canEdit;
    private String cannotEditReason;
    private List<Group> groups;

    @Data
    public static class Group {
        private String name;
    }
}
