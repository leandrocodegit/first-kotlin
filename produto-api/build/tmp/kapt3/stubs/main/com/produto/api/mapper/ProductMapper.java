package com.produto.api.mapper;

import java.lang.System;

@org.mapstruct.Mapper
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\'\u00a8\u0006\t"}, d2 = {"Lcom/produto/api/mapper/ProductMapper;", "", "toEntity", "Lcom/produto/api/model/Product;", "productRequest", "Lcom/produto/api/controller/request/ProductRequest;", "toResponse", "Lcom/produto/api/controller/response/ProductResponse;", "product", "produto-api"})
public abstract interface ProductMapper {
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.Mappings(value = {@org.mapstruct.Mapping(target = "isActive", source = "active"), @org.mapstruct.Mapping(target = "id", ignore = true)})
    public abstract com.produto.api.model.Product toEntity(@org.jetbrains.annotations.NotNull
    com.produto.api.controller.request.ProductRequest productRequest);
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.Mapping(source = "active", target = "isActive")
    public abstract com.produto.api.controller.response.ProductResponse toResponse(@org.jetbrains.annotations.NotNull
    com.produto.api.model.Product product);
}