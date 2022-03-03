package it.unipv.po.spesaself.model.prodotti;

import javax.xml.crypto.Data;

import it.unipv.po.spesaself.model.sconti.TipoSconto;

public class ProdottoDaBanco extends Prodotto {


	public ProdottoDaBanco(String nome, double prezzo, TipoSconto scontoDiretto) {
		super(nome, prezzo, scontoDiretto);

	}

	// metodo getPrezzo ereditato dalla classe astratta

	public TipoProdotto getTipo() {
		return TipoProdotto.BANCO;
	}

	@Override
	public String toString() {
		return "ProdottoDaBanco [nome= " + nome + ", prezzo=" + prezzo;
	}


	
	
}
