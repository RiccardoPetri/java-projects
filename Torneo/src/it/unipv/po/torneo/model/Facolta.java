package it.unipv.po.torneo.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Facolta {

	private String nome;
	private HashMap<String, Team> m;
	private int punteggioFacolta;

	public Facolta(String nome) {
		this.nome = nome;
		m = new HashMap<String, Team>();
	}

	public boolean addTeam(Team team) {		
		if (team != null) {
			System.out.println("Aggiunto team : " + team.getCodice()+ " nella facoltà "+nome);
			m.put(team.getCodice(), team);
			return true;
		}
		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public HashMap<String, Team> getM() {
		return m;
	}

	public int getPunteggioFacolta() {
		return punteggioFacolta;
	}

	public double calcolaPunteggio() {
		double punteggioMedioTotale = 0;
		for(Team x : m.values()) {
			punteggioFacolta+= x.getPunteggioOttenuto();
			
		}
		punteggioMedioTotale=punteggioFacolta/m.size();
		return punteggioMedioTotale;
	}



}
