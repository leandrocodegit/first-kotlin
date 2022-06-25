package com.api.delivery.controller.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\fR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006\u001f"}, d2 = {"Lcom/api/delivery/controller/response/DeliveryResponse;", "", "id", "", "idClient", "", "status", "Lcom/api/delivery/enuns/StatusDelivery;", "products", "", "Lcom/api/delivery/controller/response/ProductResponse;", "addressDelivery", "(Ljava/lang/String;JLcom/api/delivery/enuns/StatusDelivery;Ljava/util/List;Ljava/lang/String;)V", "getAddressDelivery", "()Ljava/lang/String;", "setAddressDelivery", "(Ljava/lang/String;)V", "getId", "setId", "getIdClient", "()J", "setIdClient", "(J)V", "getProducts", "()Ljava/util/List;", "setProducts", "(Ljava/util/List;)V", "getStatus", "()Lcom/api/delivery/enuns/StatusDelivery;", "setStatus", "(Lcom/api/delivery/enuns/StatusDelivery;)V", "delivery-api"})
public final class DeliveryResponse {
    @org.jetbrains.annotations.NotNull
    private java.lang.String id;
    private long idClient;
    @org.jetbrains.annotations.NotNull
    private com.api.delivery.enuns.StatusDelivery status;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.api.delivery.controller.response.ProductResponse> products;
    @org.jetbrains.annotations.NotNull
    private java.lang.String addressDelivery;
    
    public DeliveryResponse(@org.jetbrains.annotations.NotNull
    java.lang.String id, long idClient, @org.jetbrains.annotations.NotNull
    com.api.delivery.enuns.StatusDelivery status, @org.jetbrains.annotations.NotNull
    java.util.List<com.api.delivery.controller.response.ProductResponse> products, @org.jetbrains.annotations.NotNull
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
    public final com.api.delivery.enuns.StatusDelivery getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull
    com.api.delivery.enuns.StatusDelivery p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.api.delivery.controller.response.ProductResponse> getProducts() {
        return null;
    }
    
    public final void setProducts(@org.jetbrains.annotations.NotNull
    java.util.List<com.api.delivery.controller.response.ProductResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAddressDelivery() {
        return null;
    }
    
    public final void setAddressDelivery(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
}