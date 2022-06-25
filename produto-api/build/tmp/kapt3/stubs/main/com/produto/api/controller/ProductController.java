package com.produto.api.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0017J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0017J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0017J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0017J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00120\bH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/produto/api/controller/ProductController;", "", "productService", "Lcom/produto/api/service/ProductService;", "productMapper", "Lcom/produto/api/mapper/ProductMapper;", "(Lcom/produto/api/service/ProductService;Lcom/produto/api/mapper/ProductMapper;)V", "activeStatusProduct", "Lorg/springframework/http/ResponseEntity;", "Lcom/produto/api/controller/response/ProductResponse;", "id", "", "buscaProduct", "createNewProduct", "productRequest", "Lcom/produto/api/controller/request/ProductRequest;", "inactiveStatusProduct", "listAllProducts", "", "produto-api"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/v1/products"})
@org.springframework.web.bind.annotation.RestController
public class ProductController {
    private final com.produto.api.service.ProductService productService = null;
    private final com.produto.api.mapper.ProductMapper productMapper = null;
    
    public ProductController(@org.jetbrains.annotations.NotNull
    com.produto.api.service.ProductService productService, @org.jetbrains.annotations.NotNull
    com.produto.api.mapper.ProductMapper productMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    public org.springframework.http.ResponseEntity<com.produto.api.controller.response.ProductResponse> buscaProduct(@org.springframework.web.bind.annotation.PathVariable
    long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping
    public org.springframework.http.ResponseEntity<java.util.List<com.produto.api.controller.response.ProductResponse>> listAllProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping
    public org.springframework.http.ResponseEntity<com.produto.api.controller.response.ProductResponse> createNewProduct(@org.jetbrains.annotations.NotNull
    @javax.validation.Valid
    @org.springframework.web.bind.annotation.RequestBody
    com.produto.api.controller.request.ProductRequest productRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PatchMapping(value = {"/{id}/active"})
    public org.springframework.http.ResponseEntity<com.produto.api.controller.response.ProductResponse> activeStatusProduct(@org.springframework.web.bind.annotation.PathVariable
    long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PatchMapping(value = {"/{id}/desactive"})
    public org.springframework.http.ResponseEntity<com.produto.api.controller.response.ProductResponse> inactiveStatusProduct(@org.springframework.web.bind.annotation.PathVariable
    long id) {
        return null;
    }
}