package it.unipv.po.spesaself.model;

import it.unipv.po.spesaself.model.prodotti.Prodotto;
import it.unipv.po.spesaself.model.prodotti.TipoProdotto;
import it.unipv.po.spesaself.model.sconti.ScontoCumulativo;

public class SistemaSpesaSelf {
	private double spesaTot;
	private String codiceDispositivo;
	private Carrello y;
	private ScontoCumulativo sc;
	
	public SistemaSpesaSelf(String codiceDispositivo) {
		this.codiceDispositivo = codiceDispositivo;
		y = new Carrello();
		sc = new ScontoCumulativo();		//pe ofni sistema istanzio uno ScontoCumulativo
	}


	public boolean aggiungiAlCarrello(Prodotto x) {
		if (x != null) {
			x.setPrezzo(sc.applicaScontoCumulativo(y, x));
			y.getP().add(x);
			return true;
		}
		System.out.println("Prodotto non aggiungibile al carrello!");
		return false;
	}

	
	public double spesaTotaleSenzaScontoDiretto(Carrello c) {
		Bilancia b = new Bilancia();
		for(Prodotto p : c.getP()) {
			if(p.getTipo() == TipoProdotto.BILANCIA) {
				spesaTot+= (b.whatKg(p))*(p.getPrezzoSenzaScontoDiretto());
				continue;			//break mi esce dal for, contiune dall'iterazione !!!!!!!!!! (debugging helped)
			}
			
			spesaTot+=p.getPrezzoSenzaScontoDiretto();
		}
		double temp = spesaTot;
		spesaTot = 0;
		return temp;
		
	}

	public double spesaTotaleNetta(Carrello c) {		//netta=con tutti gli sconti applicati
		Bilancia b = new Bilancia();
		for(Prodotto p : c.getP()) {
			if(p.getTipo() == TipoProdotto.BILANCIA) {
				spesaTot+= (b.whatKg(p))*(p.getPrezzo());
				continue;			//break mi esce dal for, contiune dall'iterazione !!!!!!!!!! (debugging helped)
			}
			spesaTot+=p.getPrezzo();
		}
		double temp = spesaTot;
		spesaTot = 0;
		return temp;
	}
	
	@Override
	public String toString() {
		String lista = "";
		for(Prodotto x : y.getP()) {
			lista = lista + x +"\n";
		}
		return lista;
	}


	public double getSpesaTot() {
		return spesaTot;
	}


	public String getCodiceDispositivo() {
		return codiceDispositivo;
	}


	public Carrello getY() {
		return y;
	}

	
	
}
