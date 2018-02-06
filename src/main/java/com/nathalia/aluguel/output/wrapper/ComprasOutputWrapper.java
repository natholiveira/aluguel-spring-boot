package com.nathalia.aluguel.output.wrapper;

import java.util.ArrayList;
import java.util.List;

import com.nathalia.aluguel.domain.Compra;
import com.nathalia.aluguel.output.CompraOutput;

public class ComprasOutputWrapper {
	
	private List<CompraOutput> compras = new ArrayList<>();

	public ComprasOutputWrapper(List<Compra> compras) {
		for (Compra compra : compras) {
			this.compras.add(new CompraOutput(compra));
		}
	}

	public List<CompraOutput> getCompras() {
		return compras;
	}

	public void setCompras(List<CompraOutput> compras) {
		this.compras = compras;
	}
	
	
}
