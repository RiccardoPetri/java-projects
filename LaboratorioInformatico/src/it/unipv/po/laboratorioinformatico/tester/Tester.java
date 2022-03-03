package it.unipv.po.laboratorioinformatico.tester;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import it.unipv.po.laboratorioinformatico.model.Laboratorio;
import it.unipv.po.laboratorioinformatico.model.computer.Computer;
import it.unipv.po.laboratorioinformatico.model.computer.ComputerComparator;
import it.unipv.po.laboratorioinformatico.model.computer.Cpu;
import it.unipv.po.laboratorioinformatico.model.computer.Desktop;
import it.unipv.po.laboratorioinformatico.model.computer.Server;


public class Tester {

	public static void main(String[] args) {
		
		Laboratorio l = new Laboratorio("LabInfo");
		
		l.inserisciPc(new Server(new Cpu(8, 2), 16, 10000));
		//l.getC().add(new Server(ew Cpu(8, 2), 16, 10000));
		l.inserisciPc(new Server(new Cpu(8, 2), 16, 10000));
		l.inserisciPc(new Server(new Cpu(2, 2), 4, 20));
		
		l.inserisciPc(new Desktop(new Cpu(8, 2), 16, 10000));
		l.inserisciPc(new Desktop(new Cpu(8, 2), 16, 10000));
		l.inserisciPc(new Desktop(new Cpu(2, 2), 4, 20));
		
		
		System.out.println(l.toString());
		
		l.contaDekstop();
		
		
		((Server)l.getC().get(0)).controllaRequisitiMinimi();
		((Server)l.getC().get(2)).controllaRequisitiMinimi();
		
		((Desktop)l.getC().get(3)).controllaRequisitiMinimi();
		((Desktop)l.getC().get(5)).controllaRequisitiMinimi();
		
		
		Collections.sort(l.getC(), new ComputerComparator());
		
		System.out.println(l.toString());
		
		
		//se volessi ordinare anche per hardDisk?@@@@  (override con classe che estende(?)
	

	}

}
