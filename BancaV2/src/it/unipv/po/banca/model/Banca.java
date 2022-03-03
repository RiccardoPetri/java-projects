
package it.unipv.po.banca.model;

import java.util.HashMap;
import java.util.Observable;

import it.unipv.po.banca.model.conto.ContoCorrente;
import it.unipv.po.banca.model.conto.ContoDeposito;
import it.unipv.po.banca.model.conto.ContoWeb;
import it.unipv.po.banca.model.conto.util.TipologiaConto;

@SuppressWarnings("deprecation")
public class Banca extends Observable{

	private String nome;
	private int contiInseriti;
	final private String IBAN;

	private HashMap<String, Conto> c; // USANDO UNA MAPPA! (COME KEY L'IBAN CHE è UNIVOCA PER OGNI ELEMENTO

	public Banca(String nome, int numConti) {
		this.nome = nome;
		contiInseriti = 0;

		IBAN = "IT00000" + nome + "000";

		// se voglio poter ordinare, uso likedhashmap (estende hashmap)
		c = new HashMap<String, Conto>(numConti); // @@@@devo mettere dentro i parametri? se provo con map non va in
													// entrambi i casi!

		// <chiave ti tipo string(iban), valore ti tipo conto> (CORRISPONDENZA BIUNIVOCA
	}

	public boolean aggiungiConto(String cf, TipologiaConto t) {
		if (cf != null) {
			Conto x = null;
			String iban = IBAN + (contiInseriti + 1);
			switch (t) {
			case CORRENTE:
				x = new ContoCorrente(iban, cf);
				break;
			case WEB:
				x = new ContoWeb(iban, cf);
				break;
			case DEPOSITO:
				x = new ContoDeposito(iban, cf);
				break;
			}
			c.put(iban, x);
			contiInseriti++;
			return true;
		}
		System.out.println("cf inesistente!");
		return false;
	}

	
	public HashMap<String, Conto> getMap() {
		return c;
	}

	public String getNome() {
		return nome;
	}
	
	public double getSaldo(String iban) {
		double saldo=0;
		if(this.c.containsKey(iban)) {
			saldo= c.get(iban).getSaldo();
			//System.out.println(saldo);
					
		}
		return saldo;
	}

	public Conto getConto(String iban) {
		if (c.containsKey(iban))
			return c.get(iban);
		return null;
//		for(Conto x : c.values()) {		//FOREACH CHE MI RITORNERA LA REFERENCE AL CONTO DI INTERESSE!!!
//			if (x.getIban().equals(iban)) {   //si usa equals per confrontare due stringhe!!!
//				return x;
//			}
//		}
//		return null; 
	}

//	public boolean aggiungiContoCorrente(String cf) {
//		if(contiInseriti < conti.length) {
//			String iban = IBAN + (contiInseriti + 1);  
//			conti[contiInseriti] = new ContoCorrente(iban, cf); //COSI ISTANZIO SOLO I CONTICORRENTE!!!!
//			contiInseriti++;
//			
//			return true;
//		}else return false;
//	}
//	
//	public boolean aggiungiContoDeposito(String cf) {
//		if(contiInseriti < conti.length) {
//			String iban = IBAN + (contiInseriti + 1);  
//			conti[contiInseriti] = new ContoDeposito(iban, cf); 
//			contiInseriti++;
//			return true;
//		}else return false;
//	}
//	
//	public boolean aggiungiContoWeb(String cf) {
//		if(contiInseriti < conti.length) {
//			String iban = IBAN + (contiInseriti + 1); 
//			conti[contiInseriti] = new ContoWeb(iban, cf,"changeme"); 
//			contiInseriti++;
//			//System.out.println("aggiunto con successo "+ iban);
//			
//			return true;
//		}else return false;
//	}

//---------------------------------------------------------------------------------------------------------
	// LE DEVO FARE NEL CONTO QUESTE COSE!!!!!!!!!!!!!!!!!

	// PRIMA COSA DA DOVER FARE:
//	public boolean changePassword(String newPW, String iban) {
//		if(newPW != null) {
//			for(Conto x : c.values()) {		
//				if (x.getIban().equals(iban)) { //@@@@@@@
//					System.out.println("entrato");
//					x.setPassword(newPW);
//					System.out.println("Password modificata!!!");//vorrei fare un set password con il conto trovato, ma prende metodo di Conto
//				}
//			
//			
//				((ContoWeb)this.getConto(iban)).setPassword(newPW);
//				System.out.println("pw modificata");
//				return true;
//			}
//			return false;
//		
//	}

//	public boolean login(String iban, String oldPassword, String password) {
//		if(oldPassword.equals("changeme")) {
//			System.out.println("Modificare la password una prima volta!");
//			return false;
//		}
//		((ContoWeb)this.getConto(iban)).setFlagLogin(1);;
//		System.out.println("LOGIN EFFETTUATO!");
//					return true;
//	}

	// ---------------------------------------------------------------------------------------------------------

	public boolean operazioneConto(String iban, double valore) {
		Conto x = c.get(iban);
		if (x != null) {
			x.operazione(valore); // @@@@@su quale metodo operazione va? in base all'iban capisce che tipo è il
									// conto?
			
			// return true;
			this.setChanged();						//NOTIFICA CAMBAIMENTI!!!!
			this.notifyObservers();						
		} else
			System.out.println("Operazione impossibile, dentro c ho null");
		return false;
	}

	public double calcolaSaldoTotale() {
		double saldoTot = 0.0;
		for (Conto x : c.values()) {
			saldoTot += x.getSaldo();
		}
		return saldoTot;
	}

	@Override
	public String toString() {
		String s = "";
		for (Conto x : c.values()) {
			s += x + "\n";
		}
		return "Nome banca: " + nome + "\tnumero conti che contiene: " + contiInseriti + "\n" + s;
	}
//________________________________________________________________________________________________________________

	public boolean addAccountable(String iban, Accountable acc) {
		Conto x = c.get(iban); // mi ritorna l'elemento con quell'iban il get(key)!!!!!!!!!
		return x.addAccountable(acc);

	}

	public void fineMese() {
		for (Conto x : c.values()) {
			x.fineMese();
		}
	}

}
