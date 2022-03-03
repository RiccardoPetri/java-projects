package it.unipv.po.centralina.model;

import java.util.HashMap;

public class CentralinaPiccola extends Centralina{	
	
	public CentralinaPiccola(String nome) {
		super(nome);	//perchè questo richiama il costruttore del padre, quindi istanzia l'array
		
		
		//porta = new HashMap<Integer, Porta>();		//non serve!!! @@@@@@@@@@
		
		setPorteInseribili(3);
		
		
	}


	
	
}
