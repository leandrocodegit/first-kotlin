package com.api.delivery.mapper;

import java.lang.System;

@org.mapstruct.Mapper
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\'\u00a8\u0006\t"}, d2 = {"Lcom/api/delivery/mapper/DeliveryMapper;", "", "toEntity", "Lcom/api/delivery/model/Delivery;", "deliveryRequest", "Lcom/api/delivery/controller/request/DeliveryRequest;", "toResponse", "Lcom/api/delivery/controller/response/DeliveryResponse;", "delivery", "delivery-api"})
public abstract interface DeliveryMapper {
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.Mappings(value = {@org.mapstruct.Mapping(target = "addressDelivery", ignore = true), @org.mapstruct.Mapping(target = "status", expression = "java(StatusDelivery.OPEN)"), @org.mapstruct.Mapping(target = "id", expression = "java(ObjectId.get())")})
    public abstract com.api.delivery.model.Delivery toEntity(@org.jetbrains.annotations.NotNull
    com.api.delivery.controller.request.DeliveryRequest deliveryRequest);
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.Mapping(target = "id", expression = "java(delivery.getId().toString())")
    public abstract com.api.delivery.controller.response.DeliveryResponse toResponse(@org.jetbrains.annotations.NotNull
    com.api.delivery.model.Delivery delivery);
}