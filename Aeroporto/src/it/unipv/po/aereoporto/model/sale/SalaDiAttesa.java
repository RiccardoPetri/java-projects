package it.unipv.po.aereoporto.model.sale;

import java.util.ArrayList;
import it.unipv.po.aereoporto.model.flyer.Persona;
import it.unipv.po.aereoporto.model.util.NumeroMassimoPostiException;

public class SalaDiAttesa implements Accessibile {

	private ArrayList<Persona> s;
	private int maxNumPosti = 10;
	protected String codiceSala;

	public SalaDiAttesa(String codiceSala) {
		this.codiceSala = codiceSala;
		s = new ArrayList<Persona>();
	}
	

	@Override
	public boolean addViaggiatore(Persona p) {
		try {

			if (p != null) {
				if(s.size() < maxNumPosti) {
					System.out.println("Aggiunto: "+p.getNome()+" "+p.getCognome());
					return s.add(p);
				}
				throw new NumeroMassimoPostiException("Numero posti esaurito");
			}
			throw new NullPointerException("Persona p è null");
		}
		catch(NullPointerException ex) {
			System.out.println(ex.getMessage());
		}
		catch(NumeroMassimoPostiException ex) {
			ex.print();
		}
//		catch(Exception ex) { MAI!!
//			System.out.println(ex.getMessage());
//		}
		return false;
	}

	public void rimuoviFlayer(Persona f) {		//vedremo altri modi per farlo
		s.remove(f);
		System.out.println("Rimosso flayer "+f.getNome() +" "+ f.getCognome());
	}

	public ArrayList<Persona> getS() {
		return s;
	}


	@Override
	public String toString() {
		String listString = "";
		for (Persona p : s) {
			listString += p.toString() + "\n";
		}
		return listString;
	}

//	Le sale di attesa sono caratterizzate da un numero massimo di posti e possono essere di due tipi:
//	1.	Sale d'attesa. Sono sale accessibili a qualsiasi viaggiatore.
//	2.	Sale Vip. Sono sale accessibili solo a viaggiatori in possesso di una carta servizi.
//
//	Si modelli la realt� sopra descritta e si realizzi un tester considerando almeno 5 persone, di cui almeno 
//un flyer e un frequent flyer, 3 sale di cui almeno una sala d�attesa e una sala Vip. Le sale possono essere inizializzate 
//in modo tale da testare il meccanismo di controllo della capienza.

}
