package com.nathalia.aluguel.output;

import com.nathalia.aluguel.domain.Carro;

public class CarroOutput {

	private Long id;
	private String marca;
	private Long pessoa;

	public CarroOutput(Carro carro) {
		id = carro.getId();
		marca = carro.getMarca();
		pessoa = carro.getPessoa() != null ? carro.getPessoa().getId() : null;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Long getPessoa() {
		return pessoa;
	}

	public void setPessoa(Long pessoa) {
		this.pessoa = pessoa;
	}

}
