package it.unipv.po.aereoporto.model.flyer;

import it.unipv.po.aereoporto.model.util.Genere;

public abstract class Persona {

//	Si consideri l�accesso delle persone alle sale d�attesa di un aeroporto. 
//	Ogni persona � caratterizzata da nome, cognome, et�, sesso (maschile/femminile).
//	Inoltre, le persone possono appartenere alle seguenti categorie:
//	1.	Flyer. Si tratta di viaggiatori occasionali che non hanno diritto ad usufruire di servizi aggiuntivi.
//	Esso � caratterizzato dal numero di volo.
//	2.	Frequent Flyer. Si tratta di viaggiatori frequenti che possono accedere ai servizi aggiuntivi offerti
//	dalle compagnie aeree. In aggiunta alle informazioni normali, questi viaggiatori hanno associato un numero 
//	di volo, una carta servizi e il numero di miglia percorse.


	private String nome;
	private String cognome;
	private int eta;
	private Genere genere; // potrei farlo binario?			//� UN ENUM!!!
	

	public Persona(String nome, String cognome, int eta, Genere genere) {			
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.genere = genere;
	}


	public abstract boolean isVip();	//IMPORTANTE DICHIARARE UN METODO ASTRATTO!!!
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	
	public Genere getSesso() {
		return genere;
	}

	public void setSesso(Genere sesso) {
		this.genere = sesso;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", sesso=" + genere + "]";
	}
	
	

}
