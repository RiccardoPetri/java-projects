package it.unipv.po.spesaself.model.sconti;

import it.unipv.po.spesaself.model.prodotti.Prodotto;

public class ScontoDiretto {
	public static final double SCONTO_LOW = 0.7;
	public static final double SCONTO_MEDIUM = 0.5;
	public static final double SCONTO_HIGH = 0.2;
	public static final double SCONTO_NULL = 1;
	

	
	public double calcolaSconto(double prezzo, TipoSconto sconto) {
			switch (sconto) {
			case LOW:
				return SCONTO_LOW * prezzo;
			case MEDIUM:
				return SCONTO_MEDIUM * prezzo;
			case HIGH:
				return SCONTO_HIGH * prezzo;
			case NULL:
				return SCONTO_NULL* prezzo;
			default:
			System.out.println("Sconto non applicabile");
			}
		return SCONTO_NULL;
}
	
//	public double calcolaSconto(double prezzo, TipoSconto sconto) {
//		if(prezzo > 0) {
//			if (sconto == TipoSconto.LOW) {			//ANCHE QUI è UN CASE SWITCH CASE ( SE HO CONDIZIONI SU STESSI ATTRIBUTI
//				return SCONTO_LOW * prezzo;
//			} else if (sconto == TipoSconto.MEDIUM) {
//				return SCONTO_MEDIUM * prezzo;
//			} else
//				return SCONTO_HIGH * prezzo;
//		}
//		return SCONTO_NULL;
//	}
}
