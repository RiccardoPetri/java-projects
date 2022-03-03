package it.unipv.po.torneo.model;

public class Studente {

	private String cf, nome, cognome;

	public Studente(String cf, String nome, String cognome) {
		this.cf = cf;
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getCf() {
		return cf;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	@Override
	public String toString() {
		return "Studente [cf=" + cf + ", nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	
	
}
