package it.unipv.po.rectangle;

public class Rectangle {

// Data type primitivi:
// int, long, short = decimali
// char = un carattere
// double e float = numeri in virgola
// boolean = true/false (0/1)
// byte = sono 8 bit

// Data type non primitivi (derivati):
// String = è una sequenza di caratteri
// Data/Time
// ...	

	private double base;
	private double altezza;

//	public Rectangle() {
//		base = 0.0;
//		altezza = 0.0;
//
//	}

//	public Rectangle(double b) {
//		base = b;
//		altezza = 0.0;
//	
//	}

	public Rectangle(double base, double altezza) {
		this.base = base;
		this.altezza = altezza; // THIS. IN QUESTO CASO SALVA @@@@@@@@@@@@@@@
	}

	public double getBase() { // per interagire all'esterno con gli attributi della classe (che sono privati)
		return base;
	}

	public double getAltezza() { // è UN METODO NORMALE COME GLI ALTRI, QUINDI CI METTO DOUBLE
		return altezza;
	}

	public void setBase(double b) { // parametri devono avere sempre il loro tipo!!!
		base = b;
	}

	public void setAltezza(double altezza) { // CONVIENE SEMPRE USARE I PARAMETRI PER ESTESO (+ CHIARI)
		this.altezza = altezza;
	}

	public double calcolaPerimentro() {
		return (base + altezza) * 2;

	}

	public double calcolaArea() {
		double area = base * altezza; // spreco di memoria!!
		System.out.println("L'area è: " + area);
		return area;
	}

	@Override
	public String toString() { // sconsigliato mettere metodi nel toString
		// return "Altezza: " + altezza + "\tBase: " + base;
		return String.format("Altezza: %f Base: %f", altezza, base); // PIU COMPATTO
	}

	// %s per stringa
	// %f per double
	// %d per int
	// %c per char
	// %b per boolean

//	public void inverterBaseAltezza() {
//		altezza = tmp;              //NON DEVO METTERE IN ALTEZZE 0.0!!!!!!!!
//		base = altezza;
//		tmp = base;
//		}

	public void inverterBaseAltezza() {
		double tmp = altezza; // va nel metodo appunto
		altezza = base;
		base = tmp;
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(3.5, 10.2);

		double altezza = r.getAltezza();

		r.setAltezza(4);

		System.out.println("Altezza: " + r.getAltezza());

		System.out.println("Altezza : " + altezza + "\tBase : " + r.getBase());
		System.out.println("Altezza : " + r.getAltezza() + "\tBase : " + r.getBase()); // ritorna l'altezza cambiata

		// invertoBaseEaltezza!@@@@@@@
		r.inverterBaseAltezza();
		// System.out.println("Inverto base e altezza: "+ r.toString());

//		System.out.println("Perimetro : " + (altezza + r.getBase()) * 2);

		System.out.println("Perimetro : " + r.calcolaPerimentro());

//		System.out.println("Area :" + r.calcolaArea());

		// r.setAltezza(7);
		// altezza = r.getAltezza(); // RIUTILIZZO DELLA STESSA VARIABILE (CON ALTEZZA
		// DIVERSA)

//		System.out.println("Altezza : " + altezza + "\tBase : " + r.getBase());
//
//		System.out.println("Perimetro : " + (altezza + r.getBase()) * 2);
//
//		System.out.println("Perimetro : " + r.calcolaPerimentro());
//
//		System.out.println("Area :" + r.calcolaArea());

		System.out.println(r.toString() + "\tPerimetro: " + r.calcolaPerimentro() + "\tArea: " + r.calcolaArea());
		System.out.println(r.toString()
				+ String.format("\tPerimetro: %d \tArea: %d ", (int)r.calcolaPerimentro(), (int) r.calcolaArea()));
		// prima stampa il syso nel metodo area, perchè viene prima della fine di questo
		// syso

		// SFRUTTANDO IL CONCETTO DI OVERRIDE, è IMPLICITO IL RIFERIMENTO A TOSTRING

		// System.out.println(r + "\tPerimetro: " + r.calcolaPerimentro() + "\tArea: " +
		// r.calcolaArea());

		// Rectangle r2 = new Rectangle(); //fa riferimento al costruttore senza
		// parametri fatto sopra
		// System.out.println("Altezza : " + r2.getAltezza() + "\tBase : " +
		// r2.getBase());

		double[] vettore;
		vettore = new double[2];
		vettore[0] = r.getBase();
		vettore[1] = r.getAltezza();

		System.out.println("Nel vettore ho: " + vettore[0]);
		// vettore da solo è riferito all'indirizzo della reference all'array di double
		// (devo mettere vettore[0] e vettore[1])

	}

}
