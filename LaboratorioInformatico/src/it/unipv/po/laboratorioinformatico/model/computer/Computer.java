package it.unipv.po.laboratorioinformatico.model.computer;

import it.unipv.po.laboratorioinformatico.model.computer.util.TipoPc;


public abstract class Computer {

	protected TipoPc tipo;
	private Cpu cpu;
	protected int ram; // @@@ me li fa mettere protected
	protected int hardDisk;

	public Computer(Cpu cpu, int ram, int hardDisk) {
		this.cpu = cpu;
		this.ram = ram;
		this.hardDisk = hardDisk;
	}

	public abstract boolean controllaRequisitiMinimi();		//!!!!! (webInformation non ha figli, quindi andava bene interfaccia)
															// con le interfacce ho comuni solo i metodi!!!!!!
	public TipoPc getTipoPc() {
		return tipo;
	}

	public void setTipoPc(TipoPc tipoPc) {
		this.tipo = tipoPc;
	}

	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHardDisk() {
		return hardDisk;
	}

	public void setHardDisk(int hardDisk) {
		this.hardDisk = hardDisk;
	}

	@Override
	public String toString() {
		return "con le seguenti caratteristiche : " + cpu + ", ram = " + ram + ", hardDisk = " + hardDisk + "\n";
	}

}
