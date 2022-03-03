package it.unipv.po.officina.model.veicolo;

import java.util.Comparator;

public class VeicoliComparator implements Comparator<Veicolo> {


		@Override
		public int compare(Veicolo o1, Veicolo o2) {
			if (o1.km < o2.km) {
				return -1; 
			} else if (o1.km > o2.km) {
				return +1;
			} else {
				return 0;
																		
			}
		}

}