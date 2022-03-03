package it.unipv.po.forme.model;



import it.unipv.po.forme.model.util.Colore;

public class ImgVett {
	
	private int maxForme = 10;												//si userebbe un arrayList con questo controllo
	private Forma[] f;	//in realtà avrei dovuto usare array 
	private int conteggio;
	
	public ImgVett(int grandezza) {
		f = new Forma[grandezza];
	}

	public boolean aggiungiForma(Forma a) {
		if (a != null && conteggio < f.length) {
			f[conteggio]=a;
			conteggio++;
			return true;
		}
		System.out.println("Forma non aggiunngibile");
		return false;
	}

//	public boolean rimuoviForma(Forma a) {
//		if (a != null) {
//			f.remove(a);
//			conteggio--;
//			return true;
//		}
//		System.out.println("Nessuna forma rimossa");
//		return false;
//	}

	public double calcolaAreaTotale() {
		double tot = 0;
		for (Forma s : f) {
			tot += s.calcolaArea();
		}
		return tot;
	}

	public double calcolaAreaTotalePerColore(Colore c) {
		double tot = 0;
		for (Forma s : f) {
			if (s.getColore() == c) {
				tot += s.calcolaArea();
			}

		}
		return tot;
	}

//	public ArrayList<Forma> getF() {
//		return f;
//	}
//
//	public void setF(ArrayList<Forma> f) {
//		this.f = f;
//	}

	public int getConteggio() {
		return conteggio;
	}

	public void setConteggio(int conteggio) {
		this.conteggio = conteggio;
	}

	@Override
	public String toString() {		//ci andrà stringBuilder
		String s = "";
		for (Forma x : f) {
			if (f != null) {
				s += x + "\n";
			}
		}
		return s;
	}

}
