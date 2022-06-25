package com.produto.api.controller

import com.produto.api.controller.request.ProductRequest
import com.produto.api.controller.response.ProductResponse
import com.produto.api.enum.StatusProduct
import com.produto.api.mapper.ProductMapper
import com.produto.api.model.Product
import com.produto.api.service.ProductService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.stream.Collectors
import javax.validation.Valid

@RestController
@RequestMapping("/api/v1/products")
class ProductController(
    private val productService: ProductService,
    private val productMapper: ProductMapper
) {

    @GetMapping("/{id}")
    fun buscaProduct(@PathVariable id: Long): ResponseEntity<ProductResponse>{
        print("PRODUCT ID ${id}")
        return ResponseEntity.ok(productMapper.toResponse(productService.buscaProduct(id)))
    }

    @GetMapping
    fun listAllProducts(): ResponseEntity<List<ProductResponse>>{
        var listResponse: List<ProductResponse> = productService
            .listAllPorducts()
            .stream()
            .map { product -> productMapper.toResponse(product) }
            .collect(Collectors.toList())
        return ResponseEntity.ok(listResponse)
    }

    @PostMapping
    fun createNewProduct(@RequestBody @Valid productRequest: ProductRequest): ResponseEntity<ProductResponse>{
        var product: Product = productService.createPorduct(productMapper.toEntity(productRequest))
        return ResponseEntity.ok(productMapper.toResponse(product))
    }

    @PatchMapping("/{id}/active")
    fun activeStatusProduct(@PathVariable id: Long): ResponseEntity<ProductResponse>{
        return ResponseEntity.ok(productMapper.toResponse(productService.updateStatusProduct(id, StatusProduct.ACTIVE)))
    }

    @PatchMapping("/{id}/desactive")
    fun inactiveStatusProduct(@PathVariable id: Long): ResponseEntity<ProductResponse>{
        return ResponseEntity.ok(productMapper.toResponse(productService.updateStatusProduct(id, StatusProduct.INACTIVE)))
    }





}