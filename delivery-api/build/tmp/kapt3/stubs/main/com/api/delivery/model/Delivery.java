package com.api.delivery.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006\""}, d2 = {"Lcom/api/delivery/model/Delivery;", "", "id", "Lorg/bson/types/ObjectId;", "idClient", "", "status", "Lcom/api/delivery/enuns/StatusDelivery;", "products", "", "Lcom/api/delivery/model/Product;", "addressDelivery", "", "(Lorg/bson/types/ObjectId;JLcom/api/delivery/enuns/StatusDelivery;Ljava/util/List;Ljava/lang/String;)V", "getAddressDelivery", "()Ljava/lang/String;", "setAddressDelivery", "(Ljava/lang/String;)V", "getId", "()Lorg/bson/types/ObjectId;", "setId", "(Lorg/bson/types/ObjectId;)V", "getIdClient", "()J", "setIdClient", "(J)V", "getProducts", "()Ljava/util/List;", "setProducts", "(Ljava/util/List;)V", "getStatus", "()Lcom/api/delivery/enuns/StatusDelivery;", "setStatus", "(Lcom/api/delivery/enuns/StatusDelivery;)V", "delivery-api"})
@org.springframework.data.mongodb.core.mapping.Document
public final class Delivery {
    @org.jetbrains.annotations.NotNull
    @org.springframework.data.annotation.Id
    private org.bson.types.ObjectId id;
    private long idClient;
    @org.jetbrains.annotations.NotNull
    private com.api.delivery.enuns.StatusDelivery status;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.api.delivery.model.Product> products;
    @org.jetbrains.annotations.Nullable
    private java.lang.String addressDelivery;
    
    public Delivery(@org.jetbrains.annotations.NotNull
    org.bson.types.ObjectId id, long idClient, @org.jetbrains.annotations.NotNull
    com.api.delivery.enuns.StatusDelivery status, @org.jetbrains.annotations.NotNull
    java.util.List<com.api.delivery.model.Product> products, @org.jetbrains.annotations.Nullable
    java.lang.String addressDelivery) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.bson.types.ObjectId getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull
    org.bson.types.ObjectId p0) {
    }
    
    public final long getIdClient() {
        return 0L;
    }
    
    public final void setIdClient(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.api.delivery.enuns.StatusDelivery getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull
    com.api.delivery.enuns.StatusDelivery p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.api.delivery.model.Product> getProducts() {
        return null;
    }
    
    public final void setProducts(@org.jetbrains.annotations.NotNull
    java.util.List<com.api.delivery.model.Product> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAddressDelivery() {
        return null;
    }
    
    public final void setAddressDelivery(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
}