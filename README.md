# asaas-spring-sdk
A lightweight and easy-to-use Java SDK for integrating with the Asaas API using Spring Boot.  This SDK abstracts common operations like customer management, billing, and subscriptions, making it easier to integrate Asaas into your Java Spring applications.

![AsaasSpringSDK-Banner-min](https://github.com/user-attachments/assets/6887ca76-f431-4a16-8fcc-3fdd44977e62)

🔄 Este README está disponível em [Português 🇧🇷](README.pt-br.md).

🔗 [Official Asaas documentation 💙.](https://docs.asaas.com/)

## Implemented routes:

### Payments
✅ Create new payment. \
✅ List payments. \
✅ Create new payment with credit card. \
✅ Capture payment with Pre-Authorization. \
✅ Pay a charge with a credit card. \
✅ Retrieve payment billing information. \
✅ Payment viewing information. \
✅ Retrieve a single payment. \
✅ Update existing payment. \
✅ Delete payment. \
✅ Restore removed payment. \
✅ Retrieve status of a payment. \
✅ Refund payment. \
✅ Get digitable bill line. \
✅ Get QR Code for Pix payments. \
✅ Confirm cash receipt. \
✅ Undo cash receipt confirmation. \
✅ Sales simulator. \
✅ Retrieve payment escrow in the Escrow Account. \
✅ Recovering payment limits.


### Credit Card
✅ Credit card tokenization.

### Customers
✅ Create new customer. \
✅ List customers. \
✅ Retrieve a single customer. \
✅ Update existing customer. \
✅ Remove Customer. \
✅ Restore removed customer. \
✅ Retrieve notifications from a customer.

---

## Installation

### Settings
First you need to have a `settings.xml` with the content below in the `~/.m2/settings.xml` directory. \
🔒 `USERNAME`: GitHub username. \
🔒 `GITHUB_TOKEN`: Personal Access Token (Personal Access Token with `read:packages` permissions).
```xml
<servers>
    <server>
        <id>github</id>
        <username>USERNAME</username>
        <password>GITHUB_TOKEN</password>
    </server>
</servers>
```

### Repositories
In your `pom.xml` file add the following sections: \
🆚 `LAST_VERSION`: 🔗 [See the latest version](https://github.com/ViniciusDeSenna/asaas-spring-sdk/packages/2488874)
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
