package it.unipv.po.forme.model;

import it.unipv.po.forme.model.util.Colore;

public class Rettangolo extends Forma{

	private double base;
	private double altezza;

	
	public Rettangolo(Colore colore, double base, double altezza) {
		super(colore);
		this.altezza=altezza;
		this.base=base;

	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	@Override
	public double calcolaPerimetro() {
	
		return (base+altezza)*2;
	}

	@Override
	public double calcolaArea() {
	
		return base*altezza;
	}

	@Override
	public String toString() {
		return "Rettangolo con base = " + base + " e altezza = " + altezza;
	}

	
	
}
