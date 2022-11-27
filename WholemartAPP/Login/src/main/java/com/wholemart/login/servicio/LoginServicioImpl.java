package com.wholemart.login.servicio;

import com.wholemart.login.dto.LoginDTO;
import com.wholemart.login.modelo.Usuario;
import com.wholemart.login.repository.LoginRepository;
import com.wholemart.registro.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServicioImpl implements LoginServicio{
    private LoginServicio loginServicio;

    //public LoginServicioImpl(UsuarioRepository usuarioRepository) {
        //this.usuarioRepository = usuarioRepository;
   // }
@Autowired
    LoginRepository loginRepository;
    @Override
    public String autenticar(LoginDTO loginDTO) {
        System.out.println("LoginDTO" +loginDTO.toString());
        Usuario resultadoUsuario = loginRepository.findByEmailAndPassword(loginDTO.getCorreoElectronico(), loginDTO.getPassword());

        if (resultadoUsuario !=null){
            return  "Login exitoso";
        }else  {return "Usuario o contraseña incorrecta";}
    }
}
