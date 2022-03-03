package it.unipv.po.officina.model.veicolo;

public abstract class Veicolo {

	public String marca;
	public String modello;
	public double cilindrata;
	public double km;
	protected String targa;


	public Veicolo(String targa, String marca, String modello, double cilindrata, double km) {
		this.cilindrata = cilindrata;
		this.km = km;
		this.modello = modello;
		this.marca = marca;
		this.targa = targa;
	}
	

	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModello() {
		return modello;
	}


	public void setModello(String modello) {
		this.modello = modello;
	}


	public double getCilindrata() {
		return cilindrata;
	}


	public void setCilindrata(double cilindrata) {
		this.cilindrata = cilindrata;
	}


	public double getKm() {
		return km;
	}


	public void setKm(double km) {
		this.km = km;
	}


	public String getTarga() {
		return targa;
	}


	public void setTarga(String targa) {
		this.targa = targa;
	}


	@Override
	public String toString() {
		return "Targa: "+targa+  ", marca=" + marca + ", modello=" + modello + ", cilindrata=" + cilindrata + ", km=" + km;
	}

}
