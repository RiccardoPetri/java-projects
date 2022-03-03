package it.unipv.po.torneo.tester;

import java.util.ArrayList;

import it.unipv.po.torneo.model.Facolta;
import it.unipv.po.torneo.model.Incontro;
import it.unipv.po.torneo.model.OrganizzazioneTorneo;
import it.unipv.po.torneo.model.Studente;
import it.unipv.po.torneo.model.Team;
import it.unipv.po.torneo.model.problemi.ProbProgettazione;
import it.unipv.po.torneo.model.problemi.ProbProgrammazione;
import it.unipv.po.torneo.model.problemi.Problema;

public class TesterTorneo {

	public static void main(String[] args) {
		
		OrganizzazioneTorneo  o = new OrganizzazioneTorneo("Torneo1");
		
		
		Team t1 = new Team("team1");
		t1.aggiungiStudente(new Studente("cf1","nome1", "conome1"));
		t1.aggiungiStudente(new Studente("cf2","nome2", "conome2"));
		t1.aggiungiStudente(new Studente("cf3","nome3", "conome3"));
		t1.aggiungiStudente(new Studente("cf4","nome4", "conome4"));
		t1.aggiungiStudente(new Studente("cf5","nome5", "conome5"));
		t1.aggiungiStudente(new Studente("cf6","nome6", "conome6"));
		t1.aggiungiStudente(new Studente("cf7","nome7", "conome7"));		//non aggiungibile (IMPLEMENTO QUI L'ECCEZIONE CUSTOM
//		Team t2 = new Team("team2");
//		t2.aggiungiStudente(new Studente("cf1","nome1", "conome1"));
//		t2.aggiungiStudente(new Studente("cf2","nome2", "conome2"));
//		t2.aggiungiStudente(new Studente("cf3","nome3", "conome3"));
//		t2.aggiungiStudente(new Studente("cf4","nome4", "conome4"));
		
		Team t3 = new Team("team3");
		t3.aggiungiStudente(new Studente("cf1","nome1", "conome1"));
		t3.aggiungiStudente(new Studente("cf2","nome2", "conome2"));
		t3.aggiungiStudente(new Studente("cf3","nome3", "conome3"));
		t3.aggiungiStudente(new Studente("cf4","nome4", "conome4"));
		
//		Team t4 = new Team("team4");
//		t4.aggiungiStudente(new Studente("cf1","nome1", "conome1"));
//		t4.aggiungiStudente(new Studente("cf2","nome2", "conome2"));
//		t4.aggiungiStudente(new Studente("cf3","nome3", "conome3"));
//		t4.aggiungiStudente(new Studente("cf4","nome4", "conome4"));
//		
//		Team t5 = new Team("team5");
//		t5.aggiungiStudente(new Studente("cf1","nome1", "conome1"));
//		t5.aggiungiStudente(new Studente("cf2","nome2", "conome2"));
//		t5.aggiungiStudente(new Studente("cf3","nome3", "conome3"));
//		t5.aggiungiStudente(new Studente("cf4","nome4", "conome4"));
//		Team t6 = new Team("team6");
//		t6.aggiungiStudente(new Studente("cf1","nome1", "conome1"));
//		t6.aggiungiStudente(new Studente("cf2","nome2", "conome2"));
//		t6.aggiungiStudente(new Studente("cf3","nome3", "conome3"));
//		t6.aggiungiStudente(new Studente("cf4","nome4", "conome4"));

	
		Facolta f1 = new Facolta("AAA");
		f1.addTeam(t1);
//		f1.addTeam(t2);
		
		Facolta f2= new Facolta("BBB");
		f2.addTeam(t3);
//		f2.addTeam(t4);

		
//		Facolta f3= new Facolta("CCC");
//		f3.addTeam(t5);
//		f3.addTeam(t6);
		
		
		o.aggiungiPartecipanti(f1);
		o.aggiungiPartecipanti(f2);
		
		
		ArrayList<Problema> problema = new ArrayList<Problema>();
		problema.add(new ProbProgettazione("testoProblema", "c"));
		problema.add(new ProbProgettazione("testoProblema", "c"));
		problema.add(new ProbProgettazione("testoProblema", "c"));
		problema.add(new ProbProgettazione("testoProblema", "c"));
		problema.add(new ProbProgettazione("testoProblema", "c"));
		problema.add(new ProbProgettazione("testoProblema", "c"));
		problema.add(new ProbProgettazione("testoProblema", "c"));
		problema.add(new ProbProgettazione("testoProblema", "c"));
		problema.add(new ProbProgettazione("testoProblema", "c"));
		problema.add(new ProbProgettazione("testoProblema", "c"));
		problema.add(new ProbProgettazione("testoProblema", "c"));
		problema.add(new ProbProgettazione("testoProblema", "c"));
		problema.add(new ProbProgettazione("testoProblema", "c"));
		problema.add(new ProbProgettazione("testoProblema", "c"));
		problema.add(new ProbProgettazione("testoProblema", "c"));
		
		problema.add(new ProbProgrammazione("testoProblema", "c"));
		problema.add(new ProbProgrammazione("testoProblema", "c"));
		problema.add(new ProbProgrammazione("testoProblema", "c"));
		problema.add(new ProbProgrammazione("testoProblema", "c"));
		problema.add(new ProbProgrammazione("testoProblema", "c"));
		problema.add(new ProbProgrammazione("testoProblema", "c"));
		problema.add(new ProbProgrammazione("testoProblema", "c"));
		problema.add(new ProbProgrammazione("testoProblema", "c"));
		problema.add(new ProbProgrammazione("testoProblema", "c"));
		problema.add(new ProbProgrammazione("testoProblema", "c"));
		problema.add(new ProbProgrammazione("testoProblema", "c"));
		problema.add(new ProbProgrammazione("testoProblema", "c"));
		problema.add(new ProbProgrammazione("testoProblema", "c"));
		problema.add(new ProbProgrammazione("testoProblema", "c"));
		problema.add(new ProbProgrammazione("testoProblema", "c"));
		//System.out.println(problema.size());
		
		//risposte del team1
		t1.aggiungiSoluzione("a");	//no
		t1.aggiungiSoluzione("a");	//no
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");
		t1.aggiungiSoluzione("c");

		//risposte del team3
		t3.aggiungiSoluzione("a");	//no
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		t3.aggiungiSoluzione("c");
		

		new Incontro(t1, t3, problema);
		
		//SOLUZIONE CON MATCHMAKING(DA MODIFICARE)
//		o.setProblemi(problema);	
//		o.matchmaking();
		
		//per effettuare l'incontro successivo
		t1.rimuoviSoluzioni();
		t3.rimuoviSoluzioni();
		
		f1.calcolaPunteggio();
		f2.calcolaPunteggio();
		
		o.calcolaVittoria();
		
		
		//metodo risposte incontro()
		
		
//		Un Gruppo di Facoltà Universitarie organizza un torneo di informatica. 
//		Il Regolamento del Torneo è il seguente: 
//		-	Ogni facoltà può formare più team, ciascuno dei quali composto da 4 a 6 studenti.
//		-	Gli organizzatori garantiscono che ogni team partecipi a 4 incontri. 
//		-	Ad ogni incontro partecipano 2 team, ai quali viene richiesto di risolvere 30 problemi di informatica. 
//		-	I problemi di informatica possono essere di due tipi: programmazione e progettazione. I problemi di programmazione valgono 1 punto, quelli di progettazione ne valgono 2.
//		-	Ogni team riceve i punti per la risoluzione del problema se riesce a risolverlo prima del team avversario.
//		-	Vince il torneo il team che ha ottenuto il punteggio complessivo superiore. 
//		-	Vince la facoltà che ottiene il punteggio complessivo medio (fra tutti i team) superiore.
//
//		Requisiti Minimi: 
//		1.	Utilizzare il polimorfismo per gestire la risoluzione dei problemi e l’assegnazione dei punteggi.
//		2.	Definire e gestire almeno un’eccezione custom.
//		3.	Creare una classe di test che simuli una partita per dimostrare che il sistema realizzato funzioni correttamente.
		
		
		//UNA SOLA PARTITA DA SIMULARE!!! ECCO!
		
		

	}
}
