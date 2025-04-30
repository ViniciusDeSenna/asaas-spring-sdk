package com.senna.asaas_spring_sdk.payment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Dados do pagamento relacionados a Pix | Payment data related to pix
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasPaymentPixSummary {
    /**
     * Imagem do QrCode em base64 | QrCode image in base64
     */
    String encodedImage;

    /**
     * Copia e Cola do QrCode | Copy and Paste of the Pix QrCode
     */
    String payload;

    /**
     * Data de expiração do QrCode | QrCode expiration date
     */
    String expirationDate;
}
