package com.example.demo.cidades.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.cidades.Agencia;
import com.example.demo.cidades.Cliente;
import com.example.demo.cidades.Conta;
import com.example.demo.cidades.repository.ContaRepository;

@Service
public class ContaService {
	
	@Autowired
	private ContaRepository contaRepository;
	
	public Conta criar(String numero, Agencia agencia, Double saldo, Cliente cliente) {
		Conta conta = new Conta (numero, agencia, saldo, cliente);
		return contaRepository.save(conta);
	}
	
	public void limpar() {
		contaRepository.deleteAll();
	}
}
