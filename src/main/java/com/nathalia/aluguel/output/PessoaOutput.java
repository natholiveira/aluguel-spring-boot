package com.nathalia.aluguel.output;

import java.util.ArrayList;
import java.util.List;

import com.nathalia.aluguel.domain.Carro;
import com.nathalia.aluguel.domain.Pessoa;

public class PessoaOutput {

	private Long id;
	private String nome;
	private Integer idade;
	private List<Long> carros = new ArrayList<>();
	
	public PessoaOutput(Pessoa pessoa) {
		nome = pessoa.getNome();
		id = pessoa.getId();
		idade = Integer.valueOf(pessoa.getIdade());
		
		for (Carro carro : pessoa.getCarros()) {
			carros.add(carro.getId());
		}
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

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

}
