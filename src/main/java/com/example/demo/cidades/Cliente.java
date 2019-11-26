package com.example.demo.cidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "cliente")
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "cpf")
	private String cpf;
	
	@ManyToOne
	@JoinColumn(name = "telefone")
	private String telefone;
	
	public Cliente() {}
}
