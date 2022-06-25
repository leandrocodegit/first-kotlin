package com.api.purchases.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/api/purchases/repository/PurchasesRepository;", "Lorg/springframework/data/mongodb/repository/MongoRepository;", "Lcom/api/purchases/model/Purchases;", "Lorg/bson/types/ObjectId;", "findAllPurschasesByIdClient", "", "id", "", "purchases-api"})
public abstract interface PurchasesRepository extends org.springframework.data.mongodb.repository.MongoRepository<com.api.purchases.model.Purchases, org.bson.types.ObjectId> {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.api.purchases.model.Purchases> findAllPurschasesByIdClient(long id);
}