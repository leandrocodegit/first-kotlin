package com.api.delivery.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0017J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0017J\u001e\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00120\b2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/api/delivery/controller/DeliveryController;", "", "deliveryService", "Lcom/api/delivery/service/DeliveryService;", "deliveryMapper", "Lcom/api/delivery/mapper/DeliveryMapper;", "(Lcom/api/delivery/service/DeliveryService;Lcom/api/delivery/mapper/DeliveryMapper;)V", "createDelivery", "Lorg/springframework/http/ResponseEntity;", "Lcom/api/delivery/controller/response/DeliveryResponse;", "deliveryRequest", "Lcom/api/delivery/controller/request/DeliveryRequest;", "getDeliveryClient", "idClient", "", "id", "Lorg/bson/types/ObjectId;", "listAllDeliveryClient", "", "delivery-api"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/v1/delivery"})
@org.springframework.web.bind.annotation.RestController
public class DeliveryController {
    private final com.api.delivery.service.DeliveryService deliveryService = null;
    private final com.api.delivery.mapper.DeliveryMapper deliveryMapper = null;
    
    public DeliveryController(@org.jetbrains.annotations.NotNull
    com.api.delivery.service.DeliveryService deliveryService, @org.jetbrains.annotations.NotNull
    com.api.delivery.mapper.DeliveryMapper deliveryMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{idClient}"})
    public org.springframework.http.ResponseEntity<java.util.List<com.api.delivery.controller.response.DeliveryResponse>> listAllDeliveryClient(@org.springframework.web.bind.annotation.PathVariable
    long idClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{idClient}/{id}"})
    public org.springframework.http.ResponseEntity<com.api.delivery.controller.response.DeliveryResponse> getDeliveryClient(@org.springframework.web.bind.annotation.PathVariable
    long idClient, @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable
    org.bson.types.ObjectId id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping
    public org.springframework.http.ResponseEntity<com.api.delivery.controller.response.DeliveryResponse> createDelivery(@org.jetbrains.annotations.NotNull
    @javax.validation.Valid
    @org.springframework.web.bind.annotation.RequestBody
    com.api.delivery.controller.request.DeliveryRequest deliveryRequest) {
        return null;
    }
}