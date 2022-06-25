package com.api.purchases.mapper;

import java.lang.System;

@org.mapstruct.Mapper
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\'\u00a8\u0006\t"}, d2 = {"Lcom/api/purchases/mapper/PurchasesMapper;", "", "toEntity", "Lcom/api/purchases/model/Purchases;", "purchasesRequest", "Lcom/api/purchases/controller/request/PurchasesRequest;", "toResponse", "Lcom/api/purchases/controller/response/PurchasesResponse;", "purchases", "purchases-api"})
public abstract interface PurchasesMapper {
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.Mappings(value = {@org.mapstruct.Mapping(target = "id", expression = "java(ObjectId.get())"), @org.mapstruct.Mapping(target = "product.name", ignore = true), @org.mapstruct.Mapping(target = "product.valor", ignore = true), @org.mapstruct.Mapping(target = "total", ignore = true), @org.mapstruct.Mapping(target = "addressDelivery", ignore = true)})
    public abstract com.api.purchases.model.Purchases toEntity(@org.jetbrains.annotations.NotNull
    com.api.purchases.controller.request.PurchasesRequest purchasesRequest);
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.Mappings(value = {@org.mapstruct.Mapping(target = "id", expression = "java(purchases.getId().toString())")})
    public abstract com.api.purchases.controller.response.PurchasesResponse toResponse(@org.jetbrains.annotations.NotNull
    com.api.purchases.model.Purchases purchases);
}