package com.nathalia.aluguel.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nathalia.aluguel.domain.Carro;
import com.nathalia.aluguel.domain.Compra;
import com.nathalia.aluguel.domain.Pessoa;
import com.nathalia.aluguel.input.wrapper.CompraInputWrapper;
import com.nathalia.aluguel.output.wrapper.CompraOutputWrapper;
import com.nathalia.aluguel.output.wrapper.ComprasOutputWrapper;
import com.nathalia.aluguel.repository.CarroRepository;
import com.nathalia.aluguel.repository.CompraRepository;
import com.nathalia.aluguel.repository.PessoaRepository;

@RestController
public class CompraAPI {
	
	@Autowired
	private CompraRepository compraRepository;
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private CarroRepository carroRepository;
	
	@GetMapping("/compras")
	public ResponseEntity<?> listar() {
		List<Compra> compras = compraRepository.findAll();

		return new ResponseEntity<ComprasOutputWrapper>(new ComprasOutputWrapper(compras), HttpStatus.OK);
	}
	
	@GetMapping("/compras/{id}")
    public ResponseEntity<?> obter(@PathVariable Long id) {
		Compra compra = compraRepository.findOne(id);
		
		return new ResponseEntity<CompraOutputWrapper>(new CompraOutputWrapper(compra), HttpStatus.OK);
		
	}
	
	@PostMapping("/compras")
	public ResponseEntity<?> salvar(@RequestBody CompraInputWrapper compraInputWrapper) {
		Pessoa pessoa = pessoaRepository.findOne(compraInputWrapper.getCompra().getPessoa());
		Carro carro = carroRepository.findOne(compraInputWrapper.getCompra().getCarro());
		
		carro.setPessoa(pessoa);
		
		Compra compra = new Compra();
		compra.setCarro(carro);
		compra.setPessoa(pessoa);;
		
		compraRepository.save(compra);
		carroRepository.save(carro);
		
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
