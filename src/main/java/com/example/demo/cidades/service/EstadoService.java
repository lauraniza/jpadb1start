package com.example.demo.cidades.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cidades.Estado;
import com.example.demo.cidades.repository.EstadoRepository;

@Service
public class EstadoService {
	@Autowired
	private EstadoRepository estadoRepository;
	
	public Estado criar(String nome) {
		Estado estado = new Estado(nome);
		return estadoRepository.save(estado);
	}
	
	public void limpar() {
		estadoRepository.deleteAll();
	}
	
	public void deletarPorId() {
		Long id = (long) 1;
		estadoRepository.deleteById(id );
	}
	
	public Estado buscarPorNomes(String nome) {
		return estadoRepository.findByNome(nome).orElseThrow(()-> new RuntimeException("Estado não encontrado."));
	}
}
