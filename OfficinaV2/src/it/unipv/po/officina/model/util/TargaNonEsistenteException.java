package it.unipv.po.officina.model.util;

public class TargaNonEsistenteException extends Exception{

	public TargaNonEsistenteException(String msg){
		super(msg);
	}
	
	public void Print() {
		System.out.println(this.getMessage());
	}
}
