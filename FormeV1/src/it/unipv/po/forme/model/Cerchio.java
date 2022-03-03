package it.unipv.po.forme.model;

import it.unipv.po.forme.model.util.Colore;

public class Cerchio extends Forma{

	private double raggio;
	
	public Cerchio(Colore colore, double raggio) {
		super(colore);
		this.raggio = raggio;

	}
	@Override
	public double calcolaPerimetro() {
		return Math.PI*raggio*2;
	}

	@Override
	public double calcolaArea() {
		
		return Math.PI*raggio*raggio;
	}
	@Override
	public String toString() {
		return "Cerchio di raggio = " + raggio;
	}
	
	

}
