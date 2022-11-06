package com.registro.usuario.dto;

public class UsuarioRegistroDTO {

    private Long id;

    private String nombres;

    private String email;

    private String password;

    private String cargo;

    private Long dni;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public UsuarioRegistroDTO(Long id, String nombres, String email, String password, String cargo, Long dni) {
        super();
        this.id = id;
        this.nombres = nombres;
        this.email = email;
        this.password = password;
        this.cargo = cargo;
        this.dni = dni;
    }

    public UsuarioRegistroDTO(String nombres, String email, String password, String cargo, Long dni) {
        super();
        this.nombres = nombres;
        this.email = email;
        this.password = password;
        this.cargo = cargo;
        this.dni = dni;
    }


    public UsuarioRegistroDTO() {
    }
}
