package it.unipv.po.officina.model.veicolo.camion;

import java.util.Date;

import it.unipv.po.officina.model.veicolo.camion.util.tipoTelepass;

public class Telepass {
	
	private String id;
	private tipoTelepass tipo;
	private Date scadenza;
	
	public Telepass(String id, tipoTelepass tipo) {
		this.id=id;
		this.tipo=tipo;
		assegnaScadenza(tipo);
		
	}
	private void assegnaScadenza(tipoTelepass tipo) {
	}

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public tipoTelepass getTipo() {
		return tipo;
	}


	public void setTipo(tipoTelepass tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "[id=" + id + ", tipo=" + tipo + "]";
	}

	
	
	
	
	
	//devo controllare se scade (15 giorni di preavviso)	consiglio di vedere tipo di tato date and time
}
