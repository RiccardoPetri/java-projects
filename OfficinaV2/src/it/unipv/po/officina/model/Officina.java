package it.unipv.po.officina.model;

import java.util.HashMap;
import java.util.Map;

import it.unipv.po.officina.model.util.TargaNonEsistenteException;
import it.unipv.po.officina.model.veicolo.Veicolo;

public class Officina {

	private String nome;
	private int veicoliInseriti;

	private HashMap<String, Veicolo> m; // PER LA MAPPA

	public Officina(String nome) {
		this.nome = nome;
		this.veicoliInseriti = 0;
		m = new HashMap<String, Veicolo>(); // PER LA MAPPA
	}

	public boolean aggiungiVeicolo(Veicolo nuovo) {
		try {
			if (nuovo != null) {
				m.put(nuovo.getTarga(), nuovo); // PER LA MAPPA
				veicoliInseriti++;
				return true;
			}
			throw new NullPointerException("nuovo è null!");
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
		}
		return false;
	}

	public void rimuoviVeicolo(Veicolo nuovo) {
		m.remove(nuovo.getTarga(), nuovo); // PER LA MAPPA
		veicoliInseriti--;
	}

	public String getNome() {
		return nome;
	}

	public Map<String, Veicolo> getM() {
		return m;
	}

	public void setM(HashMap<String, Veicolo> m) {
		this.m = m;
	}

	public Veicolo getVeicolo(String targa) {
		try {
			if (m.containsKey(targa)) { // SE M CONTIENE UN OGGETO CON QUELLA CHIAVE, ALLORA...
				return m.get(targa);
			} // IMPORTANTE! RITORNA IL VALORE A CUI LA CHIAVE è LEGATA
			throw new TargaNonEsistenteException("Targa " + targa + " non esistente");
		} catch (TargaNonEsistenteException ex) {
			ex.Print();
		}
		return null;
	}

	@Override
	public String toString() {
		String listString = "";
		for (Veicolo s : m.values()) { // PER LA MAPPA
			listString += s.toString() + "\n";
		}
		return listString;
	}

}
