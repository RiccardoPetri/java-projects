package it.unipv.po.officina.model.veicolo.motorino;

import it.unipv.po.officina.model.veicolo.Revisionabile;
import it.unipv.po.officina.model.veicolo.Veicolo;

public class Motorino extends Veicolo implements Revisionabile {

	private Casco casco;

	public Motorino(String marca, String modello, double cilindrata, double km, Casco casco) {
		super(marca, modello, cilindrata, km);
		this.casco = casco;
	}

	
	public Casco getCasco() {
		return casco;
	}


	@Override
	public String toString() {
		return "Veicolo: MOTORINO  ->"+super.toString()+ casco.toString();
	}


	@Override
	public String revisione(String marca, String modello, double cilindrata, double km) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}
