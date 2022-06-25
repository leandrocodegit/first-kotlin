package com.cliente.api.controller.controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0017J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0017J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0017J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\bH\u0017J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/cliente/api/controller/controllers/UsuarioController;", "", "usuarioService", "Lcom/cliente/api/service/UsuarioService;", "usuarioMapper", "Lcom/cliente/api/mapper/UsuarioMapper;", "(Lcom/cliente/api/service/UsuarioService;Lcom/cliente/api/mapper/UsuarioMapper;)V", "activeUsuario", "Lorg/springframework/http/ResponseEntity;", "Lcom/cliente/api/controller/response/UsuarioResponse;", "id", "", "buscarUsuarioId", "desactiveUsuario", "listAllUsuario", "", "savesUsuario", "usuarioRequest", "Lcom/cliente/api/controller/request/UsuarioRequest;", "cliente-api"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/v1/users"})
@org.springframework.web.bind.annotation.RestController
public class UsuarioController {
    private final com.cliente.api.service.UsuarioService usuarioService = null;
    private final com.cliente.api.mapper.UsuarioMapper usuarioMapper = null;
    
    public UsuarioController(@org.jetbrains.annotations.NotNull
    com.cliente.api.service.UsuarioService usuarioService, @org.jetbrains.annotations.NotNull
    com.cliente.api.mapper.UsuarioMapper usuarioMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping
    public org.springframework.http.ResponseEntity<java.util.List<com.cliente.api.controller.response.UsuarioResponse>> listAllUsuario() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    public org.springframework.http.ResponseEntity<com.cliente.api.controller.response.UsuarioResponse> buscarUsuarioId(@org.springframework.web.bind.annotation.PathVariable
    long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping
    public org.springframework.http.ResponseEntity<com.cliente.api.controller.response.UsuarioResponse> savesUsuario(@org.jetbrains.annotations.NotNull
    @javax.validation.Valid
    @org.springframework.web.bind.annotation.RequestBody
    com.cliente.api.controller.request.UsuarioRequest usuarioRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PatchMapping(value = {"/{id}/desactive"})
    public org.springframework.http.ResponseEntity<com.cliente.api.controller.response.UsuarioResponse> desactiveUsuario(@org.springframework.web.bind.annotation.PathVariable
    long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PatchMapping(value = {"/{id}/active"})
    public org.springframework.http.ResponseEntity<com.cliente.api.controller.response.UsuarioResponse> activeUsuario(@org.springframework.web.bind.annotation.PathVariable
    long id) {
        return null;
    }
}