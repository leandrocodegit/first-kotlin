package com.cliente.api.controller.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f\u00a8\u0006\u001e"}, d2 = {"Lcom/cliente/api/controller/request/UsuarioRequest;", "", "email", "", "nome", "idade", "", "endereco", "Lcom/cliente/api/controller/request/EnderecoRequest;", "telefone", "senha", "(Ljava/lang/String;Ljava/lang/String;ILcom/cliente/api/controller/request/EnderecoRequest;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getEndereco", "()Lcom/cliente/api/controller/request/EnderecoRequest;", "setEndereco", "(Lcom/cliente/api/controller/request/EnderecoRequest;)V", "getIdade", "()I", "setIdade", "(I)V", "getNome", "setNome", "getSenha", "setSenha", "getTelefone", "setTelefone", "cliente-api"})
public final class UsuarioRequest {
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.Email
    private java.lang.String email;
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    private java.lang.String nome;
    @javax.validation.constraints.Max(value = 120L)
    @javax.validation.constraints.Min(value = 18L)
    @javax.validation.constraints.NotNull
    private int idade;
    @org.jetbrains.annotations.NotNull
    private com.cliente.api.controller.request.EnderecoRequest endereco;
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    private java.lang.String telefone;
    @org.jetbrains.annotations.NotNull
    private java.lang.String senha;
    
    public UsuarioRequest(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String nome, int idade, @org.jetbrains.annotations.NotNull
    com.cliente.api.controller.request.EnderecoRequest endereco, @org.jetbrains.annotations.NotNull
    java.lang.String telefone, @org.jetbrains.annotations.NotNull
    java.lang.String senha) {
        super();
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
    public final com.cliente.api.controller.request.EnderecoRequest getEndereco() {
        return null;
    }
    
    public final void setEndereco(@org.jetbrains.annotations.NotNull
    com.cliente.api.controller.request.EnderecoRequest p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTelefone() {
        return null;
    }
    
    public final void setTelefone(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSenha() {
        return null;
    }
    
    public final void setSenha(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
}