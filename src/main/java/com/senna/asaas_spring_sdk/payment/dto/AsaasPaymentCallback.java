package com.senna.asaas_spring_sdk.payment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * Informações de redirecionamento automático após pagamento do link de pagamento | Automatic redirection information after the payment of the link payment
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasPaymentCallback {
        /**
         * URL que o cliente será redirecionado após o pagamento com sucesso da fatura ou link de pagamento | URL that the customer will be redirected to after successful payment of the invoice or payment link
         */
        String successUrl;

        /**
         * Definir se o cliente será redirecionado automaticamente ou será apenas informado com um botão para retornar ao site. O padrão é true, caso queira desativar informar false | Define whether the customer will be automatically redirected or will just be informed with a button to return to the website. The default is true, if you want to disable it, enter false
         */
        Boolean autoRedirect;
}