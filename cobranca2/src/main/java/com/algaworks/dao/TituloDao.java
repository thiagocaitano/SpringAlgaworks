package com.algaworks.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.model.Titulo;

public interface TituloDao extends JpaRepository<Titulo, Long> {

	
}
