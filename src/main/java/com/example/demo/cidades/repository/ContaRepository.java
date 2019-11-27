package com.example.demo.cidades.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.cidades.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long> {

}
