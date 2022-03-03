package it.unipv.po.triangle.tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import it.unipv.po.triangle.dataModel.Colore;
import it.unipv.po.triangle.dataModel.Triangle;
import it.unipv.po.triangle.dataModel.TriangleComparator;

public class Tester {

	public static void main(String[] args) {

		Triangle[] triangoli= new Triangle[5];				//array di triangoli
	
		
		triangoli[0] = new Triangle(Colore.RED, 3, 4, 5, 6, 7); // nomeEnum.COSTANTE !!!!

		triangoli[1] = new Triangle(3, 4, 5, 6);

		triangoli[2]= new Triangle(1, 1, 1, 1);

		triangoli[3] = new Triangle(10, 20, 20, 10);
		
		triangoli[4] = new Triangle(Colore.BLUE, 3, 4, 5, 6, 7);

		System.out.println("The color of the first triangle is: " + triangoli[0].colore);

		// calcolaAreaMaggiore(); //aggiungendo STATIC, FUNZIONA!!! 

//		if (triangoli[0].calcolaArea() > triangoli[1].calcolaArea() & triangoli[0].calcolaArea() > triangoli[0].calcolaArea()
//				& triangoli[0].calcolaArea() > triangoli[3].calcolaArea()) { // & and
//			System.out.println(
//					"L'area maggiore vale: " + t.calcolaArea() + "\tdel triangolo di colore: " + t.getColore()); // ||
//																													// or
//		} else if (t1.calcolaArea() > t2.calcolaArea() & t1.calcolaArea() > t3.calcolaArea()) { // != not equal
//			System.out.println(
//					"L'area maggiore vale: " + t1.calcolaArea() + "\tdel triangolo di colore: " + t1.getColore()); // ==
//																													// equal
//		} else if (t2.calcolaArea() > t3.calcolaArea()) {
//			System.out.println(
//					"L'area maggiore vale: " + t2.calcolaArea() + "\tdel triangolo di colore: " + t2.getColore());
//		} else {
//			System.out.println(
//					"L'area maggiore vale: " + t3.calcolaArea() + "\tdel triangolo di colore: " + t3.getColore());
//		}

		
	
		
		
//		double[] vettoreAree = new double[4]; // creo una variabile che conterrà 4 elementi
//		vettoreAree[0] = t.calcolaArea();
//		vettoreAree[1] = t1.calcolaArea();
//		vettoreAree[2] = t2.calcolaArea();
//		vettoreAree[3] = t3.calcolaArea();
//		System.out.println("Valore prima area nel vettore: " + vettoreAree[0]);        

		
											
		
		Arrays.sort(triangoli,0,5,new TriangleComparator());	//USANDO COMPARATOR!!!!
		
		
		for (Triangle p : triangoli) {			//FOR EACH
	            System.out.println(p.toString());
	            
	        }
		
		
//-----------------------------------		
		//L'interfaccia COMPARABLE, a differenza dell'interfaccia COMPARATOR, permette il confronto degli attributi di UN SOLO
		//tipo di oggetto (TRIANGLE) che passo come parametro
		
		
		//ARRAY LIST CHE EFFETTUA L'ORDINAMENTO PER AREA, RICHIEDE CHE OGNI ELEMENTO IMPLEMENTI L'INTERFACCIA COMPARABLE,
		//E CHE SIA DEFINITO IL METODO DI COMPARETO CHE RITORNI +1/-1/0!!!!
		
		 ArrayList<Triangle> ttt = new ArrayList<Triangle>();    
		 
		 ttt.add(triangoli[0]);	//ttt.add(t); -> t reference all'oggetto istanziato
		 ttt.add(triangoli[1]);
		 ttt.add(triangoli[2]);
		 ttt.add(triangoli[3]);
		 ttt.add(triangoli[4]);
		 
		 
		 
		 Collections.sort(ttt);
		 
		 System.out.println(ttt);
		 
//		 for (Triangle p : ttt) {			//FOR EACH
//	            System.out.println(p.toString());
//	            
//	        }
		 
		//faccio un ordinamento decrescente, cosi stampo il primo valore che so avere area maggiore
		 System.out.println("Il triangolo con: "+ ttt.get(0).toString()+" ha l'area maggiore che vale: "+ ttt.get(0).calcolaArea());
//------------------------------------
		
		}
	

}
