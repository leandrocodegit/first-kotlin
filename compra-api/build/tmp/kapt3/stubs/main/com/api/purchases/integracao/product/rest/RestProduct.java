package com.api.purchases.integracao.product.rest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/api/purchases/integracao/product/rest/RestProduct;", "", "requestProdust", "Lcom/api/purchases/integracao/product/response/ProductResponse;", "id", "", "purchases-api"})
@org.springframework.cloud.openfeign.FeignClient(name = "productReponse", url = "http://localhost:9090/api/v1/products")
public abstract interface RestProduct {
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    public abstract com.api.purchases.integracao.product.response.ProductResponse requestProdust(@org.springframework.web.bind.annotation.PathVariable
    long id);
}