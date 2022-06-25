package com.api.purchases.controller.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/api/purchases/controller/request/ProductRequest;", "", "idProduct", "", "qtd", "", "(JI)V", "getIdProduct", "()J", "setIdProduct", "(J)V", "getQtd", "()I", "setQtd", "(I)V", "purchases-api"})
public final class ProductRequest {
    @javax.validation.constraints.Min(value = 1L)
    private long idProduct;
    @javax.validation.constraints.Min(value = 1L)
    private int qtd;
    
    public ProductRequest(long idProduct, int qtd) {
        super();
    }
    
    public final long getIdProduct() {
        return 0L;
    }
    
    public final void setIdProduct(long p0) {
    }
    
    public final int getQtd() {
        return 0;
    }
    
    public final void setQtd(int p0) {
    }
}