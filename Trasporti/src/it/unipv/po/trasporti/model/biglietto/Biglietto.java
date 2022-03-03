package it.unipv.po.trasporti.model.biglietto;

import it.unipv.po.trasporti.model.Utilizzabile;
import it.unipv.po.trasporti.model.Passeggero;
import it.unipv.po.trasporti.model.biglietto.util.TipologiaBiglietto;

public abstract class Biglietto implements Utilizzabile {

	protected int accessiConsentiti;
	protected int utilizziEffettuati;
	private String codice;
	protected Passeggero intestatario;


	public Biglietto(String codice) {
		this.codice = codice;
	}

	@Override
	public boolean isUtilizzabile() { // ha senso se creo anche l'interfaccia? (come conto, non creo classe
										// astratta(?)
										// il testo dice di usare il polimorfismo
		if (utilizziEffettuati < accessiConsentiti) {
			return true;
		}
		return false;
	}

	public abstract TipologiaBiglietto getTipo();

	public int getAccessiConsentiti() {
		return accessiConsentiti;
	}

	public void setAccessiConsentiti(int accessiConsentiti) {
		this.accessiConsentiti = accessiConsentiti;
	}

	public int getUtilizziEffettuati() {
		return utilizziEffettuati;
	}

	public void setUtilizziEffettuati(int utilizziEffettuati) {
		this.utilizziEffettuati = utilizziEffettuati;
	}

	public String getCodice() {
		return codice;
	}

	@Override
	public String toString() {
		return "AccessiConsentiti = " + accessiConsentiti + ", utilizziEffettuati= " + utilizziEffettuati + ", codice= "
				+ codice + ", intestatario= " + intestatario;
	}

}
