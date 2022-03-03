package it.unipv.po.torneo.model;

import java.util.ArrayList;
import java.util.HashMap;

import it.unipv.po.torneo.model.problemi.Problema;

public class OrganizzazioneTorneo {

	private String nomeTorneo;
	private HashMap<String, Facolta> torneo;
	private ArrayList<Problema> problemi;
	private static int numeroProblemi = 30;
	// private Incontro incontroCorrente;

	public OrganizzazioneTorneo(String nomeTorneo) {
		this.nomeTorneo = nomeTorneo;
		torneo = new HashMap<>();
		problemi = new ArrayList<Problema>();
	}

	public boolean aggiungiPartecipanti(Facolta f) {
		try {
			if (f != null) {
				torneo.put(f.getNome(), f);
				System.out.println("Aggiunta facoltà " + f.getNome() + " al torneo " + nomeTorneo);
				return true;
			}
			throw new NullPointerException("Facoltà non valida");
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		return false;
	}

	public boolean aggiungiProblema(Problema p) { // potevo risparmiarmi i membri e fare qui una eccezione sul max num?
		if (p != null && problemi.size() < 30) {
			return problemi.add(p);
		}
		return false;
	}

//	public void matchmaking() {
//		for (Facolta f : torneo.values()) {
//			for (Team x : f.getM().values()) {
//				if (x.getIncontriSostenuti() < 4) {
//					for (Facolta g : torneo.values()) {
//						if (g == f) {
//							continue;
//						}
//						for (Team y : g.getM().values()) {
//							if (y.getIncontriSostenuti() < 4) {
//								if (x.getIncontriSostenuti() < 4) {
//
//									x.setIncontriSostenuti(x.getIncontriSostenuti() + 1);
//									y.setIncontriSostenuti(y.getIncontriSostenuti() + 1);
//
//									new Incontro(x, y, problemi);		//poi alla seconda iterazione inverte team2 = x;
//																		//e il problema su cui si affrontano è sempre lo stesso;
//								}
//								break;
//							}
//						}
//						break;
//					}
//				}
//			}
//		}
//	}

	public void calcolaVittoria() {
		double t1 = 0;
		Facolta facolta = null;
		for (Facolta f : torneo.values()) {
			double t2 = f.calcolaPunteggio();
			if (t1 < t2) {
				t1 = t2;
				facolta = f;
			}

		}
		System.out.println("VINCE LA FACOLTA : " + facolta.getNome());
	}

	public ArrayList<Problema> getProblemi() {
		return problemi;
	}

	public void setProblemi(ArrayList<Problema> problemi) {
		this.problemi = problemi;
	}

	public static int getNumeroProblemi() {
		return numeroProblemi;
	}
}
