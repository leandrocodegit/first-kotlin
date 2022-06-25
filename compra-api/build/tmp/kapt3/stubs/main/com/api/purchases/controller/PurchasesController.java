package com.api.purchases.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0017J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0017J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\b\b\u0001\u0010\u000e\u001a\u00020\u0014H\u0017J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\b\b\u0001\u0010\u0016\u001a\u00020\u0017H\u0017J\u001e\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00190\f2\b\b\u0001\u0010\u001a\u001a\u00020\u000fH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/api/purchases/controller/PurchasesController;", "", "purchasesService", "Lcom/api/purchases/service/PurchasesService;", "purchasesMapper", "Lcom/api/purchases/mapper/PurchasesMapper;", "restProduct", "Lcom/api/purchases/integracao/product/rest/RestProduct;", "restClient", "Lcom/api/purchases/integracao/client/rest/RestClient;", "(Lcom/api/purchases/service/PurchasesService;Lcom/api/purchases/mapper/PurchasesMapper;Lcom/api/purchases/integracao/product/rest/RestProduct;Lcom/api/purchases/integracao/client/rest/RestClient;)V", "buscaClient", "Lorg/springframework/http/ResponseEntity;", "Lcom/api/purchases/integracao/client/response/ClientResponse;", "id", "", "buscaProduct", "Lcom/api/purchases/integracao/product/response/ProductResponse;", "buscaPurchases", "Lcom/api/purchases/controller/response/PurchasesResponse;", "Lorg/bson/types/ObjectId;", "createNewCompra", "comprasRequest", "Lcom/api/purchases/controller/request/PurchasesRequest;", "listAllPurchasesClient", "", "userId", "purchases-api"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/v1/purchases"})
@org.springframework.web.bind.annotation.RestController
public class PurchasesController {
    private final com.api.purchases.service.PurchasesService purchasesService = null;
    private final com.api.purchases.mapper.PurchasesMapper purchasesMapper = null;
    private final com.api.purchases.integracao.product.rest.RestProduct restProduct = null;
    private final com.api.purchases.integracao.client.rest.RestClient restClient = null;
    
    public PurchasesController(@org.jetbrains.annotations.NotNull
    com.api.purchases.service.PurchasesService purchasesService, @org.jetbrains.annotations.NotNull
    com.api.purchases.mapper.PurchasesMapper purchasesMapper, @org.jetbrains.annotations.NotNull
    com.api.purchases.integracao.product.rest.RestProduct restProduct, @org.jetbrains.annotations.NotNull
    com.api.purchases.integracao.client.rest.RestClient restClient) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{userId}"})
    public org.springframework.http.ResponseEntity<java.util.List<com.api.purchases.controller.response.PurchasesResponse>> listAllPurchasesClient(@org.springframework.web.bind.annotation.PathVariable
    long userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{userId}/{id}"})
    public org.springframework.http.ResponseEntity<com.api.purchases.controller.response.PurchasesResponse> buscaPurchases(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable
    org.bson.types.ObjectId id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/product/{id}"})
    public org.springframework.http.ResponseEntity<com.api.purchases.integracao.product.response.ProductResponse> buscaProduct(@org.springframework.web.bind.annotation.PathVariable
    long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/client/{id}"})
    public org.springframework.http.ResponseEntity<com.api.purchases.integracao.client.response.ClientResponse> buscaClient(@org.springframework.web.bind.annotation.PathVariable
    long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping
    public org.springframework.http.ResponseEntity<com.api.purchases.controller.response.PurchasesResponse> createNewCompra(@org.jetbrains.annotations.NotNull
    @javax.validation.Valid
    @org.springframework.web.bind.annotation.RequestBody
    com.api.purchases.controller.request.PurchasesRequest comprasRequest) {
        return null;
    }
}