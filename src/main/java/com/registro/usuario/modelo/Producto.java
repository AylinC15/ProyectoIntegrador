package com.registro.usuario.modelo;


import javax.persistence.*;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descripcion", nullable = false,length = 30)
    private String descripcion;
    @Column(name = "cantidad", nullable = false,length = 30)
    private int cantidad;
    @Column(name = "marca", nullable = false,length = 30)
    private String marca;
    @Column(name = "precio", nullable = false,length = 30)
    private double precio;

    public Producto() {
    }

    public Producto(Long id, String descripcion, int cantidad, String marca, double precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.marca = marca;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}
