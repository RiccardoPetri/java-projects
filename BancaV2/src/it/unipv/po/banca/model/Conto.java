package it.unipv.po.banca.model;

import it.unipv.po.banca.model.conto.util.TipologiaConto;

public interface Conto {
	
	boolean operazione(double valore);	//modificatore di default (visibilità solo nello stesso package)(nella firma devo mettere cosa restituisce)
	double getSaldo();
	String getIban();
	TipologiaConto getTipo();
	
	//String getPassword(); //ha senso?@@				SECONDA INTERFACCIA DA IMPLEMENTARE!!!!
	
	
	boolean addAccountable(Accountable acc);
	boolean fineMese();
}
