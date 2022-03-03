package it.unipv.po.triangle.dataModel;

import java.util.Comparator;

//NEL CASO DEL COMPARATOR, DEVO CREARE UNA CLASSE PER COMPARATOR, A CUI PASSERò DUE TIPI OBJET COMPARABILI CHE POI CASTO AL TIPO
public class TriangleComparator implements Comparator<Triangle> {

	
	@Override
	public int compare(Triangle o1, Triangle o2) {
		if (o1.calcolaArea() < o2.calcolaArea()) {
			return +1; // inverto con +1 se voglio che ordini crescentemente!!!!
		} else if (o1.calcolaArea() > o2.calcolaArea()) {
			return -1;
		} else {
			return 0;//getColore().compareTo(o2.getColore()); // nel caso in cui ho aree uguali, ordino per
																	
		}
	}
	
	
	
	//CON COMPARATOR POSSO A DIFFERENZA DELL'INTERFACCIA COMPARABLE(CHE NON AVRà UNA SUA CLASSE SPECIFICA), FARE CONFRONTI
	//SU PIU TIPI DI OGGETTO!, MENTRE COMPARABLE SOLO TRIANGOLI!!!
		
//		@Override
//		public int compare(Quadrato o1, Quadrato o2) {
//			if (o1.calcolaArea() < o2.calcolaArea()) {
//				return +1; // inverto con +1 se voglio che ordini crescentemente!!!!
//			} else if (o1.calcolaArea() > o2.calcolaArea()) {
//				return -1;
//			} else {
//				return 0;//getColore().compareTo(o2.getColore()); // nel caso in cui ho aree uguali, ordino per
//																		
//			}
		
	
		
		
	
	//nel main cambia il sort cosi: 	//Collections.sort(ccc, new TriangleComparator());

}
	

