package com.wholemart.registro.controlador;

import com.wholemart.registro.dto.UsuarioRegistroDTO;
import com.wholemart.registro.servicio.UsuarioServicio;
import org.hibernate.boot.jaxb.Origin;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class RegistroUsuarioControlador {

    private UsuarioServicio usuarioServicio;

    public RegistroUsuarioControlador(UsuarioServicio usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }

    @ModelAttribute("usuario")
    public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO(){
        return new UsuarioRegistroDTO();
    }
    @GetMapping("/register")
    public String mostrarFormularioDeRegistro(){
        return "com/wholemart/registro";
    }

   @CrossOrigin(origins = "http://127.0.0.1:5500/")
    @PostMapping("registrar")
    public  String registrarCuentaUsuario(@RequestBody UsuarioRegistroDTO registroDTO){
       System.out.println("registroDTO"+ registroDTO.toString());;
        usuarioServicio.guardarUsuario(registroDTO);
        return "redirect:/Usuario Registrado con Exito";
    }

}
