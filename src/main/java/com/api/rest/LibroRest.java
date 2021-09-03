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
import com.api.dao.LibroDAO;
import com.api.model.Libros;


@RestController
@CrossOrigin(origins="http://localhost:4200/")
@RequestMapping("libro")
public class LibroRest {
	
	@Autowired
	private LibroDAO libroDAO;
	
	//METODOS HTTP-- SOLICITUD AL SERVIDOR
	@PostMapping("/guardar")
	public void guardar(@RequestBody Libros libro) throws Exception{
		if(libro.getNombre() == null || libro.getNombre() == "" ||
				libro.getAnoEdicion() == null || libro.getAnoEdicion() == "" ||
				libro.getAutor() == null || libro.getAutor() == "" ||
				libro.getEditorial() == null || libro.getEditorial()  == "" ||
				libro.getGenero() == null || libro.getGenero() == "" ||
				libro.getId() == 0 ||
				libro.getNumPaginas() == null ||
				libro.getPais() == null || libro.getPais() == "" ||
				libro.getPrecio() == 0
				)
				{
					throw new Exception("NO SE RECIBEN DATOS VACÍOS");
				}
				else
				{
					libroDAO.save(libro);
				}
	}
	@GetMapping("/listar")
	public List<Libros> listar(){
		
		return libroDAO.findAll(); 
	}	
	@DeleteMapping("/eliminar/{id}")
	private void eliminar(@PathVariable("id") Integer id){
		
		libroDAO.deleteById(id);
	}
	
	@PutMapping("/actulizar")
	public void actualizar(@RequestBody Libros libro) throws Exception{
		if(libro.getNombre() == null || libro.getNombre() == "" ||
				libro.getAnoEdicion() == null || libro.getAnoEdicion() == "" ||
				libro.getAutor() == null || libro.getAutor() == "" ||
				libro.getEditorial() == null || libro.getEditorial()  == "" ||
				libro.getGenero() == null || libro.getGenero() == "" ||
				libro.getId() == 0 ||
				libro.getNumPaginas() == null ||
				libro.getPais() == null || libro.getPais() == "" ||
				libro.getPrecio() == 0
				)
				{
					throw new Exception("NO SE RECIBEN DATOS VACÍOS");
				}
				else
				{
					libroDAO.save(libro);
				}
	}
	@GetMapping("/{id}")
	public Optional<Libros> libro(@PathVariable("id") Integer id){
		return libroDAO.findById(id);
	}	
}


