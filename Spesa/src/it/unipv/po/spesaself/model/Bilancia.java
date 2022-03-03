package it.unipv.po.spesaself.model;


import it.unipv.po.spesaself.model.prodotti.Prodotto;
import it.unipv.po.spesaself.model.prodotti.ProdottoDaBilancia;

public class Bilancia {
	
	
	public double whatKg(Prodotto p) {
		//eccezione se non è da bilancia@@@@
		return ((ProdottoDaBilancia) p).getKg();
	}

}




// p.getPrezzo() * (((ProdottoDaBilancia) p).getKg());