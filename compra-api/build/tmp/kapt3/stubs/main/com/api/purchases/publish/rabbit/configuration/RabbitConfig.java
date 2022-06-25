package com.api.purchases.publish.rabbit.configuration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0017J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017J\b\u0010\t\u001a\u00020\nH\u0017J\b\u0010\u000b\u001a\u00020\fH\u0017\u00a8\u0006\r"}, d2 = {"Lcom/api/purchases/publish/rabbit/configuration/RabbitConfig;", "", "()V", "directExchange", "Lorg/springframework/amqp/core/Exchange;", "messageConverter", "Lorg/springframework/amqp/support/converter/MessageConverter;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "purchaseBinging", "Lorg/springframework/amqp/core/Binding;", "purchasesModelQueue", "Lorg/springframework/amqp/core/Queue;", "purchases-api"})
@org.springframework.context.annotation.Configuration
public class RabbitConfig {
    
    public RabbitConfig() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    public org.springframework.amqp.core.Binding purchaseBinging() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    public org.springframework.amqp.core.Exchange directExchange() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    public org.springframework.amqp.core.Queue purchasesModelQueue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    public org.springframework.amqp.support.converter.MessageConverter messageConverter(@org.jetbrains.annotations.NotNull
    com.fasterxml.jackson.databind.ObjectMapper objectMapper) {
        return null;
    }
}