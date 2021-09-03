package com.api.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.dao.PrestamoDAO;
import com.api.model.Prestamo;


@RestController
@CrossOrigin(origins="http://localhost:4200/")
@RequestMapping("prestamo")
public class PrestamoRest {
	
	@Autowired
	private PrestamoDAO prestamoDAO;
	
	//METODOS HTTP-- SOLICITUD AL SERVIDOR
	@PostMapping("/guardar")
	public void guardar(@RequestBody Prestamo prestamo) throws Exception{
		if(prestamo.getFechaSalida() == null || prestamo.getFechaSalida() == "" ||
				prestamo.getFechaMaxima() == null || prestamo.getFechaMaxima() == "" ||
				prestamo.getFechaDevo() == null || prestamo.getFechaDevo() == ""
				  )
				{
					throw new Exception("NO SE RECIBEN DATOS VACÍOS");
				}
				else
				{
					prestamoDAO.save(prestamo);
				}
	}
	@GetMapping("/listar")
	public List<Prestamo> listar(){
		
		return prestamoDAO.findAll(); 
	}	
	@DeleteMapping("/eliminar/{id}")
	private void eliminar(@PathVariable("id") Integer id){
		
		prestamoDAO.deleteById(id);
	}
	
	@PutMapping("/actulizar")
	public void actualizar(@RequestBody Prestamo prestamo) throws Exception{
		if(prestamo.getFechaSalida() == null || prestamo.getFechaSalida() == "" ||
				prestamo.getFechaMaxima() == null || prestamo.getFechaMaxima() == "" ||
				prestamo.getFechaDevo() == null || prestamo.getFechaDevo() == ""
				  )
				{
					throw new Exception("NO SE RECIBEN DATOS VACÍOS");
				}
				else
				{
					prestamoDAO.save(prestamo);
				}
	}
	@GetMapping("/{id}")
	public Optional<Prestamo> listar(@PathVariable("id") Integer id){
		
		return prestamoDAO.findById(id); 
	}	
	
	
	
	 

}

