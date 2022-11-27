package com.wholemart.login.modelo;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "usuarios",uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombreCompleto")
    private String nombreCompleto;
    private String email;

    @Column(name = "nombreUsuario")
    private String nombreUsuario;
    private String password;
    private String passwordConfirm;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(
            name = "usuarios_roles",
            joinColumns = @JoinColumn(name = "ususario_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "rol_id", referencedColumnName = "id")
    )
    private Collection<Rol> roles;

    public <T> Usuario(String nombreCompleto, String email, String nombreUsuario, String password, String passwordConfirm, List<T> role_user) {
    this.nombreCompleto= nombreCompleto;
    this.email = email;
    this.nombreUsuario = nombreUsuario;
    this.password = password;
    this.passwordConfirm = passwordConfirm;

    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String password) {
        this.password = passwordConfirm;
    }

    public Collection<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Rol> roles) {
        this.roles = roles;
    }

    public Usuario(Long id, String nombreCompleto, String email, String nombreUsuario, String password, String passwordConfirm,  Collection<Rol> roles) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
        this.roles = roles;
    }

    public Usuario(String nombreCompleto, String email, String nombreUsuario, String password, Collection<Rol> roles) {
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.passwordConfirm = getPasswordConfirm();
        this.roles = roles;
    }

    public Usuario() {
    }
}
