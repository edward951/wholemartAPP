package com.wholemart.login.dto;

public class LoginDTO {
    String correoElectronico;
    String password;

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginDTO{" +
                "correoElectronico='" + correoElectronico + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
