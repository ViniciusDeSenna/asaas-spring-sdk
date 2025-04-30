package com.senna.asaas_spring_sdk.payment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Informações sobre visualização da cobrança | Payment viewing information
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasPaymentViewingInformation {
    /**
     * Data e hora da visualização da fatura | Invoice viewing date and time
     */
    String invoiceViewedDate;

    /**
     * Data e hora da visualização do boleto | Bill viewing date and time
     */
    String boletoViewedDate;
}
