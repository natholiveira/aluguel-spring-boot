package com.nathalia.aluguel.output.wrapper;

import com.nathalia.aluguel.domain.Carro;
import com.nathalia.aluguel.output.CarroOutput;


public class CarroOutputWrapper {
	
	private CarroOutput carro;
	
	public CarroOutputWrapper(Carro carro) {
		this.carro = new CarroOutput(carro);
	}

	public CarroOutput getCarro() {
		return carro;
	}

	public void setCarro(CarroOutput carro) {
		this.carro = carro;
	}
	
}
