package it.unipv.po.laboratorioinformatico.model.computer;

import it.unipv.po.laboratorioinformatico.model.computer.util.TipoPc;

public class Desktop extends Computer {


	
	public Desktop(Cpu cpu, int ram, int hardDisk) {
		super(cpu, ram, hardDisk);
		//this.tipo = TipoPc.DESKTOP;		NON SI FA COSI!, DEVO SETTARE IL METODO E CHIAMARLO
	}
	
	
	@Override
	public boolean controllaRequisitiMinimi() {
		if(getCpu().getCore() < 4 || getCpu().getFreq() < 2 || ram < 8 || hardDisk < 10000) {
			System.out.println("Il desktop non soddisfa i requisiti minimi");
			return false;
		}	
		System.out.println("Il desktop soddisfa i requisiti minimi");
		return true;
	}
	@Override
	public TipoPc getTipoPc() {
		return TipoPc.DESKTOP;
	}
	
	@Override
	public String toString() {
		return "Dekstop " + super.toString();
	}

	
}
