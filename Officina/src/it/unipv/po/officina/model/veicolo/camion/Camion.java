package it.unipv.po.officina.model.veicolo.camion;

import it.unipv.po.officina.model.veicolo.Veicolo;

public class Camion extends Veicolo {

	private Telepass telepass;

	public Camion(String marca, String modello, double cilindrata, double km, Telepass telepass) {
		super(marca, modello, cilindrata, km);
		this.telepass = telepass;
	}

	// non metto revisionabile

	// Come indico che non può andare in autostrada?
	// (distinzione con due classi di veicoli da autostrada e da tutto
	// estendendo veicolo e poi estendendo camion?

	public String toString() {
		return "Veicolo: CAMION    ->" + super.toString() + ", telepass: " + telepass.toString();
	}

}
