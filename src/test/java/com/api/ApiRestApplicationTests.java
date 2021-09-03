package com.api;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.api.dao.LibroDAO;
import com.api.model.Libros;

@SpringBootTest
class ApiRestApplicationTests {
	@Autowired
	LibroDAO libroDAO;
	
	@Test
	void contextLoads() 
	{
		Libros Libro = new Libros();
		Libro.setNombre("Fidel");
		libroDAO.save(Libro);
		assertEquals(25,libroDAO.findAll().size());
	}

}
