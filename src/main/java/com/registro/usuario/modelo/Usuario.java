package com.registro.usuario.modelo;


import javax.persistence.*;
import java.util.Collection;


@Entity
@Table(name="empleados", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombres")
    private String nombres;

    @Column(name="cargo")
    private String cargo;

    @Column(name="dni")
    private Long dni;

    @Column(name="email")
    private String email;

    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable( name = "usuarios_roles", joinColumns =
                @JoinColumn(name = "usuario_id", referencedColumnName = "id"),
                inverseJoinColumns = @JoinColumn(name = "rol_id",referencedColumnName = "id"))
    private Collection<Rol> roles;



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

    public Collection<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Rol> roles) {
        this.roles = roles;
    }

    public Usuario(Long id, String nombres, String email, String password, String cargo, Long dni, Collection<Rol> roles) {
        super();
        this.id = id;
        this.nombres = nombres;
        this.email = email;
        this.password = password;
        this.cargo = cargo;
        this.dni = dni;
        this.roles = roles;
    }

    public Usuario(String nombres, String email, String password, String cargo, Long dni, Collection<Rol> roles) {
        super();
        this.nombres = nombres;
        this.email = email;
        this.password = password;
        this.cargo = cargo;
        this.dni = dni;
        this.roles = roles;
    }

    public Usuario() {
    }
}
