# asaas-spring-sdk
Um SDK Java leve e fácil de usar para integração com a API Asaas usando o Spring Boot. Este SDK abstrai operações comuns como gerenciamento de clientes, faturamento e assinaturas, facilitando a integração do Asaas em seus aplicativos Java com Spring.

![AsaasSpringSDK-Banner-min](https://github.com/user-attachments/assets/6887ca76-f431-4a16-8fcc-3fdd44977e62)

🔗 [Documentação oficial Asaas.](https://docs.asaas.com/)

## 🇧🇷 Rotas implementadas
### Cobranças
✅ Criar nova cobrança. \
✅ Listar cobranças. \
✅ Criar cobrança com cartão de crédito. \
✅ Capturar cobrança com Pré-Autorização. \
✅ Pagar uma cobrança com cartão de crédito. \
✅ Recuperar informações de pagamento de uma cobrança. \
✅ Informações sobre visualização da cobrança. \
✅ Recuperar uma única cobrança. \
✅ Atualizar cobrança existente. \
✅ Excluir cobrança. \
✅ Restaurar cobrança removida. \
✅ Recuperar status de uma cobrança. \
✅ Reembolsar cobrança. \
✅ Obter linha digitável do boleto. \
✅ Obter QR Code para pagamentos via Pix. \
✅ Confirmar recebimento em dinheiro. \
✅ Desfazer confirmação de recebimento em dinheiro. \
✅ Simulador de vendas. \
✅ Recuperar garantia da cobrança na Conta Escrow. \
✅ Recuperando limites de cobranças. 

### Cartão de Crédito
✅ Tokenização de cartão de crédito.

### Clientes
✅ Criar novo cliente. \
✅ Listar clientes. \
✅ Recuperar um único cliente. \
✅ Atualizar cliente existente. \
✅ Remover cliente. \
✅ Restaurar cliente removido. \
✅ Recuperar notificações de um cliente. 

---

## Como instalar

### Configurações
Primeiro você precisa ter um `settings.xml` com o conteudo abaixo no diretorio `~/.m2/settings.xml`. \
🔒 `USERNAME`: nome de usuário do GitHub. \
🔒 `GITHUB_TOKEN`: token pessoal de acesso (Personal Access Token com permissões de `read:packages`).
```xml
<servers>
    <server>
        <id>github</id>
        <username>USERNAME</username>
        <password>GITHUB_TOKEN</password>
    </server>
</servers>
```

### Repositórios
No seu arquivo `pom.xml` adicione os seguintes conteudos: \
🆚 `LAST_VERSION`: 🔗 [Consulte a ultima versão](https://github.com/ViniciusDeSenna/asaas-spring-sdk/packages/2488874)
```xml
<repositories>
    <repository>
        <id>github</id>
        <url>https://maven.pkg.github.com/ViniciusDeSenna/asaas-spring-sdk</url>
    </repository>
</repositories>

<dependencies>
  ...
  <dependency>
      <groupId>com.senna</groupId>
      <artifactId>asaas-spring-sdk</artifactId>
      <version>LAST_VERSION</version>
  </dependency>
</dependencies>
```

### Propriedades
No seu arquivo `application.properties` é importante que você tenha instanciado as seguintes propriedades: \
🔗 `URL` Url para chamadas do Asaas. \
🔒 `ASAAS_TOKEN` Seu token do Asaas.
```properties
asaas.api.base-url=URL
asaas.api.token=ASAAS_TOKEN
```
