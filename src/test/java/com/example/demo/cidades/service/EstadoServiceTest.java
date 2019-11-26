package com.example.demo.cidades.service;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.demo.cidades.Estado;
import com.example.demo.cidades.service.EstadoService;


@RunWith(SpringRunner.class)
@SpringBootTest

public class EstadoServiceTest {
	
	@Autowired
	private EstadoService estadoService;
	
//	@After
//	public void clean() {
//		estadoService.deletarPorId();
//	}
	
//	@After
//	public void cleanAll() {
//		estadoService.limpar();
//	}
	
	//@Test
	public void test() {
		Estado estado = estadoService.criar("Santa Catarina");
		
		assertNotNull(estado);
		System.out.println(estado.getId());
	}
	
	@Test
	public void deveBuscarEstado() {
		Estado estado = estadoService.buscarPorNomes("Paraná");
		assertNotNull(estado);
	}
	
	@Test
	public void deveLancarExcecao() {
		try {
			Estado estado = estadoService.buscarPorNomes("São Paulo");
			}
		catch(RuntimeException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
