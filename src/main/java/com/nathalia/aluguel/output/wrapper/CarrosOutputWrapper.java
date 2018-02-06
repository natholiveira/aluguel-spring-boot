package com.nathalia.aluguel.output.wrapper;

import java.util.ArrayList;
import java.util.List;

import com.nathalia.aluguel.domain.Carro;
import com.nathalia.aluguel.output.CarroOutput;

public class CarrosOutputWrapper {
	
	private List<CarroOutput> carros = new ArrayList<>();;
	
	public CarrosOutputWrapper(List<Carro> carros) {
		
		for (Carro carro : carros) {
			this.carros.add(new CarroOutput(carro));
		}
	}

	public List<CarroOutput> getCarros() {
		return carros;
	}

	public void setCarros(List<CarroOutput> carros) {
		this.carros = carros;
	}
	
}
