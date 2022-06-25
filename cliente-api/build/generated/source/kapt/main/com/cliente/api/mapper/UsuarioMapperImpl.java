package com.cliente.api.mapper;

import com.cliente.api.controller.request.UsuarioRequest;
import com.cliente.api.controller.response.EnderecoResponse;
import com.cliente.api.controller.response.UsuarioResponse;
import com.cliente.api.entity.Endereco;
import com.cliente.api.entity.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-24T11:49:33-0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.6.21.jar, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public Usuario toEntity(UsuarioRequest request) {
        if ( request == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setEmail( request.getEmail() );
        usuario.setNome( request.getNome() );
        usuario.setIdade( request.getIdade() );
        usuario.setTelefone( request.getTelefone() );
        usuario.setSenha( request.getSenha() );

        return usuario;
    }

    @Override
    public UsuarioResponse toResponse(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        long id = 0L;
        String email = null;
        String nome = null;
        int idade = 0;
        List<EnderecoResponse> enderecos = null;
        String telefone = null;

        id = usuario.getId();
        email = usuario.getEmail();
        nome = usuario.getNome();
        idade = usuario.getIdade();
        enderecos = enderecoListToEnderecoResponseList( usuario.getEnderecos() );
        telefone = usuario.getTelefone();

        boolean isActive = false;

        UsuarioResponse usuarioResponse = new UsuarioResponse( id, email, nome, idade, enderecos, telefone, isActive );

        usuarioResponse.setActive( usuario.isActive() );

        return usuarioResponse;
    }

    protected EnderecoResponse enderecoToEnderecoResponse(Endereco endereco) {
        if ( endereco == null ) {
            return null;
        }

        long id = 0L;
        String rua = null;
        String numero = null;
        String cidade = null;
        String estado = null;

        id = endereco.getId();
        rua = endereco.getRua();
        numero = endereco.getNumero();
        cidade = endereco.getCidade();
        estado = endereco.getEstado();

        boolean isDelivery = false;

        EnderecoResponse enderecoResponse = new EnderecoResponse( id, rua, numero, cidade, estado, isDelivery );

        enderecoResponse.setDelivery( endereco.isDelivery() );

        return enderecoResponse;
    }

    protected List<EnderecoResponse> enderecoListToEnderecoResponseList(List<Endereco> list) {
        if ( list == null ) {
            return null;
        }

        List<EnderecoResponse> list1 = new ArrayList<EnderecoResponse>( list.size() );
        for ( Endereco endereco : list ) {
            list1.add( enderecoToEnderecoResponse( endereco ) );
        }

        return list1;
    }
}
