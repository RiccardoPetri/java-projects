package it.unipv.po.banca.dataModel;

import java.util.HashMap;
import java.util.Map;


public class Conto {

	private String cf;
	private double saldo;
	final private String IBAN; // COSTANTI CON FINAL

	public Conto(String iban, String cf) { // qui minuscolo iban, passo un parametro non costante
		this.IBAN = iban;
		this.cf = cf;
		saldo = 0;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getCf() {
		return cf;
	}

	public String getIban() {
		return IBAN;
	}

//	public void setSaldo(double saldo) {
//		this.saldo=saldo;
//	}

//	public void setCf(String cf) {			//ha senso?  NELLA REALTà NO, A MENO CHE DEVO GESTIRE DATABASE
//		this.cf = cf;
//	}

//	public void setIban(String iban) {			//ha senso?
//		this.IBAN = iban;
//	}

	public boolean prelievo(double valore) {
		if (valore >= 0 && valore <= saldo) { // && in double posso passare 0,5 euro
			saldo -= valore;
			return true;
		} else
			System.out.println("Valore "+valore+" da prelevare non accettabile!");
			return false;

	}

	public boolean deposito(double valore) {
		if (valore >= 0) {
			saldo += valore;
			return true;
		} else
			System.out.println("Valore "+valore+" da depositare non accettabile!");
			return false;

	}

	@Override
	public String toString() {

		return "iban: " + IBAN + "\tcfIntestatario: " + cf + "\tsaldo: " + saldo;
	}

	

}
