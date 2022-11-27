package com.wholemart.registro.servicio;

import com.wholemart.registro.modelo.Rol;
import com.wholemart.registro.dto.UsuarioRegistroDTO;
import com.wholemart.registro.modelo.Usuario;
import com.wholemart.registro.repositorio.UsuarioRepository;
/*//import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;*/
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsuarioServicioImpl implements UsuarioServicio{
    private UsuarioRepository usuarioRepository;

    public UsuarioServicioImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario guardarUsuario(UsuarioRegistroDTO registroDTO) {
        Usuario usuario = new Usuario(registroDTO.getNombreCompleto(),
                registroDTO.getEmail(), registroDTO.getNombreUsuario(),
                registroDTO.getPasswordone(), registroDTO.getPasswordConfirm(), List.of(new Rol("ROLE_USER")));
        return usuarioRepository.save(usuario);
    }
//    @Override
//    public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException{
//
//        Usuario usuario = usuarioRepository.findByEmail(username);
//        if(usuario == null){
//            throw  new UsernameNotFoundException("Usuario o password inválidos");
//        }
//
//        return new User(usuario.getEmail(), usuario.getPassword(), mapearAutoridadesRoles(usuario.getRoles()));
//    }
//    private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(Collection<Rol> roles){
//        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getNombreCompleto())). collect(Collectors.toList());
//
//    }
}
