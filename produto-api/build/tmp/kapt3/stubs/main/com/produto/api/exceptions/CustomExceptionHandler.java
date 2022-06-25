package com.produto.api.exceptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J.\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014\u00a8\u0006\u0011"}, d2 = {"Lcom/produto/api/exceptions/CustomExceptionHandler;", "Lorg/springframework/web/servlet/mvc/method/annotation/ResponseEntityExceptionHandler;", "()V", "entitityCustomHandlerException", "Lorg/springframework/http/ResponseEntity;", "Lcom/produto/api/exceptions/ResponseErro;", "ex", "Lcom/produto/api/exceptions/EntityExecption;", "handleMethodArgumentNotValid", "", "Lorg/springframework/web/bind/MethodArgumentNotValidException;", "headers", "Lorg/springframework/http/HttpHeaders;", "status", "Lorg/springframework/http/HttpStatus;", "request", "Lorg/springframework/web/context/request/WebRequest;", "produto-api"})
@org.springframework.web.bind.annotation.ControllerAdvice
public class CustomExceptionHandler extends org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler {
    
    public CustomExceptionHandler() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {com.produto.api.exceptions.EntityExecption.class})
    public org.springframework.http.ResponseEntity<com.produto.api.exceptions.ResponseErro> entitityCustomHandlerException(@org.jetbrains.annotations.NotNull
    com.produto.api.exceptions.EntityExecption ex) {
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