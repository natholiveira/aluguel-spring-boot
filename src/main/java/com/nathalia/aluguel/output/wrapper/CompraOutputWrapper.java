package com.nathalia.aluguel.output.wrapper;

import com.nathalia.aluguel.domain.Compra;
import com.nathalia.aluguel.output.CompraOutput;

public class CompraOutputWrapper {
	
	private CompraOutput compra;
	
	public CompraOutputWrapper(Compra compra) {
		this.compra = new CompraOutput(compra);
	}

	public CompraOutput getCompra() {
		return compra;
	}

	public void setCompra(CompraOutput compra) {
		this.compra = compra;
	}
}
