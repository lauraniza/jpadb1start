package com.example.demo.cidades.service;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.demo.cidades.Agencia;
import com.example.demo.cidades.Cidade;
import com.example.demo.cidades.repository.CidadeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AgenciaServiceTest {
	
	@Autowired
	private AgenciaService agenciaService;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@After
	public void cleanAll() {
		//agenciaService.limpar();
	}
	
	@Test
	public void test() {
		Cidade cidade = cidadeRepository.findAll().get(0);
		Agencia agencia = agenciaService.criar("558-9","001",cidade);
		
		assertNotNull(agencia);
		System.out.println(agencia.getId());
	}
	
}
