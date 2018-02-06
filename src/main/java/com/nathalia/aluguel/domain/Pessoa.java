package com.nathalia.aluguel.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.nathalia.aluguel.hardcode.TipoPessoa;

@Entity
@Table(name = "PESSOA")
public class Pessoa {

	@Id
	@SequenceGenerator(name = "pessoaSequence", sequenceName = "PESSOA_SEQUENCE")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "pessoaSequence")
	@Column(name = "ID")
	private Long id;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "IDADE")
	private String idade;
	
	@Column(name = "TIPO_PESSOA")
	@Enumerated(EnumType.STRING)
	private TipoPessoa tipo;

	@OneToMany(mappedBy = "pessoa")
	private Set<Carro> carros = new HashSet<>();
	
	@OneToMany(mappedBy = "pessoa")
	private Set<Compra> compras = new HashSet<>();

	public Pessoa() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public TipoPessoa getTipo() {
		return tipo;
	}

	public void setTipo(TipoPessoa tipo) {
		this.tipo = tipo;
	}

	public Set<Carro> getCarros() {
		return carros;
	}

	public void setCarros(Set<Carro> carros) {
		this.carros = carros;
	}

	public Set<Compra> getCompras() {
		return compras;
	}

	public void setCompras(Set<Compra> compras) {
		this.compras = compras;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", idade=");
		builder.append(idade);
		builder.append("]");
		return builder.toString();
	}

}