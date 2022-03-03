package it.unipv.po.spesaself.model.prodotti;

import it.unipv.po.spesaself.model.sconti.TipoSconto;

public class ProdottoDaBilancia extends Prodotto {

	private double kg;

	public ProdottoDaBilancia(String nome, double prezzo, double kg, TipoSconto scontoDiretto) {
		super(nome, prezzo, scontoDiretto);
		this.kg=kg;
	}

	public double getKg() {
		return kg;
	}


	@Override
	public TipoProdotto getTipo() {
		return TipoProdotto.BILANCIA;
	}

	@Override
	public String toString() {
		return "ProdottoDaBilancia [nome=" + nome + ", kg=" + kg + ", prezzo=" + prezzo + "]";
	}
	
	
	

}
