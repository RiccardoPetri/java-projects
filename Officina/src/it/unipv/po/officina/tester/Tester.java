package it.unipv.po.officina.tester;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import it.unipv.po.officina.model.Officina;
import it.unipv.po.officina.model.veicolo.VeicoliComparator;
import it.unipv.po.officina.model.veicolo.Veicolo;
import it.unipv.po.officina.model.veicolo.camion.Camion;
import it.unipv.po.officina.model.veicolo.camion.Telepass;
import it.unipv.po.officina.model.veicolo.camion.util.tipoTelepass;
import it.unipv.po.officina.model.veicolo.macchina.Macchina;
import it.unipv.po.officina.model.veicolo.motorino.Casco;
import it.unipv.po.officina.model.veicolo.motorino.Motorino;
import it.unipv.po.officina.model.veicolo.motorino.util.ColoreCasco;

//tester OFFICINA VERSIONE 1
public class Tester {

	public static void main(String[] args) {

		Officina o = new Officina("Off", 5);

		o.aggiungiVeicolo(new Motorino("marca1", "modello0", 250, 10, new Casco(20, ColoreCasco.NERO))); // rimosso
		// o.rimuoviVeicolo(o.getV().get(0));

		o.aggiungiVeicolo(new Motorino("marca1", "modello1", 25, 800, new Casco(20, ColoreCasco.GIALLO)));
		o.aggiungiVeicolo(new Motorino("marca1", "modello2", 20, 200, new Casco(20, ColoreCasco.NERO)));
		o.aggiungiVeicolo(new Motorino("marca1", "modello3", 250, 100, new Casco(20, ColoreCasco.NERO)));

		o.aggiungiVeicolo(new Macchina("marca1", "modello4", 250, 1000));
		o.aggiungiVeicolo(new Macchina("marca1", "modello5", 250, 1000));

		o.aggiungiVeicolo(new Camion("marca5", "modello6", 250, 1000, new Telepass("32B", tipoTelepass.MENSILE)));

		System.out.println(o.toString());

		// nel caso di un vettore, non posso avere un metodo getVeicolo a cui passo la
		// targa e restituisce la reference al veicolo
		// su cui voglio verificare la correttezza del casco, quindi devo fare
		// riferimento alla posizione nell'array del veicolo
		System.out.println(((Casco) ((Motorino) o.getV().get(0)).getCasco()).getColore());
		(((Motorino) o.getV().get(0)).getCasco()).changeColor(); // VA BENE!
		(((Motorino) o.getV().get(1)).getCasco()).changeColor(); // TROPPO CHIARO!!!

		// ordino per km
		Collections.sort(o.getV(), new VeicoliComparator()); // PER FARE UNA SECONDA COMPARAZIONE?@@@@
		System.out.println(o.toString());

		// ORDINO PER cilindrata
		Collections.sort(o.getV(), new Comparator<Veicolo>() {
			@Override
			public int compare(Veicolo o1, Veicolo o2) {
				if (o1.cilindrata < o2.cilindrata) {
					return -1;
				} else if (o1.cilindrata > o2.cilindrata) {
					return +1;
				} else if (o1.km < o2.km) {
					return -1;
				} else if (o1.km > o2.km) {
					return +1;
				} else {
					return 0;
				}

			}

		});
		System.out.println(o.toString());

	}
}
