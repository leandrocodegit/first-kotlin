package com.api.purchases.controller.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0015\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006\u001e"}, d2 = {"Lcom/api/purchases/controller/response/PurchasesResponse;", "", "id", "", "idClient", "", "product", "Lcom/api/purchases/controller/response/ProductResponse;", "total", "", "addressDelivery", "(Ljava/lang/String;JLcom/api/purchases/controller/response/ProductResponse;DLjava/lang/String;)V", "getAddressDelivery", "()Ljava/lang/String;", "setAddressDelivery", "(Ljava/lang/String;)V", "getId", "setId", "getIdClient", "()J", "setIdClient", "(J)V", "getProduct", "()Lcom/api/purchases/controller/response/ProductResponse;", "setProduct", "(Lcom/api/purchases/controller/response/ProductResponse;)V", "getTotal", "()D", "setTotal", "(D)V", "purchases-api"})
public final class PurchasesResponse {
    @org.jetbrains.annotations.NotNull
    private java.lang.String id;
    private long idClient;
    @org.jetbrains.annotations.NotNull
    private com.api.purchases.controller.response.ProductResponse product;
    private double total;
    @org.jetbrains.annotations.NotNull
    private java.lang.String addressDelivery;
    
    public PurchasesResponse(@org.jetbrains.annotations.NotNull
    java.lang.String id, long idClient, @org.jetbrains.annotations.NotNull
    com.api.purchases.controller.response.ProductResponse product, double total, @org.jetbrains.annotations.NotNull
    java.lang.String addressDelivery) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final long getIdClient() {
        return 0L;
    }
    
    public final void setIdClient(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.api.purchases.controller.response.ProductResponse getProduct() {
        return null;
    }
    
    public final void setProduct(@org.jetbrains.annotations.NotNull
    com.api.purchases.controller.response.ProductResponse p0) {
    }
    
    public final double getTotal() {
        return 0.0;
    }
    
    public final void setTotal(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAddressDelivery() {
        return null;
    }
    
    public final void setAddressDelivery(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
}