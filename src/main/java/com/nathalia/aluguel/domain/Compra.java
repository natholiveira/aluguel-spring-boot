package com.nathalia.aluguel.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "COMPRA")
public class Compra {

	@Id
	@SequenceGenerator(name = "compraSequence", sequenceName = "COMPRA_SEQUENCE")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "compraSequence")
	@Column(name = "ID")
	private Long id;
	
	@JoinColumn(name = "PESSOA_ID", referencedColumnName = "ID", foreignKey = @ForeignKey(name = "FK_COMPRA_PESSOA"))
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	private Pessoa pessoa;
	
	@JoinColumn(name = "CARRO_ID", referencedColumnName = "ID", foreignKey = @ForeignKey(name = "FK_COMPRA_CARRO"))
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	private Carro carro;

	public Compra() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

}
