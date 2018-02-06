package com.nathalia.aluguel.output.wrapper;

import com.nathalia.aluguel.domain.Pessoa;
import com.nathalia.aluguel.output.PessoaOutput;

public class PessoaOutputWrapper {

	private PessoaOutput pessoa;

	public PessoaOutputWrapper(Pessoa pessoa) {
		// TODO Auto-generated constructor stub
		this.pessoa = new PessoaOutput(pessoa);
	}

	public PessoaOutput getPessoaOut() {
		return pessoa;
	}

	public void setPessoaOut(PessoaOutput pessoaOut) {
		this.pessoa = pessoaOut;
	}

}
