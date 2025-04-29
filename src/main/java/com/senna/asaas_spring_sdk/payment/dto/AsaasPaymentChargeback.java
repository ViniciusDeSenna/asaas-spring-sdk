package com.senna.asaas_spring_sdk.payment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.senna.asaas_spring_sdk.credit_card.dto.AsaasCreditCardSummary;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasPaymentChargeback {
    /**
     * Identificador único do chargeback. | Unique chargeback identifier.
     */
    String id;

    /**
     * Identificador único da cobrança no Asaas | Unique payment identifier in Asaas
     */
    String payment;

    /**
     * Identificador único do parcelamento no Asaas | Unique installment identifier in Asaas
     */
    String installment;

    /**
     * Identificador único do cliente ao qual o chargeback está vinculado. | Unique identifier of customer to which the chargeback is linked.
     */
    String customerAccount;

    /**
     * Status do chargeback | Chargeback status - (REQUESTED, IN_DISPUTE, DISPUTE_LOST, REVERSED DONE)
     */
    String status;

    /**
     * Razão do chargeback | Chargeback reason - (ABSENCE_OF_PRINT, ABSENT_CARD_FRAUD, CARD_ACTIVATED_PHONE_TRANSACTION, CARD_FRAUD, CARD_RECOVERY_BULLETIN, COMMERCIAL_DISAGREEMENT, COPY_NOT_RECEIVED, CREDIT_OR_DEBIT_PRESENTATION_ERROR, DIFFERENT_PAY_METHOD, FRAUD, INCORRECT_TRANSACTION_VALUE, INVALID_CURRENCY, INVALID_DATA, LATE_PRESENTATION, LOCAL_REGULATORY_OR_LEGAL_DISPUTE, MULTIPLE_ROCS, ORIGINAL_CREDIT_TRANSACTION_NOT_ACCEPTED, OTHER_ABSENT_CARD_FRAUD, PROCESS_ERROR, RECEIVED_COPY_ILLEGIBLE_OR_INCOMPLETE, RECURRENCE_CANCELED, REQUIRED_AUTHORIZATION_NOT_GRANTED, RIGHT_OF_FULL_RECOURSE_FOR_FRAUD, SALE_CANCELED, SERVICE_DISAGREEMENT_OR_DEFECTIVE_PRODUCT, SERVICE_NOT_RECEIVED, SPLIT_SALE, TRANSFERS_OF_DIVERSE_RESPONSIBILITIES, UNQUALIFIED_CAR_RENTAL_DEBIT, USA_CARDHOLDER_DISPUTE, VISA_FRAUD_MONITORING_PROGRAM, WARNING_BULLETIN_FILE)
     */
    String reason;

    /**
     * Data de abertura do chargeback. | Chargeback opening date.
     */
    String disputeStartDate;

    /**
     * Valor do chargeback. | Chargeback value.
     */
    BigDecimal value;

    /**
     * Data de liquidação da cobrança no Asaas | Payment date on Asaas
     */
    String paymentDate;

    /**
     * Informações do cartão de crédito | Credit card information
     */
    AsaasCreditCardSummary creditCard;

    /**
     * Status da disputa do chargeback. | Chargeback dispute status. - (REQUESTED, ACCEPTED, REJECTED)
     */
    String disputeStatus;

    /**
     * Data limite para envio de documentos de disputa. | Deadline to send dispute documents.
     */
    String deadlineToSendDisputeDocuments;
}