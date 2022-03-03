package it.unipv.po.spesaself.model.prodotti;

import it.unipv.po.spesaself.model.Acquistabile;
import it.unipv.po.spesaself.model.sconti.ScontoDiretto;
import it.unipv.po.spesaself.model.sconti.TipoSconto;

public abstract class Prodotto implements Acquistabile {
	protected double prezzo;
	protected String nome;
	protected TipoSconto scontoDiretto;
	private ScontoDiretto sd;

	public Prodotto(String nome, double prezzo, TipoSconto scontoDiretto) {
		this.prezzo = prezzo;
		this.nome = nome;
		this.scontoDiretto = scontoDiretto;
		if (scontoDiretto != TipoSconto.NULL)
			sd = new ScontoDiretto(); // COSI ISTANZIO UNA SOLA VOLTA PER OGNI PRODOTTO

	}

	public abstract TipoProdotto getTipo();	//perfetto, trovato il metodo abstract!!!

	public double getPrezzo() {
		if (scontoDiretto != TipoSconto.NULL) {
			return sd.calcolaSconto(prezzo, scontoDiretto);
		}
		return prezzo;
	}

	public double getPrezzoSenzaScontoDiretto() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoSconto getTipoSconto() {
		return scontoDiretto;
	}

}
