package com.wholemart.registro.servicio;

import com.wholemart.registro.dto.UsuarioRegistroDTO;
import com.wholemart.registro.modelo.Usuario;
//import org.springframework.security.core.userdetails.UserDetailsService;

public interface UsuarioServicio
        //extends UserDetailsService
        {
    public Usuario guardarUsuario(UsuarioRegistroDTO registroDTO);
}
