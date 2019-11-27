package com.example.demo.cidades.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.cidades.Cidade;
import com.example.demo.cidades.Estado;

public interface CidadeRepository extends JpaRepository<Cidade,Long> {

}
