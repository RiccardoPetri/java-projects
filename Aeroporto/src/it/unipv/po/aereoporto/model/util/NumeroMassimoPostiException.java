package it.unipv.po.aereoporto.model.util;

public class NumeroMassimoPostiException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NumeroMassimoPostiException(String msg) {
		super(msg);
	}
	
	
	public void print() {
		System.out.println(this.getMessage());
	}

}
