package it.unipv.po.torneo.model.problemi;

public abstract class Problema {

	protected int punteggio;
	private String traccia; 
	private String soluzione;

	public Problema(String traccia, String soluzione) {
		this.traccia = traccia;
		this.soluzione= soluzione;
	}

	public int getPunteggio() {
		return punteggio;
	}

	public String getTraccia() {
		return traccia;
	}

	public void setTraccia(String traccia) {
		this.traccia = traccia;
	}

	public String getSoluzione() {
		return soluzione;
	}

	public void setSoluzione(String soluzione) {
		this.soluzione = soluzione;
	}
	
	


	
}
