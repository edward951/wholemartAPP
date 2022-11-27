package com.wholemart.registro.modelo;

import javax.persistence.*;

@Entity
@Table(name = "rol")
public class Rol {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreCompleto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Rol(int id, String nombreCompleto) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
    }

    public Rol() {
    }

    public Rol(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
}
