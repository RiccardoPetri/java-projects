package it.unipv.po.aereoporto.model.flyer;

import it.unipv.po.aereoporto.model.util.Genere;

public class Flyer extends Persona {

//	1.	Flyer. Si tratta di viaggiatori occasionali che non hanno diritto ad usufruire di servizi aggiuntivi.
//	Esso è caratterizzato dal numero di volo.

	private String numeroVolo;		//definire intero o double solo se ho un'operazione double 8 byte


	public Flyer(String nome, String cognome, int eta, Genere genere, String numeroVolo) {
		super(nome, cognome, eta, genere);
		this.numeroVolo = numeroVolo;

	}


	public String getNumeroVolo() {
		return numeroVolo;
	}



	public void setNumeroVolo(String numeroVolo) {
		this.numeroVolo = numeroVolo;
	}

	@Override
	public String toString() {
		return super.toString()+ " Flyer [numeroVolo=" + numeroVolo + "]";
	}

	@Override
	public boolean isVip() {		//si usa is
		return false;
	}

}
