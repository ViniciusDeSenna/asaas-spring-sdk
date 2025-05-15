package com.senna.asaas_spring_sdk.customer.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasCustomerUpdateRequest {
    /**
     * Nome do cliente | Customer name
     */
    String name;

    /**
     * CPF ou CNPJ do cliente | Customer CPF or CNPJ
     */
    String cpfCnpj;

    /**
     * Email do cliente | Customer email
     */
    String email;

    /**
     * Telefone do cliente | Landline
     */
    String phone;

    /**
     * Celular do cliente | Customer cell phone
     */
    String mobilePhone;

    /**
     * Endereço do cliente | Customer address
     */
    String address;

    /**
     * Número do endereço do cliente | Customer address number
     */
    String addressNumber;

    /**
     * Complemento do endereço do cliente | Customer address complement
     */
    String complement;

    /**
     * Bairro do endereço do cliente | Customer address neighborhood
     */
    String province;

    /**
     * Identificador único da cidade no Asaas | Address zip code
     */
    String postalCode;

    /**
     * Referência externa do cliente | External customer reference
     */
    String externalReference;

    /**
     * Indica se as notificações estão desabilitadas | Indicates whether notifications are disabled
     */
    Boolean notificationDisabled;

    /**
     * E-mails adicionais do cliente | Additional customer emails
     */
    String additionalEmails;

    /**
     * Inscrição municipal do cliente | Customer municipal registration
     */
    String municipalInscription;

    /**
     * Inscrição estadual do cliente | Customer state registration
     */
    String stateInscription;

    /**
     * Observações do cliente | Customer Observations
     */
    String observations;

    /**
     * Nome do grupo ao qual o cliente pertence | Name of the group the customer belongs to
     */
    String groupName;

    /**
     * Empresa | Company
     */
    String company;

    /**
     * Indica se o pagador é estrangeiro | Indicates if it's non-brazilian customer
     */
    Boolean foreignCustomer;
}
