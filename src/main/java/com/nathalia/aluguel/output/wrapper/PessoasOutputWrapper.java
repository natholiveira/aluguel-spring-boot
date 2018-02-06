package com.nathalia.aluguel.output.wrapper;

import java.util.ArrayList;
import java.util.List;

import com.nathalia.aluguel.domain.Pessoa;
import com.nathalia.aluguel.output.PessoaOutput;

public class PessoasOutputWrapper {
	
	private List<PessoaOutput> pessoas;
	
	public PessoasOutputWrapper(List<Pessoa> pessoas) {
		this.pessoas = new ArrayList<>();
		
		for (Pessoa pessoa : pessoas) {
			this.pessoas.add(new PessoaOutput(pessoa));
		}
	
	}

	public List<PessoaOutput> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<PessoaOutput> pessoas) {
		this.pessoas = pessoas;
	}
}
