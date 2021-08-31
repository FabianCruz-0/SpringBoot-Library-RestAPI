package com.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.model.Libros;

public interface LibroDAO extends JpaRepository <Libros, Integer> {
}
