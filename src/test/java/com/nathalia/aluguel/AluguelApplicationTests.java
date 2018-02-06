package com.nathalia.aluguel;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nathalia.aluguel.domain.Carro;
import com.nathalia.aluguel.repository.CarroRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AluguelApplicationTests {
	
	@Autowired
	private CarroRepository carroRepository;

	@Test
	public void salvarCarro() {
		
		Carro carro = new Carro();
		carro.setModelo("Sedan");
		carro.setMarca("Fiat");
		
		carro = carroRepository.save(carro);
		
		assertNotNull(carro);
		assertNotNull(carro.getId());
		
		System.out.println(carro);
		
		
	}
	
	@Test
	public void listarCarro() {
		
		Carro carro = new Carro();
		carro.setModelo("Sedan");
		carro.setMarca("Fiat");
		
		carro = carroRepository.save(carro);
		
		List<Carro> carros = carroRepository.findAll();
		
		assertFalse(carros.isEmpty());
		
	}

}
