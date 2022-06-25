package com.api.delivery.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\u000b"}, d2 = {"Lcom/api/delivery/repository/DeliveryRepository;", "Lorg/springframework/data/mongodb/repository/MongoRepository;", "Lcom/api/delivery/model/Delivery;", "Lorg/bson/types/ObjectId;", "findAllByIdClient", "", "idCleint", "", "findByIdAndIdClient", "Ljava/util/Optional;", "id", "delivery-api"})
public abstract interface DeliveryRepository extends org.springframework.data.mongodb.repository.MongoRepository<com.api.delivery.model.Delivery, org.bson.types.ObjectId> {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.api.delivery.model.Delivery> findAllByIdClient(long idCleint);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.Optional<com.api.delivery.model.Delivery> findByIdAndIdClient(@org.jetbrains.annotations.NotNull
    org.bson.types.ObjectId id, long idCleint);
}