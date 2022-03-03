package it.unipv.po.banca.tester;

import javax.swing.JFrame;

import it.unipv.po.banca.model.Accountable;
import it.unipv.po.banca.model.Banca;
import it.unipv.po.banca.model.Conto;
import it.unipv.po.banca.model.accountable.AbbonamentoSky;
import it.unipv.po.banca.model.accountable.Stipendio;
import it.unipv.po.banca.model.conto.ContoCorrente;
import it.unipv.po.banca.model.conto.ContoDeposito;
import it.unipv.po.banca.model.conto.ContoWeb;
import it.unipv.po.banca.model.conto.util.TipologiaConto;
import it.unipv.po.banca.view.BanchiereGUI;
import it.unipv.po.banca.view.Frame;

public class Tester {
	
	public static void main(String[] args) {
		
		Banca b = new Banca("Intesa", 10);
		
		
		
		b.aggiungiConto("aaa",TipologiaConto.CORRENTE);
		b.operazioneConto("IT00000Intesa0001", 500);
		
		b.aggiungiConto("bbb",TipologiaConto.DEPOSITO);
		b.operazioneConto("IT00000Intesa0002", 500);
		System.out.println(b.calcolaSaldoTotale());				//calcolo il saldo totale 1000!!!!
		
		
		
		//ContoWeb cw=new ContoWeb(null, "ccc", null);
		b.aggiungiConto("ccc",TipologiaConto.WEB);
		b.aggiungiConto("ddd",TipologiaConto.WEB);
		
		System.out.println(b.toString());
	
		
		b.operazioneConto("IT00000Intesa0002", -500);	//dovrebbe dare stringa con errore
		
		//((ContoWeb)b.getConto("IT00000Intesa0003")).unico(); //CAZZO
		
		
		
		System.out.println(b.getConto("IT00000Intesa0003").toString());//getConto mi torna la reference x del conto!!!
		b.operazioneConto("IT00000Intesa0003", 5.0);	//dato che non è stata modificata la prima volta la pw, op impossibile
		
		
		((ContoWeb)b.getConto("IT00000Intesa0003")).changePassword("changeme", "NEW");

		((ContoWeb)b.getConto("IT00000Intesa0003")).login("NEW");
		
		
		
		//b.login("IT00000Intesa0003",((ContoWeb)b.getConto("IT00000Intesa0003")).getPassword(), "NEW");
		
//		b.operazioneConto("IT00000Intesa0003", 10.0);
	
//		System.out.println(b.getConto("IT00000Intesa0003").getSaldo());
//		//va in conto corrente e non in conto deposito per il getSaldo
		
		
		b.operazioneConto("IT00000Intesa0003", 5.0);
		System.out.println(b.getConto("IT00000Intesa0003").toString()+"\n");
	
		
//_______________________________________________________________________________________________________________
		
        Accountable s1 = new Stipendio(1300);
        ((Stipendio)s1).addStraordinario(10);

        b.addAccountable("IT00000Intesa0001", new AbbonamentoSky(true, true, true));
        b.addAccountable("IT00000Intesa0002", new AbbonamentoSky(true, false, false));
        //b.addAccountable("IT00000Intesa0001", s1);
        b.fineMese();
        System.out.println("FINE MESE TRIGGERED");
        System.out.println(b);
		
//_______________________________________________________________________________________________________________
		
		
        BanchiereGUI frame= new BanchiereGUI();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
	}
	
}
