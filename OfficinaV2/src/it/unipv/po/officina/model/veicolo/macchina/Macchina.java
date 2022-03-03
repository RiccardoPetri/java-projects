package it.unipv.po.officina.model.veicolo.macchina;

import it.unipv.po.officina.model.veicolo.Revisionabile;
import it.unipv.po.officina.model.veicolo.Veicolo;

public class Macchina extends Veicolo implements Revisionabile {

	public Macchina(String targa, String marca, String modello, double cilindrata, double km) {
		super(targa, marca, modello, cilindrata, km);
	}

	@Override
	public String revisione(String marca, String modello, double cilindrata, double km) {
		return "";
	}

	@Override
	public String toString() {
		return "Veicolo: MACCHINA  ->" + super.toString();
	}

}
