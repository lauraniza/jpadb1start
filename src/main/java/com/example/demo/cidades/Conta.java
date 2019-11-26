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
@Table(name = "conta")
public class Conta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "numero")
	private String numero;
	
	@ManyToOne
	@JoinColumn(name = "agencia_id")
	private Agencia agencia;
	
	@ManyToOne
	@JoinColumn(name = "saldo")
	private Double saldo;

	public Long getId() { return id; }
	
	public String getNumero() { return numero; }
	
	public Agencia getCidade() { return agencia; }
	
	public Double getSaldo() { return saldo; }
	
	public Conta() {}
	
}
