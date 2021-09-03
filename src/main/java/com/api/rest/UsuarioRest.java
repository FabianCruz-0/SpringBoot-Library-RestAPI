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

import com.api.dao.UsuarioDAO;
import com.api.model.Usuario;

@RestController
@CrossOrigin(origins="http://localhost:4200/")
@RequestMapping("usuario")
public class UsuarioRest {
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	//METODOS HTTP-- SOLICITUD AL SERVIDOR
	@PostMapping("/guardar")
	public void guardar(@RequestBody Usuario usuario) throws Exception{
		if(usuario.getNombre() == null || usuario.getNombre() == "" || 
		 usuario.getApellidos() == null || usuario.getApellidos() == "" ||
		 usuario.getDni() == null || usuario.getDni() == "" ||
		 usuario.getDomicilio() == null || usuario.getDomicilio() == "" ||
		 usuario.getEstado() == null || usuario.getEstado() == "" ||
		 usuario.getCiudad() == null || usuario.getCiudad() == "" ||
		 usuario.getFechaNacimiento() == null || usuario.getFechaNacimiento() == ""
		  )
		{
			throw new Exception("NO SE RECIBEN DATOS VACÍOS");
		}
		else
		{
			usuarioDAO.save(usuario);
		}
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
	public void actualizar(@RequestBody Usuario usuario) throws Exception{
		if(usuario.getNombre() == null || usuario.getNombre() == "" || 
				 usuario.getApellidos() == null || usuario.getApellidos() == "" ||
				 usuario.getDni() == null || usuario.getDni() == "" ||
				 usuario.getDomicilio() == null || usuario.getDomicilio() == "" ||
				 usuario.getEstado() == null || usuario.getEstado() == "" ||
				 usuario.getCiudad() == null || usuario.getCiudad() == "" ||
				 usuario.getFechaNacimiento() == null || usuario.getFechaNacimiento() == ""
				  )
				{
					throw new Exception("NO SE RECIBEN DATOS VACÍOS");
				}
				else
				{
					usuarioDAO.save(usuario);
				}
	}
	
	@GetMapping("/{id}")
	public Optional<Usuario> listar(@PathVariable("id") Integer id){
		
		return usuarioDAO.findById(id); 
	}	
	
	 

}
