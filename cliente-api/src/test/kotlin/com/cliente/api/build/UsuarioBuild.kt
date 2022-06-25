package com.cliente.api.build

import com.cliente.api.controller.request.EnderecoRequest
import com.cliente.api.controller.request.UsuarioRequest
import com.cliente.api.controller.response.EnderecoResponse
import com.cliente.api.controller.response.UsuarioResponse
import com.cliente.api.entity.Endereco
import com.cliente.api.entity.Usuario
import com.cliente.api.util.BuscaEndereco
import java.util.Random

class UsuarioBuild(
    var id: Long = 0,
    var email: String = "@gft.com",
    var nome: String = "Leandro Oliveira",
    var idade: Int = 33,
    var endereco: List<Endereco> = listOf(Endereco(Random().nextLong(10000000), "Ruas dos bobos", "zero", "Bobos","BB","0000000000")),
    var telefone: String = "9999999999",
    var senha: String = "admin",
    var isActive: Boolean = true
)    {
    fun createUsuario(): Usuario{
        return Usuario(Random().nextLong(10000000),"email${Random().nextInt(10000000)}${email}",nome, idade, endereco,telefone,senha,isActive)
    }

    fun createUsuarioResponse(): UsuarioResponse{
        var list = listOf<EnderecoResponse>(EnderecoResponse(Random().nextLong(10000000), "Ruas dos bobos", "zero", "Bobos","BB"))
        return UsuarioResponse(Random().nextLong(10000000),"email${Random().nextInt(10000000)}${email}",nome, idade, list,telefone,isActive)
    }

    fun createUsuarioRequest(): UsuarioRequest{
        return UsuarioRequest("email${Random().nextInt(10000000)}${email}",nome, idade, EnderecoRequest("rua um", "zero"),telefone,senha)
    }
    fun createUsuarioActive(): Usuario{
        return Usuario(Random().nextLong(10000000),"email${Random().nextInt(10000000)}${email}",nome, idade, endereco,telefone,senha,true)
    }

    fun createUsuarioInactive(): Usuario{
        return Usuario(Random().nextLong(10000000),"email${Random().nextInt(10000000)}${email}",nome, idade, endereco,telefone,senha,false)
    }

}