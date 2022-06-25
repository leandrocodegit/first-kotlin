package com.api.purchases.exceptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\tH\u0017J.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J.\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0016H\u0017\u00a8\u0006\u0017"}, d2 = {"Lcom/api/purchases/exceptions/CustomResponseHandlerException;", "Lorg/springframework/web/servlet/mvc/method/annotation/ResponseEntityExceptionHandler;", "()V", "entityExceptionHandler", "Lorg/springframework/http/ResponseEntity;", "Lcom/api/purchases/exceptions/ResponseErro;", "ex", "Lcom/api/purchases/exceptions/EntityException;", "feingnExecption", "Lfeign/FeignException;", "handleHttpMessageNotReadable", "", "Lorg/springframework/http/converter/HttpMessageNotReadableException;", "headers", "Lorg/springframework/http/HttpHeaders;", "status", "Lorg/springframework/http/HttpStatus;", "request", "Lorg/springframework/web/context/request/WebRequest;", "handleMethodArgumentNotValid", "Lorg/springframework/web/bind/MethodArgumentNotValidException;", "illegalArgumentExceptionHandler", "Lorg/springframework/web/method/annotation/MethodArgumentTypeMismatchException;", "purchases-api"})
@org.springframework.web.bind.annotation.ControllerAdvice
public class CustomResponseHandlerException extends org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler {
    
    public CustomResponseHandlerException() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {com.api.purchases.exceptions.EntityException.class})
    public org.springframework.http.ResponseEntity<com.api.purchases.exceptions.ResponseErro> entityExceptionHandler(@org.jetbrains.annotations.NotNull
    com.api.purchases.exceptions.EntityException ex) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {org.springframework.web.method.annotation.MethodArgumentTypeMismatchException.class})
    public org.springframework.http.ResponseEntity<com.api.purchases.exceptions.ResponseErro> illegalArgumentExceptionHandler(@org.jetbrains.annotations.NotNull
    org.springframework.web.method.annotation.MethodArgumentTypeMismatchException ex) {
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
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {feign.FeignException.class})
    public org.springframework.http.ResponseEntity<com.api.purchases.exceptions.ResponseErro> feingnExecption(@org.jetbrains.annotations.NotNull
    feign.FeignException ex) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected org.springframework.http.ResponseEntity<java.lang.Object> handleHttpMessageNotReadable(@org.jetbrains.annotations.NotNull
    org.springframework.http.converter.HttpMessageNotReadableException ex, @org.jetbrains.annotations.NotNull
    org.springframework.http.HttpHeaders headers, @org.jetbrains.annotations.NotNull
    org.springframework.http.HttpStatus status, @org.jetbrains.annotations.NotNull
    org.springframework.web.context.request.WebRequest request) {
        return null;
    }
}