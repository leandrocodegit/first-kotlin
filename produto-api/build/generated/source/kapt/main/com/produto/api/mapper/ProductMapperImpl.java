package com.produto.api.mapper;

import com.produto.api.controller.request.ProductRequest;
import com.produto.api.controller.response.ProductResponse;
import com.produto.api.model.Product;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-22T17:22:22-0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.6.21.jar, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product toEntity(ProductRequest productRequest) {
        if ( productRequest == null ) {
            return null;
        }

        boolean isActive = false;
        String nome = null;
        int quantidade = 0;
        double valor = 0.0d;
        String descricao = null;

        isActive = productRequest.isActive();
        nome = productRequest.getNome();
        quantidade = productRequest.getQuantidade();
        valor = productRequest.getValor();
        descricao = productRequest.getDescricao();

        long id = 0L;

        Product product = new Product( id, nome, quantidade, valor, descricao, isActive );

        product.setActive( productRequest.isActive() );

        return product;
    }

    @Override
    public ProductResponse toResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        boolean isActive = false;
        long id = 0L;
        String nome = null;
        int quantidade = 0;
        double valor = 0.0d;
        String descricao = null;

        isActive = product.isActive();
        id = product.getId();
        nome = product.getNome();
        quantidade = product.getQuantidade();
        valor = product.getValor();
        descricao = product.getDescricao();

        ProductResponse productResponse = new ProductResponse( id, nome, quantidade, valor, descricao, isActive );

        productResponse.setActive( product.isActive() );

        return productResponse;
    }
}
