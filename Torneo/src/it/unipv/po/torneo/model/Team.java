package it.unipv.po.torneo.model;

import java.util.ArrayList;
import java.util.HashMap;

import it.unipv.po.torneo.model.problemi.util.TipoProblemi;
import it.unipv.po.torneo.model.util.NumeroMassimoStudentiException;

public class Team {

	private String codice;
	private final int NUMEROMASSIMOSTUDENTI = 6;
	private HashMap<String, Studente> studenti;
	private int incontriSostenuti = 0; // deve essere incrementato fino a 4 per ogni team!
	private int punteggioOttenuto = 0;
	private ArrayList<String> soluzioni;

	public Team(String codice) {
		this.codice = codice;		// APPARTE LE COSTANTI IL RESTO INIZIALIZZO DENTRO
		studenti = new HashMap<>();
		soluzioni = new ArrayList<String>();
	}

	public boolean aggiungiStudente(Studente studente) {
		try {
			if(studenti.size() < NUMEROMASSIMOSTUDENTI) {	//volendo mettevo and
				studenti.put(studente.getCf(), studente);
				return true;
			}
			throw new NumeroMassimoStudentiException("Studente non aggiungibile, massimo 6 per team");
		}
		catch(NumeroMassimoStudentiException ex) {
			ex.print();
		}
		return false;
	}
	
	public boolean aggiungiSoluzione(String s) {
		if(s!= null) {
			return soluzioni.add(s);
		}
		return false;
	}
	
	public boolean rimuoviSoluzioni() {
		for(int i = 0; i < soluzioni.size() ; i++) {
			soluzioni.remove(i);
		}
		return true;
	}
	
	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}


	public int getIncontriSostenuti() {
		return incontriSostenuti;
	}

	public void setIncontriSostenuti(int incontriSostenuti) {
		this.incontriSostenuti = incontriSostenuti;
	}

	public int getPunteggioOttenuto() {
		return punteggioOttenuto;
	}
	
	

	public void setPunteggioOttenuto(int punteggioOttenuto) {
		this.punteggioOttenuto = punteggioOttenuto;
	}

	public ArrayList<String> getSoluzioni() {
		return soluzioni;
	}
	
	

	public void setSoluzioni(ArrayList<String> soluzioni) {
		this.soluzioni = soluzioni;
	}

	@Override
	public String toString() {
		return "Team con codice " + codice;
	}

}
