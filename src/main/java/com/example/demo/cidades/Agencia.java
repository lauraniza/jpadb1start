package com.example.demo.cidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private Cidade cidade;
	
	@Column(name = "banco")
	private String banco;
	
	public Agencia(String banco, String numero, Cidade cidade) {
		this.banco = banco;
		this.numero = numero;
		this.cidade = cidade;
	}
	
	
	public Long getId() { return id; }
	
	public String getNumero() { return numero; }
	
	public Cidade getCidade() {return cidade;}
	
	public String getBanco() { return banco; }
	
	public Agencia(String numero, String banco) {}
	
	public Agencia() {}
}
