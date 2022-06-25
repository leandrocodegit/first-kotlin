package com.cliente.api.controller

import com.cliente.api.build.UsuarioBuild
import com.cliente.api.controller.request.UsuarioRequest
import com.cliente.api.controller.response.UsuarioResponse
import com.cliente.api.entity.Usuario
import com.cliente.api.mapper.UsuarioMapper
import com.cliente.api.repository.UsuarioRepository
import com.cliente.api.service.UsuarioService
import com.cliente.api.util.URL_USERS
import com.cliente.api.util.URL_USER_ACTIVE
import com.cliente.api.util.URL_USER_DESACTIVE
import com.fasterxml.jackson.databind.ObjectMapper
import com.ninjasquad.springmockk.MockkBean
import io.mockk.coEvery
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.impl.annotations.SpyK
import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mock
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.context.annotation.Bean
import org.springframework.http.MediaType
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import org.springframework.test.web.servlet.result.MockMvcResultHandlers.print
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.web.servlet.function.ServerRequest
import java.util.*

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@ActiveProfiles("test")
@ExtendWith(MockKExtension::class)
class UsuarioControllerTest() {

    @Autowired
    private lateinit var mockMvc: MockMvc
    @Autowired
    private lateinit var usuarioService: UsuarioService
    @MockkBean
    private lateinit var usuarioRepository: UsuarioRepository
    @Autowired
    private lateinit var usuarioMapper: UsuarioMapper

    private lateinit var usuario: Usuario
    private lateinit var usuarioRequest: UsuarioRequest
    private lateinit var listUsers: List<Usuario>
    private lateinit var usuarioActiveMock:Usuario
    private lateinit var usuarioDesactiveMock:Usuario

    @BeforeEach
    fun setup(){
        usuarioRequest = UsuarioBuild().createUsuarioRequest()
        usuario = UsuarioBuild().createUsuario()
        usuario.email = usuarioRequest.email
        listUsers = listOf(
            UsuarioBuild().createUsuarioActive(),
            UsuarioBuild().createUsuarioInactive()
        )
        every { usuarioService.listAllUsuario() } returns listUsers
        every { usuarioRepository.findAll() } returns listUsers

        usuarioActiveMock  = usuarioRepository.findAll().first()
        usuarioDesactiveMock  = usuarioRepository.findAll().last()



    }

    @Test
    fun `test create new usuario`(){

        every { usuarioRepository.save(any()) } returns usuario
        every { usuarioService.saveUsuario(usuario) } returns usuario
        every { usuarioRepository.findByEmail(usuarioRequest.email) } returns Optional.empty()

        val body = ObjectMapper().writeValueAsString(usuarioRequest)

        this.mockMvc.perform(
            post(URL_USERS)
            .contentType(MediaType.APPLICATION_JSON)
                .content(body))
            .andDo(print())
            .andExpect(status().isOk)
            .andExpect(jsonPath("$.id").exists())
    }

    @Test
    fun `test list all usuarios`(){

        this.mockMvc.perform(get(URL_USERS)
            .contentType(MediaType.APPLICATION_JSON))
            .andDo(print())
            .andExpect(status().isOk)
            .andExpect(jsonPath("$[0].id").exists())
            .andExpect(jsonPath("$[0].id").value(usuarioActiveMock.id))
            .andExpect(jsonPath("$[0].isActive").value(true))
    }

    @Test
    fun `test desactive usuario`(){

        every { usuarioRepository.save(usuarioActiveMock) } returns usuarioActiveMock
        every { usuarioRepository.findById(usuarioActiveMock.id) } returns Optional.of(usuarioActiveMock)

        this.mockMvc.perform(
            patch("${URL_USERS}${URL_USER_DESACTIVE}",usuarioActiveMock.id)
                .contentType(MediaType.APPLICATION_JSON))
            .andDo(print())
            .andExpect(status().isOk)
            .andExpect(jsonPath("$.id").exists())
            .andExpect(jsonPath("$.id").value(usuarioActiveMock.id))
            .andExpect(jsonPath("$.isActive").value(false))
    }

    @Test
    fun `test active usuario`(){

        every { usuarioRepository.save(usuarioDesactiveMock) } returns usuarioDesactiveMock
        every { usuarioRepository.findById(usuarioDesactiveMock.id) } returns Optional.of(usuarioDesactiveMock)

        this.mockMvc.perform(
            patch("${URL_USERS}${URL_USER_ACTIVE}",usuarioDesactiveMock.id)
                .contentType(MediaType.APPLICATION_JSON))
            .andDo(print())
            .andExpect(status().isOk)
            .andExpect(jsonPath("$.id").exists())
            .andExpect(jsonPath("$.id").value(usuarioDesactiveMock.id))
            .andExpect(jsonPath("$.isActive").value(true))
    }
}