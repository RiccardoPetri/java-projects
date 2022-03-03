package it.unipv.po.laboratorioinformatico.model.computer;

import it.unipv.po.laboratorioinformatico.model.computer.util.TipoPc;

public class Server extends Computer{

	
	public Server(Cpu cpu, int ram, int hardDisk) {
		super(cpu, ram, hardDisk);
		//this.tipo = TipoPc.SERVER;
	}

	
	
	@Override
	public boolean controllaRequisitiMinimi() {
		if(getCpu().getCore() < 8 || getCpu().getFreq() < 2 || ram < 16 || hardDisk < 1000) {
			System.out.println("Il server non soddisfa i requisiti minimi");
			return false;
		}	
		System.out.println("Il server soddisfa i requisiti minimi");
		return true;
	}


	@Override
	public String toString() {
		return "Server " + super.toString();
	}
	
	
	
	

}
