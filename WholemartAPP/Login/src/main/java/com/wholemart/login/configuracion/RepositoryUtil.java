package com.wholemart.login.configuracion;

import com.wholemart.registro.modelo.Usuario;
import com.wholemart.registro.repositorio.UsuarioRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryUtil {

    @Bean
    public Usuario obtenerUsuario(){
        return new Usuario();
    }

}
