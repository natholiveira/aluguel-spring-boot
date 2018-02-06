package com.nathalia.aluguel.input.wrapper;

import com.nathalia.aluguel.input.PessoaInput;

public class PessoaInputWrapper {
	
	private PessoaInput pessoa;

	public PessoaInput getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaInput pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaInputWrapper [pessoa=");
		builder.append(pessoa);
		builder.append("]");
		return builder.toString();
	}
	
}
