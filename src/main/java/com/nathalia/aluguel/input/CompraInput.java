package com.nathalia.aluguel.input;

public class CompraInput {

	private Long pessoa;
	private Long carro;

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CompraInput [pessoa=");
		builder.append(pessoa);
		builder.append(", carro=");
		builder.append(carro);
		builder.append("]");
		return builder.toString();
	}

}
