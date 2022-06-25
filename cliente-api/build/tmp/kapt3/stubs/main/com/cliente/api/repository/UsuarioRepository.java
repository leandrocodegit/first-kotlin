package com.cliente.api.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/cliente/api/repository/UsuarioRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lcom/cliente/api/entity/Usuario;", "", "findAll", "Lorg/springframework/data/domain/Page;", "pageable", "Lorg/springframework/data/domain/Pageable;", "findByEmail", "Ljava/util/Optional;", "email", "", "cliente-api"})
@org.springframework.stereotype.Repository
public abstract interface UsuarioRepository extends org.springframework.data.jpa.repository.JpaRepository<com.cliente.api.entity.Usuario, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.Optional<com.cliente.api.entity.Usuario> findByEmail(@org.jetbrains.annotations.NotNull
    java.lang.String email);
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public abstract org.springframework.data.domain.Page<com.cliente.api.entity.Usuario> findAll(@org.jetbrains.annotations.NotNull
    org.springframework.data.domain.Pageable pageable);
}