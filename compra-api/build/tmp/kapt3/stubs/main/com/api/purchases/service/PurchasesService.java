package com.api.purchases.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u000f\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/api/purchases/service/PurchasesService;", "", "purchasesRepository", "Lcom/api/purchases/repository/PurchasesRepository;", "restProduct", "Lcom/api/purchases/integracao/product/rest/RestProduct;", "restClient", "Lcom/api/purchases/integracao/client/rest/RestClient;", "rabbitTemplate", "Lorg/springframework/amqp/rabbit/core/RabbitTemplate;", "purchasesMapper", "Lcom/api/purchases/mapper/PurchasesMapper;", "(Lcom/api/purchases/repository/PurchasesRepository;Lcom/api/purchases/integracao/product/rest/RestProduct;Lcom/api/purchases/integracao/client/rest/RestClient;Lorg/springframework/amqp/rabbit/core/RabbitTemplate;Lcom/api/purchases/mapper/PurchasesMapper;)V", "buscaPurchases", "Lcom/api/purchases/model/Purchases;", "id", "Lorg/bson/types/ObjectId;", "listAllPurchasesClient", "", "", "savePurchases", "purchases", "purchases-api"})
@org.springframework.stereotype.Service
public class PurchasesService {
    private com.api.purchases.repository.PurchasesRepository purchasesRepository;
    private final com.api.purchases.integracao.product.rest.RestProduct restProduct = null;
    private final com.api.purchases.integracao.client.rest.RestClient restClient = null;
    private final org.springframework.amqp.rabbit.core.RabbitTemplate rabbitTemplate = null;
    private final com.api.purchases.mapper.PurchasesMapper purchasesMapper = null;
    
    public PurchasesService(@org.jetbrains.annotations.NotNull
    com.api.purchases.repository.PurchasesRepository purchasesRepository, @org.jetbrains.annotations.NotNull
    com.api.purchases.integracao.product.rest.RestProduct restProduct, @org.jetbrains.annotations.NotNull
    com.api.purchases.integracao.client.rest.RestClient restClient, @org.jetbrains.annotations.NotNull
    org.springframework.amqp.rabbit.core.RabbitTemplate rabbitTemplate, @org.jetbrains.annotations.NotNull
    com.api.purchases.mapper.PurchasesMapper purchasesMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.api.purchases.model.Purchases savePurchases(@org.jetbrains.annotations.NotNull
    com.api.purchases.model.Purchases purchases) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.api.purchases.model.Purchases> listAllPurchasesClient(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.api.purchases.model.Purchases buscaPurchases(@org.jetbrains.annotations.NotNull
    org.bson.types.ObjectId id) {
        return null;
    }
}