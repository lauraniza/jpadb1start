package com.example.demo.cidades.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.cidades.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long>{
	Optional<Estado> findByNome(String nome);
	
}
