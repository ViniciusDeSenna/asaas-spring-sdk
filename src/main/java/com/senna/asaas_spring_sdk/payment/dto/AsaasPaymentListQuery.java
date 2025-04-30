package com.senna.asaas_spring_sdk.payment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.senna.asaas_spring_sdk.payment.enums.AsaasInvoiceStatus;
import lombok.Data;

/**
 * Classe de filtro para listar as cobranças | Filter class to list payments
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasPaymentListQuery {

    /**
     * Filtrar pelo Identificador único do parcelamento | Filter by unique installment identifier
     */
    String installment;

    /**
     * Elemento inicial da lista | List starting element
     */
    Integer offset;

    /**
     * Número de elementos da lista (max: 100) | Number of list elements (max: 100)
     */
    Integer limit;

    /**
     * Filtrar pelo Identificador único do cliente | Filter by unique customer identifier
     */
    String customer;

    /**
     * Filtrar pelo nome do grupo de cliente | Filter by customer group name
     */
    String customerGroupName;

    /**
     * Filtrar por forma de pagamento | Filter by billing type
     */
    String billingType;

    /**
     * Filtrar por status | Filter by status
     */
    String status;

    /**
     * Filtrar pelo Identificador único da assinatura | Filter by unique subscription identifier
     */
    String subscription;

    /**
     * Filtrar pelo Identificador do seu sistema | Filter by your system identifier
     */
    String externalReference;

    /**
     * Filtrar pela data de pagamento | Filter by payment date
     */
    String paymentDate;

    /**
     * Filtro para retornar cobranças que possuem ou não nota fiscal | Filter to return charges that have or do not have an invoice
     */
    AsaasInvoiceStatus invoiceStatus;

    /**
     * Filtrar pela data estimada de crédito | Filter by estimated credit date
     */
    String estimatedCreditDate;

    /**
     * Filtrar recebimentos originados de um QrCode estático utilizando o id gerado na hora da criação do QrCode | Filter receipts originating from a static QrCode using the id generated when the QrCode was created
     */
    String pixQrCodeId;

    /**
     * Filtrar registros antecipados ou não | Filter anticipated charges or not
     */
    Boolean anticipated;

    /**
     * Filtrar registros antecipaveis ou não | Filter anticipable charges or not
     */
    Boolean anticipable;

    /**
     * Filtrar a partir da data de criação inicial | Filter from initial creation date
     */
    String dateCreatedGE;

    /**
     * Filtrar até a data de criação final | Filter to final creation date
     */
    String dateCreatedLE;

    /**
     * Filtrar a partir da data de recebimento inicial | Filter from initial payment date
     */
    String paymentDateGE;

    /**
     * Filtrar até a data de recebimento final | Filter to final payment date
     */
    String paymentDateLE;

    /**
     * Filtrar a partir da data estimada de crédito inicial | Filter from estimated initial credit date
     */
    String estimatedCreditDateGE;

    /**
     * Filtrar até a data estimada de crédito final | Filter to estimated end credit date
     */
    String estimatedCreditDateLE;

    /**
     * Filtrar a partir da data de vencimento inicial | Filter from initial due date
     */
    String dueDateGE;

    /**
     * Filtrar até a data de vencimento final | Filter by final due date
     */
    String dueDateLE;

    /**
     * Filtrar pelo endereço de e-mail do usuário que criou a cobrança | Filter by the email address of the user who created the payment.
     */
    String user;
}
