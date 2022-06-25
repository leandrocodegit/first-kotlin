package com.api.delivery.controller.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/api/delivery/controller/request/DeliveryRequest;", "", "idClient", "", "products", "", "Lcom/api/delivery/controller/request/ProductRequest;", "(JLjava/util/List;)V", "getIdClient", "()J", "setIdClient", "(J)V", "getProducts", "()Ljava/util/List;", "setProducts", "(Ljava/util/List;)V", "delivery-api"})
public final class DeliveryRequest {
    @javax.validation.constraints.Min(value = 1L)
    private long idClient;
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotEmpty
    @javax.validation.Valid
    private java.util.List<com.api.delivery.controller.request.ProductRequest> products;
    
    public DeliveryRequest(long idClient, @org.jetbrains.annotations.NotNull
    java.util.List<com.api.delivery.controller.request.ProductRequest> products) {
        super();
    }
    
    public final long getIdClient() {
        return 0L;
    }
    
    public final void setIdClient(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.api.delivery.controller.request.ProductRequest> getProducts() {
        return null;
    }
    
    public final void setProducts(@org.jetbrains.annotations.NotNull
    java.util.List<com.api.delivery.controller.request.ProductRequest> p0) {
    }
}