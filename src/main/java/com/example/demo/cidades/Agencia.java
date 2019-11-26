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
@Table(name = "agencia")
public class Agencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "numero")
	private String numero;
	
	@ManyToOne
	@JoinColumn(name = "cidade_id")
	private Cidade cidade;
	
	@ManyToOne
	@JoinColumn(name = "banco")
	private String banco;
	
	public Long getId() { return id; }
	
	public String getNumero() { return numero; }
	
	public Cidade getCidade() {return cidade;}
	
	public String getBanco() { return banco; }
	
	public Agencia() {}
}
