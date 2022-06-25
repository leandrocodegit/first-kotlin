package com.cliente.api.controller.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u0013R\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010\u0013\u00a8\u0006\'"}, d2 = {"Lcom/cliente/api/controller/response/UsuarioResponse;", "", "id", "", "email", "", "nome", "idade", "", "enderecos", "", "Lcom/cliente/api/controller/response/EnderecoResponse;", "telefone", "isActive", "", "(JLjava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Z)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getEnderecos", "()Ljava/util/List;", "setEnderecos", "(Ljava/util/List;)V", "getId", "()J", "setId", "(J)V", "getIdade", "()I", "setIdade", "(I)V", "()Z", "setActive", "(Z)V", "getNome", "setNome", "getTelefone", "setTelefone", "cliente-api"})
public final class UsuarioResponse {
    private long id;
    @org.jetbrains.annotations.NotNull
    private java.lang.String email;
    @org.jetbrains.annotations.NotNull
    private java.lang.String nome;
    private int idade;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.cliente.api.controller.response.EnderecoResponse> enderecos;
    @org.jetbrains.annotations.NotNull
    private java.lang.String telefone;
    private boolean isActive;
    
    public UsuarioResponse(long id, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String nome, int idade, @org.jetbrains.annotations.NotNull
    java.util.List<com.cliente.api.controller.response.EnderecoResponse> enderecos, @org.jetbrains.annotations.NotNull
    java.lang.String telefone, boolean isActive) {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNome() {
        return null;
    }
    
    public final void setNome(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getIdade() {
        return 0;
    }
    
    public final void setIdade(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.cliente.api.controller.response.EnderecoResponse> getEnderecos() {
        return null;
    }
    
    public final void setEnderecos(@org.jetbrains.annotations.NotNull
    java.util.List<com.cliente.api.controller.response.EnderecoResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTelefone() {
        return null;
    }
    
    public final void setTelefone(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean isActive() {
        return false;
    }
    
    public final void setActive(boolean p0) {
    }
}