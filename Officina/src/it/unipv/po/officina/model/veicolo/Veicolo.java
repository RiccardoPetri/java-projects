package it.unipv.po.officina.model.veicolo;

public abstract class Veicolo {
	
	public String marca;
	public String modello;
	public double cilindrata;
	public double km;
	
	public Veicolo(String marca, String modello, double cilindrata,double km) {
		this.cilindrata=cilindrata;
		this.km=km;
		this.modello=modello;
		this.marca=marca;
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


	@Override
	public String toString() {
		return "  marca=" + marca + ", modello=" + modello + ", cilindrata=" + cilindrata + ", km=" + km;
	}
	
	

}
