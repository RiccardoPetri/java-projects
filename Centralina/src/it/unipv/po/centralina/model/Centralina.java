package it.unipv.po.centralina.model;

import java.util.HashMap;

import it.unipv.po.centralina.model.sensori.Configurazione;
import it.unipv.po.centralina.model.sensori.Sensore;
import it.unipv.po.centralina.model.sensori.util.TipoSensore;

public class Centralina implements Configurazione {

	protected HashMap<Integer, Porta> porta; 
	private int porteInseribili = 4;	
	private String nome;

	public Centralina(String nome) {
		this.nome = nome;
		porta = new HashMap<Integer, Porta>();		//POTEVO FARE COME VALORI LE PORTE, E NELLE PORTE
	}
	
	@Override
	public boolean aggiungiPorta(Sensore s) {
		//System.out.println(porta.size());
		if (s != null && porta.size() < porteInseribili) {
			if (s.getTipoSensore() == TipoSensore.RILEVA_GRANDEZZA_FISICA) {
				Porta p = new Porta(s);
				porta.put(p.getNumeroPorta(), p);//passo prima il getNumPorta e la porta
				System.out.println("Aggiunto un sensore rilevatore di grandezze fisiche nella porta " + p.getNumeroPorta());
				return true;
			} else if (s.getTipoSensore()  == TipoSensore.RILEVA_OCCORRENZA_EVENTO) {
				Porta p = new Porta(s);
				porta.put(p.getNumeroPorta(), p);
				System.out.println("Aggiunto un sensore rilevatore di evento nella porta " + p.getNumeroPorta());
				return true;
			}
		}
		System.out.println(s.toString() + " non aggiungibile");
		return false;
	}

//	La centralina deve ricevere le informazioni dai sensori e deve poter mostrare all’utilizzatore gli stati di
//	allarme generati (porta a cui il sensore che ha segnalato l’allarme è collegato, tipo di sensore e timestamp
//	dell’evento di allarme).

	public boolean verificaAnomalie() {
		for (Porta p : porta.values()) {
			if (p.getSensore().allarmeSensoreCentralina()) {
				System.out.println("Anomalia verificata nel " + p.getSensore().toString() + " nella porta " + p.getNumeroPorta());
			}
		}

		return true;
	}

	public int getPorteInseribili() {
		return porteInseribili;
	}

	public void setPorteInseribili(int porteInseribili) {
		this.porteInseribili = porteInseribili;
	}

	public HashMap<Integer, Porta> getPorta() {
		return porta;
	}

	public String getNome() {
		return nome;
	}




}
