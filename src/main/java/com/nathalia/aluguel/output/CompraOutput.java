package com.nathalia.aluguel.output;

import com.nathalia.aluguel.domain.Compra;

public class CompraOutput {
	
	private Long id;
	private Long pessoa;
	private Long carro;
	
	public CompraOutput(Compra compra) {
		id = compra.getId();
		pessoa = compra.getPessoa() != null ? compra.getPessoa().getId() : null;
		carro = compra.getCarro() != null ? compra.getCarro().getId() : null;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPessoa() {
		return pessoa;
	}

	public void setPessoa(Long pessoa) {
		this.pessoa = pessoa;
	}

	public Long getCarro() {
		return carro;
	}

	public void setCarro(Long carro) {
		this.carro = carro;
	}
	
}
