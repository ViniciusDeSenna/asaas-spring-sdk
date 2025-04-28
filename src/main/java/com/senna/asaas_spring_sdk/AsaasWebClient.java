package com.senna.asaas_spring_sdk;

import com.senna.asaas_spring_sdk.customer.dto.AsaasCustomer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriBuilder;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.function.Function;

@Component
public class AsaasWebClient {

    private final WebClient webClient;

    public AsaasWebClient(@Value("${asaas.api.base-url}") String baseUrl, @Value("${asaas.api.token}") String apiKey) {
        this.webClient = WebClient.builder()
                .baseUrl(baseUrl)
                .defaultHeader("Accept", "application/json")
                .defaultHeader("Content-Type", "application/json")
                .defaultHeader("access_token", apiKey)
                .build();
    }

    public WebClient getClient() {
        return this.webClient;
    }

    /**
     * [PT-BR]
     * Função padrão POST.
     * |
     * [EN]
     * Default POST function.
     *
     * @param path Uri da requisição para API | Request Uri for API.
     * @param request Corpo da requisição para API | API request body.
     * @param responseType Classe que vai receber a resposta da API (um DTO casualmente) | Class that will receive the response from the API (DTO, by the way).
     * @return Retorna a resposta da API | Returns the API response.
     * @param <T> Classe que vai receber a resposta da API (um DTO casualmente) | Class that will receive the response from the API (DTO, by the way).
     */
    public <T> Mono<T> post(String path, Object request, Class<T> responseType) {
        return this.getClient()
                .post()
                .uri(path)
                .bodyValue(request)
                .retrieve()
                .onStatus(HttpStatusCode::isError, response ->
                        response.bodyToMono(String.class)
                                .map(body -> new RuntimeException("Erro da API: " + body))
                )
                .bodyToMono(responseType);
    };

    /**
     * [PT-BR]
     * Função padrão POST sem BODY.
     * |
     * [EN]
     * Default POST function without BODY.
     *
     * @param path Uri da requisição para API | Request Uri for API.
     * @param responseType Classe que vai receber a resposta da API (um DTO casualmente) | Class that will receive the response from the API (DTO, by the way).
     * @return Retorna a resposta da API | Returns the API response.
     * @param <T> Classe que vai receber a resposta da API (um DTO casualmente) | Class that will receive the response from the API (DTO, by the way).
     */
    public <T> Mono<T> post(String path, Class<T> responseType) {
        return this.getClient()
                .post()
                .uri(path)
                .retrieve()
                .onStatus(HttpStatusCode::isError, response ->
                        response.bodyToMono(String.class)
                                .map(body -> new RuntimeException("Erro da API: " + body))
                )
                .bodyToMono(responseType);
    };

    /**
     * [PT-BR]
     * Função padrão GET.
     * |
     * [EN]
     * Default GET function.
     *
     * @param path Uri da requisição para API | Request Uri for API.
     * @param responseType Classe que vai receber a resposta da API (um DTO casualmente) | Class that will receive the response from the API (DTO, by the way).
     * @return Retorna a resposta da API | Returns the API response.
     * @param <T> Classe que vai receber a resposta da API (um DTO casualmente) | Class that will receive the response from the API (DTO, by the way).
     */
    public <T> Mono<T> get(String path, Class<T> responseType) {
        return this.getClient()
                .get()
                .uri(path)
                .retrieve()
                .onStatus(HttpStatusCode::isError, response ->
                        response.bodyToMono(String.class)
                                .map(body -> new RuntimeException("Erro da API: " + body))
                )
                .bodyToMono(responseType);
    };

    /**
     * [PT-BR]
     * Função padrão GET com UriBuilder. Funciona como a requisição padrão GET porem permite que você monte o path de maneira dinâmica (facilitando o uso de filtros).
     * |
     * [EN]
     * Standard GET function with UriBuilder. It works like the standard GET request but allows you to build the path dynamically (making it easier to use filters).
     *
     * @param uriFunction Uri da requisição para API | Request Uri for API.
     * @param responseType Classe que vai receber a resposta da API (um DTO casualmente) | Class that will receive the response from the API (DTO, by the way).
     * @return Retorna a resposta da API | Returns the API response.
     * @param <T> Classe que vai receber a resposta da API (um DTO casualmente) | Class that will receive the response from the API (DTO, by the way).
     */
    public <T> Mono<T> get(Function<UriBuilder, URI> uriFunction, Class<T> responseType) {
        return this.getClient()
                .get()
                .uri(uriFunction)
                .retrieve()
                .bodyToMono(responseType);
    }

    /**
     * [PT-BR]
     * Função padrão PUT.
     * |
     * [EN]
     * Default PUT function.
     *
     * @param path Uri da requisição para API | Request Uri for API.
     * @param responseType Classe que vai receber a resposta da API (um DTO casualmente) | Class that will receive the response from the API (DTO, by the way).
     * @return Retorna a resposta da API | Returns the API response.
     * @param <T> Classe que vai receber a resposta da API (um DTO casualmente) | Class that will receive the response from the API (DTO, by the way).
     */
    public <T> Mono<T> put(String path, Object request, Class<T> responseType) {
        return this.getClient()
                .put()
                .uri(path)
                .bodyValue(request)
                .retrieve()
                .onStatus(HttpStatusCode::isError, response ->
                        response.bodyToMono(String.class)
                                .map(body -> new RuntimeException("Erro da API: " + body))
                )
                .bodyToMono(responseType);
    };

    /**
     * [PT-BR]
     * Função padrão DELETE.
     * |
     * [EN]
     * Default DELETE function.
     *
     * @param path Uri da requisição para API | Request Uri for API.
     * @param responseType Classe que vai receber a resposta da API (um DTO casualmente) | Class that will receive the response from the API (DTO, by the way).
     * @return Retorna a resposta da API | Returns the API response.
     * @param <T> Classe que vai receber a resposta da API (um DTO casualmente) | Class that will receive the response from the API (DTO, by the way).
     */
    public <T> Mono<T> delete(String path, Class<T> responseType) {
        return this.getClient()
                .delete()
                .uri(path)
                .retrieve()
                .onStatus(HttpStatusCode::isError, response ->
                        response.bodyToMono(String.class)
                                .map(body -> new RuntimeException("Erro da API: " + body))
                )
                .bodyToMono(responseType);
    }
}
