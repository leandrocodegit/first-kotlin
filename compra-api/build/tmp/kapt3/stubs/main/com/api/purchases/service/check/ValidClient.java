package com.api.purchases.service.check;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/api/purchases/service/check/ValidClient;", "Lcom/api/purchases/service/check/ValidPurchases;", "clientResponse", "Lcom/api/purchases/integracao/client/response/ClientResponse;", "purchases", "Lcom/api/purchases/model/Purchases;", "(Lcom/api/purchases/integracao/client/response/ClientResponse;Lcom/api/purchases/model/Purchases;)V", "getClientResponse", "()Lcom/api/purchases/integracao/client/response/ClientResponse;", "setClientResponse", "(Lcom/api/purchases/integracao/client/response/ClientResponse;)V", "check", "", "purchases-api"})
public final class ValidClient extends com.api.purchases.service.check.ValidPurchases {
    @org.jetbrains.annotations.NotNull
    private com.api.purchases.integracao.client.response.ClientResponse clientResponse;
    
    public ValidClient(@org.jetbrains.annotations.NotNull
    com.api.purchases.integracao.client.response.ClientResponse clientResponse, @org.jetbrains.annotations.NotNull
    com.api.purchases.model.Purchases purchases) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.api.purchases.integracao.client.response.ClientResponse getClientResponse() {
        return null;
    }
    
    public final void setClientResponse(@org.jetbrains.annotations.NotNull
    com.api.purchases.integracao.client.response.ClientResponse p0) {
    }
    
    @java.lang.Override
    public void check() {
    }
}