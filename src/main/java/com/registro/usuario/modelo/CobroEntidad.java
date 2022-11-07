package com.registro.usuario.modelo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tabla_cobros")
public class CobroEntidad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre",nullable = false,length = 20)
	private String nombre;
	
	@Column(name = "totalcobro",nullable = false,length = 20)
	private float totalcobro;
	
	@Column(name = "fecha")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	@PrePersist
	public void prePersist() {
		this.fecha = new Date();
	}

	@Column(name = "ruc",nullable = false,length = 20)
	private String ruc;
	
	public CobroEntidad() {

	}


	public CobroEntidad(Long id, String nombre, float totalcobro, Date fecha, String ruc) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.totalcobro = totalcobro;
		this.fecha = fecha;
		this.ruc = ruc;
	}
	
	public CobroEntidad(String nombre, float totalcobro, Date fecha, String ruc) {
		super();
		this.nombre = nombre;
		this.totalcobro = totalcobro;
		this.ruc = ruc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getTotalcobro() {
		return totalcobro;
	}

	public void setTotalcobro(float totalcobro) {
		this.totalcobro = totalcobro;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getRuc() {
		return ruc;
	}

	public void setruc(String ruc) {
		this.ruc = ruc;
	}

	@Override
	public String toString() {
		return "CobroEntidad [id=" + id + ", nombre=" + nombre + ", totalcobro=" + totalcobro + ", fecha" + fecha + ", ruc=" + fecha + "]";
	}
	
	
}
