package com.nathalia.aluguel.hardcode;

public enum TipoPessoa {
	FISICA("fisica"),
	JURIDICA("juridica");
	
	private String nome;
	
	TipoPessoa(String nome) {
		 this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	 
}
