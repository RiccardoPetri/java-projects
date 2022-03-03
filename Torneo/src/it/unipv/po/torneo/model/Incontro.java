package it.unipv.po.torneo.model;

import java.util.ArrayList;

import it.unipv.po.torneo.model.problemi.Problema;

public class Incontro {

	private Team team1, team2;
	private ArrayList<Problema> m;

	public Incontro(Team team1, Team team2, ArrayList<Problema> m) {
		this.team1 = team1;
		this.team2 = team2;
		this.m = m;

		sfida();
	}

	public void sfida() {
		team1.setIncontriSostenuti(team1.getIncontriSostenuti() + 1);
		team2.setIncontriSostenuti(team1.getIncontriSostenuti() + 1);

		int i = 0;
		for (Problema p : m) {

			//System.out.println(p.getSoluzione());
			if (p.getSoluzione().equals(team1.getSoluzioni().get(i))) {
				team1.setPunteggioOttenuto(team1.getPunteggioOttenuto() + p.getPunteggio());

			}
			if (p.getSoluzione().equals(team2.getSoluzioni().get(i))) {
				team2.setPunteggioOttenuto(team2.getPunteggioOttenuto() + p.getPunteggio());

			}

			i++;
		}

		System.out.println("PunteggioDel team1: " + team1.getPunteggioOttenuto());
		System.out.println("PunteggioDel team2: " + team2.getPunteggioOttenuto());

	}

}
