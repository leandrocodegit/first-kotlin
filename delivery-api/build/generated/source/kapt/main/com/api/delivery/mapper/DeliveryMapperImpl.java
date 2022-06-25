package com.api.delivery.mapper;

import com.api.delivery.controller.request.DeliveryRequest;
import com.api.delivery.controller.request.ProductRequest;
import com.api.delivery.controller.response.DeliveryResponse;
import com.api.delivery.controller.response.ProductResponse;
import com.api.delivery.enuns.StatusDelivery;
import com.api.delivery.model.Delivery;
import com.api.delivery.model.Product;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-24T21:23:10-0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.6.21.jar, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class DeliveryMapperImpl implements DeliveryMapper {

    @Override
    public Delivery toEntity(DeliveryRequest deliveryRequest) {
        if ( deliveryRequest == null ) {
            return null;
        }

        long idClient = 0L;
        List<Product> products = null;

        idClient = deliveryRequest.getIdClient();
        products = productRequestListToProductList( deliveryRequest.getProducts() );

        String addressDelivery = null;
        StatusDelivery status = StatusDelivery.OPEN;
        ObjectId id = ObjectId.get();

        Delivery delivery = new Delivery( id, idClient, status, products, addressDelivery );

        return delivery;
    }

    @Override
    public DeliveryResponse toResponse(Delivery delivery) {
        if ( delivery == null ) {
            return null;
        }

        long idClient = 0L;
        StatusDelivery status = null;
        List<ProductResponse> products = null;
        String addressDelivery = null;

        idClient = delivery.getIdClient();
        status = delivery.getStatus();
        products = productListToProductResponseList( delivery.getProducts() );
        addressDelivery = delivery.getAddressDelivery();

        String id = delivery.getId().toString();

        DeliveryResponse deliveryResponse = new DeliveryResponse( id, idClient, status, products, addressDelivery );

        return deliveryResponse;
    }

    protected Product productRequestToProduct(ProductRequest productRequest) {
        if ( productRequest == null ) {
            return null;
        }

        long idProduct = 0L;
        int qtd = 0;

        idProduct = productRequest.getIdProduct();
        qtd = productRequest.getQtd();

        Product product = new Product( idProduct, qtd );

        return product;
    }

    protected List<Product> productRequestListToProductList(List<ProductRequest> list) {
        if ( list == null ) {
            return null;
        }

        List<Product> list1 = new ArrayList<Product>( list.size() );
        for ( ProductRequest productRequest : list ) {
            list1.add( productRequestToProduct( productRequest ) );
        }

        return list1;
    }

    protected ProductResponse productToProductResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        long idProduct = 0L;
        int qtd = 0;

        idProduct = product.getIdProduct();
        qtd = product.getQtd();

        ProductResponse productResponse = new ProductResponse( idProduct, qtd );

        return productResponse;
    }

    protected List<ProductResponse> productListToProductResponseList(List<Product> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductResponse> list1 = new ArrayList<ProductResponse>( list.size() );
        for ( Product product : list ) {
            list1.add( productToProductResponse( product ) );
        }

        return list1;
    }
}
