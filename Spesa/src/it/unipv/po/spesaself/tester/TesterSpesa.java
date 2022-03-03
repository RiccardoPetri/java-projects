package it.unipv.po.spesaself.tester;

import it.unipv.po.spesaself.model.Carrello;
import it.unipv.po.spesaself.model.SistemaSpesaSelf;
import it.unipv.po.spesaself.model.prodotti.Prodotto;
import it.unipv.po.spesaself.model.prodotti.ProdottoDaBanco;
import it.unipv.po.spesaself.model.prodotti.ProdottoDaBilancia;
import it.unipv.po.spesaself.model.sconti.TipoSconto;

public class TesterSpesa {

	public static void main(String[] args) {
		SistemaSpesaSelf s = new SistemaSpesaSelf("dispositivo1");
		s.aggiungiAlCarrello(new ProdottoDaBilancia("kiwi", 4, 1, null));
		s.aggiungiAlCarrello(new ProdottoDaBilancia("ananas", 6, 1, null));
		s.aggiungiAlCarrello(new ProdottoDaBilancia("mango", 8, 1, null));
		s.aggiungiAlCarrello(new ProdottoDaBilancia("banana", 5, 1, null));

		s.aggiungiAlCarrello(new ProdottoDaBanco("uova", 4, TipoSconto.MEDIUM));
		s.aggiungiAlCarrello(new ProdottoDaBanco("tonno", 2, TipoSconto.MEDIUM));	//con lo scontoCumulativo risparmio 1 euro

		System.out.println(s.toString());

		System.out.println(s.spesaTotaleSenzaScontoDiretto(s.getY()));
		
		System.out.println(s.spesaTotaleNetta(s.getY())); //		
		
		
		//giustamente il prezzo dell'uovo con lo sconto diretto varrà 2, poi quando lo aggiungo al carrello
		//con lo scontoCumulativo arriva a 1!!!!!
		//QUINDI con lo scontoCumulativo risparmio 1 euro
		//con lo scontoDiretto risparmio 2 euro per l'uovo che costa 1 per lo scontoCumulativo, costerà 0.5 con scontoDiretto
		//per un totale di 25.5 al posto di 29 (29-2 (per uovo)-1.5 (per tonno)!!!!!

	}

}
