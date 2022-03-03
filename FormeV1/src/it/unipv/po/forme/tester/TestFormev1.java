package it.unipv.po.forme.tester;

import it.unipv.po.forme.model.Cerchio;
import it.unipv.po.forme.model.ImgVett;
import it.unipv.po.forme.model.Quadrato;
import it.unipv.po.forme.model.Rettangolo;
import it.unipv.po.forme.model.util.Colore;

public class TestFormev1 {

	public static void main(String[] args) {
		
		ImgVett i = new ImgVett(10);
		
		i.aggiungiForma(new Rettangolo(Colore.BLACK, 10, 20));
		i.aggiungiForma(new Rettangolo(Colore.BLACK, 10, 20));
		i.aggiungiForma(new Rettangolo(Colore.RED, 10, 20));
		i.aggiungiForma(new Rettangolo(Colore.RED, 10, 20));
		
		i.aggiungiForma(new Quadrato(Colore.BLACK, 3));
		i.aggiungiForma(new Quadrato(Colore.BLACK, 4));
		
		i.aggiungiForma(new Cerchio(Colore.BLACK, 1));
		i.aggiungiForma(new Cerchio(Colore.BLACK, 2));
		
		
		System.out.println("Area totale : " + i.calcolaAreaTotale());
		
		System.out.println("Area totale di figure rosse : " + i.calcolaAreaTotalePerColore(Colore.RED));

		System.out.println(i.toString());
	}

}
