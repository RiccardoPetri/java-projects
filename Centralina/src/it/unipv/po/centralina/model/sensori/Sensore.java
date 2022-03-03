package it.unipv.po.centralina.model.sensori;

import it.unipv.po.centralina.model.Porta;
import it.unipv.po.centralina.model.sensori.util.TipoSensore;

public abstract class Sensore {
	
	protected Porta porta;
	protected boolean allarme;

	// costruttore
	public Sensore(boolean allarme) {
		this.allarme = false;
	}

	public abstract TipoSensore getTipoSensore();

	// metodo che lega il concetto di sensore alla centralina!
	public boolean allarmeSensoreCentralina() {
		return allarme;
	}


	public void setAllarme(boolean allarme) {
		this.allarme = allarme;
	}
}
