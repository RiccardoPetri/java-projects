package it.unipv.po.aereoporto.model.sale;

import java.util.HashMap;
import it.unipv.po.aereoporto.model.flyer.FrequentFlyer;
import it.unipv.po.aereoporto.model.flyer.Persona;
import it.unipv.po.aereoporto.model.util.NoFrequentFlyerEcxeption;
import it.unipv.po.aereoporto.model.util.NumeroMassimoPostiException;

public class SalaVip extends SalaDiAttesa {

	private HashMap<String, FrequentFlyer> m; // SI COMMENTA DICENDO CHE IPOTIZZO ESSERE UNICA!!, se no usavo sempl
												// arrayList

	private int maxNumPosti = 2;

	public SalaVip(String codiceSala) {
		// SUPER VUOLE TUTTI I PARAMETRI ISTANZIATI DAL PADRE!!!!
		super(codiceSala); // EREDITO L'ATTRIBUTO PRIVATO, MA IL VALORE LO ISTANZIO CON I PARAMETRI!!

		m = new HashMap<String, FrequentFlyer>(); // senza complicarmi la vita usavo un arrayList come prima
	}

//	@Override
//	public boolean addViaggiatore(Persona p) {
//		try {
//			if (p == null) {
//				throw new NullPointerException();
//			}
//			if (m.size() < maxNumPosti && p != null) {
//				if (p.isVip()) {
//					m.put(((FrequentFlyer) p).getCodiceCarta(), (FrequentFlyer) p);
//					System.out.println(p.getNome() + " " + p.getCognome() + " accedente alla sala " + codiceSala);
//					return true;
//				}
//				if (!p.isVip()) {
//					throw new NoFrequentFlyerEcxeption("Flyer non vip");
//				}
//			}
//			if (m.size() >= maxNumPosti) {
//				throw new NumeroMassimoPostiException("Numero massimo posti esaurito"); // THROW VUOL DIRE VAI AL CATCH
//			}
//		} catch (NumeroMassimoPostiException ex) {
//			ex.print();
//		} catch (NullPointerException ex) {
//			System.out.println("Persona p è null");
//		} catch (NoFrequentFlyerEcxeption ex) {
//			ex.print();
//		}
//
//		return false;
//	}

	@Override
	public boolean addViaggiatore(Persona p) {
		try {
			if (p == null) {
				throw new NullPointerException();
			}
				if (m.size() > maxNumPosti) {
					throw new NumeroMassimoPostiException("Numero massimo posti esaurito"); // THROW VUOL DIRE VAI AL CATCH
				}
					if (!p.isVip()) {
						throw new NoFrequentFlyerEcxeption("Flyer non vip");
					}
						m.put(((FrequentFlyer) p).getCodiceCarta(), (FrequentFlyer) p);
						System.out.println(p.getNome() + " " + p.getCognome() + " accedente alla sala " + codiceSala);
						// System.out.println(m.size());
						return true;
		} catch (NumeroMassimoPostiException ex) {
			ex.print();
		} catch (NullPointerException ex) {
			System.out.println("Persona p è null");
		} catch (NoFrequentFlyerEcxeption ex) {
			ex.print();
		}
		return false;
	}

	// vedremo altri modi(?)
	@Override
	public void rimuoviFlayer(Persona f) {
		m.remove(((FrequentFlyer) f).getCodiceCarta());
		System.out.println("Rimosso flayer " + f.getNome() + " " + f.getCognome());
	}

	public HashMap<String, FrequentFlyer> getM() {
		return m;
	}


	@Override
	public String toString() {
		String list = "";
		for (Persona p : m.values()) {
			list += p.toString() + "\n";
		}
		return list;
	}

}
