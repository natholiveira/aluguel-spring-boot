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
import com.nathalia.aluguel.input.wrapper.CarroInputWrapper;
import com.nathalia.aluguel.output.wrapper.CarroOutputWrapper;
import com.nathalia.aluguel.output.wrapper.CarrosOutputWrapper;
import com.nathalia.aluguel.repository.CarroRepository;

@RestController
public class CarroAPI {
	
	@Autowired
	private CarroRepository carroRepository;
	
	@GetMapping("/carros")
	public ResponseEntity<?> listar() {
		List<Carro> carros = carroRepository.findAll();

		return new ResponseEntity<CarrosOutputWrapper>(new CarrosOutputWrapper(carros), HttpStatus.OK);
	}
	
	@PostMapping("/carros")
	public ResponseEntity<?> salvar(@RequestBody CarroInputWrapper carroInputWrapper) {
		
		Carro carro = new Carro();
		carro.setMarca(carroInputWrapper.getCarro().getMarca());
		carro.setModelo(carroInputWrapper.getCarro().getModelo());
		
		carroRepository.save(carro);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@PutMapping("/carros/{id}")
	public ResponseEntity<?> alterar(@PathVariable Long id, @RequestBody CarroInputWrapper carroInputWrapper) {
		
		Carro carro = carroRepository.findOne(id);
		carro.setMarca(carroInputWrapper.getCarro().getMarca());
		carro.setModelo(carroInputWrapper.getCarro().getModelo());
		
		carroRepository.save(carro);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/carros/{id}")
	public ResponseEntity<?> obter(@PathVariable Long id){
		Carro carro = carroRepository.findOne(id);
		return new ResponseEntity<CarroOutputWrapper>(new CarroOutputWrapper(carro), HttpStatus.OK);
	}
//	
//	public static void main(String[] args) {
//		Gson gson = new Gson();
//		
//		Carro carro = new Carro();
//		carro.setId(2L);
//		carro.setMarca("Fiat");
//		carro.setModelo("gol");
//		
//		String json = gson.toJson(new CarroOutputWrapper(carro));
//		System.out.println(json);
//	}

}