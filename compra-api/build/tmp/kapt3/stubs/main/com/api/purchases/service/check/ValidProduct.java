package com.api.purchases.service.check;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/api/purchases/service/check/ValidProduct;", "Lcom/api/purchases/service/check/ValidPurchases;", "productResponse", "Lcom/api/purchases/integracao/product/response/ProductResponse;", "purchases", "Lcom/api/purchases/model/Purchases;", "(Lcom/api/purchases/integracao/product/response/ProductResponse;Lcom/api/purchases/model/Purchases;)V", "getProductResponse", "()Lcom/api/purchases/integracao/product/response/ProductResponse;", "setProductResponse", "(Lcom/api/purchases/integracao/product/response/ProductResponse;)V", "check", "", "purchases-api"})
public final class ValidProduct extends com.api.purchases.service.check.ValidPurchases {
    @org.jetbrains.annotations.NotNull
    private com.api.purchases.integracao.product.response.ProductResponse productResponse;
    
    public ValidProduct(@org.jetbrains.annotations.NotNull
    com.api.purchases.integracao.product.response.ProductResponse productResponse, @org.jetbrains.annotations.NotNull
    com.api.purchases.model.Purchases purchases) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.api.purchases.integracao.product.response.ProductResponse getProductResponse() {
        return null;
    }
    
    public final void setProductResponse(@org.jetbrains.annotations.NotNull
    com.api.purchases.integracao.product.response.ProductResponse p0) {
    }
    
    @java.lang.Override
    public void check() {
    }
}