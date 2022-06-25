package com.cliente.api.mapper;

import java.lang.System;

@org.mapstruct.Mapper(unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\t"}, d2 = {"Lcom/cliente/api/mapper/UsuarioMapper;", "", "toEntity", "Lcom/cliente/api/entity/Usuario;", "request", "Lcom/cliente/api/controller/request/UsuarioRequest;", "toResponse", "Lcom/cliente/api/controller/response/UsuarioResponse;", "usuario", "cliente-api"})
public abstract interface UsuarioMapper {
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.Mappings(value = {@org.mapstruct.Mapping(target = "usuarioRequest.isActive", expression = "java(Boolean.TRUE)"), @org.mapstruct.Mapping(target = "enderecoRequest.isDelivery", expression = "java(Boolean.TRUE)"), @org.mapstruct.Mapping(target = "enderecos", ignore = true)})
    public abstract com.cliente.api.entity.Usuario toEntity(@org.jetbrains.annotations.NotNull
    com.cliente.api.controller.request.UsuarioRequest request);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.cliente.api.controller.response.UsuarioResponse toResponse(@org.jetbrains.annotations.NotNull
    com.cliente.api.entity.Usuario usuario);
}