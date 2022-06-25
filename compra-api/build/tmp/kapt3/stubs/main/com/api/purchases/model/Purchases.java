package com.api.purchases.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006\u001f"}, d2 = {"Lcom/api/purchases/model/Purchases;", "", "id", "Lorg/bson/types/ObjectId;", "idClient", "", "product", "Lcom/api/purchases/model/Product;", "total", "", "addressDelivery", "", "(Lorg/bson/types/ObjectId;JLcom/api/purchases/model/Product;DLjava/lang/String;)V", "getAddressDelivery", "()Ljava/lang/String;", "setAddressDelivery", "(Ljava/lang/String;)V", "getId", "()Lorg/bson/types/ObjectId;", "getIdClient", "()J", "setIdClient", "(J)V", "getProduct", "()Lcom/api/purchases/model/Product;", "setProduct", "(Lcom/api/purchases/model/Product;)V", "getTotal", "()D", "setTotal", "(D)V", "purchases-api"})
@org.springframework.data.mongodb.core.mapping.Document
public final class Purchases {
    @org.jetbrains.annotations.NotNull
    @org.springframework.data.annotation.Id
    private final org.bson.types.ObjectId id = null;
    private long idClient;
    @org.jetbrains.annotations.NotNull
    private com.api.purchases.model.Product product;
    private double total;
    @org.jetbrains.annotations.Nullable
    private java.lang.String addressDelivery;
    
    public Purchases(@org.jetbrains.annotations.NotNull
    org.bson.types.ObjectId id, long idClient, @org.jetbrains.annotations.NotNull
    com.api.purchases.model.Product product, double total, @org.jetbrains.annotations.Nullable
    java.lang.String addressDelivery) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.bson.types.ObjectId getId() {
        return null;
    }
    
    public final long getIdClient() {
        return 0L;
    }
    
    public final void setIdClient(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.api.purchases.model.Product getProduct() {
        return null;
    }
    
    public final void setProduct(@org.jetbrains.annotations.NotNull
    com.api.purchases.model.Product p0) {
    }
    
    public final double getTotal() {
        return 0.0;
    }
    
    public final void setTotal(double p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAddressDelivery() {
        return null;
    }
    
    public final void setAddressDelivery(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
}