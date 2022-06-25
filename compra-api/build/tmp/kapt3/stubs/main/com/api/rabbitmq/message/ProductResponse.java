package com.api.rabbitmq.message;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2 = {"Lcom/api/rabbitmq/message/ProductResponse;", "", "idProduct", "", "name", "", "qtd", "", "valor", "", "(JLjava/lang/String;ID)V", "getIdProduct", "()J", "setIdProduct", "(J)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getQtd", "()I", "setQtd", "(I)V", "getValor", "()D", "setValor", "(D)V", "purchases-api"})
public final class ProductResponse {
    private long idProduct;
    @org.jetbrains.annotations.NotNull
    private java.lang.String name;
    private int qtd;
    private double valor;
    
    public ProductResponse(long idProduct, @org.jetbrains.annotations.NotNull
    java.lang.String name, int qtd, double valor) {
        super();
    }
    
    public final long getIdProduct() {
        return 0L;
    }
    
    public final void setIdProduct(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getQtd() {
        return 0;
    }
    
    public final void setQtd(int p0) {
    }
    
    public final double getValor() {
        return 0.0;
    }
    
    public final void setValor(double p0) {
    }
}