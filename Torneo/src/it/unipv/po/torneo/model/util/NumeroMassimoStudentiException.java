package it.unipv.po.torneo.model.util;

public class NumeroMassimoStudentiException extends Exception{

	public NumeroMassimoStudentiException(String msg) {
		super(msg);
	}
	
	public void print() {
		System.out.println(this.getMessage());
	}
}
