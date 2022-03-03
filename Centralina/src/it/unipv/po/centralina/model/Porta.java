package it.unipv.po.centralina.model;

import it.unipv.po.centralina.model.sensori.Sensore;

public class Porta {

	private static int n=1;
	private int numeroPorta;
	private Sensore sensore;
	
	public Porta(Sensore sensore) {		//MEGLIO NON PASSARE COME PARAMETRO IL VAOLRE DELLA PORTA, MA INSERIRLO DA DENTRO!!!!
		this.numeroPorta = n;
		this.sensore=sensore;
		n++;
	}

	public int getNumeroPorta() {
		return numeroPorta;
	}

	public void setNumeroPorta(int numeroPorta) {
		this.numeroPorta = numeroPorta;
	}

	public Sensore getSensore() {
		return sensore;
	}

	public void setSensore(Sensore sensore) {
		this.sensore = sensore;
	}
	
	
}
