package it.unipv.po.laboratorioinformatico.model;

import java.util.ArrayList;

import it.unipv.po.laboratorioinformatico.model.computer.Computer;
import it.unipv.po.laboratorioinformatico.model.computer.Desktop;
import it.unipv.po.laboratorioinformatico.model.computer.util.TipoPc;

public class Laboratorio {

	private String nome;
	private ArrayList<Computer> c;

	public Laboratorio(String nome) {
		this.nome = nome;
		c = new ArrayList<Computer>();
	}


	
	public void inserisciPc(Computer computer) {
		c.add(computer);
	}

	public void contaDekstop() {
		int num = 0;
//		int i = 0;
		for (Computer s : c) {
			//if (s.getTipoPc() == TipoPc.DESKTOP) { 			//Non va bene definito cosi!!!!
			
			if(s.getTipoPc() == TipoPc.DESKTOP){		//NON DEVO FARE ALCUN CAST, S SCORRERà TUTTI I TIPI DI PC E 	
														//FARà DA SOLO IL TIPOPC "OVVERIDETATO" DELLA CLASSE,
				num++;
				
			}
//			i++;
	
		}
		System.out.println("Numero di Desktop: " + num);
	}

	public ArrayList<Computer> getC() {
		return c;
	}

	public void setC(ArrayList<Computer> c) {
		this.c = c;
	}

	
	@Override
	public String toString() {
		String s = "";
		for (Computer x : c) {
			if (c != null) {
				s += x;
			}
		}
		return s;
	}

}
