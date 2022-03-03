package it.unipv.po.officina.model.util;

public class NumeroMassimoVeicoliException extends Exception{

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


		public NumeroMassimoVeicoliException(String msg) {
			super(msg);
		}
		
		
		public void print() {
			System.out.println(this.getMessage());
		}

}

