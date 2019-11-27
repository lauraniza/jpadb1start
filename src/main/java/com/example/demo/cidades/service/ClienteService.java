package com.example.demo.cidades.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cidades.Cliente;
import com.example.demo.cidades.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente criar(String nome, String cpf, String telefone) {
		Cliente cliente = new Cliente("Laura Pegini Niza", "10785061916","44991373008");
		return clienteRepository.save(cliente);
	}
	
	public void limpar() {
		clienteRepository.deleteAll();
	}

}
