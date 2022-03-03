package it.unipv.po.officina.model.veicolo.motorino;

import it.unipv.po.officina.model.veicolo.motorino.util.ColoreCasco;

public class Casco {

	private double size;
	private ColoreCasco colore;

	public Casco(double size, ColoreCasco colore) {
		this.colore = colore;
		this.size = size;
	}

	public boolean changeColor() {
		if ((colore == ColoreCasco.BIANCO) || (colore.equals(ColoreCasco.GIALLO))) {
			System.out.println("Colore del casco troppo chiaro!");
			colore=ColoreCasco.BLU;
			return true;
		} else
			return false;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public ColoreCasco getColore() {
		return colore;
	}

//	public void setColore(ColoreCasco colore) {
//		this.colore = colore;
//	}

	@Override
	public String toString() {
		return ", casco [size=" + size + ", colore=" + colore + "]";
	}

}
