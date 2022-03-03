package it.unipv.po.banca.tester;

import java.util.HashMap;
import java.util.Map;

import it.unipv.po.banca.dataModel.*;

public class Tester { // DEVI CREARE IL METODO MAIN!!!!

	public static void main(String[] args) {

		Banca b = new Banca("Intesa", 10);

		b.aggiungiConto("aaa");
		b.aggiungiConto("bbb");
		
		System.out.println(b.toString());

		b.operazione("IT00000Intesa0001", 100);

		System.out.println("Saldo conto: " + b.getConto("IT00000Intesa0001").getSaldo());

		b.operazione("IT00000Intesa0001", -10);

		System.out.println("Saldo conto: " + b.getConto("IT00000Intesa0001").getSaldo());

		b.operazione("IT00000Intesa0001", -1000); // errore!!

		
		
		b.aggiungiConto("IT00000Intesa0001");
		b.operazione("IT00000Intesa0002", 500);
		
		System.out.println("Il saldo totale nella banca è: " + b.calcolaSaldoTotale());
		
		



		
	}
}
