package com.cliente.api.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0016J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0018"}, d2 = {"Lcom/cliente/api/service/UsuarioService;", "", "usuarioRepository", "Lcom/cliente/api/repository/UsuarioRepository;", "(Lcom/cliente/api/repository/UsuarioRepository;)V", "getUsuarioRepository", "()Lcom/cliente/api/repository/UsuarioRepository;", "buscarUsuarioByEmail", "Lcom/cliente/api/entity/Usuario;", "email", "", "buscarUsuarioById", "id", "", "listAllUsuario", "", "Lorg/springframework/data/domain/Page;", "pageable", "Lorg/springframework/data/domain/Pageable;", "saveUsuario", "usuario", "updateStatusUsuario", "statusUsuario", "Lcom/cliente/api/enuns/StatusUsuario;", "cliente-api"})
@org.springframework.stereotype.Service
public class UsuarioService {
    @org.jetbrains.annotations.NotNull
    private final com.cliente.api.repository.UsuarioRepository usuarioRepository = null;
    
    public UsuarioService(@org.jetbrains.annotations.NotNull
    com.cliente.api.repository.UsuarioRepository usuarioRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.cliente.api.repository.UsuarioRepository getUsuarioRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.cliente.api.entity.Usuario buscarUsuarioById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.cliente.api.entity.Usuario buscarUsuarioByEmail(@org.jetbrains.annotations.NotNull
    java.lang.String email) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.cliente.api.entity.Usuario> listAllUsuario() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.springframework.data.domain.Page<com.cliente.api.entity.Usuario> listAllUsuario(@org.jetbrains.annotations.NotNull
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.cliente.api.entity.Usuario saveUsuario(@org.jetbrains.annotations.NotNull
    com.cliente.api.entity.Usuario usuario) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.cliente.api.entity.Usuario updateStatusUsuario(long id, @org.jetbrains.annotations.NotNull
    com.cliente.api.enuns.StatusUsuario statusUsuario) {
        return null;
    }
}