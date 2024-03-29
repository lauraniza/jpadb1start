package com.example.demo.cidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cidade")

public class Cidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome", length = 60)
	private String nome;
	
	@ManyToOne
	private Estado uf;
	
	public Cidade(String nome, Estado uf) {
		this.nome = nome;
		this.uf = uf;
	}
	
	public Long getId() { return id; }
	
	public String getNome() { return nome; }
	
	public Estado getUf() { return uf; }
	
	public Cidade(){}

}
