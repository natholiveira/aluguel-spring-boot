package com.nathalia.aluguel.input.wrapper;

import com.nathalia.aluguel.input.CarroInput;

public class CarroInputWrapper {

	private CarroInput carro;

	public CarroInput getCarro() {
		return carro;
	}

	public void setCarro(CarroInput carro) {
		this.carro = carro;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CarroInputWrapper [carro=");
		builder.append(carro);
		builder.append("]");
		return builder.toString();
	}
}
