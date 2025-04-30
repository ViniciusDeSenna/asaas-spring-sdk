package com.senna.asaas_spring_sdk.payment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * Requisição para atualizar uma cobrança | Request to update a payment
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasPaymentUpdateRequest {

    /**
     * Forma de pagamento | Payment billing type
     */
    String billingType;

    /**
     * Valor da cobrança | Payment amount
     */
    BigDecimal value;

    /**
     * Data de vencimento da cobrança | Payment due date
     */
    String dueDate;

    /**
     * Descrição da cobrança | Payment description - (máx. 500)
     */
    String description;

    /**
     * Dias após o vencimento para cancelamento do registro (somente para boleto bancário) | Days after registration cancellation deadline (only for bank slip)
     */
    Integer daysAfterDueDateToRegistrationCancellation;

    /**
     * Campo livre para busca | Free search field
     */
    String externalReference;

    /**
     * Informações de desconto | Discount information
     */
    AsaasPaymentDiscount discount;

    /**
     * Informações de juros para pagamento após o vencimento | Interest information for payment after due date
     */
    AsaasPaymentInterest interest;

    /**
     * Informações de multa para pagamento após o vencimento | Fine information for payment after due date
     */
    AsaasPaymentFine fine;

    /**
     * Define se a cobrança será enviada via Correios | Define whether the payment will be sent via post
     */
    Boolean postalService;

    /**
     * Configurações do split | Split Settings
     */
    List<AsaasPaymentSplit> split;

    /**
     * Informações de redirecionamento automático após pagamento do link de pagamento | Automatic redirection information after the payment of the link payment
     */
    AsaasPaymentCallback callback;
}
