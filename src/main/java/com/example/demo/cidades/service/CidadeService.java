package com.example.demo.cidades.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cidades.Cidade;
import com.example.demo.cidades.Estado;
import com.example.demo.cidades.repository.CidadeRepository;

@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	public Cidade criar(String nome, Estado uf) {
		Cidade cidade = new Cidade(nome,uf);
		return cidadeRepository.save(cidade);
	}
	
	public void limpar() {
		cidadeRepository.deleteAll();
	}

}
