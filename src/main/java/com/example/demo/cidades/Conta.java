package com.example.demo.cidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private Agencia agencia;
	
	@Column(name = "saldo")
	private Double saldo;
	
	@Column(name = "cliente")
	private Cliente cliente;
	
	public Conta(String numero, Agencia agencia, Double saldo, Cliente cliente) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public Long getId() { return id; }
	
	public String getNumero() { return numero; }
	
	public Agencia getCidade() { return agencia; }
	
	public Double getSaldo() { return saldo; }
	
	public Cliente getCliente() { return cliente; }
	
	public Conta() {}
	
}
