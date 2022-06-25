package com.api.delivery.exceptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/api/delivery/exceptions/EntityException;", "Lcom/api/delivery/exceptions/CustomException;", "message", "", "codeError", "Lcom/api/delivery/enuns/CodeError;", "(Ljava/lang/String;Lcom/api/delivery/enuns/CodeError;)V", "getCodeError", "()Lcom/api/delivery/enuns/CodeError;", "setCodeError", "(Lcom/api/delivery/enuns/CodeError;)V", "delivery-api"})
public final class EntityException extends com.api.delivery.exceptions.CustomException {
    @org.jetbrains.annotations.NotNull
    private com.api.delivery.enuns.CodeError codeError;
    
    public EntityException(@org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.NotNull
    com.api.delivery.enuns.CodeError codeError) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.api.delivery.enuns.CodeError getCodeError() {
        return null;
    }
    
    public final void setCodeError(@org.jetbrains.annotations.NotNull
    com.api.delivery.enuns.CodeError p0) {
    }
}