package it.unipv.po.aereoporto.tester;

import it.unipv.po.aereoporto.model.flyer.CartaServizi;
import it.unipv.po.aereoporto.model.flyer.Flyer;
import it.unipv.po.aereoporto.model.flyer.FrequentFlyer;
import it.unipv.po.aereoporto.model.sale.SalaDiAttesa;
import it.unipv.po.aereoporto.model.sale.SalaVip;
import it.unipv.po.aereoporto.model.util.Genere;

public class TesterSala {

	public static void main(String[] args) {
		
		SalaDiAttesa x = new SalaDiAttesa("P01");
		
		
		x.addViaggiatore(new Flyer("Andrea", "Ciao", 33, Genere.UOMO, "14"));
		x.addViaggiatore(new Flyer("Marco", "Ciao", 33, Genere.UOMO, "14"));
		x.addViaggiatore(new Flyer("Riccardo", "Ciao", 33, Genere.UOMO, "14"));
		x.addViaggiatore(new Flyer("Alessio", "Ciao", 33, Genere.UOMO, "14"));
		x.addViaggiatore(new FrequentFlyer("Anto", "Ciao", 33, Genere.UOMO, "14",new CartaServizi("IT0545")));
		x.addViaggiatore(new FrequentFlyer("Luca", "Ciao", 33, Genere.UOMO, "14",new CartaServizi("IT0546")));
		x.addViaggiatore(new FrequentFlyer("Giovanni", "Ciao", 33, Genere.UOMO, "14",new CartaServizi("IT0547")));
		//x.rimuoviFlayer(x.getS().get(0));	//rimuove il Flayer 0
		System.out.println(x.toString());
		
		SalaVip y = new SalaVip("V01"); //ne posso inserire massimo 2
		y.addViaggiatore(null);
		y.addViaggiatore(new Flyer("Antonio", "Ciao", 33, Genere.UOMO, "14"));	//non può accedere qui!
		y.addViaggiatore(new FrequentFlyer("Alessia", "cognome", 50, Genere.DONNA ,"10" , new CartaServizi("IT04578")));
		y.addViaggiatore(new FrequentFlyer("Alessia", "cognome", 50, Genere.DONNA ,"10" , new CartaServizi("IT04500")));
		y.addViaggiatore(new FrequentFlyer("Alessia", "cognome1", 50, Genere.DONNA ,"10" , new CartaServizi("IT04770")));
		y.addViaggiatore(new FrequentFlyer("Alessia", "cognome", 50, Genere.DONNA ,"10" , new CartaServizi("IT04579")));

		System.out.println(y.toString());
	
		
//		
//		SalaVip z = new SalaVip("V02", 1);
//		z.addViaggiatore(new FrequentFlyer("nome0", "cognome0", 50, Sesso.DONNA ,"10" , new CartaServizi("IT04578")));
//		z.addViaggiatore(new FrequentFlyer("nome1", "cognome1", 50, Sesso.DONNA ,"10" , new CartaServizi("IT04570")));
//		//z.rimuoviFlayer(z.getM().get("IT04570"));
//		z.addViaggiatore(new FrequentFlyer("nome2", "cognome2", 50, Sesso.DONNA ,"10" , new CartaServizi("IT04579")));
//		z.addViaggiatore(new FrequentFlyer("nome3", "cognome3", 50, Sesso.DONNA ,"10" , new CartaServizi("IT04580")));	//limite raggiunto!
//		
//
//		System.out.println(z.toString());	//non serve il casting, ho già definito che z è di tipo SalaVip
	}

}
