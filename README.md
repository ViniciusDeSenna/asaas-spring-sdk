# asaas-spring-sdk

[PT-BR]

Um SDK Java leve e fácil de usar para integração com a API Asaas usando o Spring Boot. Este SDK abstrai operações comuns como gerenciamento de clientes, faturamento e assinaturas, facilitando a integração do Asaas em seus aplicativos Java ou Spring.

[EN]

A lightweight and easy-to-use Java SDK for integrating with the Asaas API using Spring Boot.  This SDK abstracts common operations like customer management, billing, and subscriptions, making it easier to integrate Asaas into your Java or Spring-based applications.

---

## Rotas implementadas | Implemented routes:

### Cobranças | Payments
| Status | PT-BR | EN |
|--------|-------|----|
|✅| Criar nova cobrança | Create new payment
|✅| Listar cobranças    | List payments
|✅| Criar cobrança com cartão de crédito | Create new payment with credit card
|✅| Capturar cobrança com Pré-Autorização | Capture payment with Pre-Authorization
|✅| Pagar uma cobrança com cartão de crédito | Pay a charge with a credit card
|✅| Recuperar informações de pagamento de uma cobrança | Retrieve payment billing information
|✅| Informações sobre visualização da cobrança | Payment viewing information
|✅| Recuperar uma única cobrança | Retrieve a single payment
|✅| Atualizar cobrança existente | Update existing payment
|✅| Excluir cobrança | Delete payment
|✅| Restaurar cobrança removida | Restore removed payment
|✅| Recuperar status de uma cobrança | Retrieve status of a payment
|✅| Reembolsar cobrança | Refund payment
|✅| Obter linha digitável do boleto | Get digitable bill line
|✅| Obter QR Code para pagamentos via Pix | Get QR Code for Pix payments
|✅| Confirmar recebimento em dinheiro | Confirm cash receipt
|✅| Desfazer confirmação de recebimento em dinheiro | Undo cash receipt confirmation
|✅| Simulador de vendas | Sales simulator
|✅| Recuperar garantia da cobrança na Conta Escrow | Retrieve payment escrow in the Escrow Account
|✅| Recuperando limites de cobranças | Recovering payment limits


### Cartão de Crédito | Credit Card
| Status | PT-BR | EN |
|--------|-------|----|
|✅| Tokenização de cartão de crédito | Credit card tokenization

### Clientes | Customers
| Status | PT-BR | EN |
|--------|-------|----|
|✅| Criar novo cliente | Create new customer
|✅| Listar clientes | List customers
|✅| Recuperar um único cliente | Retrieve a single customer
|✅| Atualizar cliente existente | Update existing customer
|✅| Remover cliente | Remove Customer
|✅| Restaurar cliente removido | Restore removed customer
|✅| Recuperar notificações de um cliente | Retrieve notifications from a customer
