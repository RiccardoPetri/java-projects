package it.unipv.po.officina.model.veicolo.macchina;

import it.unipv.po.officina.model.veicolo.Revisionabile;
import it.unipv.po.officina.model.veicolo.Veicolo;

public class Macchina extends Veicolo implements Revisionabile {

	//int id=1;
	//FACCIAMO FINTA ID: MARCA+MODELLO
	public Macchina(String marca, String modello, double cilindrata, double km) {
		super(marca, modello, cilindrata, km);
	}

	
	@Override
	public String revisione(String marca, String modello, double cilindrata, double km) {
		return "";
	}
	
	//PER DIFFERENZIARE L'IDENTIFICATIVO DELL'OGGETTO NELL ARRAYLIST E ANCHE PER UNIFICARLO NEL CASO SIA COMPOSTO DA PIU ATTRIBUTI
	//SI USA HASHCODE(CHE RESTITUISCE UN INTERO E EQUALS)
	
	@Override
	public int hashCode() {
		return (marca+modello).hashCode();			//((Integer)id).hashCode()
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		Macchina car = (Macchina) obj;
		return (car.getMarca()+car.getModello())== this.marca+this.modello;  //return team.getId() == this.getId();
	}

	@Override
	public String toString() {
		return "Veicolo: MACCHINA  ->" + super.toString();
	}

}
