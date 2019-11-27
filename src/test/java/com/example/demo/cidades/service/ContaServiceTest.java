package com.example.demo.cidades.service;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.demo.cidades.Agencia;
import com.example.demo.cidades.Cliente;
import com.example.demo.cidades.Conta;
import com.example.demo.cidades.repository.AgenciaRepository;
import com.example.demo.cidades.repository.ClienteRepository;
import com.example.demo.cidades.repository.ContaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContaServiceTest {
	
	@Autowired
	private ContaRepository contaRepository;
	
	@Autowired
	private AgenciaRepository agenciaRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ContaService contaService;
	
	@After
	public void cleanAll() {
		//contaService.limpar();
	}
	
	@Test
	public void test() {
		Cliente cliente = clienteRepository.findAll().get(0);
		Agencia agencia = agenciaRepository.findAll().get(0);
		Conta conta = new Conta("69246-9",agencia,8500.0,cliente);
		
		contaRepository.save(conta);
		assertNotNull(conta);
		System.out.println(conta.getId());
	}
	
}
