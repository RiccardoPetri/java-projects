package it.unipv.po.triangle.dataModel;

public class Triangle extends Forma implements Comparable<Triangle> {

	private double base;
	private double altezza;
	private double pCateto;
	private double sCateto;

	public Triangle(Colore colore, double spessore, double base, double altezza, double pCateto, double sCateto) {
		super(colore, spessore);
		this.altezza = altezza;
		this.base = base;
		this.pCateto = pCateto;
		this.sCateto = sCateto;
	}

	public Triangle(double base, double altezza, double pCateto, double sCateto) {
		super();
		this.altezza = altezza;
		this.base = base;
		this.pCateto = pCateto;
		this.sCateto = sCateto;
	}

	public double calcolaArea() {		//I METODI DICHIARATI IN UNA CLASSE ASTRATTA VANNO DICHIARATI TUTTI NELLA FIGLIA!!
		return (base * altezza) / 2;	//(NEL CASO IN CUI NON SONO PRESENTI LI, TIPO CALCOLAPERIMETRO CHE C'è SOLO NELLA PADRE
	}

	public double calcolaPerimetro() {
		return base + pCateto + sCateto;
	}

	@Override
	public String toString() {
		return "Base: " + base + " Altezza: " + altezza + " Area: " + calcolaArea() + " Colore: "+ colore;
	}

//-------------------------------------------------------------------------

	// CASO DI CONFRONTO TRA TIPI PRIMITIVI:
	@Override
	public int compareTo(Triangle othetTriangle) {
		if (this.calcolaArea() < othetTriangle.calcolaArea()) {
			return +1; // inverto con +1 se voglio che ordini crescentemente!!!!
		} else if (this.calcolaArea() > othetTriangle.calcolaArea()) {
			return -1;
		} else {
			return getColore().compareTo(othetTriangle.getColore()); // nel caso in cui ho aree uguali, ordino per
																		// COLORE
																		// che non essendo un tipo primitivo non posso
																		// usare > <
																		// quindi uso il compareTo dell'enum, ereditata
																		// da object  (INFATTI MI ORDINA PRIMA IL BLU)

		}
	}

//	//CASO DI CONFRONTO TRA STRINGHE:
//		@Override
//		public int compareTo(Triangle othetTriangle) {
//			int r = getColore().compareTo(othetTriangle.getColore());
//
//	        if (r == 0) {
//	        	r = getNome().compareTo(othetTriangle.getNome());                 //potrei stampare altre cose tipo il nome
//	        }
//          return r;
//	    	}
//		}

	// COME POSSO FARE SENZA ARRAYLIST? @@@@@@@@@@@@@@@@@@

//	@Override
//	public int compareTo(Triangle othetTriangle) {
//		if (this.calcolaArea() < othetTriangle.calcolaArea()) {
//		    return (int)othetTriangle.calcolaArea();
//		} else if (this.calcolaArea() > othetTriangle.calcolaArea()) {
//		    return (int)this.calcolaArea();
//		} else {
//		    return 0;
//		
//		}
//	}

}
