package it.unipv.po.spesaself.model;

import java.util.ArrayList;

import it.unipv.po.spesaself.model.prodotti.Prodotto;

public class Carrello {

	private ArrayList<Prodotto> p; // se hanno un codice prodotto potrei usare una mappa

	
	public Carrello() {
		p = new ArrayList<Prodotto>();
	}

	public ArrayList<Prodotto> getP() {
		return p;
	}

	public void setP(ArrayList<Prodotto> p) {
		this.p = p;
}
	
	//andranno qua agg e rim prod
		
}
