package com.senna.asaas_spring_sdk.payment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Dados do pagamento relacionados a boleto | Payment data related to bank slip
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasPaymentBankSlipSummary {
    /**
     * Linha digitável do boleto | Digitable bill line
     */
    String identificationField;

    /**
     * Número de identificação do boleto | Unique identification of the bank slip
     */
    String nossoNumero;

    /**
     * Código de barras do boleto | Bank slip bar code
     */
    String barCode;

    /**
     * URL para download do boleto | URL to download the bank slip
     */
    String bankSlipUrl;

    /**
     * Dias após o vencimento para cancelamento do registro (somente para boleto bancário) | Days after registration cancellation deadline (only for bank slip)
     */
    Integer daysAfterDueDateToRegistrationCancellation;
}
