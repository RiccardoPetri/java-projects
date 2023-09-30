package it.unipv.po.aereoporto.model.flyer;

public class CartaServizi {

	private String codice;
	private double accredito;

	public CartaServizi(String codice) {
		this.codice = codice;
		this.accredito=accredito;	//anche qui passo TUTTE LE COSE ISTANZIABILI nel costruttore!
									//il saldo no perch� era zero, normalmente passo tutto
		
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public double getAccredito() {
		return accredito;
	}

	public void setAccredito(double accredito) {
		this.accredito = accredito;
	}

	@Override
	public String toString() {
		return "CartaServizi [codice=" + codice + ", accredito=" + accredito + "]";
	}

	
	
}
