package com.example.demo.cidades.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.cidades.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
