package com.cliente.api.repository

import com.cliente.api.build.UsuarioBuild
import com.cliente.api.entity.Usuario
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import java.util.*

@ExtendWith(MockKExtension::class)
class UsuarioServiceTest {

    @MockK
    private lateinit var usuarioRepository: UsuarioRepository

    @Test
    fun `test create new user`(){

        var newUsuario: Usuario = UsuarioBuild().createUsuario()
        every { usuarioRepository.save(newUsuario) } returns newUsuario

        var saveUsuario: Usuario = usuarioRepository.save(newUsuario)
        assertEquals(saveUsuario.id, newUsuario.id)

    }
    @Test
    fun `test find usuario`(){

        var usuario: Usuario = UsuarioBuild().createUsuario()
        every { usuarioRepository.findByEmail(usuario.email) } returns Optional.of(usuario)

        var srcUsuario: Usuario = usuarioRepository.findByEmail(usuario.email).get()
        assertEquals(usuario.email, srcUsuario.email)

    }
}