package it.unipv.po.spesaself.model.sconti;

import it.unipv.po.spesaself.model.Carrello;
import it.unipv.po.spesaself.model.prodotti.Prodotto;

public class ScontoCumulativo {

//	Sconti cumulativi. Riduce il prezzo dell’ultimo prodotto inserito se il numero di 
//	prodotti con quella promozione è maggiore di un certo valore, per prodotti da banco, 
//	o di un certo peso per prodotti da bilancia.
	
	public static final double SCONTOCUMULATIVO = 0.5;

	
		public double applicaScontoCumulativo(Carrello c, Prodotto x) {		//IMPARARE SWITCH CASE
			int low = 0, medium = 0, high = 0;
		for(Prodotto p : c.getP()) {
			if(p.getTipoSconto() == TipoSconto.LOW) {
				low++;
				continue;
			} else if (p.getTipoSconto() == TipoSconto.MEDIUM) {
				medium++;
				continue;
			} else if (p.getTipoSconto() == TipoSconto.HIGH) {
				high++;
				continue;
			}
		}
		if(x.getTipoSconto() == TipoSconto.LOW) {
			if(low >= 1) {
				return SCONTOCUMULATIVO*x.getPrezzoSenzaScontoDiretto();
			}
		}else if(x.getTipoSconto() == TipoSconto.MEDIUM) {
			if(medium >= 1) {
				return SCONTOCUMULATIVO*x.getPrezzoSenzaScontoDiretto();
			}
		}else if(x.getTipoSconto() == TipoSconto.HIGH) {
			if(high >= 1) {
				return SCONTOCUMULATIVO*x.getPrezzoSenzaScontoDiretto();
			}
		}
		return x.getPrezzoSenzaScontoDiretto();		//non succederà nulla (se metto l'altro get mi applica 2 volte lo sconto
	}
}
