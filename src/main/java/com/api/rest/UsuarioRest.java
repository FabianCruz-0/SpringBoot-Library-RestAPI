package com.api.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.dao.UsuarioDAO;
import com.api.model.Usuario;

@RestController
@RequestMapping("usuario")
public class UsuarioRest {
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	//METODOS HTTP-- SOLICITUD AL SERVIDOR
	@PostMapping("/guardar")
	public void guardar(@RequestBody Usuario usuario){
		
		usuarioDAO.save(usuario);
	}
	@GetMapping("/listar")
	public List<Usuario> listar(){
		
		return usuarioDAO.findAll(); 
	}	
	@DeleteMapping("/eliminar/{id}")
	private void eliminar(@PathVariable("id") Integer id){
		
		usuarioDAO.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Usuario usuario){
		usuarioDAO.save(usuario);
	}
	
	@GetMapping("/{id}")
	public Optional<Usuario> listar(@PathVariable("id") Integer id){
		
		return usuarioDAO.findById(id); 
	}	
	
	 

}
