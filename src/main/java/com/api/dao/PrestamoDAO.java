package com.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.model.Prestamo;

public interface PrestamoDAO extends JpaRepository <Prestamo, Integer>{

}
