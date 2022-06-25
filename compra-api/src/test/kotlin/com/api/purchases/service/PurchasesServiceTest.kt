package com.api.purchases.service

import com.api.purchases.build.Builds
import com.api.purchases.exceptions.EntityException
import com.api.purchases.integracao.client.response.ClientResponse
import com.api.purchases.integracao.client.rest.RestClient
import com.api.purchases.integracao.product.response.ProductResponse
import com.api.purchases.integracao.product.rest.RestProduct
import com.api.purchases.model.Purchases
import com.api.purchases.repository.PurchasesRepository
import com.ninjasquad.springmockk.MockkBean
import feign.FeignException
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.extension.ExtendWith
import java.util.*
import kotlin.collections.List

@ExtendWith(MockKExtension::class)
class PurchasesServiceTest {

    @InjectMockKs
    private lateinit var purchasesService: PurchasesService
    @MockK
    private lateinit var purchasesRepository: PurchasesRepository
    @MockK
    private lateinit var restProduct: RestProduct
    @MockK
    private lateinit var restClient: RestClient
    private lateinit var purchases: Purchases
    private lateinit var productResponse: ProductResponse
    private lateinit var clientResponse: ClientResponse

    @BeforeEach
    fun setup(){
        purchases = Builds().createPurchases()
        productResponse = Builds().creatProducResponse()
        clientResponse = Builds().createClientResponse()

        every { purchasesRepository.save(any()) } returns purchases
        every { restProduct.requestProdust(purchases.product.idProduct) } returns productResponse
        every { restClient.requestClient(purchases.idClient) } returns clientResponse

    }

    @Test
    fun `test create new purchases`(){

      every { purchasesRepository.findById(purchases.id) } returns Optional.empty()
      var savePurchases: Purchases =  purchasesService.savePurchases(purchases)

        assert(savePurchases.id == purchases.id)
    }

    @Test
    fun `test create new purchases client age min invalid`(){

        clientResponse.idade = 15
        every { restClient.requestClient(clientResponse.id) } returns clientResponse
        assertThrows<EntityException> { purchasesService.savePurchases(purchases) }
    }

    @Test
    fun `test create new purchases client not found invalid`(){

        every { restClient.requestClient(purchases.idClient) } throws RuntimeException()
        assertThrows<RuntimeException> { purchasesService.savePurchases(purchases) }
    }

    @Test
    fun `test create new purchases product quantity invalid`(){

        purchases.product.qtd = 10000
        every { restProduct.requestProdust(purchases.product.idProduct) } returns productResponse
        assertThrows<EntityException> { purchasesService.savePurchases(purchases) }

        purchases.product.qtd = 0
        every { restProduct.requestProdust(purchases.product.idProduct) } returns productResponse
        assertThrows<EntityException> { purchasesService.savePurchases(purchases) }

        purchases.product.qtd = -10
        every { restProduct.requestProdust(purchases.product.idProduct) } returns productResponse
        assertThrows<EntityException> { purchasesService.savePurchases(purchases) }
    }

    @Test
    fun `test find purchases by id already exist`(){

        every { purchasesRepository.findById(purchases.id) } returns Optional.of(purchases)
        var findPurchases: Purchases =  purchasesService.buscaPurchases(purchases.id)
        assert(findPurchases.id == purchases.id)
    }

    @Test
    fun `test find purchases by id is not exist`(){

        every { purchasesRepository.findById(purchases.id) } returns Optional.empty()
        assertThrows<EntityException> { purchasesService.buscaPurchases(purchases.id) }
    }

    @Test
    fun `test find all purchases`(){

        every { purchasesRepository.findAllPurschasesByIdClient(1L) } returns listOf<Purchases>(
            Builds().createPurchases(),
            Builds().createPurchases())

        var listPurchases: List<Purchases> =  purchasesService.listAllPurchasesClient(1L)
        assert(listPurchases.isNotEmpty())
    }
}