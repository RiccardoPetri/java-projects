package it.unipv.po.laboratorioinformatico.model.computer;

public class Cpu {

	private int core;
	private int freq;
	
	
	
	public Cpu(int core, int freq) {
		this.core=core;
		this.freq=freq;
	}



	public int getCore() {
		return core;
	}



	public void setCore(int core) {
		this.core = core;
	}



	public int getFreq() {
		return freq;
	}



	public void setFreq(int freq) {
		this.freq = freq;
	}



	@Override
	public String toString() {
		return "La Cpu è composta da " + core + " Core"+" e da una frequenza di " + freq + " GHz";
	}
	
	
	
	
	
	
}
