package it.unipv.po.forme.model;

import it.unipv.po.forme.model.util.Colore;

public abstract class Forma {		//EREDITARIETà PARTO DAL PADRE!!
	
	private Colore colore;
	
	
	public Forma(Colore colore) { // una classe astratta ha sia il costruttore che almeno un metodo abstract(per
									// forza!)
		this.colore = colore; // e attributi che ereditano le classi figlie(se no farei un'interfaccia con
								// solo metodi)
	}

	

	public abstract double calcolaPerimetro();

	public abstract double calcolaArea();

	public Colore getColore() {
		return colore;
	}

	public void setColore(Colore colore) {
		this.colore = colore;
	}

	@Override
	public String toString() {
		return "Forma di colore = " + colore;
	}

}
