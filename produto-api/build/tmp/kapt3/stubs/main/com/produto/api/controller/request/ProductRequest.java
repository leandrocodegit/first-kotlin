package com.produto.api.controller.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001d"}, d2 = {"Lcom/produto/api/controller/request/ProductRequest;", "", "nome", "", "quantidade", "", "valor", "", "descricao", "isActive", "", "(Ljava/lang/String;IDLjava/lang/String;Z)V", "getDescricao", "()Ljava/lang/String;", "setDescricao", "(Ljava/lang/String;)V", "()Z", "setActive", "(Z)V", "getNome", "setNome", "getQuantidade", "()I", "setQuantidade", "(I)V", "getValor", "()D", "setValor", "(D)V", "produto-api"})
public final class ProductRequest {
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    private java.lang.String nome;
    @javax.validation.constraints.Min(value = 1L)
    private int quantidade;
    @javax.validation.constraints.Min(value = 1L)
    private double valor;
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    private java.lang.String descricao;
    private boolean isActive;
    
    public ProductRequest(@org.jetbrains.annotations.NotNull
    java.lang.String nome, int quantidade, double valor, @org.jetbrains.annotations.NotNull
    java.lang.String descricao, boolean isActive) {
        super();
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