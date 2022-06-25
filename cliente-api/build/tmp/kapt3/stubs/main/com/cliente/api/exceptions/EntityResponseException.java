package com.cliente.api.exceptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/cliente/api/exceptions/EntityResponseException;", "Lcom/cliente/api/exceptions/EntityException;", "message", "", "codigo", "Lcom/cliente/api/enuns/CodigoErro;", "(Ljava/lang/String;Lcom/cliente/api/enuns/CodigoErro;)V", "getCodigo", "()Lcom/cliente/api/enuns/CodigoErro;", "setCodigo", "(Lcom/cliente/api/enuns/CodigoErro;)V", "serialVersionUID", "", "cliente-api"})
public final class EntityResponseException extends com.cliente.api.exceptions.EntityException {
    @org.jetbrains.annotations.NotNull
    private com.cliente.api.enuns.CodigoErro codigo;
    private final long serialVersionUID = 7485635423254641L;
    
    public EntityResponseException(@org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.NotNull
    com.cliente.api.enuns.CodigoErro codigo) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.cliente.api.enuns.CodigoErro getCodigo() {
        return null;
    }
    
    public final void setCodigo(@org.jetbrains.annotations.NotNull
    com.cliente.api.enuns.CodigoErro p0) {
    }
}