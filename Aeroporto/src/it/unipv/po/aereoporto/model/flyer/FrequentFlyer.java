package it.unipv.po.aereoporto.model.flyer;

import it.unipv.po.aereoporto.model.util.Genere;

public class FrequentFlyer extends Flyer {

//	2.	Frequent Flyer. Si tratta di viaggiatori frequenti che possono accedere ai servizi aggiuntivi offerti 
//	dalle compagnie aeree. In aggiunta alle informazioni normali, questi viaggiatori hanno associato un numero
//	di volo, una carta servizi e il numero di miglia percorse.

	private double migliaPercorse;
	private CartaServizi carta;

	public FrequentFlyer(String nome, String cognome, int eta, Genere sesso, String numeroVolo, CartaServizi carta) {
		super(nome, cognome, eta, sesso, numeroVolo);
		this.migliaPercorse = 0; // passare come parametro ogni cosa che non sia un contatore o un saldo
												// iniziale =0;
		this.carta = carta;
	}

	@Override
	public boolean isVip() {
		return true;
	}

	public double getMigliaPercorse() {
		return migliaPercorse;
	}

	public void setMigliaPercorse(double migliaPercorse) {
		this.migliaPercorse = migliaPercorse;
	}

	public String getCodiceCarta() {
		return carta.getCodice();
	}

	public CartaServizi getCarta() {
		return carta;
	}

	public void setCarta(CartaServizi carta) {
		this.carta = carta;
	}

}
