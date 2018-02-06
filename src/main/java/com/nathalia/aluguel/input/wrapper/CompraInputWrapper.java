package com.nathalia.aluguel.input.wrapper;

import com.nathalia.aluguel.input.CompraInput;

public class CompraInputWrapper {
	private CompraInput compra;

	public CompraInput getCompra() {
		return compra;
	}

	public void setCompra(CompraInput compra) {
		this.compra = compra;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CompraInputWrapper [compra=");
		builder.append(compra);
		builder.append("]");
		return builder.toString();
	}
}
