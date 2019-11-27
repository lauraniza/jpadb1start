package com.example.demo.cidades.service;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.cidades.Cliente;
import com.example.demo.cidades.repository.ClienteRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClienteServiceTest {
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Test
	public void test() {
		Cliente cliente = new Cliente("Laura Pegini Niza","10785061916","44991373008");
		
		clienteRepository.save(cliente);
		assertNotNull(cliente);
		System.out.println(cliente.getId());
	}
	
	@After
	public void cleanAll() {
		//clienteService.limpar();
	}
}
