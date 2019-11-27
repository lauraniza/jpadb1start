package com.example.demo.cidades.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.cidades.Agencia;
import com.example.demo.cidades.Cidade;
import com.example.demo.cidades.repository.AgenciaRepository;

@Service
public class AgenciaService {
	
	@Autowired
	private AgenciaRepository agenciaRepository;
	
	public Agencia criar(String banco, String numero, Cidade cidade) {
		Agencia agencia = new Agencia (banco, numero, cidade);
		return agenciaRepository.save(agencia);
	}
	
	public void limpar() {
		agenciaRepository.deleteAll();
	}

}
