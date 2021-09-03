package com.api.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Libros {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id_libro")
	private int id;
	@Column(name ="nombre")
	private String nombre;
	@Column(name ="editorial")
	private String editorial;
	@Column(name ="autor")
	private String autor;
	@Column(name ="genero")
	private String genero;
	
	@Column(name ="pais_autor")
	private String pais;
	@Column(name ="numero_paginas")
	private Integer numPaginas;
	@Column(name ="año_edicion")
	private String anoEdicion;
	@Column(name ="precio")
	private int  precio;
	
	public Libros () 
	{
		
	}
	 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Integer getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(Integer numPaginas) {
		this.numPaginas = numPaginas;
	}
	public String getAnoEdicion() {
		return anoEdicion;
	}
	public void setAnoEdicion(String anoEdicion) {
		this.anoEdicion = anoEdicion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	

}
