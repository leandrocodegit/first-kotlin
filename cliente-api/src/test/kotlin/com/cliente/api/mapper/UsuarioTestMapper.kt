package com.cliente.api.mapper

import com.cliente.api.build.UsuarioBuild
import com.cliente.api.controller.request.UsuarioRequest
import com.cliente.api.entity.Usuario
import org.junit.jupiter.api.Test
import org.mapstruct.factory.Mappers


class UsuarioTestMapper() {

    private val usuarioMapper = Mappers.getMapper(UsuarioMapper::class.java)

    @Test
    fun `converter test mapper usuario entity to response`(){
       val usuarioCreate: Usuario = UsuarioBuild().createUsuario()
       val usuarioResponse = usuarioMapper.toResponse(usuarioCreate)

        assert(usuarioCreate.id == usuarioResponse.id)
        assert(usuarioCreate.email == usuarioResponse.email)
        assert(usuarioCreate.nome == usuarioResponse.nome)
        assert(usuarioCreate.idade == usuarioResponse.idade)
        assert(usuarioCreate.telefone == usuarioResponse.telefone)
        assert(usuarioCreate.isActive == usuarioResponse.isActive)
    }

    @Test
    fun `converter test mapper usuario response to entity`(){
        val usuarioRequest: UsuarioRequest = UsuarioBuild().createUsuarioRequest()
        val usuarioCreate = usuarioMapper.toEntity(usuarioRequest)

        assert(usuarioCreate.email == usuarioRequest.email)
        assert(usuarioCreate.nome == usuarioRequest.nome)
        assert(usuarioCreate.idade == usuarioRequest.idade)
        assert(usuarioCreate.telefone == usuarioRequest.telefone)
        assert(usuarioCreate.senha == usuarioRequest.senha)
    }

}