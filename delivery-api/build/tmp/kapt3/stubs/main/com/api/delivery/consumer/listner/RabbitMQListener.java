package com.api.delivery.consumer.listner;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/api/delivery/consumer/listner/RabbitMQListener;", "", "deliveryService", "Lcom/api/delivery/service/DeliveryService;", "(Lcom/api/delivery/service/DeliveryService;)V", "receiveUserModelMessage", "", "message", "Lorg/springframework/amqp/core/Message;", "delivery-api"})
@org.springframework.stereotype.Service
public class RabbitMQListener {
    private com.api.delivery.service.DeliveryService deliveryService;
    
    public RabbitMQListener(@org.jetbrains.annotations.NotNull
    com.api.delivery.service.DeliveryService deliveryService) {
        super();
    }
    
    @org.springframework.amqp.rabbit.annotation.RabbitListener(queues = {"PURCHASES-MODEL-QUEUE"})
    public void receiveUserModelMessage(@org.jetbrains.annotations.NotNull
    org.springframework.amqp.core.Message message) {
    }
}