package com.cliente.api.service

import com.cliente.api.build.UsuarioBuild
import com.cliente.api.entity.Usuario
import com.cliente.api.enuns.StatusUsuario
import com.cliente.api.exceptions.EntityResponseException
import com.cliente.api.repository.UsuarioRepository
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import io.mockk.verify
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.test.util.AssertionErrors.*
import java.util.*

@ExtendWith(MockKExtension::class)
class UsuarioServiceTest {

    @InjectMockKs
    private lateinit var usuarioService: UsuarioService;
    @MockK
    private lateinit var usuarioRepository: UsuarioRepository

    private lateinit var usuarioActive:Usuario
    private lateinit var usuarioInactive:Usuario

    @BeforeEach
    private fun setup(){
        usuarioActive = UsuarioBuild().createUsuarioActive()
        usuarioInactive = UsuarioBuild().createUsuarioInactive()
    }

    @Test
    fun `test usuario is active`(){

        every { usuarioRepository.findById(usuarioActive.id) } returns Optional.of(usuarioActive)
        every { usuarioRepository.save(usuarioActive) } returns usuarioActive

        assertThrows<EntityResponseException> {usuarioService.updateStatusUsuario(usuarioActive.id,StatusUsuario.ATIVO).isActive }
        assertFalse("return false active", usuarioService.updateStatusUsuario(usuarioActive.id,StatusUsuario.INATIVO).isActive)
    }

    @Test
    fun `test usuario is inactive`(){

        every { usuarioRepository.findById(usuarioInactive.id) } returns Optional.of(usuarioInactive)
        every { usuarioRepository.save(usuarioInactive) } returns usuarioInactive

        assertThrows<EntityResponseException> {usuarioService.updateStatusUsuario(usuarioInactive.id,StatusUsuario.INATIVO).isActive }
        assertTrue("return true active", usuarioService.updateStatusUsuario(usuarioInactive.id,StatusUsuario.ATIVO).isActive)
        verify(exactly = 1){usuarioRepository.save(usuarioInactive)}

    }
}