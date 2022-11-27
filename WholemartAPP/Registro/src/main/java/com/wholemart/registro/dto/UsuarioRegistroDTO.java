package com.wholemart.registro.dto;

public class UsuarioRegistroDTO {

    private Long id;
    private String nombreCompleto;
    private String email;
    private String nombreUsuario;
    private String passwordone;
    private String passwordConfirm;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPasswordone() {
        return passwordone;
    }

    public void setPassword(String passwordone) {
        this.passwordone = passwordone;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public UsuarioRegistroDTO(Long id, String nombreCompleto, String email, String nombreUsuario, String passwordone, String passwordConfirm) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.nombreUsuario = nombreUsuario;
        this.passwordone = passwordone;
        this.passwordConfirm = passwordConfirm;
    }

    public UsuarioRegistroDTO(String nombreCompleto, String email, String nombreUsuario, String passwordone, String passwordConfirm) {
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.nombreUsuario = nombreUsuario;
        this.passwordone = passwordone;
        this.passwordConfirm = passwordConfirm;
    }

    public UsuarioRegistroDTO(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UsuarioRegistroDTO{" +
                "id=" + id +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", email='" + email + '\'' +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", passwordone='" + passwordone + '\'' +
                ", passwordConfirm='" + passwordConfirm + '\'' +
                '}';
    }

    public UsuarioRegistroDTO() {

    }
}
