package it.unipv.po.aereoporto.model.util;

public class NoFrequentFlyerEcxeption extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public NoFrequentFlyerEcxeption(String msg) {
		super(msg);
	}
	
	public void print() {
		System.out.println(this.getMessage());		//il padre serve solo per questo
	}
}
