package com.senna.asaas_spring_sdk.customer.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Notifications from a customer
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasCustomerNotification {
    /**
     * Tipo de objeto | Object type
     */
    String object;

    /**
     * Identificador único de notificação | Unique notification identifier
     */
    String id;

    /**
     * Identificador único do cliente | Unique customer identifier
     */
    String customer;

    /**
     * Indica se a notificação está habilitada | Indicates whether notification is enabled
     */
    Boolean enabled;

    /**
     * Indica se o e-mail enviado a você está habilitado ou desabilitado | Indicates whether the email sent to you is enabled or disabled
     */
    Boolean emailEnabledForProvider;

    /**
     * Indica se o SMS enviado a você está habilitado ou desabilitado | Indicates whether the SMS sent to you is enabled or disabled
     */
    Boolean smsEnabledForProvider;

    /**
     * Indica se o e-mail enviado ao cliente está habilitado ou desabilitado | Indicates whether the email sent to the customer is enabled or disabled
     */
    Boolean emailEnabledForCustomer;

    /**
     * Indica se o SMS enviado ao cliente está habilitado ou desabilitado | Indicates whether the SMS sent to the customer is enabled or disabled
     */
    Boolean smsEnabledForCustomer;

    /**
     * Indica se a notificação de voz ao cliente está habilitada ou desabilitada | Indicates whether voice notification to the customer is enabled or disabled
     */
    Boolean phoneCallEnabledForCustomer;

    /**
     * Indica se a notificação do WhatsApp enviada ao cliente está habilitada ou desabilitada | Indicates whether the WhatsApp notification sent to the customer is enabled or disabled
     */
    Boolean whatsappEnabledForCustomer;

    /**
     * Tipo de evento | Kind of event - (PAYMENT_CREATED, PAYMENT_UPDATED, PAYMENT_RECEIVED, PAYMENT_OVERDUE, PAYMENT_DUEDATE_WARNING, SEND_LINHA_DIGITAVEL)
     */
    String event;

    /**
     * Especifica quantos dias antes da data de vencimento a notificação deve ser enviada. Válido apenas para os eventos PAYMENT_DUEDATE_WARNING e PAYMENT_OVERDUE. | Specifies how many days before the due date the notification must be sent. Valid only for the PAYMENT_DUEDATE_WARNING and PAYMENT_OVERDUE events
     */
    Integer scheduleOffset;

    /**
     * Indica se a notificação foi excluída | Indicates whether the notification was deleted
     */
    Boolean deleted;
}