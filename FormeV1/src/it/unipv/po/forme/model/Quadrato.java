package it.unipv.po.forme.model;

import it.unipv.po.forme.model.util.Colore;

public class Quadrato extends Forma{

	private double lato;
	
	public Quadrato(Colore colore, double lato) {
		super(colore);
		this.lato=lato;

	}
	
	
	public double getLato() {
		return lato;
	}


	public void setLato(double lato) {
		this.lato = lato;
	}


	@Override
	public double calcolaPerimetro() {
		
		return (lato+lato)*2;
	}

	@Override
	public double calcolaArea() {
		return Math.pow(lato, 2);//lato*lato;			//CLASSE STATICA NON VA ISTANZIATA!!!! TIPO MATH
	}


	@Override
	public String toString() {
		return "Quadrato con lato = " + lato;
	}

	
}
