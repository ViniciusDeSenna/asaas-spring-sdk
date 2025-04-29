package com.senna.asaas_spring_sdk.payment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.senna.asaas_spring_sdk.credit_card.dto.AsaasCreditCard;
import com.senna.asaas_spring_sdk.credit_card.dto.AsaasCreditCardHolderInfo;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * Requisição para criar uma cobrança | Request to create a payment
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasPaymentCreateRequest {

   /**
    * Identificador único do cliente no Asaas | Unique customer identifier in Asaas
    */
   String customer;

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
    * Número de parcelas (somente no caso de cobrança parcelada) | Number of installments (only in the case of installment payment)
    */
   Integer installmentCount;

   /**
    * Informe o valor total de uma cobrança que será parcelada (somente no caso de cobrança parcelada). Caso enviado este campo o installmentValue não é necessário, o cálculo por parcela será automático. | Enter the total amount of a charge that will be paid in installments (only in the case of an installment charge). If this field is sent, the installmentValue is not necessary, the calculation per installment will be automatic.
    */
   BigDecimal totalValue;

   /**
    * Valor de cada parcela (somente no caso de cobrança parcelada). Envie este campo em caso de querer definir o valor de cada parcela. | Value of each installment (only in the case of installment payment). Send this field if you want to define the value of each installment.
    */
   BigDecimal installmentValue;

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

   /**
    * Informações do cartão de crédito | Credit card information
    */
   AsaasCreditCard creditCard;

   /**
    * Informações do titular do cartão de crédito | Credit card holder information
    */
   AsaasCreditCardHolderInfo creditCardHolderInfo;

   /**
    * Token do cartão de crédito para uso da funcionalidade de tokenização de cartão de crédito | Credit card token for using the credit card tokenization functionality
    */
   String creditCardToken;

   /**
    * Realizar apenas a Pré-Autorização da cobrança | Carry out only the Pre-Authorization of the payment
    */
   Boolean authorizeOnly;

   /**
    * IP de onde o cliente está fazendo a compra. Não deve ser informado o IP do seu servidor. | IP from where the customer is making the purchase. Your server's IP must not be entered.
    */
   String remoteIp;
}