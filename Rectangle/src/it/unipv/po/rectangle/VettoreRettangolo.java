package it.unipv.po.rectangle;

public class VettoreRettangolo {

	private double[] baseAltezza;// = new double[2]; //come definire lo spazio di 2 elementi
									// nell'array?
									// (forse fare ricorso all'array list?)

	// costruttore
	public VettoreRettangolo(double altezza, double base) {
		baseAltezza = new double[2]; // 2 INDICA LA DIMENSIONE DEL VETTORE (LUNGHEZZA)
		baseAltezza[0] = altezza;
		baseAltezza[1] = base;
		// baseAltezza[2]= 12; -> NOOO!
	}

	// getter
	public double getAltezza() {
		return baseAltezza[0];
	}

	// getter
	public double getBase() {
		return baseAltezza[1];
	}

	// setter
	public void setAltezza(double altezza) {
		baseAltezza[0] = altezza;
	}

	// setter
	public void setBase(double base) {
		baseAltezza[1] = base;
	}

	@Override
	public String toString() {
		return String.format("altezza: %f \tbase: %f", baseAltezza[0], baseAltezza[1]);
	}

	public double calcolaPerimetro() {
		return (baseAltezza[0] + baseAltezza[1]) * 2;
	}

	public double calcolaArea() {
		return (baseAltezza[0] * baseAltezza[1]);
	}

	public void invertiBaseAltezza() {
		double tmp = baseAltezza[0];
		baseAltezza[0] = baseAltezza[1];
		baseAltezza[1] = tmp;
	}

	// tester
	public static void main(String[] args) {

		VettoreRettangolo v = new VettoreRettangolo(3.5, 10.0); // non do la lunghezza al vettore!!

		System.out.println(v.toString());

		v.invertiBaseAltezza();

		System.out.println(v.toString());

		System.out.println("Area: " + v.calcolaArea() + "\tPerimetro: " + v.calcolaPerimetro());

	}
}
