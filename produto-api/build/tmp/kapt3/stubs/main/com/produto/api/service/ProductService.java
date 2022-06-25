package com.produto.api.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/produto/api/service/ProductService;", "", "productRepository", "Lcom/produto/api/repository/ProductRepository;", "(Lcom/produto/api/repository/ProductRepository;)V", "buscaProduct", "Lcom/produto/api/model/Product;", "id", "", "createPorduct", "produto", "listAllPorducts", "", "updateStatusProduct", "statusProduct", "Lcom/produto/api/enum/StatusProduct;", "produto-api"})
@org.springframework.stereotype.Service
public class ProductService {
    private com.produto.api.repository.ProductRepository productRepository;
    
    public ProductService(@org.jetbrains.annotations.NotNull
    com.produto.api.repository.ProductRepository productRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.produto.api.model.Product createPorduct(@org.jetbrains.annotations.NotNull
    com.produto.api.model.Product produto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.produto.api.model.Product> listAllPorducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.produto.api.model.Product buscaProduct(long id) {
        return null;
    }
}