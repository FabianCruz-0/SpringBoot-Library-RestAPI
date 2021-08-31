package com.api.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Prestamo {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_prestamo")
	private int id ;
	@Column(name="id_libro")
	private int idLibro;
	@Column(name="id_usuario")
	private int idUsuario;
	@Column(name="fecha_salida")
	private String fechaSalida;
	@Column(name="fecha_maxima_devolucion")
	private String fechaMaxima;
	@Column(name="fecha_devolucion")
	private String fechaDevo;
	
	public Prestamo(){
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public String getFechaMaxima() {
		return fechaMaxima;
	}
	public void setFechaMaxima(String fechaMaxima) {
		this.fechaMaxima = fechaMaxima;
	}
	public String getFechaDevo() {
		return fechaDevo;
	}
	public void setFechaDevo(String fechaDevo) {
		this.fechaDevo = fechaDevo;
	}

}
