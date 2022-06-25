package com.api.delivery.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\t\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/api/delivery/service/DeliveryService;", "", "deliveryRepository", "Lcom/api/delivery/repository/DeliveryRepository;", "restClient", "Lcom/api/delivery/integracao/client/rest/RestClient;", "(Lcom/api/delivery/repository/DeliveryRepository;Lcom/api/delivery/integracao/client/rest/RestClient;)V", "getDeliveryByClient", "Lcom/api/delivery/model/Delivery;", "id", "Lorg/bson/types/ObjectId;", "idClient", "", "listAllDeliveryesClient", "", "saveDelivery", "delivery", "delivery-api"})
@org.springframework.stereotype.Service
public class DeliveryService {
    private final com.api.delivery.repository.DeliveryRepository deliveryRepository = null;
    private final com.api.delivery.integracao.client.rest.RestClient restClient = null;
    
    public DeliveryService(@org.jetbrains.annotations.NotNull
    com.api.delivery.repository.DeliveryRepository deliveryRepository, @org.jetbrains.annotations.NotNull
    com.api.delivery.integracao.client.rest.RestClient restClient) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.api.delivery.model.Delivery saveDelivery(@org.jetbrains.annotations.NotNull
    com.api.delivery.model.Delivery delivery) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.api.delivery.model.Delivery> listAllDeliveryesClient(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.api.delivery.model.Delivery getDeliveryByClient(@org.jetbrains.annotations.NotNull
    org.bson.types.ObjectId id, long idClient) {
        return null;
    }
}