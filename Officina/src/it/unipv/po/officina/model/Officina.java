package it.unipv.po.officina.model;

import java.util.ArrayList;
import java.util.Map;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import it.unipv.po.officina.model.util.NumeroMassimoVeicoliException;
import it.unipv.po.officina.model.veicolo.Veicolo;
import it.unipv.po.officina.model.veicolo.motorino.Motorino;

public class Officina {

	private String nome;
	private int veicoliInseriti;
	private int maxVeicoli;
	private ArrayList<Veicolo> v; // non mappa perchè non ho un identificativo univoco per un oggetto (tipo targa
									// e iban per i conti)
									// qui arrayList o List? @@@@@@@@@@@@@@@
	
	//private Map<String, Veicolo> m;

	public Officina(String nome, int maxVeicoli) {
		this.nome = nome;
		this.veicoliInseriti = 0;
		this.maxVeicoli= maxVeicoli;
		v = new ArrayList<>(); // non imposto grandezza con arrayList!!!
	}



	public boolean aggiungiVeicolo(Veicolo nuovo) {	
		try {
			if(nuovo != null) {
				if(v.size() < maxVeicoli) {
					veicoliInseriti++;
					System.out.println("Inserito veicolo: "+nuovo.getModello());
					return v.add(nuovo);
				}
				throw new NumeroMassimoVeicoliException("Numero veicoli inseribili esaurito");
			}
			throw new NullPointerException("nuovo è null");
			//System.out.println("Errore nel trovare il veicolo");
		}
		catch(NullPointerException ex) {
			System.out.println(ex.getMessage());
		}
		catch(NumeroMassimoVeicoliException ex) {
			ex.print();
		}
		return false;
	}

	public boolean rimuoviVeicolo(Veicolo rim) {
		v.remove(rim);			//APPLICAVA L'EQUALS DELLA CLASSE OBJECT, POTEVA RIMUOVERMI UN ALTRO OGGETTO IDENTIFICATO NELLO STESSO MODO
		veicoliInseriti--;
		return true;		
	}


	
	
	public String getNome() {
		return nome;
	}

	public ArrayList<Veicolo> getV() {			//serve questo getter/setter? SI!!!
		return v;
	}

	
	

	@Override
	public String toString() {
		String listString = "";
		for (Veicolo s : v) {
			listString += s.toString() + "\n";
		}
		

		return listString;
	}

}
