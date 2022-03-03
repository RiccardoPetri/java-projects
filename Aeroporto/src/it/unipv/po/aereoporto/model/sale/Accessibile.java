package it.unipv.po.aereoporto.model.sale;

import it.unipv.po.aereoporto.model.flyer.Persona;

public interface Accessibile {
	
//	Le sale di attesa sono caratterizzate da un numero massimo di posti e possono essere di due tipi:
//		1.	Sale d'attesa. Sono sale accessibili a qualsiasi viaggiatore.
//		2.	Sale Vip. Sono sale accessibili solo a viaggiatori in possesso di una carta servizi.
//
//		Si modelli la realtà sopra descritta e si realizzi un tester considerando almeno 5 persone, di cui almeno 
//	un flyer e un frequent flyer, 3 sale di cui almeno una sala d’attesa e una sala Vip. Le sale possono essere inizializzate 
//	in modo tale da testare il meccanismo di controllo della capienza.


	public  boolean addViaggiatore(Persona p);


}
