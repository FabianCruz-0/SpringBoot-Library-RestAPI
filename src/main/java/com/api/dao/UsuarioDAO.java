package com.api.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.api.model.Usuario;

public interface UsuarioDAO extends JpaRepository <Usuario, Integer> {

}
