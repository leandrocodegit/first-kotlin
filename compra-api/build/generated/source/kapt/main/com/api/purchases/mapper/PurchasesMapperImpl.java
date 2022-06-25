package com.api.purchases.mapper;

import com.api.purchases.controller.request.ProductRequest;
import com.api.purchases.controller.request.PurchasesRequest;
import com.api.purchases.controller.response.ProductResponse;
import com.api.purchases.controller.response.PurchasesResponse;
import com.api.purchases.model.Product;
import com.api.purchases.model.Purchases;
import javax.annotation.processing.Generated;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-24T14:53:32-0300",
    comments = "version: 1.5.1.Final, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.6.21.jar, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class PurchasesMapperImpl implements PurchasesMapper {

    @Override
    public Purchases toEntity(PurchasesRequest purchasesRequest) {
        if ( purchasesRequest == null ) {
            return null;
        }

        long idClient = 0L;
        Product product = null;

        idClient = purchasesRequest.getIdClient();
        product = productRequestToProduct( purchasesRequest.getProduct() );

        ObjectId id = ObjectId.get();
        double total = 0.0d;
        String addressDelivery = null;

        Purchases purchases = new Purchases( id, idClient, product, total, addressDelivery );

        return purchases;
    }

    @Override
    public PurchasesResponse toResponse(Purchases purchases) {
        if ( purchases == null ) {
            return null;
        }

        long idClient = 0L;
        ProductResponse product = null;
        double total = 0.0d;
        String addressDelivery = null;

        idClient = purchases.getIdClient();
        product = productToProductResponse( purchases.getProduct() );
        total = purchases.getTotal();
        addressDelivery = purchases.getAddressDelivery();

        String id = purchases.getId().toString();

        PurchasesResponse purchasesResponse = new PurchasesResponse( id, idClient, product, total, addressDelivery );

        return purchasesResponse;
    }

    protected Product productRequestToProduct(ProductRequest productRequest) {
        if ( productRequest == null ) {
            return null;
        }

        long idProduct = 0L;
        int qtd = 0;

        idProduct = productRequest.getIdProduct();
        qtd = productRequest.getQtd();

        String name = null;
        double valor = 0.0d;

        Product product = new Product( idProduct, name, qtd, valor );

        return product;
    }

    protected ProductResponse productToProductResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        long idProduct = 0L;
        String name = null;
        int qtd = 0;
        double valor = 0.0d;

        idProduct = product.getIdProduct();
        name = product.getName();
        qtd = product.getQtd();
        valor = product.getValor();

        ProductResponse productResponse = new ProductResponse( idProduct, name, qtd, valor );

        return productResponse;
    }
}
