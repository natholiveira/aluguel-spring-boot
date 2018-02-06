package com.nathalia.aluguel.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CARRO")
public class Carro {

	@Id
	@SequenceGenerator(name = "carroSequence", sequenceName = "CARRO_SEQUENCE")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "carroSequence")
	@Column(name = "ID")
	private Long id;

	@Column(name = "MODELO")
	private String modelo;

	@Column(name = "MARCA")
	private String marca;

	@JoinColumn(name = "PESSOA_ID", referencedColumnName = "ID", foreignKey = @ForeignKey(name = "FK_CARRO_PESSOA"))
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	private Pessoa pessoa;
	
	@OneToMany(mappedBy = "carro")
	private Set<Compra> compras = new HashSet<>();

	public Carro() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
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
		builder.append("Carro [id=");
		builder.append(id);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", marca=");
		builder.append(marca);
		builder.append("]");
		return builder.toString();
	}

}
