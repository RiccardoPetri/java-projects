package it.unipv.po.centralina.model.sensori;

import it.unipv.po.centralina.model.Porta;
import it.unipv.po.centralina.model.sensori.util.TipoEvento;
import it.unipv.po.centralina.model.sensori.util.TipoSensore;

public class SensoreB extends Sensore {

	private TipoEvento tipoEv;
	private TipoEvento ultimoEventoMonitorato;

	public SensoreB(TipoEvento tipoEv, boolean allarme) {
		super(allarme);
		this.tipoEv = tipoEv;
		TipoEvento ultimoEventoMonitorato = null;
	}

//ipotizzo che se l'evento accade una seconda volta consecutiva, si verifica l'allarme
	public boolean monitoraggioFrequenzaEvento(TipoEvento tipoEv) {
		if (ultimoEventoMonitorato != tipoEv) {
			ultimoEventoMonitorato = tipoEv;
			return allarme = false;
		}
		return allarme = true;
	}

	@Override
	public TipoSensore getTipoSensore() {
		return TipoSensore.RILEVA_OCCORRENZA_EVENTO;

	}

	public TipoEvento getTipoEv() {
		return tipoEv;
	}

	@Override
	public String toString() {
		return "SensoreB rileva " + tipoEv;
	}

}
