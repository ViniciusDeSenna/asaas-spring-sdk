package com.senna.asaas_spring_sdk.customer.dto;

import lombok.Data;

import java.util.List;

/**
 * Classe genérica para clientes | Generic class for customers
 */
@Data
public class AsaasCustomer {
    /**
     * Tipo de objeto | Object type
     */
    String object;

    /**
     * Identificador único do cliente no Asaas | Unique customer identifier
     */
    String id;

    /**
     * Data de criação do cliente | Customer creation date
     */
    String dateCreated;

    /**
     * Nome do cliente | Client name
     */
    String name;

    /**
     * E-mail do cliente | Customer e-mail
     */
    String email;

    /**
     * Telefone do cliente | Customer phone
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
     * Identificador único da cidade no Asaas | Customer address neighborhood
     */
    String city;

    /**
     * Cidade do endereço do cliente | City of customer address
     */
    String cityName;

    /**
     * Estado do endereço do cliente | Customer address status
     */
    String state;

    /**
     * País do cliente | Customer country
     */
    String country;

    /**
     * CEP do endereço do cliente | Customer address zip code
     */
    String postalCode;

    /**
     * CPF ou CNPJ do cliente | Customer CPF or CNPJ
     */
    String cpfCnpj;

    /**
     * Tipo de pessoa | Kind of person - (JURIDICA, FISICA)
     */
    String personType;

    /**
     * Indica se é um cliente deletado | Indicates whether it is a deleted client
     */
    Boolean deleted;

    /**
     * E-mails adicionais do cliente | Additional customer emails
     */
    String additionalEmails;

    /**
     * Referência externa do cliente | External customer reference
     */
    String externalReference;

    /**
     * Indica se as notificações estão desabilitadas | Indicates whether notifications are disabled
     */
    Boolean notificationDisabled;

    /**
     * Observações do cliente | Customer Observations
     */
    String observations;

    /**
     * Indica se o pagador é estrangeiro | Indicates if it's non-brazilian customer
     */
    Boolean foreignCustomer;

    /**
     * Grupos ao qual o cliente pertence | Groups to which the client belongs
     */
    List<AsaasCustomerGroup> groups;
}
