package com.produto.api.controller.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006#"}, d2 = {"Lcom/produto/api/controller/response/ProductResponse;", "", "id", "", "nome", "", "quantidade", "", "valor", "", "descricao", "isActive", "", "(JLjava/lang/String;IDLjava/lang/String;Z)V", "getDescricao", "()Ljava/lang/String;", "setDescricao", "(Ljava/lang/String;)V", "getId", "()J", "setId", "(J)V", "()Z", "setActive", "(Z)V", "getNome", "setNome", "getQuantidade", "()I", "setQuantidade", "(I)V", "getValor", "()D", "setValor", "(D)V", "produto-api"})
public final class ProductResponse {
    private long id;
    @org.jetbrains.annotations.NotNull
    private java.lang.String nome;
    private int quantidade;
    private double valor;
    @org.jetbrains.annotations.NotNull
    private java.lang.String descricao;
    private boolean isActive;
    
    public ProductResponse(long id, @org.jetbrains.annotations.NotNull
    java.lang.String nome, int quantidade, double valor, @org.jetbrains.annotations.NotNull
    java.lang.String descricao, @com.fasterxml.jackson.annotation.JsonProperty(value = "is_active")
    boolean isActive) {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNome() {
        return null;
    }
    
    public final void setNome(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getQuantidade() {
        return 0;
    }
    
    public final void setQuantidade(int p0) {
    }
    
    public final double getValor() {
        return 0.0;
    }
    
    public final void setValor(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescricao() {
        return null;
    }
    
    public final void setDescricao(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean isActive() {
        return false;
    }
    
    public final void setActive(boolean p0) {
    }
}