package com.cliente.api.exceptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\u0006\u001a\u00020\u0010H\u0017J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\u0006\u001a\u00020\u0012H\u0017\u00a8\u0006\u0013"}, d2 = {"Lcom/cliente/api/exceptions/CustomRestExceptionHandler;", "Lorg/springframework/web/servlet/mvc/method/annotation/ResponseEntityExceptionHandler;", "()V", "handleMethodArgumentNotValid", "Lorg/springframework/http/ResponseEntity;", "", "ex", "Lorg/springframework/web/bind/MethodArgumentNotValidException;", "headers", "Lorg/springframework/http/HttpHeaders;", "status", "Lorg/springframework/http/HttpStatus;", "request", "Lorg/springframework/web/context/request/WebRequest;", "handlerEntityNotFoundException", "Lcom/cliente/api/exceptions/ResponseErro;", "Lcom/cliente/api/exceptions/EntityResponseException;", "handlerValidadeException", "Ljavax/validation/UnexpectedTypeException;", "cliente-api"})
@org.springframework.web.bind.annotation.ControllerAdvice
public class CustomRestExceptionHandler extends org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler {
    
    public CustomRestExceptionHandler() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {com.cliente.api.exceptions.EntityResponseException.class})
    public org.springframework.http.ResponseEntity<com.cliente.api.exceptions.ResponseErro> handlerEntityNotFoundException(@org.jetbrains.annotations.NotNull
    com.cliente.api.exceptions.EntityResponseException ex) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {javax.validation.UnexpectedTypeException.class})
    public org.springframework.http.ResponseEntity<com.cliente.api.exceptions.ResponseErro> handlerValidadeException(@org.jetbrains.annotations.NotNull
    javax.validation.UnexpectedTypeException ex) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected org.springframework.http.ResponseEntity<java.lang.Object> handleMethodArgumentNotValid(@org.jetbrains.annotations.NotNull
    org.springframework.web.bind.MethodArgumentNotValidException ex, @org.jetbrains.annotations.NotNull
    org.springframework.http.HttpHeaders headers, @org.jetbrains.annotations.NotNull
    org.springframework.http.HttpStatus status, @org.jetbrains.annotations.NotNull
    org.springframework.web.context.request.WebRequest request) {
        return null;
    }
}