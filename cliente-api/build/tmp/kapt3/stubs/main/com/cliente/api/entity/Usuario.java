package com.cliente.api.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u0014R\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0012\"\u0004\b\'\u0010\u0014R\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014\u00a8\u0006*"}, d2 = {"Lcom/cliente/api/entity/Usuario;", "", "id", "", "email", "", "nome", "idade", "", "enderecos", "", "Lcom/cliente/api/entity/Endereco;", "telefone", "senha", "isActive", "", "(JLjava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getEnderecos", "()Ljava/util/List;", "setEnderecos", "(Ljava/util/List;)V", "getId", "()J", "setId", "(J)V", "getIdade", "()I", "setIdade", "(I)V", "()Z", "setActive", "(Z)V", "getNome", "setNome", "getSenha", "setSenha", "getTelefone", "setTelefone", "cliente-api"})
@javax.persistence.Entity
public final class Usuario {
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id
    private long id;
    @org.jetbrains.annotations.NotNull
    private java.lang.String email;
    @org.jetbrains.annotations.NotNull
    private java.lang.String nome;
    private int idade;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.OneToMany(cascade = {javax.persistence.CascadeType.ALL})
    private java.util.List<com.cliente.api.entity.Endereco> enderecos;
    @org.jetbrains.annotations.NotNull
    private java.lang.String telefone;
    @org.jetbrains.annotations.NotNull
    private java.lang.String senha;
    private boolean isActive;
    
    public Usuario(long id, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String nome, @javax.validation.constraints.Size(min = 1, max = 100)
    int idade, @org.jetbrains.annotations.Nullable
    java.util.List<com.cliente.api.entity.Endereco> enderecos, @org.jetbrains.annotations.NotNull
    java.lang.String telefone, @org.jetbrains.annotations.NotNull
    java.lang.String senha, boolean isActive) {
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
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.cliente.api.entity.Endereco> getEnderecos() {
        return null;
    }
    
    public final void setEnderecos(@org.jetbrains.annotations.Nullable
    java.util.List<com.cliente.api.entity.Endereco> p0) {
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
    
    public final boolean isActive() {
        return false;
    }
    
    public final void setActive(boolean p0) {
    }
}