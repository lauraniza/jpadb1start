package com.example.demo.cidades.service;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.demo.cidades.Cidade;
import com.example.demo.cidades.Estado;
import com.example.demo.cidades.repository.EstadoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CidadeServiceTest {
	
	@Autowired
	private CidadeService cidadeService;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
//	@After
//	public void cleanAll() {
//		cidadeService.limpar();
//}
	
	@Test
	public void test() {
		Estado uf = estadoRepository.findAll().get(0);
		Cidade cidade = cidadeService.criar("Maringá",uf);
		
		assertNotNull(cidade);
		System.out.println(cidade.getId());		
	}
	
	
}
