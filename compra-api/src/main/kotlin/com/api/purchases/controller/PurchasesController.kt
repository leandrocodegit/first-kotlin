package com.api.purchases.controller

import com.api.purchases.controller.request.PurchasesRequest
import com.api.purchases.controller.response.PurchasesResponse
import com.api.purchases.integracao.client.response.ClientResponse
import com.api.purchases.integracao.client.rest.RestClient
import com.api.purchases.integracao.product.response.ProductResponse
import com.api.purchases.integracao.product.rest.RestProduct
import com.api.purchases.mapper.PurchasesMapper
import com.api.purchases.model.Purchases
import com.api.purchases.service.PurchasesService
import org.bson.types.ObjectId
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.stream.Collectors
import javax.validation.Valid

@RestController
@RequestMapping("/api/v1/purchases")
class PurchasesController(
    private val purchasesService: PurchasesService,
    private val purchasesMapper: PurchasesMapper,
    private val restProduct: RestProduct,
    private val restClient: RestClient
) {

    @GetMapping("/{userId}")
    fun listAllPurchasesClient(@PathVariable userId: Long): ResponseEntity<List<PurchasesResponse>>{
        var list: List<PurchasesResponse> = purchasesService.listAllPurchasesClient(userId)
            .stream()
            .map { c -> purchasesMapper.toResponse(c) }
            .collect(Collectors.toList())
      return ResponseEntity.ok(list)
    }

    @GetMapping("/{userId}/{id}")
    fun buscaPurchases(@PathVariable id: ObjectId): ResponseEntity<PurchasesResponse>{
        return ResponseEntity.ok(purchasesMapper.toResponse(purchasesService.buscaPurchases(id)))
    }

    @GetMapping("/product/{id}")
    fun buscaProduct(@PathVariable id: Long): ResponseEntity<ProductResponse>{
        return ResponseEntity.ok(restProduct.requestProdust(id))
    }

    @GetMapping("/client/{id}")
    fun buscaClient(@PathVariable id: Long): ResponseEntity<ClientResponse>{
        return ResponseEntity.ok(restClient.requestClient(id))
    }

    @PostMapping
    fun createNewCompra(@RequestBody @Valid comprasRequest: PurchasesRequest): ResponseEntity<PurchasesResponse>{
        var purchases: Purchases = purchasesMapper.toEntity(comprasRequest)
        return ResponseEntity.ok(purchasesMapper.toResponse(purchasesService.savePurchases(purchases)))
    }


}