package com.wholemart.login.controlador;

import com.wholemart.login.dto.LoginDTO;
import com.wholemart.login.servicio.LoginServicio;
import com.wholemart.registro.servicio.UsuarioServicio;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class LoginController {

    @RestController
    @RequestMapping("/")
    public class RegistroUsuarioControlador {

        private LoginServicio loginService;

        public RegistroUsuarioControlador(LoginServicio loginServicio) {
            this.loginService = loginServicio;
        }

        @ModelAttribute("login")
        public LoginDTO retornarNuevoUsuarioRegistroDTO(){
            return new LoginDTO();
        }
        @GetMapping("/login")
        public String mostrarFormularioDeRegistro(){
            return "com/wholemart/login";
        }

        @CrossOrigin(origins = "http://127.0.0.1:5500/")
        @PostMapping("autenticar")
        public  String registrarCuentaUsuario(@RequestBody LoginDTO loginDTO){
            System.out.println("Login" + loginDTO.toString());
            return loginService.autenticar(loginDTO);
        }

    }
}
