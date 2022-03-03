package it.unipv.po.banca.dataModel;

public class Banca {

	private String nome;
	private int contiInseriti;
	private Conto[] conti;
	final private String IBAN;

	public Banca(String nome, int numConti) {
		this.nome = nome;
		contiInseriti = 0;
		conti = new Conto[numConti]; // IMPARARE BENE		//potrei creare una MAPPA, come Key associo all'oggetto l'iban 
															//(la map non permette l'ordinamento degli oggetti!
		IBAN = "IT00000" + nome + "000";
	}

	public String getNome() {
		return nome;
	}

	public Conto getConto(String iban) {
		for (int i = 0; i < contiInseriti; i++) {
			if (conti[i].getIban().equals(iban)) {   //si usa equals per confrontare due stringhe!!!
				// mentre se non confronto tra stringhe : 
				//conti[i].getSaldo() == conti[i].getSaldo()
				return conti[i];
			}
		}
		return null;
	}

	public boolean aggiungiConto(String cf) {
		if(contiInseriti < conti.length) {
			String iban = IBAN + (contiInseriti + 1);  //CONCATENO ALLA STRINGA IBAN UN 1
			conti[contiInseriti] = new Conto(iban, cf); // IMPARARE
			contiInseriti++;
			return true;
		}else return false;
	}
	
	public boolean operazione(String iban, double valore) {
		
		Conto c=getConto(iban);	//EVITO SPRECO DI PRESTAZIONI SE TROVO UNA SOLA VOLTA LA REFERENCE VOLUTA
		if(c != null) {
			if(valore > 0) {
				return c.deposito(valore); //mi scervellavo sul bisogno di avere il conto esatto, ma sfrutto il metodo creato;
			}else{				
				return c.prelievo(-valore);   //METTO UN -
			} //se no mi ritornava vero anche se il prelievo era falso
		}
		return false;
	}


	

	public double calcolaSaldoTotale() {
		double saldoTot = 0.0;
		for(int i=0;i<contiInseriti;i++) {
			saldoTot+=conti[i].getSaldo();
		}
		return saldoTot;
	}



	@Override
	public String toString() {

		return "Nome banca: " + nome + "\tnumero conti che contiene: " + contiInseriti + "\tcf del proprietario del "
				+ "primo conto inserito: " + conti[0].getCf() +"\n";
		
		//NELLA REALTA SOLO NOME BANCA, NON CONTI INSERITI NEL TOSTRING
	}

	
	
	
	//come fare una map?@@@@@@@@@@@@
	
	
	
	
	
	
}
