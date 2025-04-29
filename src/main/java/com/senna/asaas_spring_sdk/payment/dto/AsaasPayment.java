package com.senna.asaas_spring_sdk.payment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.senna.asaas_spring_sdk.credit_card.dto.AsaasCreditCardSummary;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * Objeto genérico para cobranças | Generic object for payments
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsaasPayment {
    /**
     * Tipo do objeto | Object type
     */
    String object;

    /**
     * Identificador único da cobrança no Asaas | Unique payment identifier in Asaas
     */
    String id;

    /**
     * Data de criação da cobrança | Payment creation date
     */
    LocalDate dateCreated;

    /**
     * Identificador único do cliente ao qual a cobrança pertence | Unique identifier of the customer to whom the payment belongs
     */
    String customer;

    /**
     * Identificador único da assinatura (quando cobrança recorrente) | Unique subscription identifier (when recurring billing)
     */
    String subscription;

    /**
     * Identificador único do parcelamento (quando cobrança parcelada) | Unique installment identifier (when billing in installments)
     */
    String installment;

    /**
     * Identificador único do link de pagamentos ao qual a cobrança pertence | Unique identifier of the payments link to which the payment belongs
     */
    String paymentLink;

    /**
     * Valor da cobrança | Payment amount
     */
    BigDecimal value;

    /**
     * Valor líquido da cobrança após desconto da tarifa do Asaas | Net value of the charge after discounting the Asaas fee
     */
    BigDecimal netValue;

    /**
     * Valor original da cobrança (preenchido quando paga com juros e multa) | Original amount of charge (filled when paid with interest and fine)
     */
    BigDecimal originalValue;

    /**
     * Valor calculado de juros e multa que deve ser pago após o vencimento da cobrança | Calculated amount of interest and fine that must be paid after the charge is due
     */
    BigDecimal interestValue;

    /**
     * Descrição da cobrança | Description of the payment
     */
    String description;

    /**
     * Forma de pagamento | Payment billing type - (UNDEFINED, BOLETO, CREDIT_CARD, DEBIT_CARD, TRANSFER, DEPOSIT, PIX)
     */
    String billingType;

    /**
     * Informações do cartão de crédito | Credit card information
     */
    AsaasCreditCardSummary creditCard;

    /**
     * Informa se a cobrança pode ser paga após o vencimento (Somente para boleto) | Informs whether the charge can be paid after the due date (Only for bank slip)
     */
    Boolean canBePaidAfterDueDate;

    /**
     * Identificador único da transação Pix à qual a cobrança pertence | Unique identifier of the Pix transaction to which the payment belongs
     */
    String pixTransaction;

    /**
     * Identificador único do QrCode estático gerado para determinada chave Pix | Unique identifier of the static QrCode generated for a given Pix key
     */
    String pixQrCodeId;

    /**
     * Status da cobrança | Payment status - (PENDING, RECEIVED, CONFIRMED, OVERDUE, REFUNDED, RECEIVED_IN_CASH, REFUND_REQUESTED, REFUND_IN_PROGRESS, CHARGEBACK_REQUESTED, CHARGEBACK_DISPUTE, AWAITING_CHARGEBACK_REVERSAL, DUNNING_REQUESTED, DUNNING_RECEIVED, AWAITING_RISK_ANALYSIS)
     */
    String status;

    /**
     * Data de vencimento da cobrança | Payment due date
     */
    LocalDate dueDate;

    /**
     * Vencimento original no ato da criação da cobrança | Original due date upon creation of the payment
     */
    LocalDate originalDueDate;

    /**
     * Data de liquidação da cobrança no Asaas | Payment date on Asaas
     */
    LocalDate paymentDate;

    /**
     * Data em que o cliente efetuou o pagamento do boleto | Date on which the customer paid the bank slip
     */
    LocalDate clientPaymentDate;

    /**
     * Número da parcela | Parcel number
     */
    Integer installmentNumber;

    /**
     * URL da fatura | Invoice URL
     */
    String invoiceUrl;

    /**
     * Número da fatura | Bill number
     */
    String invoiceNumber;

    /**
     * Campo livre para busca | Free search field
     */
    String externalReference;

    /**
     * Determina se a cobrança foi removida | Determines if the payment has been removed
     */
    Boolean deleted;

    /**
     * Define se a cobrança foi antecipada ou está em processo de antecipação | Defines whether the charge was anticipated or is in the process of being anticipated
     */
    Boolean anticipated;

    /**
     * Determina se a cobrança é antecipável | Determines whether the charge is anticipated
     */
    Boolean anticipable;

    /**
     * Indica a data que o crédito ficou disponível | Date when the credit became available
     */
    LocalDate creditDate;

    /**
     * Data estimada de quando o crédito ficará disponível | Estimated date when the credit will be available
     */
    LocalDate estimatedCreditDate;

    /**
     * URL do comprovante de confirmação, recebimento, estorno ou remoção. | URL of proof of confirmation, receipt, reversal or removal
     */
    String transactionReceiptUrl;

    /**
     * Identificação única do boleto | Unique identification of the bank slip
     */
    String nossoNumero;

    /**
     * URL para download do boleto | URL to download the bank slip
     */
    String bankSlipUrl;

    /**
     * Informações de desconto | Discount information
     */
    AsaasPaymentDiscount discount;

    /**
     * Informações de multa para pagamento após o vencimento | Fine information for payment after due date
     */
    AsaasPaymentFine fine;

    /**
     * Informações de juros para pagamento após o vencimento | Interest information for payment after due date
     */
    AsaasPaymentInterest interest;

    /**
     * Configurações do split | Split Settings
     */
    List<AsaasPaymentSplit> split;

    /**
     * Define se a cobrança será enviada via Correios | Define whether the payment will be sent via post
     */
    Boolean postalService;

    /**
     * Dias após o vencimento para cancelamento do registro (somente para boleto bancário) | Days after registration cancellation deadline (only for bank slip)
     */
    Integer daysAfterDueDateToRegistrationCancellation;

    /**
     *
     */
    AsaasPaymentChargeback chargeback;

    /**
     * Informações de garantia da cobrança na Conta Escrow | Payment escrow in the Escrow Account information
     */
    AsaasPaymentEscrow escrow;

    /**
     * Informações de estorno | Refunds information
     */
    List<AsaasPaymentRefund> refunds;
}