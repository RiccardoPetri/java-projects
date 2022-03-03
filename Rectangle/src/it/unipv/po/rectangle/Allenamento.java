package it.unipv.po.rectangle;

public class Allenamento {

	private double base;
	private double altezza;

	// costruttore
	public Allenamento(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double b) {
		base = b;
	}

	@Override
	public String toString() {
		return "Base = " + base + "\tAltezza : " + altezza;
	}

	public static void main(String[] args) {

		Allenamento r = new Allenamento(2, 5);

		System.out.println(r.toString());

	}
}
