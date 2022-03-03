package it.unipv.po.officina.tester;

import it.unipv.po.officina.model.Officina;
import it.unipv.po.officina.model.veicolo.Veicolo;
import it.unipv.po.officina.model.veicolo.camion.Camion;
import it.unipv.po.officina.model.veicolo.camion.Telepass;
import it.unipv.po.officina.model.veicolo.camion.util.tipoTelepass;
import it.unipv.po.officina.model.veicolo.macchina.Macchina;
import it.unipv.po.officina.model.veicolo.motorino.Casco;
import it.unipv.po.officina.model.veicolo.motorino.Motorino;
import it.unipv.po.officina.model.veicolo.motorino.util.ColoreCasco;

//officina versione 2
public class tester {

	public static void main(String[] args) {
		Officina o = new Officina("Off");
		// aggiunta targa come chiave nella mappa!!!
		o.aggiungiVeicolo(null);
		o.aggiungiVeicolo(new Motorino("targa1", "marca1", "modello1", 250, 1000, new Casco(20, ColoreCasco.NERO)));
		o.aggiungiVeicolo(new Motorino("targa2", "marca1", "modello1", 250, 1000, new Casco(20, ColoreCasco.NERO)));
		o.aggiungiVeicolo(new Motorino("targa3", "marca1", "modello1", 250, 1000, new Casco(20, ColoreCasco.NERO)));
		o.aggiungiVeicolo(new Motorino("targa4", "marca1", "modello1", 250, 1000, new Casco(20, ColoreCasco.BIANCO)));
		o.aggiungiVeicolo(new Macchina("targa5", "marca1", "modello3", 250, 1000));
		o.aggiungiVeicolo(new Macchina("targa6", "marca1", "modello4", 250, 1000));

		((Casco) ((Motorino) o.getVeicolo("targa4")).getCasco()).changeColor();

		o.rimuoviVeicolo(o.getVeicolo("targa6"));

		o.aggiungiVeicolo(new Camion("targa7", "marca5", "modello5", 250, 1000, new Telepass("32B", tipoTelepass.MENSILE)));

		System.out.println(o.toString());

		o.getVeicolo("targa0000");
	}
}
