package com.nathalia.aluguel.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.nathalia.aluguel.domain.Carro;
import com.nathalia.aluguel.domain.Pessoa;
import com.nathalia.aluguel.input.wrapper.CarroInputWrapper;
import com.nathalia.aluguel.input.wrapper.PessoaInputWrapper;
import com.nathalia.aluguel.output.wrapper.PessoaOutputWrapper;
import com.nathalia.aluguel.output.wrapper.PessoasOutputWrapper;
import com.nathalia.aluguel.repository.PessoaRepository;

@RestController
public class PessoaAPI {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@GetMapping("/pessoas")
	public ResponseEntity<?> listar() {
		List<Pessoa> pessoas = pessoaRepository.findAll();

		return new ResponseEntity<PessoasOutputWrapper>(new PessoasOutputWrapper(pessoas), HttpStatus.OK);
	}
	
	@GetMapping("/pessoas/{id}")
    public ResponseEntity<?> obter(@PathVariable Long id) {
		Pessoa pessoa = pessoaRepository.findOne(id);
		
		return new ResponseEntity<PessoaOutputWrapper>(new PessoaOutputWrapper(pessoa), HttpStatus.OK);
		
	}
	
	@PutMapping("/pessoas/{id}")
	public ResponseEntity<?> alterar(@PathVariable Long id, @RequestBody PessoaInputWrapper pessoaInputWrapper) {
		
		Pessoa pessoa = pessoaRepository.findOne(id);
		pessoa.setIdade(pessoaInputWrapper.getPessoa().getIdade());
		pessoa.setNome(pessoaInputWrapper.getPessoa().getNome());
		
		pessoaRepository.save(pessoa);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@PostMapping("/pessoas")
	public ResponseEntity<?> salvar(@RequestBody PessoaInputWrapper pessoaInputWrapper) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setIdade(pessoaInputWrapper.getPessoa().getIdade());
		pessoa.setNome(pessoaInputWrapper.getPessoa().getNome());
		
		pessoaRepository.save(pessoa);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
//	public static void main(String[] args) {
//		Gson gson = new Gson();
//		
//		Pessoa pessoa = new Pessoa();
//		pessoa.setId(1L);
//		pessoa.setIdade("23");
//		pessoa.setNome("flavio");
//		
//		String json = gson.toJson(new PessoaOutputWrapper(pessoa));
//		System.out.println(json);
//		
//	}

}
