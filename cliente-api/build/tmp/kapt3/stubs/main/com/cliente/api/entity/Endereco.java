package com.cliente.api.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010\u00a8\u0006 "}, d2 = {"Lcom/cliente/api/entity/Endereco;", "", "id", "", "rua", "", "numero", "cidade", "estado", "cep", "isDelivery", "", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getCep", "()Ljava/lang/String;", "setCep", "(Ljava/lang/String;)V", "getCidade", "setCidade", "getEstado", "setEstado", "getId", "()J", "setId", "(J)V", "()Z", "setDelivery", "(Z)V", "getNumero", "setNumero", "getRua", "setRua", "cliente-api"})
@javax.persistence.Entity
public final class Endereco {
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id
    private long id;
    @org.jetbrains.annotations.NotNull
    private java.lang.String rua;
    @org.jetbrains.annotations.Nullable
    private java.lang.String numero;
    @org.jetbrains.annotations.NotNull
    private java.lang.String cidade;
    @org.jetbrains.annotations.NotNull
    private java.lang.String estado;
    @org.jetbrains.annotations.NotNull
    private java.lang.String cep;
    private boolean isDelivery;
    
    public Endereco(long id, @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    java.lang.String rua, @org.jetbrains.annotations.Nullable
    @javax.validation.constraints.NotBlank
    java.lang.String numero, @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    java.lang.String cidade, @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    java.lang.String estado, @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    java.lang.String cep, boolean isDelivery) {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRua() {
        return null;
    }
    
    public final void setRua(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNumero() {
        return null;
    }
    
    public final void setNumero(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCidade() {
        return null;
    }
    
    public final void setCidade(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEstado() {
        return null;
    }
    
    public final void setEstado(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCep() {
        return null;
    }
    
    public final void setCep(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean isDelivery() {
        return false;
    }
    
    public final void setDelivery(boolean p0) {
    }
}